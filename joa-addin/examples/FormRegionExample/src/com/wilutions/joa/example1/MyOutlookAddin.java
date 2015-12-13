package com.wilutions.joa.example1;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.TaskPane;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.msforms.Control;
import com.wilutions.mslib.msforms.Page;
import com.wilutions.mslib.outlook.ContactItem;
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook.OlDefaultFolders;
import com.wilutions.mslib.outlook.OlItemType;
import com.wilutions.mslib.outlook._Folders;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._NameSpace;
import com.wilutions.mslib.outlook.impl.PagesImpl;

@CoClass(progId = "JoaExample1.Addin", guid = "{0020ABA7-EC2D-481F-A6A3-406FDE391259}")
@DeclAddin(loadBehavior=LoadBehavior.LoadOnStart, application = OfficeApplication.Outlook, friendlyName = "Example1 Java Addin", description = "First example for an Outlook Addin developed in Java")
public class MyOutlookAddin extends OutlookAddin {

	private static MyOutlookAddin instance;
	private TaskPane taskPane1 = new MyTaskPane();

	public MyOutlookAddin() {
		instance = this;
	}

	public static MyOutlookAddin getInstance() {
		return instance;
	}

	@Override
	public void onButtonClicked(IDispatch ribbonControl) {
		System.out.println("onButtonClicked " + ribbonControl);

		try {
			_NameSpace olns = getApplication().GetNamespace("MAPI");
			MAPIFolder myFolder = olns.GetDefaultFolder(OlDefaultFolders.olFolderContacts);
			System.out.println("myFoldeR="  +myFolder);

			_Folders folders = olns.getFolders();
			int foldersCount = folders.getCount();
			System.out.println("folderscount=" + foldersCount);
			MAPIFolder folder_i = folders.GetFirst();
			while (folder_i != null) {
				String fullPath = folder_i.getFolderPath();
				System.out.println("fullPath=" + fullPath);
				folder_i = folders.GetNext();
			}

			MAPIFolder folder = getApplication().getSession().PickFolder();
			String folderName = folder.getFolderPath();
			System.out.println(folderName);

			// PickerDialog pdlg = app.getPickerDialog();
			// pdlg.setDataHandlerId("{000CDF0A-0000-0000-C000-000000000046}");
			// pdlg.setTitle("Sample Picker Dialog");
			// PickerProperties props = pdlg.getProperties();
			// props.Add("SiteUrl", "http://www.elo.com",
			// MsoPickerField.msoPickerFieldText);
			// PickerResults existingResults = pdlg.CreatePickerResults();
			// existingResults.Add("johndoe@contoso.com", "John Doe", "User",
			// "", null, null);
			// ByRef<PickerResults> existingResultsRef = new
			// ByRef<PickerResults>(existingResults);
			// PickerResults pickerResults = pdlg.Show(Boolean.FALSE,
			// existingResultsRef);
			// System.out.println("pickerResults=" + pickerResults);

			// Dispatch dispMailItem = app.CreateItem(OlItemType.olMailItem);
			// MailItem mailItem = new MailItem(dispMailItem);
			// mailItem.setCC("w.imig@elo.com");
			// Recipients recipients = mailItem.getRecipients();
			// recipients.Add("w.imig@elo.com");
			// mailItem.getRecipients().Add("a.grunna@elo.com");

			// OlObjectClass cls = mailItem.getClass_();
			//
			// OlImportance imp = mailItem.getImportance();
			// mailItem.setImportance(OlImportance.olImportanceHigh);
			// imp = mailItem.getImportance();
			//
			// OlSensitivity sen = mailItem.getSensitivity();
			// mailItem.setSensitivity(OlSensitivity.olPrivate);
			//
			// OlFlagIcon flg = mailItem.getFlagIcon();
			// mailItem.setFlagIcon(OlFlagIcon.olBlueFlagIcon);
			//
			// mailItem.setHTMLBody("<html><body><i>hallo mail</i></body></html>");
			// mailItem.Display(Boolean.FALSE);

		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			System.gc();
			System.gc();
		}

	}

