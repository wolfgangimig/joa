package ribbonx.outlook14.addin;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.outlook.Explorer;
import com.wilutions.mslib.outlook.ExplorerEvents;
import com.wilutions.mslib.outlook._Explorer;

/**
 * This class tracks the state of an Outlook Explorer window for your add-in and
 * ensures that what happens in this window is handled correctly.
 */
public class OutlookExplorer extends DispatchImpl implements ExplorerEvents {

	private Explorer m_Window;
	private EventHandler<Event> Close;
	private EventHandler<InvalidateEventArgs> InvalidateControl;

	public OutlookExplorer(_Explorer explorer) {
		m_Window = Dispatch.as(explorer, Explorer.class);
		m_Window.withEvents(this);
	}

	public void Close_addEventHandler(EventHandler<Event> h) {
		this.Close = h;
	}

	public void Close_removeEventHandler() {
		this.Close = null;
	}

	public void InvalidateControl_addEventHandler(EventHandler<InvalidateEventArgs> h) {
		this.InvalidateControl = h;
	}

	public void InvalidateControl_removeEventHandler() {
		this.InvalidateControl = null;
	}

	@Override
	public void onActivate() throws ComException {
	}

	@Override
	public void onFolderSwitch() throws ComException {
	}

	@Override
	public void onBeforeFolderSwitch(Dispatch NewFolder, ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onViewSwitch() throws ComException {
	}

	@Override
	public void onBeforeViewSwitch(Object NewView, ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onDeactivate() throws ComException {
	}

	@Override
	public void onSelectionChange() throws ComException {
		RaiseInvalidateControl("MyTab");
	}

	@Override
	public void onClose() throws ComException {
		// Unhook explorer-level events
		m_Window.releaseEvents(this);

		// Raise the OutlookExplorer close event
		if (Close != null) {
			Close.handle(new ActionEvent(this, null));
		}

		m_Window = null;
	}

	private void RaiseInvalidateControl(String controlID) {
		if (InvalidateControl != null)
			InvalidateControl.handle(new InvalidateEventArgs(this, controlID));
	}

	public static class InvalidateEventArgs extends ActionEvent {
		private static final long serialVersionUID = 1L;
		private final String controlID;

		public InvalidateEventArgs(Object source, String controlId) {
			super(source, null);
			controlID = controlId;
		}

		public String getControlID() {
			return controlID;
		}
	}

	public Explorer getWindow() {
		return m_Window;
	}

}
