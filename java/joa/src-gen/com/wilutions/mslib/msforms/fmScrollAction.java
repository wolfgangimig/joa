/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmScrollAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E0ABC3C0-D199-11CE-8CCE-00AA0044BB60}")
public enum fmScrollAction {
  fmScrollActionNoChange(0),
  fmScrollActionLineUp(1),
  fmScrollActionLineDown(2),
  fmScrollActionPageUp(3),
  fmScrollActionPageDown(4),
  fmScrollActionBegin(5),
  fmScrollActionEnd(6),
  _fmScrollActionAbsoluteChange(7),
  fmScrollActionPropertyChange(8),
  fmScrollActionControlRequest(9),
  fmScrollActionFocusRequest(10);

  public final int value;
  private fmScrollAction(int value) { this.value = value; }
  public static  fmScrollAction valueOf(int value) {
    switch(value) {
    case 0: return fmScrollActionNoChange;
    case 1: return fmScrollActionLineUp;
    case 2: return fmScrollActionLineDown;
    case 3: return fmScrollActionPageUp;
    case 4: return fmScrollActionPageDown;
    case 5: return fmScrollActionBegin;
    case 6: return fmScrollActionEnd;
    case 7: return _fmScrollActionAbsoluteChange;
    case 8: return fmScrollActionPropertyChange;
    case 9: return fmScrollActionControlRequest;
    case 10: return fmScrollActionFocusRequest;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmScrollAction.class);
    }
  }
}
