/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{570C03E0-F797-11CE-B9EC-00AA006B1A69}")
public class fmAction implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmAction fmActionCut = new fmAction(0);
  public final static fmAction fmActionCopy = new fmAction(1);
  public final static fmAction fmActionPaste = new fmAction(2);
  public final static fmAction fmActionDragDrop = new fmAction(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmActionCut = 0;
  public final static int _fmActionCopy = 1;
  public final static int _fmActionPaste = 2;
  public final static int _fmActionDragDrop = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmAction valueOf(int value) {
    switch(value) {
    case 0: return fmActionCut;
    case 1: return fmActionCopy;
    case 2: return fmActionPaste;
    case 3: return fmActionDragDrop;
    default: return new fmAction(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmActionCut";
    case 1: return "fmActionCopy";
    case 2: return "fmActionPaste";
    case 3: return "fmActionDragDrop";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmActionCut");
      if ((value & 1) != 0) sbuf.append("|fmActionCopy");
      if ((value & 2) != 0) sbuf.append("|fmActionPaste");
      if ((value & 3) != 0) sbuf.append("|fmActionDragDrop");
      return sbuf.toString();
      }
    }
  }
}
