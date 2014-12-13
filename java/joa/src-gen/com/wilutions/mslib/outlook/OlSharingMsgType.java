/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSharingMsgType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSharingMsgType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSharingMsgType olSharingMsgTypeUnknown = new OlSharingMsgType(0);
  public final static OlSharingMsgType olSharingMsgTypeRequest = new OlSharingMsgType(1);
  public final static OlSharingMsgType olSharingMsgTypeInvite = new OlSharingMsgType(2);
  public final static OlSharingMsgType olSharingMsgTypeInviteAndRequest = new OlSharingMsgType(3);
  public final static OlSharingMsgType olSharingMsgTypeResponseAllow = new OlSharingMsgType(4);
  public final static OlSharingMsgType olSharingMsgTypeResponseDeny = new OlSharingMsgType(5);

  // Integer constants for bitsets and switch statements
  public final static int _olSharingMsgTypeUnknown = 0;
  public final static int _olSharingMsgTypeRequest = 1;
  public final static int _olSharingMsgTypeInvite = 2;
  public final static int _olSharingMsgTypeInviteAndRequest = 3;
  public final static int _olSharingMsgTypeResponseAllow = 4;
  public final static int _olSharingMsgTypeResponseDeny = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSharingMsgType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSharingMsgType valueOf(int value) {
    switch(value) {
    case 0: return olSharingMsgTypeUnknown;
    case 1: return olSharingMsgTypeRequest;
    case 2: return olSharingMsgTypeInvite;
    case 3: return olSharingMsgTypeInviteAndRequest;
    case 4: return olSharingMsgTypeResponseAllow;
    case 5: return olSharingMsgTypeResponseDeny;
    default: return new OlSharingMsgType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olSharingMsgTypeUnknown";
    case 1: return "olSharingMsgTypeRequest";
    case 2: return "olSharingMsgTypeInvite";
    case 3: return "olSharingMsgTypeInviteAndRequest";
    case 4: return "olSharingMsgTypeResponseAllow";
    case 5: return "olSharingMsgTypeResponseDeny";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olSharingMsgTypeUnknown");
      if ((value & 1) != 0) sbuf.append("|olSharingMsgTypeRequest");
      if ((value & 2) != 0) sbuf.append("|olSharingMsgTypeInvite");
      if ((value & 3) != 0) sbuf.append("|olSharingMsgTypeInviteAndRequest");
      if ((value & 4) != 0) sbuf.append("|olSharingMsgTypeResponseAllow");
      if ((value & 5) != 0) sbuf.append("|olSharingMsgTypeResponseDeny");
      return sbuf.toString();
      }
    }
  }
}
