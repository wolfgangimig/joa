/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBalloonErrorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBalloonErrorType msoBalloonErrorNone = new MsoBalloonErrorType(0);
  public final static MsoBalloonErrorType msoBalloonErrorOther = new MsoBalloonErrorType(1);
  public final static MsoBalloonErrorType msoBalloonErrorTooBig = new MsoBalloonErrorType(2);
  public final static MsoBalloonErrorType msoBalloonErrorOutOfMemory = new MsoBalloonErrorType(3);
  public final static MsoBalloonErrorType msoBalloonErrorBadPictureRef = new MsoBalloonErrorType(4);
  public final static MsoBalloonErrorType msoBalloonErrorBadReference = new MsoBalloonErrorType(5);
  public final static MsoBalloonErrorType msoBalloonErrorButtonlessModal = new MsoBalloonErrorType(6);
  public final static MsoBalloonErrorType msoBalloonErrorButtonModeless = new MsoBalloonErrorType(7);
  public final static MsoBalloonErrorType msoBalloonErrorBadCharacter = new MsoBalloonErrorType(8);
  public final static MsoBalloonErrorType msoBalloonErrorCOMFailure = new MsoBalloonErrorType(9);
  public final static MsoBalloonErrorType msoBalloonErrorCharNotTopmostForModal = new MsoBalloonErrorType(10);
  public final static MsoBalloonErrorType msoBalloonErrorTooManyControls = new MsoBalloonErrorType(11);

  // Integer constants for bitsets and switch statements
  public final static int _msoBalloonErrorNone = 0;
  public final static int _msoBalloonErrorOther = 1;
  public final static int _msoBalloonErrorTooBig = 2;
  public final static int _msoBalloonErrorOutOfMemory = 3;
  public final static int _msoBalloonErrorBadPictureRef = 4;
  public final static int _msoBalloonErrorBadReference = 5;
  public final static int _msoBalloonErrorButtonlessModal = 6;
  public final static int _msoBalloonErrorButtonModeless = 7;
  public final static int _msoBalloonErrorBadCharacter = 8;
  public final static int _msoBalloonErrorCOMFailure = 9;
  public final static int _msoBalloonErrorCharNotTopmostForModal = 10;
  public final static int _msoBalloonErrorTooManyControls = 11;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBalloonErrorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoBalloonErrorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "msoBalloonErrorBadCharacter";
    case 10: return "msoBalloonErrorCharNotTopmostForModal";
    case 0: return "msoBalloonErrorNone";
    case 1: return "msoBalloonErrorOther";
    case 2: return "msoBalloonErrorTooBig";
    case 3: return "msoBalloonErrorOutOfMemory";
    case 4: return "msoBalloonErrorBadPictureRef";
    case 5: return "msoBalloonErrorBadReference";
    case 6: return "msoBalloonErrorButtonlessModal";
    case 7: return "msoBalloonErrorButtonModeless";
    case 9: return "msoBalloonErrorCOMFailure";
    case 11: return "msoBalloonErrorTooManyControls";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|msoBalloonErrorBadCharacter");
      if ((value & 10) != 0) sbuf.append("|msoBalloonErrorCharNotTopmostForModal");
      if ((value & 0) != 0) sbuf.append("|msoBalloonErrorNone");
      if ((value & 1) != 0) sbuf.append("|msoBalloonErrorOther");
      if ((value & 2) != 0) sbuf.append("|msoBalloonErrorTooBig");
      if ((value & 3) != 0) sbuf.append("|msoBalloonErrorOutOfMemory");
      if ((value & 4) != 0) sbuf.append("|msoBalloonErrorBadPictureRef");
      if ((value & 5) != 0) sbuf.append("|msoBalloonErrorBadReference");
      if ((value & 6) != 0) sbuf.append("|msoBalloonErrorButtonlessModal");
      if ((value & 7) != 0) sbuf.append("|msoBalloonErrorButtonModeless");
      if ((value & 9) != 0) sbuf.append("|msoBalloonErrorCOMFailure");
      if ((value & 11) != 0) sbuf.append("|msoBalloonErrorTooManyControls");
      return sbuf.toString();
      }
    }
  }
}
