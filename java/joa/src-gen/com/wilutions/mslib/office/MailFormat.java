/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MailFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MailFormat {
  mfPlainText(1),
  mfHTML(2),
  mfRTF(3);

  public final int value;
  private MailFormat(int value) { this.value = value; }
  public static  MailFormat valueOf(int value) {
    switch(value) {
    case 1: return mfPlainText;
    case 2: return mfHTML;
    case 3: return mfRTF;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MailFormat.class);
    }
  }
}
