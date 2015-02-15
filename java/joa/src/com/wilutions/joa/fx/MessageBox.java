package com.wilutions.joa.fx;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.Dispatch;
import com.wilutions.com.WindowHandle;

/**
 * This class provides convenient functions to display message boxes.
 */
public class MessageBox {

	public final static int CANCEL = ModalDialogFX.CANCEL;
	public final static int OK = ModalDialogFX.OK;

	public final static double DEFAULT_BUTTON_MIN_WIDTH = 100;

	/**
	 * Defines a message box button.
	 */
	public static class ButtonDefinition {
		
		/**
		 * Set focus on this button when message box is shown.
		 */
		public boolean focus;

		/**
		 * ID to be passed as result to the callback expression of
		 * {@link MessageBox#show(Object, String, String, AsyncResult)}
		 */
		public int id;

		/**
		 * Button object.
		 */
		public Button button;
	}

	public static class Builder {

		private double _buttonMinWidth = DEFAULT_BUTTON_MIN_WIDTH;
		private Object _owner;
		private String _title;
		private String _text;
		private List<ButtonDefinition> _buttonDefinitions = new ArrayList<ButtonDefinition>();

		public Builder owner(Object v) {
			assert (v instanceof Dispatch) || (v instanceof WindowHandle) || (v instanceof Window);
			if (v instanceof WindowHandle || v instanceof Window) {
				_owner = v;
			}
			else {
				_owner = Dispatch.as(v, Dispatch.class);
			}
			return this;
		}

		public Builder title(String v) {
			_title = v;
			return this;
		}

		public Builder text(String v) {
			_text = v;
			return this;
		}

		public Builder button(int id, Button button) {
			ButtonDefinition bd = new ButtonDefinition();
			bd.id = id;
			bd.button = button;
			_buttonDefinitions.add(bd);
			return this;
		}

		public Builder button(int id, String text) {
			Button button = new Button(text);
			button.setMinWidth(_buttonMinWidth);
			return button(id, button);
		}

		public Builder focus() {
			_buttonDefinitions.get(_buttonDefinitions.size()-1).focus = true;
			return this;
		}
		
		public Builder bdefault() {
			_buttonDefinitions.get(_buttonDefinitions.size()-1).button.setDefaultButton(true);
			return this;
		}

		public Builder cancel() {
			_buttonDefinitions.get(_buttonDefinitions.size()-1).button.setCancelButton(true);
			return this;
		}
		
		public Builder mwidth(double buttonMinWidth) {
			_buttonMinWidth = buttonMinWidth;
			return this;
		}
		
		public void show(AsyncResult<Integer> asyncResult) {
			DialogBox dialog = new DialogBox(_title, _text, _buttonDefinitions);
			dialog.showAsync(_owner, asyncResult);
		}
	}

	public static Builder create(Object owner) {
		return new Builder().owner(owner);
	}

	/**
	 * Show message box with OK button.
	 * 
	 * @param owner
	 *            the message box will be placed on top of this window. It can
	 *            be an explorer or inspector window.
	 * @param title
	 *            dialog caption
	 * @param text
	 *            message box's message
	 * @param asyncResult
	 *            callback expression which is invoked, when the OK button is
	 *            pressed.
	 */
	public static void show(Object owner, String title, String text, AsyncResult<Integer> asyncResult) {
		
		Button button = new Button("OK");
		button.setMinWidth(DEFAULT_BUTTON_MIN_WIDTH);
		button.setDefaultButton(true);
		
		List<ButtonDefinition> buttonDefinitions = new ArrayList<ButtonDefinition>();
		ButtonDefinition bd = new ButtonDefinition();
		bd.id = 1;
		bd.button = button;
		buttonDefinitions.add(bd);
		
		DialogBox dialog = new DialogBox(title, text, buttonDefinitions);
		dialog.showAsync(owner, asyncResult);
	}

	protected static class DialogBox extends ModalDialogFX<Integer> {

		private String text;
		private List<ButtonDefinition> buttonDefinitions;

		DialogBox(String title, String text, List<ButtonDefinition> buttons) {
			setTitle(title);
			this.text = text;
			this.buttonDefinitions = buttons;
			setMinimizeBox(false);
			setMaximizeBox(false);
		}

		@Override
		public Scene createScene() {

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

			for (ButtonDefinition buttonDefinition : buttonDefinitions) {

				final int buttonId = buttonDefinition.id;
				final Button bn = buttonDefinition.button;
				hbox.getChildren().add(bn);

				bn.setOnAction((e) -> {
					DialogBox.this.finish(buttonId);
				});

				if (buttonDefinition.focus) {
					DialogBox.this.addEventHandler(WindowEvent.WINDOW_SHOWN, (e) -> {
						bn.requestFocus();
					});
				}
			}

			return dialog;
		}

		@Override
		public void onSystemMenuClose() {
			finish(CANCEL);
		}
	}
}
