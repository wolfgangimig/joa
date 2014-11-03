/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCTPDockPositionRestrict.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCTPDockPositionRestrict {
  msoCTPDockPositionRestrictNone(0),
  msoCTPDockPositionRestrictNoChange(1),
  msoCTPDockPositionRestrictNoHorizontal(2),
  msoCTPDockPositionRestrictNoVertical(3);

  public final int value;
  private MsoCTPDockPositionRestrict(int value) { this.value = value; }
  public static  MsoCTPDockPositionRestrict valueOf(int value) {
    switch(value) {
    case 0: return msoCTPDockPositionRestrictNone;
    case 1: return msoCTPDockPositionRestrictNoChange;
    case 2: return msoCTPDockPositionRestrictNoHorizontal;
    case 3: return msoCTPDockPositionRestrictNoVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCTPDockPositionRestrict.class);
    }
  }
}
