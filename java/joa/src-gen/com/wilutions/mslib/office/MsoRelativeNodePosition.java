/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoRelativeNodePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoRelativeNodePosition {
  msoBeforeNode(1),
  msoAfterNode(2),
  msoBeforeFirstSibling(3),
  msoAfterLastSibling(4);

  public final int value;
  private MsoRelativeNodePosition(int value) { this.value = value; }
  public static  MsoRelativeNodePosition valueOf(int value) {
    switch(value) {
    case 1: return msoBeforeNode;
    case 2: return msoAfterNode;
    case 3: return msoBeforeFirstSibling;
    case 4: return msoAfterLastSibling;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoRelativeNodePosition.class);
    }
  }
}
