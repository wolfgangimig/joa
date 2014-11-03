/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionCopyLike.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlActionCopyLike {
  olReply(0),
  olReplyAll(1),
  olForward(2),
  olReplyFolder(3),
  olRespond(4);

  public final int value;
  private OlActionCopyLike(int value) { this.value = value; }
  public static  OlActionCopyLike valueOf(int value) {
    switch(value) {
    case 0: return olReply;
    case 1: return olReplyAll;
    case 2: return olForward;
    case 3: return olReplyFolder;
    case 4: return olRespond;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlActionCopyLike.class);
    }
  }
}
