/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionCopyLike.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlActionCopyLike {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlActionCopyLike olReply = new OlActionCopyLike(0);
  public final static OlActionCopyLike olReplyAll = new OlActionCopyLike(1);
  public final static OlActionCopyLike olForward = new OlActionCopyLike(2);
  public final static OlActionCopyLike olReplyFolder = new OlActionCopyLike(3);
  public final static OlActionCopyLike olRespond = new OlActionCopyLike(4);

  // Integer constants for bitsets and switch statements
  public final static int _olReply = 0;
  public final static int _olReplyAll = 1;
  public final static int _olForward = 2;
  public final static int _olReplyFolder = 3;
  public final static int _olRespond = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlActionCopyLike(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlActionCopyLike valueOf(int value) {
    switch(value) {
    case 0: return olReply;
    case 1: return olReplyAll;
    case 2: return olForward;
    case 3: return olReplyFolder;
    case 4: return olRespond;
    default: return new OlActionCopyLike(value);
    }
  }
}
