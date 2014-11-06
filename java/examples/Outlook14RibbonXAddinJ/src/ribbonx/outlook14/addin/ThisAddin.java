package ribbonx.outlook14.addin;

import java.util.ArrayList;
import java.util.List;

import javafx.event.Event;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.AddressEntry;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.ExchangeUser;
import com.wilutions.mslib.outlook.Explorers;
import com.wilutions.mslib.outlook.ExplorersEvents;
import com.wilutions.mslib.outlook.Inspectors;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook._Explorer;
import com.wilutions.mslib.outlook._Explorers;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;

/**
 * Transformation of MSDN article
 * "Extending the User Interface in Outlook 2010".
 * 
 * @see http://msdn.microsoft.com/en-us/library/ee692172(office.14).aspx
 */
public class ThisAddin extends OutlookAddin implements ExplorersEvents, InspectorsEvents {

	Application m_Application;

	// Outlook.Explorers m_Explorers;
	_Explorers m_Explorers;

	// Outlook.Inspectors m_Inspectors;
	_Inspectors m_Inspectors;

	// public stdole.IPictureDisp m_pictdisp = null;
	Dispatch m_pictdisp;

	// List of tracked explorer windows.
	List<OutlookExplorer> m_Windows;

	// List of traced inspector windows.
	List<OutlookInspector> m_InspectorWindows;

	// Ribbon UI reference.
	IRibbonUI m_Ribbon;

	@Override
	public void onStartup() throws ComException {
		super.onStartup();

		m_Application = getApplication();
		m_Explorers = m_Application.getExplorers();
		m_Inspectors = m_Application.getInspectors();
		m_Windows = new ArrayList<OutlookExplorer>();
		m_InspectorWindows = new ArrayList<OutlookInspector>();

		// Wire up event handlers to handle multiple Explorer windows.
		Dispatch.as(m_Explorers, Explorers.class).withEvents(this);

		// Wire up event handler to handle multiple Inspector windows.
		Dispatch.as(m_Inspectors, Inspectors.class).withEvents(this);

		// Add the ActiveExplorer to m_Windows.
		_Explorer expl = m_Application.ActiveExplorer();
		OutlookExplorer window = new OutlookExplorer(expl);
		m_Windows.add(window);

		// Hook up event handlers for window.
		window.Close_addEventHandler((e) -> WrappedWindow_Close(e));
		window.InvalidateControl_addEventHandler((e) -> WrappedWindow_InvalidateControl(e));

		// Get IPictureDisp for CurrentUser on startup
		try {
			AddressEntry addrEntry = getApplication().getSession().getCurrentUser().getAddressEntry();
			if (addrEntry.getType().equals("EX")) {
				ExchangeUser exchUser = addrEntry.GetExchangeUser();
				m_pictdisp = Dispatch.as(exchUser.GetPicture(), Dispatch.class);
			}
		} catch (ComException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onQuit() throws ComException {
		Dispatch.releaseEvents(m_Explorers, this);
		Dispatch.releaseEvents(m_Inspectors, this);

		// Dereference objects
		m_pictdisp = null;
		m_Explorers = null;
		m_Inspectors = null;
		m_Windows.clear();
		m_Windows = null;
		m_InspectorWindows.clear();
		m_InspectorWindows = null;
		m_Ribbon = null;
		m_Application = null;

		super.onQuit();
	}

	// / <summary>
	// / The NewExplorer event fires whenever a new Explorer is displayed.
	// / </summary>
	// / <param name="Explorer"></param>
	@Override
	public void onNewExplorer(_Explorer Explorer) throws ComException {
		try {
			// Check to see if this is a new window
			// we don't already track
			OutlookExplorer existingWindow = FindOutlookExplorer(Explorer);

			// If the m_Windows collection does not
			// have a window for this Explorer,
			// we should add it to m_Windows
			if (existingWindow == null) {
				OutlookExplorer window = new OutlookExplorer(Explorer);
				window.Close_addEventHandler((e) -> WrappedWindow_Close(e));
				window.InvalidateControl_addEventHandler((e) -> WrappedWindow_InvalidateControl(e));
				m_Windows.add(window);
			}
		} catch (ComException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void onNewInspector(_Inspector Inspector) throws ComException {
        m_Ribbon.Invalidate();

        try
        {
            // Check to see if this is a new window 
            // we don't already track
            OutlookInspector existingWindow =
                FindOutlookInspector(Inspector);
            // If the m_InspectorWindows collection does not 
            // have a window for this Inspector,
            // we should add it to m_InspectorWindows
            if (existingWindow == null)
            {
				OutlookInspector window = new OutlookInspector(Inspector);
				window.Close_addEventHandler((e) -> WrappedInspectorWindow_Close(e));
				window.InvalidateControl_addEventHandler((e) -> WrappedInspectorWindow_InvalidateControl(e));
				m_InspectorWindows.add(window);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

	}

	// / <summary>
	// / Looks up the window wrapper for a given window object
	// / </summary>
	// / <param name="window">An outlook explorer window</param>
	// / <returns></returns>
	OutlookExplorer FindOutlookExplorer(Object window) {
		for (OutlookExplorer Explorer : m_Windows) {
			if (Explorer.getWindow() == window) {
				return Explorer;
			}
		}
		return null;
	}

	// / <summary>
	// / Looks up the window wrapper for a given window object
	// / </summary>
	// / <param name="window">An outlook inspector window</param>
	// / <returns></returns>
	OutlookInspector FindOutlookInspector(Object window) {
		for (OutlookInspector Inspector : m_InspectorWindows) {
			if (Inspector.getWindow() == window) {
				return Inspector;
			}
		}
		return null;
	}

	private void WrappedWindow_Close(Event e) {
		OutlookExplorer window = (OutlookExplorer) e.getSource();
		window.Close_removeEventHandler();
		m_Windows.remove(window);
	}

	private void WrappedWindow_InvalidateControl(OutlookExplorer.InvalidateEventArgs e) {
		if (m_Ribbon != null) {
			m_Ribbon.InvalidateControl(e.getControlID());
		}
	}
	
	private void WrappedInspectorWindow_Close(Event e) {
		OutlookInspector window = (OutlookInspector) e.getSource();
		window.Close_removeEventHandler();
		m_Windows.remove(window);
	}

	private void WrappedInspectorWindow_InvalidateControl(OutlookInspector.InvalidateEventArgs e) {
		if (m_Ribbon != null) {
			m_Ribbon.InvalidateControl(e.getControlID());
		}
	}
}
