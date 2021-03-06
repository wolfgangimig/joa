package addin1;

import java.util.Date;

import com.wilutions.com.BackgTask;
import com.wilutions.com.ByRef;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.Missing;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.IconManager;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.fx.MessageBox;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook.NoteItem;
import com.wilutions.mslib.outlook.OlItemType;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

@CoClass(progId = "JoaAddin1.Class", guid = "{d5f0439b-27ea-4848-a230-3fa5496ea5e1}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "JOA Tutorial Add-in", description = "Example for an Outlook Add-in developed in Java")
public class JoaAddin1 extends OutlookAddin {

	final ExplorerTaskPane taskPane = new ExplorerTaskPane();
	final IconManager ribbonIcons;
	private IRibbonUI ribbon;

	public JoaAddin1() {
		Globals.setThisAddin(this);
		ribbonIcons = new IconManager(this);
	}

	@Override
	public void onItemSend(IDispatch item, ByRef<Boolean> cancel) throws ComException {
		if (item.is(MailItem.class)) {
			MailItem mailItem = Dispatch.as(item, MailItem.class);
			System.out.println("sent mail, subject=" + mailItem.getSubject());
		}
	}

	@Override
	public void onNewMailEx(String EntryID) throws ComException {
		IDispatch item = getApplication().getSession().GetItemFromID(EntryID, Missing.Value);
		if (item != null && item.is(MailItem.class)) {
			MailItem mailItem = Dispatch.as(item, MailItem.class);
			System.out.println("received mail, subject=" + mailItem.getSubject());
		}
	}

	public void onSmileButtonClicked1(IRibbonControl ribbonControl) {
		Object owner = getApplication().ActiveWindow();
		MessageBox.show(owner, "Message", "You pressed the " + ribbonControl.getId(), (result, ex) -> {
			System.out.println("MessageBox closed by button=" + result);
		});
	}

	public void onSmileButtonClicked(Dispatch ribbonControl) {

		// Event functions triggered from Outlook should not immediately call
		// Outlook functions during processing. This can cause a deadlock.
		// Thus: execute the code in a background thread.
		BackgTask.run(() -> {

			// Obtain Outlook application interface
			com.wilutions.mslib.outlook.Application app = Globals.getThisAddin().getApplication();

			// Create a new NoteItem object and "cast" it to NoteItem.class
			NoteItem noteItem = app.CreateItem(OlItemType.olNoteItem).as(NoteItem.class);

			// Assign some text and display the note
			noteItem.setBody("Hello Note");
			noteItem.Display(true);

			noteItem.Delete();

		});
	}

	public Dispatch onSmileButton2GetImage(IRibbonControl control) {
		Dispatch picdisp = ribbonIcons.get("MyHappyFaceIcon.png");
		return picdisp;
	}

	public void onSmileButton2Clicked(Dispatch ribbonControl) {
		Dialog1 dialog = new Dialog1();
		Object parentWindow = getApplication().ActiveExplorer();
		dialog.showAsync(parentWindow, (ret, ex) -> {
			System.out.println("dialog returned=" + ret);
		});
	}

	public void onJoaTaskPaneClicked(Dispatch control, Boolean pressed) {
		BackgTask.run(() -> {
			if (taskPane.hasWindow()) {
				taskPane.setVisible(pressed);
			} else {
				Object parentWindow = getApplication().ActiveExplorer();
				createTaskPaneWindowAsync(taskPane, "JOA TaskPane", parentWindow, (succ, ex) -> {
					if (ex == null) {
						taskPane.setVisible(true);
					}
					if (ex != null) {
						ex.printStackTrace();
					}
				});
			}
		});
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public void onLoadRibbon(IRibbonUI ribbon) {
		this.ribbon = ribbon;
	}

	public boolean onJoaTaskPaneGetPressed(IRibbonControl control) {
		boolean ret = taskPane.isVisible();
		return ret;
	}
	
	public void onMenuButtonClicked(IRibbonControl control) {
		Object owner = getApplication().ActiveExplorer();
		String controlId = control.getId();
		MessageBox.show(owner, "hello", "Button " + controlId + " clicked", null);
	}
	
	public Dispatch getMenuButtonImage(IRibbonControl control) {
		return ribbonIcons.get("MyHappyFaceIcon.png");
	}
	
	public String getMenuButtonLabel(IRibbonControl control) {
		return "My Button Label " + (new Date(System.currentTimeMillis()));
	}
	
	public Boolean getMenuButtonVisible(IRibbonControl control) {
		return true;
	}

	private void showDialog() {

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));

		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0);

		final TextField textField = new TextField();
		grid.add(textField, 0, 1);

		Button bnOK = new Button("OK");
		grid.add(bnOK, 0, 2);

		Scene dialog = new Scene(grid);

		Stage stage = new Stage();
		stage.setScene(dialog);

		bnOK.setOnAction((e) -> {
			stage.close();
		});

		stage.show();

		stage.toFront();
	}

}
