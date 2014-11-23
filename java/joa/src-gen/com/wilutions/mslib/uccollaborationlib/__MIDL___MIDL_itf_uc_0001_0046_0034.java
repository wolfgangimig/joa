/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0034.
 * Enumerates the InstantMessage Capabilities 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0034 {
  ucInstantMessageCapabilityCanRenderIsf(1),
  ucInstantMessageCapabilityCanRenderGif(2),
  ucInstantMessageCapabilityCanRenderRtf(4),
  ucInstantMessageCapabilitySupportMime(8),
  ucInstantMessageCapabilityCanRenderHtml(16);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0034(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0034 valueOf(int value) {
    switch(value) {
    case 1: return ucInstantMessageCapabilityCanRenderIsf;
    case 2: return ucInstantMessageCapabilityCanRenderGif;
    case 4: return ucInstantMessageCapabilityCanRenderRtf;
    case 8: return ucInstantMessageCapabilitySupportMime;
    case 16: return ucInstantMessageCapabilityCanRenderHtml;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0034.class);
    }
  }
}
