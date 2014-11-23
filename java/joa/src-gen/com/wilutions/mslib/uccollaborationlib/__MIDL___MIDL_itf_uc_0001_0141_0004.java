/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0004.
 * Enumerates the presense items for update. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0141_0004 {
  ucPresenceUpdateAvailability(0),
  ucPresenceUpdateActivityId(1),
  ucPresenceUpdateCustomActivityId(2),
  ucPresenceUpdateLocationName(3),
  ucPresenceUpdatePersonalNote(4),
  ucPresenceUpdateDisplayPhoto(5),
  ucPresenceUpdatePhotoUrl(6),
  ucPublishablePresenceItemTypeMax(7);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0141_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0141_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceUpdateAvailability;
    case 1: return ucPresenceUpdateActivityId;
    case 2: return ucPresenceUpdateCustomActivityId;
    case 3: return ucPresenceUpdateLocationName;
    case 4: return ucPresenceUpdatePersonalNote;
    case 5: return ucPresenceUpdateDisplayPhoto;
    case 6: return ucPresenceUpdatePhotoUrl;
    case 7: return ucPublishablePresenceItemTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0141_0004.class);
    }
  }
}
