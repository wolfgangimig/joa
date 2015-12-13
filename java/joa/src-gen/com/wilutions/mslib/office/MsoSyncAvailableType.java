/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncAvailableType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncAvailableType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSyncAvailableType msoSyncAvailableNone = new MsoSyncAvailableType(0);
  public final static MsoSyncAvailableType msoSyncAvailableOffline = new MsoSyncAvailableType(1);
  public final static MsoSyncAvailableType msoSyncAvailableAnywhere = new MsoSyncAvailableType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncAvailableNone = 0;
  public final static int _msoSyncAvailableOffline = 1;
  public final static int _msoSyncAvailableAnywhere = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncAvailableType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncAvailableType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncAvailableNone;
    case 1: return msoSyncAvailableOffline;
    case 2: return msoSyncAvailableAnywhere;
    default: return new MsoSyncAvailableType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoSyncAvailableNone";
    case 1: return "msoSyncAvailableOffline";
    case 2: return "msoSyncAvailableAnywhere";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoSyncAvailableNone");
      if ((value & 1) != 0) sbuf.append("|msoSyncAvailableOffline");
      if ((value & 2) != 0) sbuf.append("|msoSyncAvailableAnywhere");
      return sbuf.toString();
      }
    }
  }
}
