/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertCancelType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAlertCancelType {
  msoAlertCancelDefault(-1),
  msoAlertCancelFirst(0),
  msoAlertCancelSecond(1),
  msoAlertCancelThird(2),
  msoAlertCancelFourth(3),
  msoAlertCancelFifth(4);

  public final int value;
  private MsoAlertCancelType(int value) { this.value = value; }
  public static  MsoAlertCancelType valueOf(int value) {
    switch(value) {
    case -1: return msoAlertCancelDefault;
    case 0: return msoAlertCancelFirst;
    case 1: return msoAlertCancelSecond;
    case 2: return msoAlertCancelThird;
    case 3: return msoAlertCancelFourth;
    case 4: return msoAlertCancelFifth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAlertCancelType.class);
    }
  }
}
