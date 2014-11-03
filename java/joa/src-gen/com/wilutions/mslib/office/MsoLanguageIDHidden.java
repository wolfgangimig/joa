/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLanguageIDHidden.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLanguageIDHidden {
  msoLanguageIDChineseHongKong(3076),
  msoLanguageIDChineseMacao(5124),
  msoLanguageIDEnglishTrinidad(11273);

  public final int value;
  private MsoLanguageIDHidden(int value) { this.value = value; }
  public static  MsoLanguageIDHidden valueOf(int value) {
    switch(value) {
    case 3076: return msoLanguageIDChineseHongKong;
    case 5124: return msoLanguageIDChineseMacao;
    case 11273: return msoLanguageIDEnglishTrinidad;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLanguageIDHidden.class);
    }
  }
}
