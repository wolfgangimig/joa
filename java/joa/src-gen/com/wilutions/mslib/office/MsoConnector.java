/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoConnector.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoConnector {
  msoConnectorAnd(1),
  msoConnectorOr(2);

  public final int value;
  private MsoConnector(int value) { this.value = value; }
  public static  MsoConnector valueOf(int value) {
    switch(value) {
    case 1: return msoConnectorAnd;
    case 2: return msoConnectorOr;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoConnector.class);
    }
  }
}
