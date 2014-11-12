package com.wilutions.joa;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.WindowEvent;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ComException;

/**
 * This class provides convenient functions to display message boxes.
 */
public class MessageBox {

	public final static int CANCEL = ModalDialog.CANCEL;
	public final static int OK = ModalDialog.OK;

	/**
	 * Defines a message box button.
	 */
	public static class ButtonDefinition {
		
		/**
		 * ID to be passed as result to the callback expression of {@link MessageBox#show(Object, String, String, AsyncResult)}
		 */
		public int id;
		
		/**
		 * Text to be displayed on the button.
		 */
		public String text;

		/**
		 * Constructor to initialize an object.
		 * @param id button ID
		 * @param text button caption
		 */
		public ButtonDefinition(int id, String text) {
			this.id = id;
			this.text = text;
		}
	}

	/**
	 * Show message box with given buttons.
	 * @param owner the message box will be placed on top of this window. It can be an explorer or inspector window.
	 * @param title dialog caption
	 * @param text message box's message
	 * @param buttons buttons to be displayed 
	 * @param asyncResult callback expression which is invoked, when one of the buttons is pressed. 
	 */
	public static void show(Object owner, String title, String text, ButtonDefinition[] buttons,
			AsyncResult<Integer> asyncResult) {
		DialogBox dialog = new DialogBox(title, text, buttons);
		dialog.showAsync(owner, asyncResult);
	}

	/**
	 * Show message box with OK button.
	 * @param owner the message box will be placed on top of this window. It can be an explorer or inspector window.
	 * @param title dialog caption
	 * @param text message box's message
	 * @param asyncResult callback expression which is invoked, when the OK button is pressed. 
	 */
	public static void show(Object owner, String title, String text, AsyncResult<Integer> asyncResult) {
		ButtonDefinition[] buttons = new ButtonDefinition[] {
				new ButtonDefinition(1, "OK"),
		};
		show(owner, title, text, buttons, asyncResult);
	}

	protected static class DialogBox extends ModalDialog<Integer> {

		private String text;
		private ButtonDefinition[] buttons;

		DialogBox(String title, String text, ButtonDefinition[] buttons) {
			setTitle(title);
			this.text = text;
			this.buttons = buttons;
			setMinimizeBox(false);
			setMaximizeBox(false);
		}

		@Override
		protected Scene createScene() throws ComException {

			VBox vbox = new VBox();
			vbox.setAlignment(Pos.CENTER);
			vbox.setPadding(new Insets(10));

			Label textBox = new Label(text);
			textBox.setWrapText(true);
			vbox.getChildren().add(textBox);
			
			HBox hbox = new HBox();
			hbox.setAlignment(Pos.CENTER);
			hbox.setPadding(new Insets(10));
			hbox.setSpacing(10);
			vbox.getChildren().add(hbox);
			
			Scene dialog = new Scene(vbox);
			
			final double buttonWidth = 100;

			for (int i = 0; i < buttons.length; i++) {

				final int columnIdx = i;

				final Button bn = new Button(buttons[columnIdx].text);
				bn.setMinWidth(buttonWidth);
				hbox.getChildren().add(bn);
				
				bn.setOnAction((e) -> {
					DialogBox.this.finish(buttons[columnIdx].id);
				});
				
				if (i == 1) {
					dialog.addEventHandler(WindowEvent.WINDOW_SHOWING, (e) -> {
						bn.requestFocus();
					});
				}
			}

			
			return dialog;
		}

	}
}
