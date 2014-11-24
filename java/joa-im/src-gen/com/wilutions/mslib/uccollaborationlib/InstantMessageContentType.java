/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * InstantMessageContentType.
 * Enumerates the InstantMessage content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class InstantMessageContentType {

  // Typed constants
  public final static InstantMessageContentType ucInstantMessageContentPlainText = new InstantMessageContentType(0);
  public final static InstantMessageContentType ucInstantMessageContentHtml = new InstantMessageContentType(1);
  public final static InstantMessageContentType ucInstantMessageContentRichText = new InstantMessageContentType(2);
  public final static InstantMessageContentType ucInstantMessageContentGif = new InstantMessageContentType(3);
  public final static InstantMessageContentType ucInstantMessageContentInk = new InstantMessageContentType(4);
  public final static InstantMessageContentType ucInstantMessageContentUnknown = new InstantMessageContentType(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucInstantMessageContentPlainText = 0;
  public final static int _ucInstantMessageContentHtml = 1;
  public final static int _ucInstantMessageContentRichText = 2;
  public final static int _ucInstantMessageContentGif = 3;
  public final static int _ucInstantMessageContentInk = 4;
  public final static int _ucInstantMessageContentUnknown = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private InstantMessageContentType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  InstantMessageContentType valueOf(int value) {
    switch(value) {
    case 0: return ucInstantMessageContentPlainText;
    case 1: return ucInstantMessageContentHtml;
    case 2: return ucInstantMessageContentRichText;
    case 3: return ucInstantMessageContentGif;
    case 4: return ucInstantMessageContentInk;
    case 5: return ucInstantMessageContentUnknown;
    default: return new InstantMessageContentType(value);
    }
  }
}
