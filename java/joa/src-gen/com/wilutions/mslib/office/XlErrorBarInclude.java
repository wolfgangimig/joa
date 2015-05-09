/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarInclude.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlErrorBarInclude implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlErrorBarInclude xlErrorBarIncludeBoth = new XlErrorBarInclude(1);
  public final static XlErrorBarInclude xlErrorBarIncludeMinusValues = new XlErrorBarInclude(3);
  public final static XlErrorBarInclude xlErrorBarIncludeNone = new XlErrorBarInclude(-4142);
  public final static XlErrorBarInclude xlErrorBarIncludePlusValues = new XlErrorBarInclude(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlErrorBarIncludeBoth = 1;
  public final static int _xlErrorBarIncludeMinusValues = 3;
  public final static int _xlErrorBarIncludeNone = -4142;
  public final static int _xlErrorBarIncludePlusValues = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlErrorBarInclude(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlErrorBarInclude valueOf(int value) {
    switch(value) {
    case 1: return xlErrorBarIncludeBoth;
    case 3: return xlErrorBarIncludeMinusValues;
    case -4142: return xlErrorBarIncludeNone;
    case 2: return xlErrorBarIncludePlusValues;
    default: return new XlErrorBarInclude(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "xlErrorBarIncludeBoth";
    case 3: return "xlErrorBarIncludeMinusValues";
    case -4142: return "xlErrorBarIncludeNone";
    case 2: return "xlErrorBarIncludePlusValues";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|xlErrorBarIncludeBoth");
      if ((value & 3) != 0) sbuf.append("|xlErrorBarIncludeMinusValues");
      if ((value & -4142) != 0) sbuf.append("|xlErrorBarIncludeNone");
      if ((value & 2) != 0) sbuf.append("|xlErrorBarIncludePlusValues");
      return sbuf.toString();
      }
    }
  }
}
