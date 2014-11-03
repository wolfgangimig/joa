/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncEventType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncEventType {
  msoSyncEventDownloadInitiated(0),
  msoSyncEventDownloadSucceeded(1),
  msoSyncEventDownloadFailed(2),
  msoSyncEventUploadInitiated(3),
  msoSyncEventUploadSucceeded(4),
  msoSyncEventUploadFailed(5),
  msoSyncEventDownloadNoChange(6),
  msoSyncEventOffline(7);

  public final int value;
  private MsoSyncEventType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncEventType.class);
    }
  }
}
