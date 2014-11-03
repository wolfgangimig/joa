/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.example.cnaddin;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import com.sun.javafx.scene.control.behavior.TextAreaBehavior;
import com.sun.javafx.scene.control.skin.TextAreaSkin;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.reg.DeclRegistryValue;
import com.wilutions.com.reg.RegUtil;
import com.wilutions.joa.TaskPane;
import com.wilutions.joa.outlook.fx.CategoryItem;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.office.MsoCTPDockPositionRestrict;
import com.wilutions.mslib.office._CustomTaskPane;
import com.wilutions.mslib.outlook.Categories;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook.NoteItem;
import com.wilutions.mslib.outlook.OlItemType;

public class NoteTaskPane extends TaskPane {

	private Inspector inspector;
	private GridPane noteGrid;
	private TextArea noteText;
	private CheckBox ckDisplay;
	private CheckBox ckCatMail;
	private MailItem mailItem;
	private Label noteHeaderLabel;
	private Timer timer;
	private List<CategoryItem> catList;
	private com.wilutions.mslib.outlook.Application app;
	private Color noteGridDefaultBackgColor = Color.rgb(255, 255, 204);
	private final static Color noteHeaderColor = Color.rgb(153, 180, 209);

	private final String categoryListDelimiter;

	@DeclRegistryValue
	private boolean reg_displayNote = true;
	@DeclRegistryValue
	private boolean reg_alsoCategorizeMail = true;

	private enum NoteState {
		New, Modified, Saved
	}

	private NoteState noteState = NoteState.New;

	public NoteTaskPane(Inspector inspector) {
		this.inspector = inspector;
		this.categoryListDelimiter = (String) RegUtil.getRegistryValue("HKCU\\Control Panel\\International", "sList",
				",");
		Globals.getThisAddin().getRegistry().readFields(this);
	}

	@Override
	public void onVisibleStateChange(final _CustomTaskPane ctp) throws ComException {
		Boolean visible = ctp.getVisible();
		System.out.println("ctp.visible=" + visible);
		IRibbonUI ribbon = Globals.getThisAddin().getRibbon();
		if (ribbon != null) {
			ribbon.InvalidateControl("ShowHideTP");
		}
	}

	@Override
	public void dispose() {
		// timer, ckDisplay, ckCatMail is null, if the inspector window was closed,
		// before the scene has been created.
		if (timer != null) {
			timer.cancel();
			reg_displayNote = ckDisplay.isSelected();
			reg_alsoCategorizeMail = ckCatMail.isSelected();
		}
		super.dispose();
		Globals.getThisAddin().getRegistry().writeFields(this);
	}

	private static String toRGB(Color noteBackgColor) {
		String noteBackgRgb = String.format("#%02x%02x%02x", (int) (noteBackgColor.getRed() * 255),
				(int) (noteBackgColor.getGreen() * 255), (int) (noteBackgColor.getBlue() * 255));
		return noteBackgRgb;
	}

	private static boolean isDarkColor(Color c) {
		double d = c.getRed() + c.getGreen() + c.getBlue();
		d /= 3;
		return d < 0.5;
	}

	private void setNoteGridStyleIfUnsafed(GridPane noteGrid, Color noteBackgColor) {
		if (noteState != NoteState.Saved) {
			setNoteGridStyleAlways(noteGrid, noteBackgColor);
		}
	}

	private void setNoteGridStyleAlways(GridPane noteGrid, Color noteBackgColor) {
		String noteBackgRgb = toRGB(noteBackgColor);
		String backgStyle = "-fx-background-color: " + noteBackgRgb + "; -fx-control-inner-background: " + noteBackgRgb
				+ "; -fx-border: 1px solid; -fx-border-color: black;";
		noteGrid.setStyle(backgStyle);
	}

	private void updateNoteState(NoteState noteState) {
		this.noteState = noteState;
		String headerText = "";
		switch (noteState) {
		case New:
			headerText = "*New*";
			break;
		case Modified:
			headerText = "*Modified*";
			break;
		case Saved:
			headerText = "-Saved-";
			break;
		default:
			throw new IllegalStateException("Unknown NoteState=" + noteState);
		}
		final String s = headerText;
		Platform.runLater(() -> noteHeaderLabel.setText(s));
	}

