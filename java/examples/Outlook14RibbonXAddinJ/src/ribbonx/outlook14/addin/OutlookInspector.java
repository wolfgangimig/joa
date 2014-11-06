package ribbonx.outlook14.addin;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.outlook.AppointmentItem;
import com.wilutions.mslib.outlook.ContactItem;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorEvents;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook._Inspector;

public class OutlookInspector extends DispatchImpl implements InspectorEvents {

	private Inspector m_Window;
	// Use these instance variables to handle item-level events
	private MailItem m_Mail; // wrapped MailItem
	private AppointmentItem m_Appointment; // wrapped AppointmentItem
	private ContactItem m_Contact; // wrapped ContactItem
	private ContactItem m_Task; // wrapped TaskItem
	// Define other class-level item instance variables as needed

	private EventHandler<Event> Close;
	private EventHandler<InvalidateEventArgs> InvalidateControl;

	public OutlookInspector(_Inspector inspector) {
		m_Window = Dispatch.as(inspector, Inspector.class);

		// Hookup the close event
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
		// TODO Auto-generated method stub

	}

	@Override
	public void onDeactivate() throws ComException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClose() throws ComException {
		// Unhook events from the window
		m_Window.releaseEvents(this);

		// Raise the OutlookInspector close event
		if (Close != null) {
			Close.handle(new ActionEvent(this, null));
		}

		// Unhook any item-level instance variables
		// m_Contact = null;
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

	public Inspector getWindow() {
		return m_Window;
	}
}
