/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0002.
 * conference Setting type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0167_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfFocusFactory = new __MIDL___MIDL_itf_uc_0001_0167_0002(458753);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfEnableAudioConferencing = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894210);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfEnableAVConferencing = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894211);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfEnableDataConferencing = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894212);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfMeetingSize = new __MIDL___MIDL_itf_uc_0001_0167_0002(537329669);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfAllowAnonymousParticipants = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894214);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfEnablePSTNConferencing = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894215);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfACPsInfo = new __MIDL___MIDL_itf_uc_0001_0167_0002(458760);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfEnableEnterpriseCustomizedHelp = new __MIDL___MIDL_itf_uc_0001_0167_0002(268894217);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0002 ucConfCustomizedHelpUrl = new __MIDL___MIDL_itf_uc_0001_0167_0002(458762);

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
  private __MIDL___MIDL_itf_uc_0001_0167_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0167_0002 valueOf(int value) {
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
    default: return new __MIDL___MIDL_itf_uc_0001_0167_0002(value);
    }
  }
}
