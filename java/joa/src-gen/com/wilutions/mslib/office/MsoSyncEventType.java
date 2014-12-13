/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncEventType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncEventType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSyncEventType msoSyncEventDownloadInitiated = new MsoSyncEventType(0);
  public final static MsoSyncEventType msoSyncEventDownloadSucceeded = new MsoSyncEventType(1);
  public final static MsoSyncEventType msoSyncEventDownloadFailed = new MsoSyncEventType(2);
  public final static MsoSyncEventType msoSyncEventUploadInitiated = new MsoSyncEventType(3);
  public final static MsoSyncEventType msoSyncEventUploadSucceeded = new MsoSyncEventType(4);
  public final static MsoSyncEventType msoSyncEventUploadFailed = new MsoSyncEventType(5);
  public final static MsoSyncEventType msoSyncEventDownloadNoChange = new MsoSyncEventType(6);
  public final static MsoSyncEventType msoSyncEventOffline = new MsoSyncEventType(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncEventDownloadInitiated = 0;
  public final static int _msoSyncEventDownloadSucceeded = 1;
  public final static int _msoSyncEventDownloadFailed = 2;
  public final static int _msoSyncEventUploadInitiated = 3;
  public final static int _msoSyncEventUploadSucceeded = 4;
  public final static int _msoSyncEventUploadFailed = 5;
  public final static int _msoSyncEventDownloadNoChange = 6;
  public final static int _msoSyncEventOffline = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncEventType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncEventType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncEventDownloadInitiated;
    case 1: return msoSyncEventDownloadSucceeded;
    case 2: return msoSyncEventDownloadFailed;
    case 3: return msoSyncEventUploadInitiated;
    case 4: return msoSyncEventUploadSucceeded;
    case 5: return msoSyncEventUploadFailed;
    case 6: return msoSyncEventDownloadNoChange;
    case 7: return msoSyncEventOffline;
    default: return new MsoSyncEventType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoSyncEventDownloadInitiated";
    case 1: return "msoSyncEventDownloadSucceeded";
    case 2: return "msoSyncEventDownloadFailed";
    case 3: return "msoSyncEventUploadInitiated";
    case 4: return "msoSyncEventUploadSucceeded";
    case 5: return "msoSyncEventUploadFailed";
    case 6: return "msoSyncEventDownloadNoChange";
    case 7: return "msoSyncEventOffline";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoSyncEventDownloadInitiated");
      if ((value & 1) != 0) sbuf.append("|msoSyncEventDownloadSucceeded");
      if ((value & 2) != 0) sbuf.append("|msoSyncEventDownloadFailed");
      if ((value & 3) != 0) sbuf.append("|msoSyncEventUploadInitiated");
      if ((value & 4) != 0) sbuf.append("|msoSyncEventUploadSucceeded");
      if ((value & 5) != 0) sbuf.append("|msoSyncEventUploadFailed");
      if ((value & 6) != 0) sbuf.append("|msoSyncEventDownloadNoChange");
      if ((value & 7) != 0) sbuf.append("|msoSyncEventOffline");
      return sbuf.toString();
      }
    }
  }
}
