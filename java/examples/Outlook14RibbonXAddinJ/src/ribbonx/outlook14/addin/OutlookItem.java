package ribbonx.outlook14.addin;

import java.util.Date;

import com.wilutions.com.Dispatch;
import com.wilutions.mslib.outlook.Actions;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.Attachments;
import com.wilutions.mslib.outlook.impl.ActionsImpl;
import com.wilutions.mslib.outlook.impl.AttachmentsImpl;

public class OutlookItem {

    private Dispatch m_item;  // the wrapped Outlook item
    //private Object[] m_args;  // dummy argument array

    
    // All this property names except OlSubject and OlLastModifiedTime are 
    // not used in the example. So only they are not all implemented in order
    // to save time.
    
    private final static String OlActions = "Actions";
    private final static String OlApplication = "Application";
    private final static String OlAttachments = "Attachments";
    private final static String OlBillingInformation = "BillingInformation";
    private final static String OlBody = "Body";   
//    private final static String OlCategories = "Categories";
    private final static String OlClass = "Class";
//    private final static String OlClose = "Close";
//    private final static String OlCompanies = "Companies";
//    private final static String OlConversationIndex = "ConversationIndex";
//    private final static String OlConversationTopic = "ConversationTopic";
//    private final static String OlCopy = "Copy";
//    private final static String OlCreationTime = "CreationTime";
//    private final static String OlDisplay = "Display";
//    private final static String OlDownloadState = "DownloadState";
//    private final static String OlEntryID = "EntryID";
//    private final static String OlFormDescription = "FormDescription";
//    private final static String OlGetInspector = "GetInspector";
//    private final static String OlImportance = "Importance";
//    private final static String OlIsConflict = "IsConflict";
//    private final static String OlItemProperties = "ItemProperties";
    private final static String OlLastModificationTime = "LastModificationTime";
//    private final static String OlLinks = "Links";
//    private final static String OlMarkForDownload = "MarkForDownload";
//    private final static String OlMessageClass = "MessageClass";
//    private final static String OlMileage = "Mileage";
//    private final static String OlMove = "Move";
//    private final static String OlNoAging = "NoAging";
//    private final static String OlOutlookInternalVersion = "OutlookInternalVersion";
//    private final static String OlOutlookVersion = "OutlookVersion";
//    private final static String OlParent = "Parent";
//    private final static String OlPrintOut = "PrintOut";
//    private final static String OlPropertyAccessor = "PropertyAccessor";
//    private final static String OlSave = "Save";
//    private final static String OlSaveAs = "SaveAs";
//    private final static String OlSaved = "Saved";
//    private final static String OlSensitivity = "Sensitivity";
//    private final static String OlSession = "Session";
//    private final static String OlShowCategoriesDialog = "ShowCategoriesDialog";
//    private final static String OlSize = "Size";
    private final static String OlSubject = "Subject";
//    private final static String OlUnRead = "UnRead";
//    private final static String OlUserProperties = "UserProperties";
    
    
	public OutlookItem(Dispatch item) {
		m_item = item;
//		m_args = new Object[0];
	}
	
	private <T extends Dispatch> T propertyGet(String propertyName, Class<T> clazz) {
		return Dispatch.as(m_item._get(propertyName), clazz);
	}
		
	public Actions getActions() {
		return propertyGet(OlActions, ActionsImpl.class);
	}
	
	public Application getApplication() {
		return propertyGet(OlApplication, Application.class);
	}
	
	public Attachments getAttachments() {
		return propertyGet(OlAttachments, AttachmentsImpl.class);
	}

	public String getBillingInformation() {
		return (String)m_item._get(OlBillingInformation);
	}
	
	public void setBillingInformation(String s) {
		m_item._put(OlBillingInformation, s);
	}
	
	public String getBody() {
		return (String)m_item._get(OlBody);
	}
	
	public void setBody(String s) {
		m_item._put(OlBody, s);
	}
	
	public Object getClass_() {
		return m_item._get(OlClass);
	}
	// ...
	
	public String getSubject() {
		return (String)m_item._get(OlSubject);
	}
	
	public Date getLastModificationTime() {
		Date obj = (Date)m_item._get(OlLastModificationTime);
		return obj;
	}
	

}
