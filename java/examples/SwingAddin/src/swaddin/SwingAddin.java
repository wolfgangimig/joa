package swaddin;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.IconManager;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.joa.swing.MessageBoxSwing;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook._Explorer;

@CoClass(progId = "SwingAddin.Class", guid = "{4ba197f5-81d6-4150-a710-4d6a30fd7a38}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "Swing Addin", description = "Java Swing Outlook Addin Example.")
public class SwingAddin extends OutlookAddin {

	ExplorerTaskPane taskPane = new ExplorerTaskPane();
	final IconManager ribbonIcons;
	private IRibbonUI ribbon;

	public SwingAddin() {
		Globals.setThisAddin(this);
		ribbonIcons = new IconManager(this);
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public void onLoadRibbon(IRibbonUI ribbon) {
		this.ribbon = ribbon;
	}
	
	public void onSmileButtonClicked(IRibbonControl control) {
		_Explorer owner = Globals.getThisAddin().getApplication().ActiveExplorer();
		MessageBoxSwing.show(owner, "Dialog Title", "You pressed the Smile button", (ret, ex) -> {
			System.out.println("msgbox button=" + ret);
		});
	}

	public Dispatch onSmileButton2GetImage(IRibbonControl control) {
		Dispatch picdisp = ribbonIcons.get("MyHappyFaceIcon.png");
		return picdisp;
	}

	public void onSmileButton2Clicked(IRibbonControl control) {
		Dialog1 dialog = new Dialog1();
		_Explorer owner = Globals.getThisAddin().getApplication().ActiveExplorer();

		dialog.showAsync(owner, (result, ex) -> {
			if (result != null && result.length() != 0) {
				System.out.println("Dialog result=" + result);
			}
		});

	}

	public boolean onJoaTaskPaneGetPressed(IRibbonControl control) {
		boolean ret = taskPane.isVisible();
		return ret;
	}

	public void onJoaTaskPaneClicked(Dispatch control, Boolean pressed) {
		BackgTask.run(() -> {
			if (taskPane.hasWindow()) {
				taskPane.setVisible(pressed);
			} else {
				Object parentWindow = getApplication().ActiveExplorer();
				createTaskPaneWindowAsync(taskPane, "JOA TaskPane", parentWindow, (succ, ex) -> {
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
