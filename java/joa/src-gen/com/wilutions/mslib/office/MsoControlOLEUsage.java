/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoControlOLEUsage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoControlOLEUsage implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoControlOLEUsage msoControlOLEUsageNeither = new MsoControlOLEUsage(0);
  public final static MsoControlOLEUsage msoControlOLEUsageServer = new MsoControlOLEUsage(1);
  public final static MsoControlOLEUsage msoControlOLEUsageClient = new MsoControlOLEUsage(2);
  public final static MsoControlOLEUsage msoControlOLEUsageBoth = new MsoControlOLEUsage(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoControlOLEUsageNeither = 0;
  public final static int _msoControlOLEUsageServer = 1;
  public final static int _msoControlOLEUsageClient = 2;
  public final static int _msoControlOLEUsageBoth = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoControlOLEUsage(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoControlOLEUsage valueOf(int value) {
    switch(value) {
    case 0: return msoControlOLEUsageNeither;
    case 1: return msoControlOLEUsageServer;
    case 2: return msoControlOLEUsageClient;
    case 3: return msoControlOLEUsageBoth;
    default: return new MsoControlOLEUsage(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoControlOLEUsageNeither";
    case 1: return "msoControlOLEUsageServer";
    case 2: return "msoControlOLEUsageClient";
    case 3: return "msoControlOLEUsageBoth";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoControlOLEUsageNeither");
      if ((value & 1) != 0) sbuf.append("|msoControlOLEUsageServer");
      if ((value & 2) != 0) sbuf.append("|msoControlOLEUsageClient");
      if ((value & 3) != 0) sbuf.append("|msoControlOLEUsageBoth");
      return sbuf.toString();
      }
    }
  }
}
