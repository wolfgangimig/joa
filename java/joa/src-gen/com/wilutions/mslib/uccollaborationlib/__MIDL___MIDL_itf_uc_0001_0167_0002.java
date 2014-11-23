/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0002.
 * conference Setting type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0167_0002 {
  ucConfFocusFactory(458753),
  ucConfEnableAudioConferencing(268894210),
  ucConfEnableAVConferencing(268894211),
  ucConfEnableDataConferencing(268894212),
  ucConfMeetingSize(537329669),
  ucConfAllowAnonymousParticipants(268894214),
  ucConfEnablePSTNConferencing(268894215),
  ucConfACPsInfo(458760),
  ucConfEnableEnterpriseCustomizedHelp(268894217),
  ucConfCustomizedHelpUrl(458762);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0167_0002(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0167_0002.class);
    }
  }
}
