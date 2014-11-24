/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0034.
 * Enumerates the InstantMessage Capabilities 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0034 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0034 ucInstantMessageCapabilityCanRenderIsf = new __MIDL___MIDL_itf_uc_0001_0046_0034(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0034 ucInstantMessageCapabilityCanRenderGif = new __MIDL___MIDL_itf_uc_0001_0046_0034(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0034 ucInstantMessageCapabilityCanRenderRtf = new __MIDL___MIDL_itf_uc_0001_0046_0034(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0034 ucInstantMessageCapabilitySupportMime = new __MIDL___MIDL_itf_uc_0001_0046_0034(8);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0034 ucInstantMessageCapabilityCanRenderHtml = new __MIDL___MIDL_itf_uc_0001_0046_0034(16);

  // Integer constants for bitsets and switch statements
  public final static int _ucInstantMessageCapabilityCanRenderIsf = 1;
  public final static int _ucInstantMessageCapabilityCanRenderGif = 2;
  public final static int _ucInstantMessageCapabilityCanRenderRtf = 4;
  public final static int _ucInstantMessageCapabilitySupportMime = 8;
  public final static int _ucInstantMessageCapabilityCanRenderHtml = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0034(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0034 valueOf(int value) {
    switch(value) {
    case 1: return ucInstantMessageCapabilityCanRenderIsf;
    case 2: return ucInstantMessageCapabilityCanRenderGif;
    case 4: return ucInstantMessageCapabilityCanRenderRtf;
    case 8: return ucInstantMessageCapabilitySupportMime;
    case 16: return ucInstantMessageCapabilityCanRenderHtml;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0034(value);
    }
  }
}