	@Override
	protected Scene createScene() throws ComException {

		// The Outlook application interface
		app = Globals.getThisAddin().getApplication();

		// Selected mail
		mailItem = inspector.getCurrentItem().as(MailItem.class);

		// Categories
		final Categories categories = app.GetNamespace("MAPI").getCategories();
		catList = CategoryItem.createObservableListOfCategories(categories);
		catList.sort((p, q) -> p.toString().compareTo(q.toString()));

		// ------------------------------------------------------------------------
		// The task panes position might be of interest for building the layout
		// of the scene:

		// MsoCTPDockPosition dockPosition =
		// super.customTaskPane.getDockPosition();
		// int wd = super.customTaskPane.getWidth();
		// int ht = super.customTaskPane.getHeight();

		// Allow to dock the task pane only at the left and right border
		// of the inspector window
		customTaskPane.setDockPositionRestrict(MsoCTPDockPositionRestrict.msoCTPDockPositionRestrictNoHorizontal);
		
		// ------------------------------------------------------------------------
		// Initialize note category with mail category

		String mailCats = mailItem.getCategories();
		if (mailCats != null && mailCats.length() != 0) {
			String[] mailCatArr = mailCats.split(categoryListDelimiter);
			String mailCat = mailCatArr.length != 0 ? mailCatArr[mailCatArr.length - 1] : null;
			if (mailCat != null) {
				for (CategoryItem cat : catList) {
					if (cat.toString().equals(mailCat)) {
						noteGridDefaultBackgColor = cat.getColor();
						break;
					}
				}
			}
		}

		// ------------------------------------------------------------------------
		// Build the scene

		VBox root = new VBox();
		root.setSpacing(4);

		final Scene scene = new Scene(root);
		scene.getStylesheets().add("com/wilutions/joa/example/cnaddin/stylesheet.css");

		// ------------------------------------------------------------------------
		// The note is displayed in a view based on a GridPane with three
		// columns

		int noteRowIdx = 0;
		noteGrid = new GridPane();
		setNoteGridStyleIfUnsafed(noteGrid, noteGridDefaultBackgColor);
		noteGrid.setPadding(new Insets(2));
		noteGrid.setVgap(2);
		root.getChildren().add(noteGrid);

		// ------------------------------------------------------------------------
		// The note header bar

		int headerRectsSize = 16;
		noteGrid.getRowConstraints().add(new RowConstraints(headerRectsSize, headerRectsSize, headerRectsSize));
		noteGrid.getColumnConstraints().add(new ColumnConstraints(headerRectsSize, headerRectsSize, headerRectsSize));
		noteGrid.getColumnConstraints().add(
				new ColumnConstraints(headerRectsSize, 100, Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER, true));
		noteGrid.getColumnConstraints().add(new ColumnConstraints(headerRectsSize, headerRectsSize, headerRectsSize));

		// Note icon in left column
		Image img = new Image("com/wilutions/joa/example/cnaddin/NoteIcon.png");
		ImageView noteLeftBox = new ImageView(img);
		noteLeftBox.setFitWidth(16);
		noteLeftBox.setFitHeight(16);

		// Note header label (*New*, *Modified*, -Saved-)
		VBox noteHeaderBar = new VBox();
		GridPane.setMargin(noteHeaderBar, new Insets(8, 4, 8, 4));
		noteHeaderBar.setAlignment(Pos.CENTER);

		noteHeaderLabel = new Label();
		noteHeaderLabel.setStyle("-fx-background-color: " + toRGB(noteHeaderColor) + "; -fx-text-fill: white");
		noteHeaderLabel.setMinHeight(16);
		noteHeaderLabel.setMaxHeight(16);
		noteHeaderLabel.setMinWidth(10);
		noteHeaderLabel.setMaxWidth(Double.MAX_VALUE);
		noteHeaderLabel.setAlignment(Pos.CENTER);
		updateNoteState(NoteState.New);
		noteHeaderBar.getChildren().add(noteHeaderLabel);

		// Right square
		Rectangle noteRightBox = new Rectangle(headerRectsSize, headerRectsSize, noteHeaderColor);

		noteGrid.add(noteLeftBox, 0, noteRowIdx);
		noteGrid.add(noteHeaderBar, 1, noteRowIdx);
		noteGrid.add(noteRightBox, 2, noteRowIdx);
		noteRowIdx++;

		// --------------------------------------------------------------------
		// Edit box for note text

		noteText = new TextArea();
		noteText.setPrefRowCount(10);
		noteText.setWrapText(true);
		String subject = mailItem.getSubject();
		if (!subject.isEmpty()) {
			noteText.setText(subject + CRLF);
		}
		noteGrid.add(noteText, 0, noteRowIdx++, 3, 1);
		noteGrid.getRowConstraints().add(new RowConstraints());

		// Add a change listener to set the header label to "*Modified*".
		noteText.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				updateNoteState(NoteState.Modified);
			}
		});

		// The edit box should not eat the TAB key. This listener forwards
		// the focus to the next control, if the TAB key is pressed.
		noteText.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.TAB) {
					TextAreaSkin skin = (TextAreaSkin) noteText.getSkin();
					if (skin.getBehavior() instanceof TextAreaBehavior) {
						TextAreaBehavior behavior = (TextAreaBehavior) skin.getBehavior();
						if (event.isControlDown()) {
							behavior.callAction("InsertTab");
						} else if (event.isShiftDown()) {
							behavior.callAction("TraversePrevious");
						} else {
							behavior.callAction("TraverseNext");
						}
						event.consume();
					}

				}
			}
		});

		// --------------------------------------------------------------------
		// Line between edit box and date label

		Line noteBottomLine = new Line();
		noteBottomLine.setStartX(0);
		noteBottomLine.setStartY(0);
		noteBottomLine.setEndX(0);
		noteBottomLine.setEndY(0);
		NumberBinding bottomLineBinding = Bindings.add(noteGrid.widthProperty(), 0);
		noteBottomLine.endXProperty().bind(bottomLineBinding.subtract(8));
		noteGrid.add(noteBottomLine, 0, noteRowIdx++, 3, 1);
		noteGrid.getRowConstraints().add(new RowConstraints(3, 3, 3));

		// --------------------------------------------------------------------
		// Date label

		final Text noteDate = new Text();
		noteDate.setStyle("-fx-font: 12px \"Courier\"; -fx-font-weight: bold");
		noteGrid.getRowConstraints().add(new RowConstraints());
		noteGrid.add(noteDate, 0, noteRowIdx++, 3, 1);

		// This timer updates the note date
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(() -> {
					DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,
							FormatStyle.SHORT);
					ZonedDateTime date = ZonedDateTime.now();
					noteDate.setText(date.format(dateFormatter));
				});
			}
		}, 0, 1000);

		// --------------------------------------------------------------------
		// Checkbox "Display new note"

		ckDisplay = new CheckBox("Display new note");
		ckDisplay.setSelected(reg_displayNote);
		root.getChildren().add(ckDisplay);

		// --------------------------------------------------------------------
		// Checkbox "Assign category to mail"

		ckCatMail = new CheckBox("Assign category to mail");
		ckCatMail.setSelected(reg_alsoCategorizeMail);
		root.getChildren().add(ckCatMail);

		// ------------------------------------------------------------------------
		// Create a button for each category.

		for (CategoryItem cat : catList) {
			Button btn = new Button(cat.toString());
			root.getChildren().add(btn);

			String style = "-fx-background-color: " + toRGB(cat.getColor()) + "; ";
			if (isDarkColor(cat.getColor())) {
				style += "-fx-text-fill: white;";
			}
			btn.setStyle(style);
			btn.setMaxWidth(Double.MAX_VALUE);
			btn.setMaxHeight(20);
			btn.setCursor(Cursor.HAND);
			btn.setTooltip(new Tooltip("Create the note \n and assign it to category \"" + cat.toString() + "\"."));

			// This event handlers color the note view with the color of the
			// category
			btn.setOnMouseEntered((e) -> setNoteGridStyleIfUnsafed(noteGrid, cat.getColor()));
			btn.setOnMouseExited((e) -> setNoteGridStyleIfUnsafed(noteGrid, noteGridDefaultBackgColor));

			// This action handler creates the note.
			btn.setOnAction(new CategoryButtonActionEvent(cat));
		}

		return scene;
	}

	/**
	 * Button click handler which creates the note.
	 */
	private class CategoryButtonActionEvent implements EventHandler<ActionEvent> {

		final CategoryItem category;

		public CategoryButtonActionEvent(CategoryItem category) {
			this.category = category;
		}

		@Override
		public void handle(ActionEvent event) {

			// Do not create a note, if the note text is empty.
			if (noteText.getText().trim().isEmpty())
				return;

			// Set the note state to "saved".
			// Further mouse moves over the categories will no more update
			// the note's background.
			updateNoteState(NoteState.Saved);

			// Make sure, the correct background is assigned to the note.
			// If the note has been already saved, before this handler function
			// is executed, the mouse-enter function has not assigned
			// the right color to the note grid.
			setNoteGridStyleAlways(noteGrid, category.getColor());

			BackgTask.run(() -> {
				try {

					// Create note
					NoteItem noteItem = app.CreateItem(OlItemType.olNoteItem).as(NoteItem.class);

					// Append Outlook-ID to note text.
					String body = noteText.getText() + CRLF + CRLF + "Outlook:" + mailItem.getEntryID();
					noteItem.setBody(body);

					// Assign category to note
					String cats = category.toString();
					noteItem.setCategories(cats);

					// Assign category to mail if checkbox is selected
					boolean saveMail = false;
					if (ckCatMail.isSelected()) {
						saveMail = !mailItem.getCategories().equals(cats);
						if (saveMail) {
							mailItem.setCategories(cats);
						}
					}

					// Save note
					noteItem.Save();

					// Save mail
					if (saveMail) {
						mailItem.Save();
					}

					// Display note
					if (ckDisplay.isSelected()) {
						noteItem.Display(false);
					}

				} catch (Throwable e) {
					e.printStackTrace();
				}
			});

		}

	}

	private final static String CRLF = "\n";

}
