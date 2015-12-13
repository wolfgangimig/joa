/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoParagraphAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoParagraphAlignment implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoParagraphAlignment msoAlignMixed = new MsoParagraphAlignment(-2);
  public final static MsoParagraphAlignment msoAlignLeft = new MsoParagraphAlignment(1);
  public final static MsoParagraphAlignment msoAlignCenter = new MsoParagraphAlignment(2);
  public final static MsoParagraphAlignment msoAlignRight = new MsoParagraphAlignment(3);
  public final static MsoParagraphAlignment msoAlignJustify = new MsoParagraphAlignment(4);
  public final static MsoParagraphAlignment msoAlignDistribute = new MsoParagraphAlignment(5);
  public final static MsoParagraphAlignment msoAlignThaiDistribute = new MsoParagraphAlignment(6);
  public final static MsoParagraphAlignment msoAlignJustifyLow = new MsoParagraphAlignment(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlignMixed = -2;
  public final static int _msoAlignLeft = 1;
  public final static int _msoAlignCenter = 2;
  public final static int _msoAlignRight = 3;
  public final static int _msoAlignJustify = 4;
  public final static int _msoAlignDistribute = 5;
  public final static int _msoAlignThaiDistribute = 6;
  public final static int _msoAlignJustifyLow = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoParagraphAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoParagraphAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoAlignMixed;
    case 1: return msoAlignLeft;
    case 2: return msoAlignCenter;
    case 3: return msoAlignRight;
    case 4: return msoAlignJustify;
    case 5: return msoAlignDistribute;
    case 6: return msoAlignThaiDistribute;
    case 7: return msoAlignJustifyLow;
    default: return new MsoParagraphAlignment(value);
    }
  }

  public String toString() {
    switch(value) {
    case 7: return "msoAlignJustifyLow";
    case -2: return "msoAlignMixed";
    case 1: return "msoAlignLeft";
    case 2: return "msoAlignCenter";
    case 3: return "msoAlignRight";
    case 4: return "msoAlignJustify";
    case 5: return "msoAlignDistribute";
    case 6: return "msoAlignThaiDistribute";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoAlignJustifyLow");
      if ((value & -2) != 0) sbuf.append("|msoAlignMixed");
      if ((value & 1) != 0) sbuf.append("|msoAlignLeft");
      if ((value & 2) != 0) sbuf.append("|msoAlignCenter");
      if ((value & 3) != 0) sbuf.append("|msoAlignRight");
      if ((value & 4) != 0) sbuf.append("|msoAlignJustify");
      if ((value & 5) != 0) sbuf.append("|msoAlignDistribute");
      if ((value & 6) != 0) sbuf.append("|msoAlignThaiDistribute");
      return sbuf.toString();
      }
    }
  }
}
