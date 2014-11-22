package com.wilutions.joa.example.folderhp;

import com.wilutions.com.Missing;
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook.OlDefaultFolders;
import com.wilutions.mslib.outlook._Folders;
import com.wilutions.mslib.outlook._NameSpace;

public class FolderClass {

	// / <summary>
	// / Returns a reference to a child folder of a folder with a specific name,
	// creating an inbox folder if it doesn't exist.
	// / </summary>
	// / <param name="root"></param>
	// / <param name="folderName"></param>
	// / <returns></returns>
	public MAPIFolder CreateFolder(MAPIFolder root, String folderName) {
		return CreateFolder(root, folderName, OlDefaultFolders.olFolderInbox);
	}

	// / <summary>
	// / Returns a reference to a child folder of a folder with a specific name,
	// creating it if it doesn't exist
	// / </summary>
	// / <param name="root"></param>
	// / <param name="folderName"></param>
	// / <param name="folderType"></param>
	// / <returns></returns>
	public MAPIFolder CreateFolder(MAPIFolder root, String folderName, OlDefaultFolders folderType) {
		MAPIFolder folder = GetFolder(root, folderName);
		if (folder == null)
			folder = AddChildFolder(root, folderName, folderType);

		return folder;
	}

	// / <summary>
	// / Returns a reference to a child folder of a folder with a specific name,
	// returning null if it doesn't exist
	// / </summary>
	// / <param name="root"></param>
	// / <param name="folderName"></param>
	// / <returns></returns>
	public MAPIFolder GetFolder(MAPIFolder root, String folderName) {
		_Folders folders = root.getFolders();
		int c = folders.getCount();
		for (int i = 0; i < c; i++) {

			MAPIFolder f = folders.Item(i+1);
			if (f.getName().equals(folderName)) {
				return f;
			}
		}
		return null;
	}

	public MAPIFolder GetRootFolder(_NameSpace session) {
		return session.GetDefaultFolder(OlDefaultFolders.olFolderInbox).getParent().as(MAPIFolder.class);
	}

	// / <summary>
	// / Creates a child inbox folder with the specified name
	// / </summary>
	// / <param name="root"></param>
	// / <param name="folderName"></param>
	// / <returns></returns>
	public MAPIFolder AddChildFolder(MAPIFolder root, String folderName) {
		return AddChildFolder(root, folderName, OlDefaultFolders.olFolderInbox);
	}

	// / <summary>
	// / Creates a child folder with the specified name of the specified folder
	// type
	// / </summary>
	// / <param name="root"></param>
	// / <param name="folderName"></param>
	// / <param name="folderType"></param>
	// / <returns></returns>
	public MAPIFolder AddChildFolder(MAPIFolder root, String folderName, OlDefaultFolders folderType) {
		return root.getFolders().Add(folderName, folderType); 
	}

}
