/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSetting.
 * Contact settings. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactSetting {

  // Typed constants
  public final static ContactSetting ucContactTagged = new ContactSetting(268435456);
  public final static ContactSetting ucContactAccessLevel = new ContactSetting(805306369);
  public final static ContactSetting ucContactExchangeServiceEntryId = new ContactSetting(2);
  public final static ContactSetting ucContactSource = new ContactSetting(805306371);
  public final static ContactSetting ucContactDefaultContactEndpoint = new ContactSetting(1073741828);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactTagged = 268435456;
  public final static int _ucContactAccessLevel = 805306369;
  public final static int _ucContactExchangeServiceEntryId = 2;
  public final static int _ucContactSource = 805306371;
  public final static int _ucContactDefaultContactEndpoint = 1073741828;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactSetting(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactSetting valueOf(int value) {
    switch(value) {
    case 268435456: return ucContactTagged;
    case 805306369: return ucContactAccessLevel;
    case 2: return ucContactExchangeServiceEntryId;
    case 805306371: return ucContactSource;
    case 1073741828: return ucContactDefaultContactEndpoint;
    default: return new ContactSetting(value);
    }
  }
}
