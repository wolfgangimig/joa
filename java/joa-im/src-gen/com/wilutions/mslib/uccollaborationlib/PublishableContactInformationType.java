/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PublishableContactInformationType.
 * Enumerates the presense items for update. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PublishableContactInformationType {

  // Typed constants
  public final static PublishableContactInformationType ucPresenceUpdateAvailability = new PublishableContactInformationType(0);
  public final static PublishableContactInformationType ucPresenceUpdateActivityId = new PublishableContactInformationType(1);
  public final static PublishableContactInformationType ucPresenceUpdateCustomActivityId = new PublishableContactInformationType(2);
  public final static PublishableContactInformationType ucPresenceUpdateLocationName = new PublishableContactInformationType(3);
  public final static PublishableContactInformationType ucPresenceUpdatePersonalNote = new PublishableContactInformationType(4);
  public final static PublishableContactInformationType ucPresenceUpdateDisplayPhoto = new PublishableContactInformationType(5);
  public final static PublishableContactInformationType ucPresenceUpdatePhotoUrl = new PublishableContactInformationType(6);
  public final static PublishableContactInformationType ucPublishablePresenceItemTypeMax = new PublishableContactInformationType(7);

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
  private PublishableContactInformationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new PublishableContactInformationType(value);
    }
  }
}
