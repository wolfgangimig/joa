/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncVersionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncVersionType {
  msoSyncVersionLastViewed(0),
  msoSyncVersionServer(1);

  public final int value;
  private MsoSyncVersionType(int value) { this.value = value; }
  public static  MsoSyncVersionType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncVersionLastViewed;
    case 1: return msoSyncVersionServer;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncVersionType.class);
    }
  }
}
