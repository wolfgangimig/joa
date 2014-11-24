/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAppLanguageID.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAppLanguageID {

  // Typed constants
  public final static MsoAppLanguageID msoLanguageIDInstall = new MsoAppLanguageID(1);
  public final static MsoAppLanguageID msoLanguageIDUI = new MsoAppLanguageID(2);
  public final static MsoAppLanguageID msoLanguageIDHelp = new MsoAppLanguageID(3);
  public final static MsoAppLanguageID msoLanguageIDExeMode = new MsoAppLanguageID(4);
  public final static MsoAppLanguageID msoLanguageIDUIPrevious = new MsoAppLanguageID(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoLanguageIDInstall = 1;
  public final static int _msoLanguageIDUI = 2;
  public final static int _msoLanguageIDHelp = 3;
  public final static int _msoLanguageIDExeMode = 4;
  public final static int _msoLanguageIDUIPrevious = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAppLanguageID(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAppLanguageID valueOf(int value) {
    switch(value) {
    case 1: return msoLanguageIDInstall;
    case 2: return msoLanguageIDUI;
    case 3: return msoLanguageIDHelp;
    case 4: return msoLanguageIDExeMode;
    case 5: return msoLanguageIDUIPrevious;
    default: return new MsoAppLanguageID(value);
    }
  }
}
