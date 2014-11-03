/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDragState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{82074C80-EA51-11CE-8043-00AA006009FA}")
public enum fmDragState {
  fmDragStateEnter(0),
  fmDragStateLeave(1),
  fmDragStateOver(2);

  public final int value;
  private fmDragState(int value) { this.value = value; }
  public static  fmDragState valueOf(int value) {
    switch(value) {
    case 0: return fmDragStateEnter;
    case 1: return fmDragStateLeave;
    case 2: return fmDragStateOver;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmDragState.class);
    }
  }
}
