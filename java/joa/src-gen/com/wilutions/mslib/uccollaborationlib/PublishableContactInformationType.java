/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PublishableContactInformationType.
 * Enumerates the presense items for update. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PublishableContactInformationType {
  ucPresenceUpdateAvailability(0),
  ucPresenceUpdateActivityId(1),
  ucPresenceUpdateCustomActivityId(2),
  ucPresenceUpdateLocationName(3),
  ucPresenceUpdatePersonalNote(4),
  ucPresenceUpdateDisplayPhoto(5),
  ucPresenceUpdatePhotoUrl(6),
  ucPublishablePresenceItemTypeMax(7);

  public final int value;
  private PublishableContactInformationType(int value) { this.value = value; }
  public static  PublishableContactInformationType valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceUpdateAvailability;
    case 1: return ucPresenceUpdateActivityId;
    case 2: return ucPresenceUpdateCustomActivityId;
    case 3: return ucPresenceUpdateLocationName;
    case 4: return ucPresenceUpdatePersonalNote;
    case 5: return ucPresenceUpdateDisplayPhoto;
    case 6: return ucPresenceUpdatePhotoUrl;
    case 7: return ucPublishablePresenceItemTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PublishableContactInformationType.class);
    }
  }
}
