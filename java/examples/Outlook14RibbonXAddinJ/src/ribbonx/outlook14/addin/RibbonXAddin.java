package ribbonx.outlook14.addin;

import java.io.IOException;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeAddinUtil;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.mslib.office.IMsoContactCard;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.office.MsoContactCardAddressType;
import com.wilutions.mslib.office.impl.IMsoContactCardImpl;
import com.wilutions.mslib.outlook.AddressEntry;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.Attachment;
import com.wilutions.mslib.outlook.AttachmentSelection;
import com.wilutions.mslib.outlook.ContactItem;
import com.wilutions.mslib.outlook.Explorer;
import com.wilutions.mslib.outlook.Folder;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook.NavigationGroup;
import com.wilutions.mslib.outlook.NavigationModule;
import com.wilutions.mslib.outlook.NoteItem;
import com.wilutions.mslib.outlook.OlItemType;
import com.wilutions.mslib.outlook.OutlookBarShortcut;
import com.wilutions.mslib.outlook.Selection;
import com.wilutions.mslib.outlook.Store;
import com.wilutions.mslib.outlook.View;
import com.wilutions.mslib.outlook._AttachmentSelection;
import com.wilutions.mslib.outlook.impl.OutlookBarShortcutImpl;
import com.wilutions.mslib.outlook.impl.SelectionImpl;
import com.wilutions.mslib.outlook.impl.ViewImpl;

/**
 * Transformation of MSDN article
 * "Extending the User Interface in Outlook 2010". In a C# VSTO project, the
 * Add-in and Ribbon functionality is separated into different classes. The
 * Add-in class implements the ApplicationEvents_11 and the Ribbon class
 * implements IRibbonExtensibility. With JOA, both functionality must be
 * implemented in a single class. This is why the class RibbonXAddin is derived
 * from ThisAddin.
 * 
 * @see http://msdn.microsoft.com/en-us/library/ee692172(office.14).aspx
 */
