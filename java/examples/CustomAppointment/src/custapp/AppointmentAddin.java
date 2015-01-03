package custapp;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.outlook.FormPage;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.AppointmentItem;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;

// Erste Formularseite des Terminformulars kann nicht geändert werden:
// http://www.slipstick.com/developer/tips-customizing-outlook-appointment-forms/
// http://msdn.microsoft.com/en-us/library/office/ff863941%28v=office.15%29.aspx

/**
 * This addin example uses form pages.
 * 
 * Form pages are similar to form regions of type "separate". 
 * When adding a new form page to the inspector window, the item gets modified.
 * This is a disadvantage compared to form regions and that is why form regions
 * should be prefered.
 */
@CoClass(progId = "AppointmentAddin.Class", guid = "{8b4681a9-cdee-4ad8-9114-035ec2c6b49c}")
@DeclAddin(friendlyName = "Appointment Addin", description = "Addin with extended appointment information", application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart)
public class AppointmentAddin extends OutlookAddin implements InspectorsEvents {

	private volatile _Inspectors inspectors;

	public AppointmentAddin() {
	}

	@Override
	public void onStartup() throws ComException {
		System.out.println("AppointmentAddin.onStartup");
		Application app = getApplication();
		inspectors = app.getInspectors();
		Dispatch.withEvents(inspectors, this);
		int n = inspectors.getCount();
		for (int i = 0; i < n; i++) {
			Inspector inspector = inspectors.Item(i);
			onNewInspector(inspector);
		}
	}

	@Override
	public void onQuit() throws ComException {
		System.out.println("AppointmentAddin.onQuit");
		Dispatch.releaseEvents(inspectors, this);
		JoaDll.dumpComReferenceMap("before exit");
		super.onQuit();
	}

	@Override
	public void onNewInspector(final _Inspector insp) throws ComException {
		Inspector inspector = Dispatch.as(insp, Inspector.class);
		System.out.println("AppointmentAddin.onNewInspector " + inspector);
		IDispatch dispItem = inspector.getCurrentItem();
		if (dispItem.is(AppointmentItem.class)) {
			
			// Add form pages in background task.
			// Otherwise their icons might not be visible in the ribbon bar.
			BackgTask.run(() -> {
				
				FormPage fp = new MyFormPageFX();
				fp.setTitle("FX Page");
				fp.showAsync(inspector, null);
				
				FormPage fp2 = new MyFormPageSwing();
				fp2.setTitle("Swing Page");
				fp2.showAsync(inspector, null);
				
//				inspector.SetCurrentFormPage("FX Page");
//				inspector.HideFormPage("Termin");

			});
		}
	}

}
