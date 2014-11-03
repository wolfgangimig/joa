/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionReplyStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlActionReplyStyle {
  olOmitOriginalText(0),
  olEmbedOriginalItem(1),
  olIncludeOriginalText(2),
  olIndentOriginalText(3),
  olLinkOriginalItem(4),
  olUserPreference(5),
  olReplyTickOriginalText(1000);

  public final int value;
  private OlActionReplyStyle(int value) { this.value = value; }
  public static  OlActionReplyStyle valueOf(int value) {
    switch(value) {
    case 0: return olOmitOriginalText;
    case 1: return olEmbedOriginalItem;
    case 2: return olIncludeOriginalText;
    case 3: return olIndentOriginalText;
    case 4: return olLinkOriginalItem;
    case 5: return olUserPreference;
    case 1000: return olReplyTickOriginalText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlActionReplyStyle.class);
    }
  }
}
