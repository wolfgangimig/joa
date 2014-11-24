/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncErrorType {

  // Typed constants
  public final static MsoSyncErrorType msoSyncErrorNone = new MsoSyncErrorType(0);
  public final static MsoSyncErrorType msoSyncErrorUnauthorizedUser = new MsoSyncErrorType(1);
  public final static MsoSyncErrorType msoSyncErrorCouldNotConnect = new MsoSyncErrorType(2);
  public final static MsoSyncErrorType msoSyncErrorOutOfSpace = new MsoSyncErrorType(3);
  public final static MsoSyncErrorType msoSyncErrorFileNotFound = new MsoSyncErrorType(4);
  public final static MsoSyncErrorType msoSyncErrorFileTooLarge = new MsoSyncErrorType(5);
  public final static MsoSyncErrorType msoSyncErrorFileInUse = new MsoSyncErrorType(6);
  public final static MsoSyncErrorType msoSyncErrorVirusUpload = new MsoSyncErrorType(7);
  public final static MsoSyncErrorType msoSyncErrorVirusDownload = new MsoSyncErrorType(8);
  public final static MsoSyncErrorType msoSyncErrorUnknownUpload = new MsoSyncErrorType(9);
  public final static MsoSyncErrorType msoSyncErrorUnknownDownload = new MsoSyncErrorType(10);
  public final static MsoSyncErrorType msoSyncErrorCouldNotOpen = new MsoSyncErrorType(11);
  public final static MsoSyncErrorType msoSyncErrorCouldNotUpdate = new MsoSyncErrorType(12);
  public final static MsoSyncErrorType msoSyncErrorCouldNotCompare = new MsoSyncErrorType(13);
  public final static MsoSyncErrorType msoSyncErrorCouldNotResolve = new MsoSyncErrorType(14);
  public final static MsoSyncErrorType msoSyncErrorNoNetwork = new MsoSyncErrorType(15);
  public final static MsoSyncErrorType msoSyncErrorUnknown = new MsoSyncErrorType(16);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncErrorNone = 0;
  public final static int _msoSyncErrorUnauthorizedUser = 1;
  public final static int _msoSyncErrorCouldNotConnect = 2;
  public final static int _msoSyncErrorOutOfSpace = 3;
  public final static int _msoSyncErrorFileNotFound = 4;
  public final static int _msoSyncErrorFileTooLarge = 5;
  public final static int _msoSyncErrorFileInUse = 6;
  public final static int _msoSyncErrorVirusUpload = 7;
  public final static int _msoSyncErrorVirusDownload = 8;
  public final static int _msoSyncErrorUnknownUpload = 9;
  public final static int _msoSyncErrorUnknownDownload = 10;
  public final static int _msoSyncErrorCouldNotOpen = 11;
  public final static int _msoSyncErrorCouldNotUpdate = 12;
  public final static int _msoSyncErrorCouldNotCompare = 13;
  public final static int _msoSyncErrorCouldNotResolve = 14;
  public final static int _msoSyncErrorNoNetwork = 15;
  public final static int _msoSyncErrorUnknown = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncErrorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoSyncErrorType(value);
    }
  }
}
