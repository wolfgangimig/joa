/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0004.
 * Enumerates the presense items for update. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0141_0004 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdateAvailability = new __MIDL___MIDL_itf_uc_0001_0141_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdateActivityId = new __MIDL___MIDL_itf_uc_0001_0141_0004(1);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdateCustomActivityId = new __MIDL___MIDL_itf_uc_0001_0141_0004(2);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdateLocationName = new __MIDL___MIDL_itf_uc_0001_0141_0004(3);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdatePersonalNote = new __MIDL___MIDL_itf_uc_0001_0141_0004(4);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdateDisplayPhoto = new __MIDL___MIDL_itf_uc_0001_0141_0004(5);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPresenceUpdatePhotoUrl = new __MIDL___MIDL_itf_uc_0001_0141_0004(6);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0004 ucPublishablePresenceItemTypeMax = new __MIDL___MIDL_itf_uc_0001_0141_0004(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucPresenceUpdateAvailability = 0;
  public final static int _ucPresenceUpdateActivityId = 1;
  public final static int _ucPresenceUpdateCustomActivityId = 2;
  public final static int _ucPresenceUpdateLocationName = 3;
  public final static int _ucPresenceUpdatePersonalNote = 4;
  public final static int _ucPresenceUpdateDisplayPhoto = 5;
  public final static int _ucPresenceUpdatePhotoUrl = 6;
  public final static int _ucPublishablePresenceItemTypeMax = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0141_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0141_0004(value);
    }
  }
}
