/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0250_0001.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0250_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsSettingLoaded = new __MIDL___MIDL_itf_uc_0001_0250_0001(269615104);
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsEnableP2PVideo = new __MIDL___MIDL_itf_uc_0001_0250_0001(269615105);
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsPublicCloudProviderInfo = new __MIDL___MIDL_itf_uc_0001_0250_0001(1611792386);
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsPersonalContactStore = new __MIDL___MIDL_itf_uc_0001_0250_0001(538050563);
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsTelephonyMode = new __MIDL___MIDL_itf_uc_0001_0250_0001(538050564);
  public final static __MIDL___MIDL_itf_uc_0001_0250_0001 ucClientSettingsMax = new __MIDL___MIDL_itf_uc_0001_0250_0001(5);

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
  private __MIDL___MIDL_itf_uc_0001_0250_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0250_0001 valueOf(int value) {
    switch(value) {
    case 269615104: return ucClientSettingsSettingLoaded;
    case 269615105: return ucClientSettingsEnableP2PVideo;
    case 1611792386: return ucClientSettingsPublicCloudProviderInfo;
    case 538050563: return ucClientSettingsPersonalContactStore;
    case 538050564: return ucClientSettingsTelephonyMode;
    case 5: return ucClientSettingsMax;
    default: return new __MIDL___MIDL_itf_uc_0001_0250_0001(value);
    }
  }
}
