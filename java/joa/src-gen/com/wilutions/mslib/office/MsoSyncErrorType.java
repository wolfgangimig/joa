/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncErrorType {
  msoSyncErrorNone(0),
  msoSyncErrorUnauthorizedUser(1),
  msoSyncErrorCouldNotConnect(2),
  msoSyncErrorOutOfSpace(3),
  msoSyncErrorFileNotFound(4),
  msoSyncErrorFileTooLarge(5),
  msoSyncErrorFileInUse(6),
  msoSyncErrorVirusUpload(7),
  msoSyncErrorVirusDownload(8),
  msoSyncErrorUnknownUpload(9),
  msoSyncErrorUnknownDownload(10),
  msoSyncErrorCouldNotOpen(11),
  msoSyncErrorCouldNotUpdate(12),
  msoSyncErrorCouldNotCompare(13),
  msoSyncErrorCouldNotResolve(14),
  msoSyncErrorNoNetwork(15),
  msoSyncErrorUnknown(16);

  public final int value;
  private MsoSyncErrorType(int value) { this.value = value; }
  public static  MsoSyncErrorType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncErrorNone;
    case 1: return msoSyncErrorUnauthorizedUser;
    case 2: return msoSyncErrorCouldNotConnect;
    case 3: return msoSyncErrorOutOfSpace;
    case 4: return msoSyncErrorFileNotFound;
    case 5: return msoSyncErrorFileTooLarge;
    case 6: return msoSyncErrorFileInUse;
    case 7: return msoSyncErrorVirusUpload;
    case 8: return msoSyncErrorVirusDownload;
    case 9: return msoSyncErrorUnknownUpload;
    case 10: return msoSyncErrorUnknownDownload;
    case 11: return msoSyncErrorCouldNotOpen;
    case 12: return msoSyncErrorCouldNotUpdate;
    case 13: return msoSyncErrorCouldNotCompare;
    case 14: return msoSyncErrorCouldNotResolve;
    case 15: return msoSyncErrorNoNetwork;
    case 16: return msoSyncErrorUnknown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncErrorType.class);
    }
  }
}
