/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{570C03E0-F797-11CE-B9EC-00AA006B1A69}")
public enum fmAction {
  fmActionCut(0),
  fmActionCopy(1),
  fmActionPaste(2),
  fmActionDragDrop(3);

  public final int value;
  private fmAction(int value) { this.value = value; }
  public static  fmAction valueOf(int value) {
    switch(value) {
    case 0: return fmActionCut;
    case 1: return fmActionCopy;
    case 2: return fmActionPaste;
    case 3: return fmActionDragDrop;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmAction.class);
    }
  }
}
