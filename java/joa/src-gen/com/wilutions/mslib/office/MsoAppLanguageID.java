/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAppLanguageID.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAppLanguageID {
  msoLanguageIDInstall(1),
  msoLanguageIDUI(2),
  msoLanguageIDHelp(3),
  msoLanguageIDExeMode(4),
  msoLanguageIDUIPrevious(5);

  public final int value;
  private MsoAppLanguageID(int value) { this.value = value; }
  public static  MsoAppLanguageID valueOf(int value) {
    switch(value) {
    case 1: return msoLanguageIDInstall;
    case 2: return msoLanguageIDUI;
    case 3: return msoLanguageIDHelp;
    case 4: return msoLanguageIDExeMode;
    case 5: return msoLanguageIDUIPrevious;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAppLanguageID.class);
    }
  }
}
