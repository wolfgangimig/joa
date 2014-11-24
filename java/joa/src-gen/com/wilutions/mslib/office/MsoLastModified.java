/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLastModified.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLastModified {

  // Typed constants
  public final static MsoLastModified msoLastModifiedYesterday = new MsoLastModified(1);
  public final static MsoLastModified msoLastModifiedToday = new MsoLastModified(2);
  public final static MsoLastModified msoLastModifiedLastWeek = new MsoLastModified(3);
  public final static MsoLastModified msoLastModifiedThisWeek = new MsoLastModified(4);
  public final static MsoLastModified msoLastModifiedLastMonth = new MsoLastModified(5);
  public final static MsoLastModified msoLastModifiedThisMonth = new MsoLastModified(6);
  public final static MsoLastModified msoLastModifiedAnyTime = new MsoLastModified(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoLastModifiedYesterday = 1;
  public final static int _msoLastModifiedToday = 2;
  public final static int _msoLastModifiedLastWeek = 3;
  public final static int _msoLastModifiedThisWeek = 4;
  public final static int _msoLastModifiedLastMonth = 5;
  public final static int _msoLastModifiedThisMonth = 6;
  public final static int _msoLastModifiedAnyTime = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLastModified(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLastModified valueOf(int value) {
    switch(value) {
    case 1: return msoLastModifiedYesterday;
    case 2: return msoLastModifiedToday;
    case 3: return msoLastModifiedLastWeek;
    case 4: return msoLastModifiedThisWeek;
    case 5: return msoLastModifiedLastMonth;
    case 6: return msoLastModifiedThisMonth;
    case 7: return msoLastModifiedAnyTime;
    default: return new MsoLastModified(value);
    }
  }
}
