/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBusinessCardType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlBusinessCardType {
  olBusinessCardTypeOutlook(0),
  olBusinessCardTypeInterConnect(1);

  public final int value;
  private OlBusinessCardType(int value) { this.value = value; }
  public static  OlBusinessCardType valueOf(int value) {
    switch(value) {
    case 0: return olBusinessCardTypeOutlook;
    case 1: return olBusinessCardTypeInterConnect;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlBusinessCardType.class);
    }
  }
}
