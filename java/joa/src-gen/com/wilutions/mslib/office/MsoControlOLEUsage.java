/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoControlOLEUsage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoControlOLEUsage {
  msoControlOLEUsageNeither(0),
  msoControlOLEUsageServer(1),
  msoControlOLEUsageClient(2),
  msoControlOLEUsageBoth(3);

  public final int value;
  private MsoControlOLEUsage(int value) { this.value = value; }
  public static  MsoControlOLEUsage valueOf(int value) {
    switch(value) {
    case 0: return msoControlOLEUsageNeither;
    case 1: return msoControlOLEUsageServer;
    case 2: return msoControlOLEUsageClient;
    case 3: return msoControlOLEUsageBoth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoControlOLEUsage.class);
    }
  }
}
