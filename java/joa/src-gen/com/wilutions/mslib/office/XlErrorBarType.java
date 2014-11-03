/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlErrorBarType {
  xlErrorBarTypeCustom(-4114),
  xlErrorBarTypeFixedValue(1),
  xlErrorBarTypePercent(2),
  xlErrorBarTypeStDev(-4155),
  xlErrorBarTypeStError(4);

  public final int value;
  private XlErrorBarType(int value) { this.value = value; }
  public static  XlErrorBarType valueOf(int value) {
    switch(value) {
    case -4114: return xlErrorBarTypeCustom;
    case 1: return xlErrorBarTypeFixedValue;
    case 2: return xlErrorBarTypePercent;
    case -4155: return xlErrorBarTypeStDev;
    case 4: return xlErrorBarTypeStError;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlErrorBarType.class);
    }
  }
}
