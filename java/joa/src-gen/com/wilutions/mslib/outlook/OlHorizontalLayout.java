/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlHorizontalLayout.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{634EE3C4-6BCB-4BD6-8997-30C9DB02E223}")
public enum OlHorizontalLayout {
  olHorizontalLayoutAlignLeft(0),
  olHorizontalLayoutAlignCenter(1),
  olHorizontalLayoutAlignRight(2),
  olHorizontalLayoutGrow(3);

  public final int value;
  private OlHorizontalLayout(int value) { this.value = value; }
  public static  OlHorizontalLayout valueOf(int value) {
    switch(value) {
    case 0: return olHorizontalLayoutAlignLeft;
    case 1: return olHorizontalLayoutAlignCenter;
    case 2: return olHorizontalLayoutAlignRight;
    case 3: return olHorizontalLayoutGrow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlHorizontalLayout.class);
    }
  }
}
