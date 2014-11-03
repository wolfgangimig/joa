/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHTMLProjectOpen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoHTMLProjectOpen {
  msoHTMLProjectOpenSourceView(1),
  msoHTMLProjectOpenTextView(2);

  public final int value;
  private MsoHTMLProjectOpen(int value) { this.value = value; }
  public static  MsoHTMLProjectOpen valueOf(int value) {
    switch(value) {
    case 1: return msoHTMLProjectOpenSourceView;
    case 2: return msoHTMLProjectOpenTextView;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoHTMLProjectOpen.class);
    }
  }
}
