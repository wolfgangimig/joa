/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextureAlignment {

  // Typed constants
  public final static MsoTextureAlignment msoTextureAlignmentMixed = new MsoTextureAlignment(-2);
  public final static MsoTextureAlignment msoTextureTopLeft = new MsoTextureAlignment(0);
  public final static MsoTextureAlignment msoTextureTop = new MsoTextureAlignment(1);
  public final static MsoTextureAlignment msoTextureTopRight = new MsoTextureAlignment(2);
  public final static MsoTextureAlignment msoTextureLeft = new MsoTextureAlignment(3);
  public final static MsoTextureAlignment msoTextureCenter = new MsoTextureAlignment(4);
  public final static MsoTextureAlignment msoTextureRight = new MsoTextureAlignment(5);
  public final static MsoTextureAlignment msoTextureBottomLeft = new MsoTextureAlignment(6);
  public final static MsoTextureAlignment msoTextureBottom = new MsoTextureAlignment(7);
  public final static MsoTextureAlignment msoTextureBottomRight = new MsoTextureAlignment(8);

  // Integer constants for bitsets and switch statements
  public final static int _msoTextureAlignmentMixed = -2;
  public final static int _msoTextureTopLeft = 0;
  public final static int _msoTextureTop = 1;
  public final static int _msoTextureTopRight = 2;
  public final static int _msoTextureLeft = 3;
  public final static int _msoTextureCenter = 4;
  public final static int _msoTextureRight = 5;
  public final static int _msoTextureBottomLeft = 6;
  public final static int _msoTextureBottom = 7;
  public final static int _msoTextureBottomRight = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextureAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextureAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoTextureAlignmentMixed;
    case 0: return msoTextureTopLeft;
    case 1: return msoTextureTop;
    case 2: return msoTextureTopRight;
    case 3: return msoTextureLeft;
    case 4: return msoTextureCenter;
    case 5: return msoTextureRight;
    case 6: return msoTextureBottomLeft;
    case 7: return msoTextureBottom;
    case 8: return msoTextureBottomRight;
    default: return new MsoTextureAlignment(value);
    }
  }
}
