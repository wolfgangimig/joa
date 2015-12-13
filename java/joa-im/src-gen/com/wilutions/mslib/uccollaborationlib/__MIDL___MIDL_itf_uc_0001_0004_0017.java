/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0017.
 * Defines Contact Capability types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0017 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanShowPresence = new __MIDL___MIDL_itf_uc_0001_0004_0017(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanCaptureInstantMessage = new __MIDL___MIDL_itf_uc_0001_0004_0017(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanRenderInstantMessage = new __MIDL___MIDL_itf_uc_0001_0004_0017(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanCaptureAudio = new __MIDL___MIDL_itf_uc_0001_0004_0017(8);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanRenderAudio = new __MIDL___MIDL_itf_uc_0001_0004_0017(16);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanCaptureVideo = new __MIDL___MIDL_itf_uc_0001_0004_0017(32);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanRenderVideo = new __MIDL___MIDL_itf_uc_0001_0004_0017(64);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanCaptureAppShare = new __MIDL___MIDL_itf_uc_0001_0004_0017(128);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0017 ucContactCanRenderAppShare = new __MIDL___MIDL_itf_uc_0001_0004_0017(256);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactCanShowPresence = 1;
  public final static int _ucContactCanCaptureInstantMessage = 2;
  public final static int _ucContactCanRenderInstantMessage = 4;
  public final static int _ucContactCanCaptureAudio = 8;
  public final static int _ucContactCanRenderAudio = 16;
  public final static int _ucContactCanCaptureVideo = 32;
  public final static int _ucContactCanRenderVideo = 64;
  public final static int _ucContactCanCaptureAppShare = 128;
  public final static int _ucContactCanRenderAppShare = 256;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0017(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0017(value);
    }
  }
}
