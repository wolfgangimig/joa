/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSoftEdgeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSoftEdgeType {
  msoSoftEdgeTypeMixed(-2),
  msoSoftEdgeTypeNone(0),
  msoSoftEdgeType1(1),
  msoSoftEdgeType2(2),
  msoSoftEdgeType3(3),
  msoSoftEdgeType4(4),
  msoSoftEdgeType5(5),
  msoSoftEdgeType6(6);

  public final int value;
  private MsoSoftEdgeType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSoftEdgeType.class);
    }
  }
}
