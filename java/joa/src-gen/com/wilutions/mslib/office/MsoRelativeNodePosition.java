/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoRelativeNodePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoRelativeNodePosition {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoRelativeNodePosition msoBeforeNode = new MsoRelativeNodePosition(1);
  public final static MsoRelativeNodePosition msoAfterNode = new MsoRelativeNodePosition(2);
  public final static MsoRelativeNodePosition msoBeforeFirstSibling = new MsoRelativeNodePosition(3);
  public final static MsoRelativeNodePosition msoAfterLastSibling = new MsoRelativeNodePosition(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoBeforeNode = 1;
  public final static int _msoAfterNode = 2;
  public final static int _msoBeforeFirstSibling = 3;
  public final static int _msoAfterLastSibling = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoRelativeNodePosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoRelativeNodePosition valueOf(int value) {
    switch(value) {
    case 1: return msoBeforeNode;
    case 2: return msoAfterNode;
    case 3: return msoBeforeFirstSibling;
    case 4: return msoAfterLastSibling;
    default: return new MsoRelativeNodePosition(value);
    }
  }
}
