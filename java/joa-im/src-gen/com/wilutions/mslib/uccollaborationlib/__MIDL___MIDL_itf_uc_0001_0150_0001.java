/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0150_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0150_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeUnknown = new __MIDL___MIDL_itf_uc_0001_0150_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeAudio = new __MIDL___MIDL_itf_uc_0001_0150_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeVideo = new __MIDL___MIDL_itf_uc_0001_0150_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeInstantMessage = new __MIDL___MIDL_itf_uc_0001_0150_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeSharing = new __MIDL___MIDL_itf_uc_0001_0150_0001(8);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeFileTransfer = new __MIDL___MIDL_itf_uc_0001_0150_0001(16);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0001 ucNotificationTypeAll = new __MIDL___MIDL_itf_uc_0001_0150_0001(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotificationTypeUnknown = 0;
  public final static int _ucNotificationTypeAudio = 1;
  public final static int _ucNotificationTypeVideo = 2;
  public final static int _ucNotificationTypeInstantMessage = 4;
  public final static int _ucNotificationTypeSharing = 8;
  public final static int _ucNotificationTypeFileTransfer = 16;
  public final static int _ucNotificationTypeAll = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0150_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0150_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucNotificationTypeUnknown;
    case 1: return ucNotificationTypeAudio;
    case 2: return ucNotificationTypeVideo;
    case 4: return ucNotificationTypeInstantMessage;
    case 8: return ucNotificationTypeSharing;
    case 16: return ucNotificationTypeFileTransfer;
    case -1: return ucNotificationTypeAll;
    default: return new __MIDL___MIDL_itf_uc_0001_0150_0001(value);
    }
  }
}
