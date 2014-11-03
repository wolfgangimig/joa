/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTrackingStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTrackingStatus {
  olTrackingNone(0),
  olTrackingDelivered(1),
  olTrackingNotDelivered(2),
  olTrackingNotRead(3),
  olTrackingRecallFailure(4),
  olTrackingRecallSuccess(5),
  olTrackingRead(6),
  olTrackingReplied(7);

  public final int value;
  private OlTrackingStatus(int value) { this.value = value; }
  public static  OlTrackingStatus valueOf(int value) {
    switch(value) {
    case 0: return olTrackingNone;
    case 1: return olTrackingDelivered;
    case 2: return olTrackingNotDelivered;
    case 3: return olTrackingNotRead;
    case 4: return olTrackingRecallFailure;
    case 5: return olTrackingRecallSuccess;
    case 6: return olTrackingRead;
    case 7: return olTrackingReplied;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTrackingStatus.class);
    }
  }
}
