/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarInclude.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlErrorBarInclude {
  xlErrorBarIncludeBoth(1),
  xlErrorBarIncludeMinusValues(3),
  xlErrorBarIncludeNone(-4142),
  xlErrorBarIncludePlusValues(2);

  public final int value;
  private XlErrorBarInclude(int value) { this.value = value; }
  public static  XlErrorBarInclude valueOf(int value) {
    switch(value) {
    case 1: return xlErrorBarIncludeBoth;
    case 3: return xlErrorBarIncludeMinusValues;
    case -4142: return xlErrorBarIncludeNone;
    case 2: return xlErrorBarIncludePlusValues;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlErrorBarInclude.class);
    }
  }
}
