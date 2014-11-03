/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlVerticalLayout.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EA33F29D-6159-4E76-8A14-BCEAA808FA91}")
public enum OlVerticalLayout {
  olVerticalLayoutAlignTop(0),
  olVerticalLayoutAlignMiddle(1),
  olVerticalLayoutAlignBottom(2),
  olVerticalLayoutGrow(3);

  public final int value;
  private OlVerticalLayout(int value) { this.value = value; }
  public static  OlVerticalLayout valueOf(int value) {
    switch(value) {
    case 0: return olVerticalLayoutAlignTop;
    case 1: return olVerticalLayoutAlignMiddle;
    case 2: return olVerticalLayoutAlignBottom;
    case 3: return olVerticalLayoutGrow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlVerticalLayout.class);
    }
  }
}
