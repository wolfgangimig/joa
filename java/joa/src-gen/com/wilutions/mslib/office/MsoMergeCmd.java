/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMergeCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoMergeCmd {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoMergeCmd msoMergeUnion = new MsoMergeCmd(1);
  public final static MsoMergeCmd msoMergeCombine = new MsoMergeCmd(2);
  public final static MsoMergeCmd msoMergeIntersect = new MsoMergeCmd(3);
  public final static MsoMergeCmd msoMergeSubtract = new MsoMergeCmd(4);
  public final static MsoMergeCmd msoMergeFragment = new MsoMergeCmd(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoMergeUnion = 1;
  public final static int _msoMergeCombine = 2;
  public final static int _msoMergeIntersect = 3;
  public final static int _msoMergeSubtract = 4;
  public final static int _msoMergeFragment = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoMergeCmd(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoMergeCmd valueOf(int value) {
    switch(value) {
    case 1: return msoMergeUnion;
    case 2: return msoMergeCombine;
    case 3: return msoMergeIntersect;
    case 4: return msoMergeSubtract;
    case 5: return msoMergeFragment;
    default: return new MsoMergeCmd(value);
    }
  }
}
