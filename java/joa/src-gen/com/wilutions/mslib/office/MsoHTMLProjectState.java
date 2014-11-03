/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHTMLProjectState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoHTMLProjectState {
  msoHTMLProjectStateDocumentLocked(1),
  msoHTMLProjectStateProjectLocked(2),
  msoHTMLProjectStateDocumentProjectUnlocked(3);

  public final int value;
  private MsoHTMLProjectState(int value) { this.value = value; }
  public static  MsoHTMLProjectState valueOf(int value) {
    switch(value) {
    case 1: return msoHTMLProjectStateDocumentLocked;
    case 2: return msoHTMLProjectStateProjectLocked;
    case 3: return msoHTMLProjectStateDocumentProjectUnlocked;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoHTMLProjectState.class);
    }
  }
}
