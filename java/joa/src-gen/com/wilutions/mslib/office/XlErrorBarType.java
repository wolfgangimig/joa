/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlErrorBarType {

  // Typed constants
  public final static XlErrorBarType xlErrorBarTypeCustom = new XlErrorBarType(-4114);
  public final static XlErrorBarType xlErrorBarTypeFixedValue = new XlErrorBarType(1);
  public final static XlErrorBarType xlErrorBarTypePercent = new XlErrorBarType(2);
  public final static XlErrorBarType xlErrorBarTypeStDev = new XlErrorBarType(-4155);
  public final static XlErrorBarType xlErrorBarTypeStError = new XlErrorBarType(4);

  // Integer constants for bitsets and switch statements
  public final static int _xlErrorBarTypeCustom = -4114;
  public final static int _xlErrorBarTypeFixedValue = 1;
  public final static int _xlErrorBarTypePercent = 2;
  public final static int _xlErrorBarTypeStDev = -4155;
  public final static int _xlErrorBarTypeStError = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlErrorBarType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlErrorBarType valueOf(int value) {
    switch(value) {
    case -4114: return xlErrorBarTypeCustom;
    case 1: return xlErrorBarTypeFixedValue;
    case 2: return xlErrorBarTypePercent;
    case -4155: return xlErrorBarTypeStDev;
    case 4: return xlErrorBarTypeStError;
    default: return new XlErrorBarType(value);
    }
  }
}
