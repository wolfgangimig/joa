/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncVersionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncVersionType {

  // Typed constants
  public final static MsoSyncVersionType msoSyncVersionLastViewed = new MsoSyncVersionType(0);
  public final static MsoSyncVersionType msoSyncVersionServer = new MsoSyncVersionType(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncVersionLastViewed = 0;
  public final static int _msoSyncVersionServer = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncVersionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncVersionType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncVersionLastViewed;
    case 1: return msoSyncVersionServer;
    default: return new MsoSyncVersionType(value);
    }
  }
}