@CoClass(progId = "RibbonXOutlook14Addin.Class", guid = "{f886dd17-3bd7-498c-b1ec-f2b4ec8d477f}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "My First JOA Add-in", description = "Example for an Outlook Add-in developed in Java")
public class RibbonXAddin extends ThisAddin {

	// private IRibbonUI ribbon; already defined in superclass.

	private Application olApplication;

	public RibbonXAddin() {
	}

	@Override
	public void onStartup() throws ComException {
		super.onStartup();
		olApplication = m_Application;
	}

	@Override
	public String GetCustomUI(String ribbonID) {
		// The superclass can find the XML data in
		// files named "Ribbon." + ribbonId in the
		// package of this.getClass(). In order to
		// closely follow the C# code, this function
		// reads the XML data itself.

		String customUI = "";

		// Return the appropriate Ribbon XML for ribbonID
		switch (ribbonID) {
		case "Microsoft.Outlook.Explorer":
			customUI = GetResourceText("Explorer.xml");
			return customUI;
		case "Microsoft.Outlook.Mail.Read":
			customUI = GetResourceText("ReadMail.xml");
			return customUI;
		case "Microsoft.Mso.IMLayerUI":
			customUI = GetResourceText("ContactCard.xml");
			return customUI;
		default:
			return "";
		}
	}

	public void Ribbon_Load(IRibbonUI ribbonUI) {
		super.m_Ribbon = ribbonUI;
	}

	// Only show MyTab when Explorer Selection is
	// a received mail or when Inspector is a read note
	public boolean MyTab_GetVisible(IRibbonControl control) {
		try {
			Dispatch context = control.getContext();

			if (context.is(Explorer.class)) {
				Explorer explorer = context.as(Explorer.class);

				// explorer.getSelection throws an exception 80020009
				// when this function is called at startup.

				Selection selection = explorer.getSelection();
				if (selection.getCount() == 1) {
					Dispatch item = selection.Item(1);
					if (item.is(MailItem.class)) {
						MailItem oMail = item.as(MailItem.class);
						return oMail.getSent();
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else if (context.is(Inspector.class)) {
				Inspector oInsp = context.as(Inspector.class);
				Dispatch item = oInsp.getCurrentItem();
				if (item.is(MailItem.class)) {
					MailItem oMail = item.as(MailItem.class);
					return oMail.getSent();
				} else {
					return false;
				}
			} else {
				return true;
			}

		} catch (ComException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean MyTabInspector_GetVisible(IRibbonControl control) {
		try {
			Dispatch context = control.getContext();
			if (context.is(Inspector.class)) {
				Inspector oInsp = context.as(Inspector.class);
				Dispatch item = oInsp.getCurrentItem();
				if (item != null && item.is(MailItem.class)) {
					MailItem oMail = item.as(MailItem.class);
					return oMail.getSent();
				} else {
					return false;
				}
			} else {
				return true;
			}
		} catch (ComException e) {
			e.printStackTrace();
			return false;
		}
	}

	// MyBackstageTab_GetVisible hides the place in an Inspector window
	public boolean MyBackstageTab_GetVisible(IRibbonControl control) {
		return control.getContext().is(Explorer.class);
	}

	public Dispatch GetCurrentUserImage(IRibbonControl control) {
		return m_pictdisp;
	}

	// OnMyButtonClick routine handles all button click events
	// and displays IRibbonControl.Context in message box
	public void OnMyButtonClick(IRibbonControl control) {
		
		final Dispatch context = control.getContext();
		if (context == null)
			return;

		try {
			String msg = "";

			if (context.is(AttachmentSelection.class)) {
				msg = "Context=AttachmentSelection" + "\n";
				AttachmentSelection attachSel = context.as(AttachmentSelection.class);
				int n = attachSel.getCount();
				for (int i = 1; i <= n; i++) {
					Attachment attach = attachSel.Item(i);
					msg = msg + attach.getDisplayName() + "\n";
				}
			} else if (context.is(Folder.class)) {
				msg = "Context=Folder" + "\n";
				Folder folder = context.as(Folder.class);
				msg = msg + folder.getName();
			} else if (context.is(Selection.class)) {
				msg = "Context=Selection" + "\n";
				Selection selection = context.as(Selection.class);
				if (selection.getCount() == 1) {
					OutlookItem olItem = new OutlookItem(selection.Item(1));
					msg = msg + olItem.getSubject() + "\n" + olItem.getLastModificationTime();
				} else {
					msg = msg + "Multiple Selection Count=" + selection.getCount();
				}
			} else if (context.is(OutlookBarShortcut.class)) {
				msg = "Context=OutlookBarShortcut" + "\n";
				OutlookBarShortcut shortcut = context.as(OutlookBarShortcutImpl.class);
				msg = msg + shortcut.getName();
			} else if (context.is(Store.class)) {
				msg = "Context=Store" + "\n";
				Store store = context.as(Store.class);
				msg = msg + store.getDisplayName();
			} else if (context.is(View.class)) {
				msg = "Context=View" + "\n";
				View view = context.as(ViewImpl.class);
				msg = msg + view.getName();
			} else if (context.is(Inspector.class)) {
				msg = "Context=Inspector" + "\n";
				Inspector insp = context.as(Inspector.class);
				if (insp.getAttachmentSelection().getCount() >= 1) {
					_AttachmentSelection attachSel = insp.getAttachmentSelection();
					int n = attachSel.getCount();
					for (int i = 1; i <= n; i++) {
						Attachment attach = attachSel.Item(i);
						msg = msg + attach.getDisplayName() + "\n";
					}
				} else {
					OutlookItem olItem = new OutlookItem(insp.getCurrentItem());
					msg = msg + olItem.getSubject();
				}
			} else if (context.is(Explorer.class)) {
				msg = "Context=Explorer" + "\n";
				Explorer explorer = context.as(Explorer.class);

				boolean hasAttachments = false;

				// Reading the property AttachmentSelection always results
				// in an
				// error inside Outlook. This applies for a VBS script and a
				// VBA macro too,
				// see /vbscript/ExplorerAttachmentSelectionFails.vbs.
				// int n1 =
				// getApplication().ActiveExplorer().getAttachmentSelection().getCount();
				// int n2 = explorer.getAttachmentSelection().getCount();
				// hasAttachments = n2 >= 1;

				if (hasAttachments) {
					_AttachmentSelection attachSel = explorer.getAttachmentSelection();
					int n = attachSel.getCount();
					for (int i = 1; i <= n; i++) {
						Attachment attach = attachSel.Item(i);
						msg = msg + attach.getDisplayName() + "\n";
					}
				} else {
					Selection selection = explorer.getSelection();
					if (selection.getCount() == 1) {
						OutlookItem olItem = new OutlookItem(selection.Item(1));
						msg = msg + olItem.getSubject() + "\n" + olItem.getLastModificationTime();
					} else {
						msg = msg + "Multiple Selection Count=" + selection.getCount();
					}
				}
			} else if (context.is(NavigationGroup.class)) {
				msg = "Context=NavigationGroup" + "\n";
				NavigationGroup navGroup = context.as(NavigationGroup.class);
				msg = msg + navGroup.getName();
			} else if (context.is(IMsoContactCard.class)) {
				msg = "Context=IMsoContactCard" + "\n";
				IMsoContactCard card = context.as(IMsoContactCardImpl.class);
				if (card.getAddressType() == MsoContactCardAddressType.msoContactCardAddressTypeOutlook) {
					// IMSOContactCard.Address is AddressEntry.ID
					AddressEntry addr = olApplication.getSession().GetAddressEntryFromID(card.getAddress());
					if (addr != null) {
						msg = msg + addr.getName();
					}
				}
			} else if (context.is(NavigationModule.class)) {
				msg = "Context=NavigationModule";
				// } else if (control.getContext() == null) {
				// msg = "Context=Null";
			} else if (context.is(ContactItem.class)) {
				msg = "Context=ContactItem";
			} else {
				msg = "Context=Unknown " + new OutlookItem(context).getClass_();
			}

			// MessageBox.Show(msg,
			// "RibbonXOutlook14AddinCS",
			// MessageBoxButtons.OK,
			// MessageBoxIcon.Information);

			// Create a new NoteItem object and "cast" it to NoteItem.class
			NoteItem noteItem = olApplication.CreateItem(OlItemType.olNoteItem).as(NoteItem.class);
			noteItem.setBody("RibbonXOutlook14AddinCS\n" + msg);
			noteItem.Display(true);
			noteItem.Delete();
		} catch (ComException e) {
			e.printStackTrace();
		}
	}

	private String GetResourceText(String resourceName) {
		String ret = "";
		try {
			ret = OfficeAddinUtil.getResourceAsString(this.getClass(), resourceName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
