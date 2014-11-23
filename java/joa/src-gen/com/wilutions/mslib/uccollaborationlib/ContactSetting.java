/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSetting.
 * Contact settings. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactSetting {
  ucContactTagged(268435456),
  ucContactAccessLevel(805306369),
  ucContactExchangeServiceEntryId(2),
  ucContactSource(805306371),
  ucContactDefaultContactEndpoint(1073741828);

  public final int value;
  private ContactSetting(int value) { this.value = value; }
  public static  ContactSetting valueOf(int value) {
    switch(value) {
    case 268435456: return ucContactTagged;
    case 805306369: return ucContactAccessLevel;
    case 2: return ucContactExchangeServiceEntryId;
    case 805306371: return ucContactSource;
    case 1073741828: return ucContactDefaultContactEndpoint;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactSetting.class);
    }
  }
}
