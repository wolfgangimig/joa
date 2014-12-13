package custapp;

import com.wilutions.com.ComException;
import com.wilutions.joa.outlook.InspectorWrapper;
import com.wilutions.mslib.outlook._Inspector;

public class AppointmentInspectorWrapper extends InspectorWrapper {

	public AppointmentInspectorWrapper(_Inspector _i) throws ComException {
		super(_i);
	}

	@Override
	public void onClose() throws ComException {
		super.onClose();
		
	}
}
