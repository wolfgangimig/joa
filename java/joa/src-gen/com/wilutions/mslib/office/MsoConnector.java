/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoConnector.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoConnector {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoConnector msoConnectorAnd = new MsoConnector(1);
  public final static MsoConnector msoConnectorOr = new MsoConnector(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoConnectorAnd = 1;
  public final static int _msoConnectorOr = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoConnector(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoConnector valueOf(int value) {
    switch(value) {
    case 1: return msoConnectorAnd;
    case 2: return msoConnectorOr;
    default: return new MsoConnector(value);
    }
  }
}
