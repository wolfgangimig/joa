/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MailFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MailFormat {

  // Typed constants
  public final static MailFormat mfPlainText = new MailFormat(1);
  public final static MailFormat mfHTML = new MailFormat(2);
  public final static MailFormat mfRTF = new MailFormat(3);

  // Integer constants for bitsets and switch statements
  public final static int _mfPlainText = 1;
  public final static int _mfHTML = 2;
  public final static int _mfRTF = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MailFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MailFormat valueOf(int value) {
    switch(value) {
    case 1: return mfPlainText;
    case 2: return mfHTML;
    case 3: return mfRTF;
    default: return new MailFormat(value);
    }
  }
}
