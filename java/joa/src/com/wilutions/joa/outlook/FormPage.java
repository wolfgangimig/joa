package com.wilutions.joa.outlook;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.WindowHandle;
import com.wilutions.mslib.msforms.Control;
import com.wilutions.mslib.msforms.DataObject;
import com.wilutions.mslib.msforms.FormEvents;
import com.wilutions.mslib.msforms.ReturnBoolean;
import com.wilutions.mslib.msforms.ReturnEffect;
import com.wilutions.mslib.msforms.ReturnInteger;
import com.wilutions.mslib.msforms.ReturnSingle;
import com.wilutions.mslib.msforms.ReturnString;
import com.wilutions.mslib.msforms._UserForm;
import com.wilutions.mslib.msforms.fmAction;
import com.wilutions.mslib.msforms.fmDragState;
import com.wilutions.mslib.msforms.fmScrollAction;
import com.wilutions.mslib.msforms.fmScrollBars;
import com.wilutions.mslib.outlook.Pages;
import com.wilutions.mslib.outlook._Inspector;

public abstract class FormPage extends DispatchImpl implements FormEvents, WindowHandle {

	private _UserForm page;
	private Control joaCtrl;
	private String title = "";

	public FormPage() {
	}

	public FormPage(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void showAsync(_Inspector inspector, AsyncResult<Boolean> asyncResult) {

		Pages pages = inspector.getModifiedFormPages().as(Pages.class);

		page = pages.Add(title).as(_UserForm.class);
		page.setScrollBars(fmScrollBars.fmScrollBarsNone);

		page.withEvents(this);

		initJoaCtrl(asyncResult);
	}

	protected abstract void createAndShowEmbeddedWindowAsync(final long hwndParent, AsyncResult<Boolean> asyncResult);

	@Override
	public void onAddControl(Control Control) throws ComException {
	}

	@Override
	public void onBeforeDragOver(ReturnBoolean Cancel, Control Control, DataObject Data, Float X, Float Y,
			fmDragState State, ReturnEffect Effect, Short Shift) throws ComException {
	}

	@Override
	public void onBeforeDropOrPaste(ReturnBoolean Cancel, Control Control, fmAction Action, DataObject Data, Float X,
			Float Y, ReturnEffect Effect, Short Shift) throws ComException {
	}

	@Override
	public void onClick() throws ComException {
	}

	@Override
	public void onDblClick(ReturnBoolean Cancel) throws ComException {
	}

	@Override
	public void onError(Short Number, ReturnString Description, Integer SCode, String Source, String HelpFile,
			Integer HelpContext, ReturnBoolean CancelDisplay) throws ComException {
	}

	@Override
	public void onKeyDown(ReturnInteger KeyCode, Short Shift) throws ComException {
	}

	@Override
	public void onKeyPress(ReturnInteger KeyAscii) throws ComException {
	}

	@Override
	public void onKeyUp(ReturnInteger KeyCode, Short Shift) throws ComException {
	}

	@Override
	public void onLayout() throws ComException {
		placeControl();
	}

	private void initJoaCtrl(AsyncResult<Boolean> asyncResult) {

		joaCtrl = page.getControls().Add("JoaBridgeCtrl.Class", "joaCtrl", Boolean.TRUE);
		placeControl();

		final long hwndJoaCtrl = ((Number) joaCtrl._get("HWND")).longValue();

		createAndShowEmbeddedWindowAsync(hwndJoaCtrl, (succ, ex) -> {
			if (asyncResult != null) {
				asyncResult.setAsyncResult(succ, ex);
			}
		});
	}

	private void placeControl() throws ComException {
		if (joaCtrl != null) {
			final Float width = page.getInsideWidth();
			final Float height = page.getInsideHeight();
			joaCtrl.setLeft(0f);
			joaCtrl.setTop(0f);
			joaCtrl.setWidth(width);
			joaCtrl.setHeight(height);
		}
	}

	@Override
	public void onMouseDown(Short Button, Short Shift, Float X, Float Y) throws ComException {
	}

	@Override
	public void onMouseMove(Short Button, Short Shift, Float X, Float Y) throws ComException {
	}

	@Override
	public void onMouseUp(Short Button, Short Shift, Float X, Float Y) throws ComException {
	}

	@Override
	public void onRemoveControl(Control Control) throws ComException {
	}

	@Override
	public void onScroll(fmScrollAction ActionX, fmScrollAction ActionY, Float RequestDx, Float RequestDy,
			ReturnSingle ActualDx, ReturnSingle ActualDy) throws ComException {
	}

	@Override
	public void onZoom(ByRef<Short> Percent) throws ComException {
	}

}
