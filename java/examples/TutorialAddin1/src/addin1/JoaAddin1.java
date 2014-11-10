package addin1;

import java.util.Map;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.MessageBox;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.outlook.NoteItem;
import com.wilutions.mslib.outlook.OlItemType;

@CoClass(progId = "JoaAddin1.Class", guid = "{d5f0439b-27ea-4848-a230-3fa5496ea5e1}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "JOA Tutorial Add-in", description = "Example for an Outlook Add-in developed in Java")
public class JoaAddin1 extends OutlookAddin {

    final ExplorerTaskPane taskPane = new ExplorerTaskPane();
    final Map<String, Dispatch> ribbonIcons;

    public JoaAddin1() {
        Globals.setThisAddin(this);
        ribbonIcons = createRibbonIconsFromResources(this.getClass(), new String[] { "MyHappyFaceIcon.png" });
    }

    public void onHappyButtonClicked(Dispatch ribbonControl) {

        // Event functions triggered from Outlook should not immediately call
        // Outlook functions during processing. This can cause a deadlock.
        // Thus: execute the code in a background thread.
        BackgTask.run(() -> {

            // Obtain Outlook application interface
                com.wilutions.mslib.outlook.Application app = Globals.getThisAddin().getApplication();

                // Create a new NoteItem object and "cast" it to NoteItem.class
                NoteItem noteItem = app.CreateItem(OlItemType.olNoteItem).as(NoteItem.class);

                // Assign some text and display the note
                noteItem.setBody("Hello Note");
                noteItem.Display(true);

                noteItem.Delete();

            });
    }

    public Dispatch onHappyButton2GetImage(IRibbonControl control) {
        Dispatch picdisp = ribbonIcons.get("MyHappyFaceIcon.png");
        return picdisp;
    }
    
    public void onHappyButton2Clicked(IRibbonControl ribbonControl) {
    	Object owner = getApplication().ActiveWindow();
    	MessageBox.show(owner, "Message", "You pressed the " + ribbonControl.getId(), (result, ex) -> {
    		System.out.println("This button was pressed=" + result);
    	});
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

    public boolean onJoaTaskPaneGetPressed(IRibbonControl control) {
        boolean ret = taskPane.isVisible();
        return ret;
    }

}
