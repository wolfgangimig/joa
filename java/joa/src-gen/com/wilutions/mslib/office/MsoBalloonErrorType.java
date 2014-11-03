/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBalloonErrorType {
  msoBalloonErrorNone(0),
  msoBalloonErrorOther(1),
  msoBalloonErrorTooBig(2),
  msoBalloonErrorOutOfMemory(3),
  msoBalloonErrorBadPictureRef(4),
  msoBalloonErrorBadReference(5),
  msoBalloonErrorButtonlessModal(6),
  msoBalloonErrorButtonModeless(7),
  msoBalloonErrorBadCharacter(8),
  msoBalloonErrorCOMFailure(9),
  msoBalloonErrorCharNotTopmostForModal(10),
  msoBalloonErrorTooManyControls(11);

  public final int value;
  private MsoBalloonErrorType(int value) { this.value = value; }
  public static  MsoBalloonErrorType valueOf(int value) {
    switch(value) {
    case 0: return msoBalloonErrorNone;
    case 1: return msoBalloonErrorOther;
    case 2: return msoBalloonErrorTooBig;
    case 3: return msoBalloonErrorOutOfMemory;
    case 4: return msoBalloonErrorBadPictureRef;
    case 5: return msoBalloonErrorBadReference;
    case 6: return msoBalloonErrorButtonlessModal;
    case 7: return msoBalloonErrorButtonModeless;
    case 8: return msoBalloonErrorBadCharacter;
    case 9: return msoBalloonErrorCOMFailure;
    case 10: return msoBalloonErrorCharNotTopmostForModal;
    case 11: return msoBalloonErrorTooManyControls;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBalloonErrorType.class);
    }
  }
}
