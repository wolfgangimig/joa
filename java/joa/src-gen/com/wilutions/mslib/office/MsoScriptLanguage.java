/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScriptLanguage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoScriptLanguage {

  // Typed constants
  public final static MsoScriptLanguage msoScriptLanguageJava = new MsoScriptLanguage(1);
  public final static MsoScriptLanguage msoScriptLanguageVisualBasic = new MsoScriptLanguage(2);
  public final static MsoScriptLanguage msoScriptLanguageASP = new MsoScriptLanguage(3);
  public final static MsoScriptLanguage msoScriptLanguageOther = new MsoScriptLanguage(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoScriptLanguageJava = 1;
  public final static int _msoScriptLanguageVisualBasic = 2;
  public final static int _msoScriptLanguageASP = 3;
  public final static int _msoScriptLanguageOther = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoScriptLanguage(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoScriptLanguage valueOf(int value) {
    switch(value) {
    case 1: return msoScriptLanguageJava;
    case 2: return msoScriptLanguageVisualBasic;
    case 3: return msoScriptLanguageASP;
    case 4: return msoScriptLanguageOther;
    default: return new MsoScriptLanguage(value);
    }
  }
}
