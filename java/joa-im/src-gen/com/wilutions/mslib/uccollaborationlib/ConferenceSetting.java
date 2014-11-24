/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceSetting.
 * conference Setting type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceSetting {

  // Typed constants
  public final static ConferenceSetting ucConfFocusFactory = new ConferenceSetting(458753);
  public final static ConferenceSetting ucConfEnableAudioConferencing = new ConferenceSetting(268894210);
  public final static ConferenceSetting ucConfEnableAVConferencing = new ConferenceSetting(268894211);
  public final static ConferenceSetting ucConfEnableDataConferencing = new ConferenceSetting(268894212);
  public final static ConferenceSetting ucConfMeetingSize = new ConferenceSetting(537329669);
  public final static ConferenceSetting ucConfAllowAnonymousParticipants = new ConferenceSetting(268894214);
  public final static ConferenceSetting ucConfEnablePSTNConferencing = new ConferenceSetting(268894215);
  public final static ConferenceSetting ucConfACPsInfo = new ConferenceSetting(458760);
  public final static ConferenceSetting ucConfEnableEnterpriseCustomizedHelp = new ConferenceSetting(268894217);
  public final static ConferenceSetting ucConfCustomizedHelpUrl = new ConferenceSetting(458762);

  // Integer constants for bitsets and switch statements
  public final static int _ucConfFocusFactory = 458753;
  public final static int _ucConfEnableAudioConferencing = 268894210;
  public final static int _ucConfEnableAVConferencing = 268894211;
  public final static int _ucConfEnableDataConferencing = 268894212;
  public final static int _ucConfMeetingSize = 537329669;
  public final static int _ucConfAllowAnonymousParticipants = 268894214;
  public final static int _ucConfEnablePSTNConferencing = 268894215;
  public final static int _ucConfACPsInfo = 458760;
  public final static int _ucConfEnableEnterpriseCustomizedHelp = 268894217;
  public final static int _ucConfCustomizedHelpUrl = 458762;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceSetting(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceSetting valueOf(int value) {
    switch(value) {
    case 458753: return ucConfFocusFactory;
    case 268894210: return ucConfEnableAudioConferencing;
    case 268894211: return ucConfEnableAVConferencing;
    case 268894212: return ucConfEnableDataConferencing;
    case 537329669: return ucConfMeetingSize;
    case 268894214: return ucConfAllowAnonymousParticipants;
    case 268894215: return ucConfEnablePSTNConferencing;
    case 458760: return ucConfACPsInfo;
    case 268894217: return ucConfEnableEnterpriseCustomizedHelp;
    case 458762: return ucConfCustomizedHelpUrl;
    default: return new ConferenceSetting(value);
    }
  }
}
