/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0017.
 * Defines Contact Capability types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0017 {
  ucContactCanShowPresence(1),
  ucContactCanCaptureInstantMessage(2),
  ucContactCanRenderInstantMessage(4),
  ucContactCanCaptureAudio(8),
  ucContactCanRenderAudio(16),
  ucContactCanCaptureVideo(32),
  ucContactCanRenderVideo(64),
  ucContactCanCaptureAppShare(128),
  ucContactCanRenderAppShare(256);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0017(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0017 valueOf(int value) {
    switch(value) {
    case 1: return ucContactCanShowPresence;
    case 2: return ucContactCanCaptureInstantMessage;
    case 4: return ucContactCanRenderInstantMessage;
    case 8: return ucContactCanCaptureAudio;
    case 16: return ucContactCanRenderAudio;
    case 32: return ucContactCanCaptureVideo;
    case 64: return ucContactCanRenderVideo;
    case 128: return ucContactCanCaptureAppShare;
    case 256: return ucContactCanRenderAppShare;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0017.class);
    }
  }
}
