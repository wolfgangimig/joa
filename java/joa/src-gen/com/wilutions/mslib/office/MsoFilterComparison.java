/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFilterComparison.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFilterComparison {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFilterComparison msoFilterComparisonEqual = new MsoFilterComparison(0);
  public final static MsoFilterComparison msoFilterComparisonNotEqual = new MsoFilterComparison(1);
  public final static MsoFilterComparison msoFilterComparisonLessThan = new MsoFilterComparison(2);
  public final static MsoFilterComparison msoFilterComparisonGreaterThan = new MsoFilterComparison(3);
  public final static MsoFilterComparison msoFilterComparisonLessThanEqual = new MsoFilterComparison(4);
  public final static MsoFilterComparison msoFilterComparisonGreaterThanEqual = new MsoFilterComparison(5);
  public final static MsoFilterComparison msoFilterComparisonIsBlank = new MsoFilterComparison(6);
  public final static MsoFilterComparison msoFilterComparisonIsNotBlank = new MsoFilterComparison(7);
  public final static MsoFilterComparison msoFilterComparisonContains = new MsoFilterComparison(8);
  public final static MsoFilterComparison msoFilterComparisonNotContains = new MsoFilterComparison(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoFilterComparisonEqual = 0;
  public final static int _msoFilterComparisonNotEqual = 1;
  public final static int _msoFilterComparisonLessThan = 2;
  public final static int _msoFilterComparisonGreaterThan = 3;
  public final static int _msoFilterComparisonLessThanEqual = 4;
  public final static int _msoFilterComparisonGreaterThanEqual = 5;
  public final static int _msoFilterComparisonIsBlank = 6;
  public final static int _msoFilterComparisonIsNotBlank = 7;
  public final static int _msoFilterComparisonContains = 8;
  public final static int _msoFilterComparisonNotContains = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFilterComparison(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoFilterComparison(value);
    }
  }
}
