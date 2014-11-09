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

public class MessageBox {

	public final static int CANCEL = ModalDialog.CANCEL;
	public final static int OK = ModalDialog.OK;
	public final static int YES = 2;
	public final static int NO = 4;

	public static class ButtonDefinition {
		public int id;
		public String text;

		public ButtonDefinition(int id, String text) {
			this.id = id;
			this.text = text;
		}
	}

	public static void show(Object owner, String title, String text, ButtonDefinition[] buttons,
			AsyncResult<Integer> asyncResult) {
		DialogBox dialog = new DialogBox(title, text, buttons);
		dialog.showAsync(owner, asyncResult);
	}

	public static void show(Object owner, String title, String text, AsyncResult<Integer> asyncResult) {
		ButtonDefinition[] buttons = new ButtonDefinition[] {
				new ButtonDefinition(1, "OK"),
				new ButtonDefinition(2, "Cancel")
		};
		show(owner, title, text, buttons, asyncResult);
	}

	private static class DialogBox extends ModalDialog<Integer> {

		private String text;
		private ButtonDefinition[] buttons;

		DialogBox(String title, String text, ButtonDefinition[] buttons) {
			setTitle(title);
			this.text = text;
			this.buttons = buttons;
			setMinimizeBox(false);
			setMaximizeBox(false);
//			setWidth(300);
//			setHeight(200);
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
