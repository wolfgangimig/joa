package com.wilutions.joa.example.folderhp;

import java.io.IOException;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook._NameSpace;

@CoClass(progId = "FolderHomePageAddin.Class", guid = "{eb7a37de-e328-46b7-bfe6-3e09b95402c7}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "JOA Folder Home Page", description = "Displays JavaFX scene on a folder's home page")
public class FolderHomePageAddin extends OutlookAddin {
	
	private boolean fvButtonPressed;
	private IRibbonUI ribbon;
	private MyFolderView myFolderView;

	public FolderHomePageAddin() {
		Globals.setThisAddin(this);
	}
	
	@Override
	public void onStartup() throws ComException {
		super.onStartup();

		// Create Folder with home page, if it does not exist.
		BackgTask.run(() -> {
			try {
				createHomePageFolder();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public void createHomePageFolder() throws IOException {
		_NameSpace session = getApplication().getSession();
		MAPIFolder root = Utility.Folder.GetRootFolder(session);
		MAPIFolder crmFolder = Utility.Folder.CreateFolder(root, "JOA Folder");
		super.assignFolderView(crmFolder, MyFolderView.class, "My Folder View", "ID*1:2/3");
	}

	public void onLoadRibbon(IRibbonUI ribbon) throws ComException {
		this.ribbon = ribbon;
	}
	
	public void FVButton_onAction(Dispatch control, Boolean pressed) throws ComException {
		setFvButtonPressed(pressed);
	}
	
	public boolean FVButton_getPressed(IRibbonControl control) throws ComException {
		return isFvButtonPressed();
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public boolean isFvButtonPressed() {
		return fvButtonPressed;
	}

	public void setFvButtonPressed(boolean fvButtonPressed) {
		this.fvButtonPressed = fvButtonPressed;
		ribbon.InvalidateControl("FVButton");
	}

	public MyFolderView getMyFolderView() {
		return myFolderView;
	}

	public void setMyFolderView(MyFolderView myFolderView) {
		this.myFolderView = myFolderView;
	}
	
	
}
