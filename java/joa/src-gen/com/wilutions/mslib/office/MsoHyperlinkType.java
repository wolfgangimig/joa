/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHyperlinkType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoHyperlinkType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoHyperlinkType msoHyperlinkRange = new MsoHyperlinkType(0);
  public final static MsoHyperlinkType msoHyperlinkShape = new MsoHyperlinkType(1);
  public final static MsoHyperlinkType msoHyperlinkInlineShape = new MsoHyperlinkType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoHyperlinkRange = 0;
  public final static int _msoHyperlinkShape = 1;
  public final static int _msoHyperlinkInlineShape = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoHyperlinkType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoHyperlinkType valueOf(int value) {
    switch(value) {
    case 0: return msoHyperlinkRange;
    case 1: return msoHyperlinkShape;
    case 2: return msoHyperlinkInlineShape;
    default: return new MsoHyperlinkType(value);
    }
  }
}
