/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlwaysDeleteConversation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAlwaysDeleteConversation {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAlwaysDeleteConversation olDoNotDelete = new OlAlwaysDeleteConversation(0);
  public final static OlAlwaysDeleteConversation olAlwaysDelete = new OlAlwaysDeleteConversation(1);
  public final static OlAlwaysDeleteConversation olAlwaysDeleteUnsupported = new OlAlwaysDeleteConversation(2);

  // Integer constants for bitsets and switch statements
  public final static int _olDoNotDelete = 0;
  public final static int _olAlwaysDelete = 1;
  public final static int _olAlwaysDeleteUnsupported = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAlwaysDeleteConversation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAlwaysDeleteConversation valueOf(int value) {
    switch(value) {
    case 0: return olDoNotDelete;
    case 1: return olAlwaysDelete;
    case 2: return olAlwaysDeleteUnsupported;
    default: return new OlAlwaysDeleteConversation(value);
    }
  }
}
