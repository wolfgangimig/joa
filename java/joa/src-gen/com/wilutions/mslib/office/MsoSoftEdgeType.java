/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSoftEdgeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSoftEdgeType {

  // Typed constants
  public final static MsoSoftEdgeType msoSoftEdgeTypeMixed = new MsoSoftEdgeType(-2);
  public final static MsoSoftEdgeType msoSoftEdgeTypeNone = new MsoSoftEdgeType(0);
  public final static MsoSoftEdgeType msoSoftEdgeType1 = new MsoSoftEdgeType(1);
  public final static MsoSoftEdgeType msoSoftEdgeType2 = new MsoSoftEdgeType(2);
  public final static MsoSoftEdgeType msoSoftEdgeType3 = new MsoSoftEdgeType(3);
  public final static MsoSoftEdgeType msoSoftEdgeType4 = new MsoSoftEdgeType(4);
  public final static MsoSoftEdgeType msoSoftEdgeType5 = new MsoSoftEdgeType(5);
  public final static MsoSoftEdgeType msoSoftEdgeType6 = new MsoSoftEdgeType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoSoftEdgeTypeMixed = -2;
  public final static int _msoSoftEdgeTypeNone = 0;
  public final static int _msoSoftEdgeType1 = 1;
  public final static int _msoSoftEdgeType2 = 2;
  public final static int _msoSoftEdgeType3 = 3;
  public final static int _msoSoftEdgeType4 = 4;
  public final static int _msoSoftEdgeType5 = 5;
  public final static int _msoSoftEdgeType6 = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSoftEdgeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSoftEdgeType valueOf(int value) {
    switch(value) {
    case -2: return msoSoftEdgeTypeMixed;
    case 0: return msoSoftEdgeTypeNone;
    case 1: return msoSoftEdgeType1;
    case 2: return msoSoftEdgeType2;
    case 3: return msoSoftEdgeType3;
    case 4: return msoSoftEdgeType4;
    case 5: return msoSoftEdgeType5;
    case 6: return msoSoftEdgeType6;
    default: return new MsoSoftEdgeType(value);
    }
  }
}
