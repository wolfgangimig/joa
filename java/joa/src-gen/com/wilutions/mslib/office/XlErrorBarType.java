/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlErrorBarType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

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

  public String toString() {
    switch(value) {
    case -4114: return "xlErrorBarTypeCustom";
    case 1: return "xlErrorBarTypeFixedValue";
    case -4155: return "xlErrorBarTypeStDev";
    case 2: return "xlErrorBarTypePercent";
    case 4: return "xlErrorBarTypeStError";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -4114) != 0) sbuf.append("|xlErrorBarTypeCustom");
      if ((value & 1) != 0) sbuf.append("|xlErrorBarTypeFixedValue");
      if ((value & -4155) != 0) sbuf.append("|xlErrorBarTypeStDev");
      if ((value & 2) != 0) sbuf.append("|xlErrorBarTypePercent");
      if ((value & 4) != 0) sbuf.append("|xlErrorBarTypeStError");
      return sbuf.toString();
      }
    }
  }
}
