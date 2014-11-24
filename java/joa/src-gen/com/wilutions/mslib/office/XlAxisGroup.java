/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7D8D95F5-EFE7-4189-8D68-0B3BCCEA097A}")
public class XlAxisGroup {

  // Typed constants
  public final static XlAxisGroup xlPrimary = new XlAxisGroup(1);
  public final static XlAxisGroup xlSecondary = new XlAxisGroup(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlPrimary = 1;
  public final static int _xlSecondary = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlAxisGroup(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlAxisGroup valueOf(int value) {
    switch(value) {
    case 1: return xlPrimary;
    case 2: return xlSecondary;
    default: return new XlAxisGroup(value);
    }
  }
}
