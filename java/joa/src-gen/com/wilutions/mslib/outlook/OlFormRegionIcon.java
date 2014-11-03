/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionIcon.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormRegionIcon {
  olFormRegionIconDefault(1),
  olFormRegionIconUnread(2),
  olFormRegionIconRead(3),
  olFormRegionIconReplied(4),
  olFormRegionIconForwarded(5),
  olFormRegionIconUnsent(6),
  olFormRegionIconSubmitted(7),
  olFormRegionIconSigned(8),
  olFormRegionIconEncrypted(9),
  olFormRegionIconWindow(10),
  olFormRegionIconPage(11),
  olFormRegionIconRecurring(12);

  public final int value;
  private OlFormRegionIcon(int value) { this.value = value; }
  public static  OlFormRegionIcon valueOf(int value) {
    switch(value) {
    case 1: return olFormRegionIconDefault;
    case 2: return olFormRegionIconUnread;
    case 3: return olFormRegionIconRead;
    case 4: return olFormRegionIconReplied;
    case 5: return olFormRegionIconForwarded;
    case 6: return olFormRegionIconUnsent;
    case 7: return olFormRegionIconSubmitted;
    case 8: return olFormRegionIconSigned;
    case 9: return olFormRegionIconEncrypted;
    case 10: return olFormRegionIconWindow;
    case 11: return olFormRegionIconPage;
    case 12: return olFormRegionIconRecurring;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormRegionIcon.class);
    }
  }
}
