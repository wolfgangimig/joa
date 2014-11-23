/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0150_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0150_0001 {
  ucNotificationTypeUnknown(0),
  ucNotificationTypeAudio(1),
  ucNotificationTypeVideo(2),
  ucNotificationTypeInstantMessage(4),
  ucNotificationTypeSharing(8),
  ucNotificationTypeFileTransfer(16),
  ucNotificationTypeAll(-1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0150_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0150_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucNotificationTypeUnknown;
    case 1: return ucNotificationTypeAudio;
    case 2: return ucNotificationTypeVideo;
    case 4: return ucNotificationTypeInstantMessage;
    case 8: return ucNotificationTypeSharing;
    case 16: return ucNotificationTypeFileTransfer;
    case -1: return ucNotificationTypeAll;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0150_0001.class);
    }
  }
}
