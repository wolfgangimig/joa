/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFilterComparison.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFilterComparison {
  msoFilterComparisonEqual(0),
  msoFilterComparisonNotEqual(1),
  msoFilterComparisonLessThan(2),
  msoFilterComparisonGreaterThan(3),
  msoFilterComparisonLessThanEqual(4),
  msoFilterComparisonGreaterThanEqual(5),
  msoFilterComparisonIsBlank(6),
  msoFilterComparisonIsNotBlank(7),
  msoFilterComparisonContains(8),
  msoFilterComparisonNotContains(9);

  public final int value;
  private MsoFilterComparison(int value) { this.value = value; }
  public static  MsoFilterComparison valueOf(int value) {
    switch(value) {
    case 0: return msoFilterComparisonEqual;
    case 1: return msoFilterComparisonNotEqual;
    case 2: return msoFilterComparisonLessThan;
    case 3: return msoFilterComparisonGreaterThan;
    case 4: return msoFilterComparisonLessThanEqual;
    case 5: return msoFilterComparisonGreaterThanEqual;
    case 6: return msoFilterComparisonIsBlank;
    case 7: return msoFilterComparisonIsNotBlank;
    case 8: return msoFilterComparisonContains;
    case 9: return msoFilterComparisonNotContains;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFilterComparison.class);
    }
  }
}
