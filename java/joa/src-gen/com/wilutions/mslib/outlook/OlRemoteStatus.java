/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRemoteStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRemoteStatus {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlRemoteStatus olRemoteStatusNone = new OlRemoteStatus(0);
  public final static OlRemoteStatus olUnMarked = new OlRemoteStatus(1);
  public final static OlRemoteStatus olMarkedForDownload = new OlRemoteStatus(2);
  public final static OlRemoteStatus olMarkedForCopy = new OlRemoteStatus(3);
  public final static OlRemoteStatus olMarkedForDelete = new OlRemoteStatus(4);

  // Integer constants for bitsets and switch statements
  public final static int _olRemoteStatusNone = 0;
  public final static int _olUnMarked = 1;
  public final static int _olMarkedForDownload = 2;
  public final static int _olMarkedForCopy = 3;
  public final static int _olMarkedForDelete = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRemoteStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRemoteStatus valueOf(int value) {
    switch(value) {
    case 0: return olRemoteStatusNone;
    case 1: return olUnMarked;
    case 2: return olMarkedForDownload;
    case 3: return olMarkedForCopy;
    case 4: return olMarkedForDelete;
    default: return new OlRemoteStatus(value);
    }
  }
}
