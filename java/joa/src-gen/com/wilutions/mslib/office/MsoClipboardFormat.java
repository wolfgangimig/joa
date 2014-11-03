/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoClipboardFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoClipboardFormat {
  msoClipboardFormatMixed(-2),
  msoClipboardFormatNative(1),
  msoClipboardFormatHTML(2),
  msoClipboardFormatRTF(3),
  msoClipboardFormatPlainText(4);

  public final int value;
  private MsoClipboardFormat(int value) { this.value = value; }
  public static  MsoClipboardFormat valueOf(int value) {
    switch(value) {
    case -2: return msoClipboardFormatMixed;
    case 1: return msoClipboardFormatNative;
    case 2: return msoClipboardFormatHTML;
    case 3: return msoClipboardFormatRTF;
    case 4: return msoClipboardFormatPlainText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoClipboardFormat.class);
    }
  }
}
