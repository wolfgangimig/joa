/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientSettingsType.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ClientSettingsType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ClientSettingsType ucClientSettingsSettingLoaded = new ClientSettingsType(269615104);
  public final static ClientSettingsType ucClientSettingsEnableP2PVideo = new ClientSettingsType(269615105);
  public final static ClientSettingsType ucClientSettingsPublicCloudProviderInfo = new ClientSettingsType(1611792386);
  public final static ClientSettingsType ucClientSettingsPersonalContactStore = new ClientSettingsType(538050563);
  public final static ClientSettingsType ucClientSettingsTelephonyMode = new ClientSettingsType(538050564);
  public final static ClientSettingsType ucClientSettingsMax = new ClientSettingsType(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucClientSettingsSettingLoaded = 269615104;
  public final static int _ucClientSettingsEnableP2PVideo = 269615105;
  public final static int _ucClientSettingsPublicCloudProviderInfo = 1611792386;
  public final static int _ucClientSettingsPersonalContactStore = 538050563;
  public final static int _ucClientSettingsTelephonyMode = 538050564;
  public final static int _ucClientSettingsMax = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ClientSettingsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ClientSettingsType valueOf(int value) {
    switch(value) {
    case 269615104: return ucClientSettingsSettingLoaded;
    case 269615105: return ucClientSettingsEnableP2PVideo;
    case 1611792386: return ucClientSettingsPublicCloudProviderInfo;
    case 538050563: return ucClientSettingsPersonalContactStore;
    case 538050564: return ucClientSettingsTelephonyMode;
    case 5: return ucClientSettingsMax;
    default: return new ClientSettingsType(value);
    }
  }
}
