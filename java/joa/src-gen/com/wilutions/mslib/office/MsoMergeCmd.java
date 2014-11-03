/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMergeCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoMergeCmd {
  msoMergeUnion(1),
  msoMergeCombine(2),
  msoMergeIntersect(3),
  msoMergeSubtract(4),
  msoMergeFragment(5);

  public final int value;
  private MsoMergeCmd(int value) { this.value = value; }
  public static  MsoMergeCmd valueOf(int value) {
    switch(value) {
    case 1: return msoMergeUnion;
    case 2: return msoMergeCombine;
    case 3: return msoMergeIntersect;
    case 4: return msoMergeSubtract;
    case 5: return msoMergeFragment;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoMergeCmd.class);
    }
  }
}
