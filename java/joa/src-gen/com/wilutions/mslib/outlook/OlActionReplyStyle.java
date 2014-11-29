/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionReplyStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlActionReplyStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlActionReplyStyle olOmitOriginalText = new OlActionReplyStyle(0);
  public final static OlActionReplyStyle olEmbedOriginalItem = new OlActionReplyStyle(1);
  public final static OlActionReplyStyle olIncludeOriginalText = new OlActionReplyStyle(2);
  public final static OlActionReplyStyle olIndentOriginalText = new OlActionReplyStyle(3);
  public final static OlActionReplyStyle olLinkOriginalItem = new OlActionReplyStyle(4);
  public final static OlActionReplyStyle olUserPreference = new OlActionReplyStyle(5);
  public final static OlActionReplyStyle olReplyTickOriginalText = new OlActionReplyStyle(1000);

  // Integer constants for bitsets and switch statements
  public final static int _olOmitOriginalText = 0;
  public final static int _olEmbedOriginalItem = 1;
  public final static int _olIncludeOriginalText = 2;
  public final static int _olIndentOriginalText = 3;
  public final static int _olLinkOriginalItem = 4;
  public final static int _olUserPreference = 5;
  public final static int _olReplyTickOriginalText = 1000;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlActionReplyStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlActionReplyStyle valueOf(int value) {
    switch(value) {
    case 0: return olOmitOriginalText;
    case 1: return olEmbedOriginalItem;
    case 2: return olIncludeOriginalText;
    case 3: return olIndentOriginalText;
    case 4: return olLinkOriginalItem;
    case 5: return olUserPreference;
    case 1000: return olReplyTickOriginalText;
    default: return new OlActionReplyStyle(value);
    }
  }
}
