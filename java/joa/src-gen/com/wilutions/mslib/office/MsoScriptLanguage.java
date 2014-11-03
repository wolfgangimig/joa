/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScriptLanguage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoScriptLanguage {
  msoScriptLanguageJava(1),
  msoScriptLanguageVisualBasic(2),
  msoScriptLanguageASP(3),
  msoScriptLanguageOther(4);

  public final int value;
  private MsoScriptLanguage(int value) { this.value = value; }
  public static  MsoScriptLanguage valueOf(int value) {
    switch(value) {
    case 1: return msoScriptLanguageJava;
    case 2: return msoScriptLanguageVisualBasic;
    case 3: return msoScriptLanguageASP;
    case 4: return msoScriptLanguageOther;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoScriptLanguage.class);
    }
  }
}
