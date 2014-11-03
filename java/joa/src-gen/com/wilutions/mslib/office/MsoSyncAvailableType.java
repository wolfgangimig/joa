/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncAvailableType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncAvailableType {
  msoSyncAvailableNone(0),
  msoSyncAvailableOffline(1),
  msoSyncAvailableAnywhere(2);

  public final int value;
  private MsoSyncAvailableType(int value) { this.value = value; }
  public static  MsoSyncAvailableType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncAvailableNone;
    case 1: return msoSyncAvailableOffline;
    case 2: return msoSyncAvailableAnywhere;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncAvailableType.class);
    }
  }
}
