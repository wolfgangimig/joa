/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0250_0001.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0250_0001 {
  ucClientSettingsSettingLoaded(269615104),
  ucClientSettingsEnableP2PVideo(269615105),
  ucClientSettingsPublicCloudProviderInfo(1611792386),
  ucClientSettingsPersonalContactStore(538050563),
  ucClientSettingsTelephonyMode(538050564),
  ucClientSettingsMax(5);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0250_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0250_0001 valueOf(int value) {
    switch(value) {
    case 269615104: return ucClientSettingsSettingLoaded;
    case 269615105: return ucClientSettingsEnableP2PVideo;
    case 1611792386: return ucClientSettingsPublicCloudProviderInfo;
    case 538050563: return ucClientSettingsPersonalContactStore;
    case 538050564: return ucClientSettingsTelephonyMode;
    case 5: return ucClientSettingsMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0250_0001.class);
    }
  }
}