	public void ButtonClicked2(Dispatch ribbonControl) {
		System.out.println("ButtonClicked2 " + ribbonControl);

		createCustomContactItem();

	}

	private void createCustomContactItem() {
		try {
			// http://support.microsoft.com/kb/238755

			ContactItem oNewItem = getApplication().CreateItem(OlItemType.olContactItem).as(ContactItem.class);
			_Inspector oInsp = oNewItem.getGetInspector();

			// Create a new form page called "My Page"
			Page oPage = oInsp.getModifiedFormPages().as(PagesImpl.class).Add("My Page").as(Page.class);
			
			// Index Property is declared in the type library but not supported.
			// It is also documnented here: http://msdn.microsoft.com/en-us/library/bb176981.aspx
			// A VBA script cannot access the Index property too.
			// int index = oPage.getIndex();

			Control oLabel = oPage.getControls().Add("Forms.Label.1", "lblCompanies", Boolean.TRUE);
			placeControl(oLabel, 5, 10, 100, 13);
			oLabel._put("Caption", "Companies:");

			oInsp.SetCurrentFormPage("My Page");

			oNewItem.Display(Boolean.FALSE);

		} catch (ComException e) {
			e.printStackTrace();
		}

	}

	private void placeControl(Control ctl, int top, int left, int width, int height) throws ComException {
		ctl.setLeft(Float.valueOf(left));
		ctl.setTop(Float.valueOf(top));
		ctl.setWidth(Float.valueOf(width));
		ctl.setHeight(Float.valueOf(height));
	}

	/**
	 * Ribbon control "checkBox" onAction method has an additional parameter.
	 * How to synchronized the visibility of the TaskPane with the button? The
	 * TaskPane could be closed by button X.
	 * 
	 * @param ribbonControl
	 * @param pressed
	 */
	public void ButtonClicked3(final Dispatch ribbonControl, final Boolean pressed) throws ComException  {
		System.out.println("ButtonClicked3 " + ribbonControl);

		if (taskPane1.hasWindow()) {
			boolean v = pressed != null ? pressed.booleanValue() : true;
			try {
				taskPane1.setVisible(v);
			} catch (ComException e) {
				e.printStackTrace();
			}
		} else {
			Object parentWindow = getApplication().ActiveExplorer();
			createTaskPaneWindowAsync(taskPane1, "Hello TaskPane", parentWindow, null);
		}
	}

	public void ButtonClicked4(final Dispatch ribbonControl) {
		System.out.println("ButtonClicked4 " + ribbonControl);

		if (taskPane1.hasWindow()) {
			try {
				boolean v = taskPane1.isVisible();
				taskPane1.setVisible(!v);
			} catch (ComException e) {
				e.printStackTrace();
			}
		} else {
			Object parentWindow = getApplication().ActiveExplorer();
			createTaskPaneWindowAsync(taskPane1, "Hello TaskPane", parentWindow, (taskPane, ex) -> {
				if (ex != null) {
					ex.printStackTrace();
				}
				else {
					System.out.println("Task pane added");
				}

			});

		}

	}

	public void AddTaskPaneClicked(final Dispatch ribbonControl) throws ComException {
		System.out.println("AddTaskPaneClicked " + ribbonControl);
		Object parentWindow = getApplication().ActiveExplorer();
		final TaskPane taskPane = new MyTaskPane();
		createTaskPaneWindowAsync(taskPane, "New TaskPane", parentWindow, (succ, ex) -> {
			if (ex != null) {
				ex.printStackTrace();
			}
			else {
				taskPane.setVisible(true);
				System.out.println("Task pane added");
			}
		});
	}

	@Override
	public void onItemLoad(IDispatch Item) throws ComException {
		

	}



}
