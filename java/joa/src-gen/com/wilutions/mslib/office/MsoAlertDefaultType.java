/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertDefaultType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAlertDefaultType {
  msoAlertDefaultFirst(0),
  msoAlertDefaultSecond(1),
  msoAlertDefaultThird(2),
  msoAlertDefaultFourth(3),
  msoAlertDefaultFifth(4);

  public final int value;
  private MsoAlertDefaultType(int value) { this.value = value; }
  public static  MsoAlertDefaultType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertDefaultFirst;
    case 1: return msoAlertDefaultSecond;
    case 2: return msoAlertDefaultThird;
    case 3: return msoAlertDefaultFourth;
    case 4: return msoAlertDefaultFifth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAlertDefaultType.class);
    }
  }
}
