/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTrackingStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTrackingStatus {

  // Typed constants
  public final static OlTrackingStatus olTrackingNone = new OlTrackingStatus(0);
  public final static OlTrackingStatus olTrackingDelivered = new OlTrackingStatus(1);
  public final static OlTrackingStatus olTrackingNotDelivered = new OlTrackingStatus(2);
  public final static OlTrackingStatus olTrackingNotRead = new OlTrackingStatus(3);
  public final static OlTrackingStatus olTrackingRecallFailure = new OlTrackingStatus(4);
  public final static OlTrackingStatus olTrackingRecallSuccess = new OlTrackingStatus(5);
  public final static OlTrackingStatus olTrackingRead = new OlTrackingStatus(6);
  public final static OlTrackingStatus olTrackingReplied = new OlTrackingStatus(7);

  // Integer constants for bitsets and switch statements
  public final static int _olTrackingNone = 0;
  public final static int _olTrackingDelivered = 1;
  public final static int _olTrackingNotDelivered = 2;
  public final static int _olTrackingNotRead = 3;
  public final static int _olTrackingRecallFailure = 4;
  public final static int _olTrackingRecallSuccess = 5;
  public final static int _olTrackingRead = 6;
  public final static int _olTrackingReplied = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTrackingStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlTrackingStatus(value);
    }
  }
}
