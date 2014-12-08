package custapp;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.fx.FormPageFX;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.msforms.Control;
import com.wilutions.mslib.msforms.IPage;
import com.wilutions.mslib.msforms.Page;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.AppointmentItem;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook.Pages;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;



// Erste Formularseite des Terminformulars kann nicht geändert werden:
// http://www.slipstick.com/developer/tips-customizing-outlook-appointment-forms/
// http://msdn.microsoft.com/en-us/library/office/ff863941%28v=office.15%29.aspx



@CoClass(progId = "AppointmentAddin.Class", guid = "{8b4681a9-cdee-4ad8-9114-035ec2c6b49c}")
@DeclAddin(friendlyName = "Appointment Addin", description = "Addin with extended appointment information", application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart)
public class AppointmentAddin extends OutlookAddin implements InspectorsEvents {

	private volatile _Inspectors inspectors;

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
		BackgTask.run(() -> {
			try {
				IDispatch dispItem = inspector.getCurrentItem();
				if (dispItem.is(AppointmentItem.class)) {
					//AppointmentItem appoItem = dispItem.as(AppointmentItem.class);
					
					
					Pages pages = inspector.getModifiedFormPages().as(Pages.class);
					
					int n = pages.getCount();
					if (n != 0) {
						IPage page = pages.Item(0).as(IPage.class);
						int m = page.getControls().getCount();
						System.out.println("#controls=" + m);
					}

					

					
//					Control oLabel = pageA.getControls().Add("Forms.Label.1", "lblCompanies", Boolean.TRUE);
//					placeControl(oLabel, 5, 10, 100, 13);
//					oLabel._put("Caption", "Companies:");
					
					Page page = pages.Add("My Page").as(Page.class);
					Control joaCtrl = page.getControls().Add("JoaBridgeCtrl.Class", "joaCtrl", Boolean.TRUE);
					placeControl(joaCtrl, 0, 0, 500, 500);
					
					long hwnd = joaCtrl._GethWnd();
					final long hwndJoaCtrl = ((Number) joaCtrl._get("HWND")).longValue();
					FormPageFX pageView = new FormPageFX() {
						public Scene createScene() {
							return AppointmentAddin.this.createScene();
						}
					};
					pageView.createAndShowEmbeddedWindowAsync(hwndJoaCtrl, (succ, ex) -> {
					});
					
					
					
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
	}
	
	
	private void placeControl(Control ctl, int left, int top, int width, int height) throws ComException {
		ctl.setLeft(Float.valueOf(left));
		ctl.setTop(Float.valueOf(top));
		ctl.setWidth(Float.valueOf(width));
		ctl.setHeight(Float.valueOf(height));
	}

	public Scene createScene() {
		
		VBox root = new VBox();

		MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        menuFile.getItems().addAll(newFile, openFile);
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        root.getChildren().add(menuBar);
        
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));
		root.getChildren().add(grid);
		
		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0, 2, 1);

		TextField textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);

        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
        	    "First", "Second", "Third")
        	);
        grid.add(cb, 0, 2, 2, 1);
        
		Button bnOK = new Button("OK");
		grid.add(bnOK, 0, 3);
		bnOK.setDefaultButton(true);

		Button bnCancel = new Button("Cancel");
		grid.add(bnCancel, 1, 3);
		bnCancel.setCancelButton(true);

	
		Scene dialog = new Scene(root);

		return dialog;
	}

}
