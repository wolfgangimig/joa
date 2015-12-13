/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLanguageIDHidden.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLanguageIDHidden implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoLanguageIDHidden msoLanguageIDChineseHongKong = new MsoLanguageIDHidden(3076);
  public final static MsoLanguageIDHidden msoLanguageIDChineseMacao = new MsoLanguageIDHidden(5124);
  public final static MsoLanguageIDHidden msoLanguageIDEnglishTrinidad = new MsoLanguageIDHidden(11273);

  // Integer constants for bitsets and switch statements
  public final static int _msoLanguageIDChineseHongKong = 3076;
  public final static int _msoLanguageIDChineseMacao = 5124;
  public final static int _msoLanguageIDEnglishTrinidad = 11273;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLanguageIDHidden(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLanguageIDHidden valueOf(int value) {
    switch(value) {
    case 3076: return msoLanguageIDChineseHongKong;
    case 5124: return msoLanguageIDChineseMacao;
    case 11273: return msoLanguageIDEnglishTrinidad;
    default: return new MsoLanguageIDHidden(value);
    }
  }

  public String toString() {
    switch(value) {
    case 3076: return "msoLanguageIDChineseHongKong";
    case 5124: return "msoLanguageIDChineseMacao";
    case 11273: return "msoLanguageIDEnglishTrinidad";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 3076) != 0) sbuf.append("|msoLanguageIDChineseHongKong");
      if ((value & 5124) != 0) sbuf.append("|msoLanguageIDChineseMacao");
      if ((value & 11273) != 0) sbuf.append("|msoLanguageIDEnglishTrinidad");
      return sbuf.toString();
      }
    }
  }
}
