/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSharingMsgType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSharingMsgType {
  olSharingMsgTypeUnknown(0),
  olSharingMsgTypeRequest(1),
  olSharingMsgTypeInvite(2),
  olSharingMsgTypeInviteAndRequest(3),
  olSharingMsgTypeResponseAllow(4),
  olSharingMsgTypeResponseDeny(5);

  public final int value;
  private OlSharingMsgType(int value) { this.value = value; }
  public static  OlSharingMsgType valueOf(int value) {
    switch(value) {
    case 0: return olSharingMsgTypeUnknown;
    case 1: return olSharingMsgTypeRequest;
    case 2: return olSharingMsgTypeInvite;
    case 3: return olSharingMsgTypeInviteAndRequest;
    case 4: return olSharingMsgTypeResponseAllow;
    case 5: return olSharingMsgTypeResponseDeny;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSharingMsgType.class);
    }
  }
}
