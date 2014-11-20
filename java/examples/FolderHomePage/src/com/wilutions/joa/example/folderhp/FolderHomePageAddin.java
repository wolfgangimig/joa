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
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook._NameSpace;

@CoClass(progId = "FolderHomePageAddin.Class", guid = "{eb7a37de-e328-46b7-bfe6-3e09b95402c7}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "JOA Folder Home Page", description = "Displays JavaFX scene on a folder's home page")
public class FolderHomePageAddin extends OutlookAddin {

	final ExplorerTaskPane taskPane = new ExplorerTaskPane();

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

		MAPIFolder crmFolder = Utility.Folder.CreateFolder(root, Properties.Resources.CRMFolderName);

		String webViewFile = registerWebView(CRMTodayView.class, "CRM Today", "123");
		
		crmFolder.setWebViewURL(webViewFile);
		crmFolder.setWebViewOn(true);
	}

	public void onJoaTaskPaneClicked(Dispatch control, Boolean pressed) {
		BackgTask.run(() -> {

			if (taskPane.hasWindow()) {
				taskPane.setVisible(pressed);
			} else {
				Object parentWindow = getApplication().ActiveExplorer();
				createTaskPaneWindowAsync(taskPane, "JOA TaskPane", parentWindow, (taskPane, ex) -> {
					if (ex == null) {
						taskPane.setVisible(true);
					}
					if (ex != null) {
						ex.printStackTrace();
					}
				});
			}
		});
	}
}
