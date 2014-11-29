/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0014.
 * Defines contact calendar states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0014 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateAvailable = new __MIDL___MIDL_itf_uc_0001_0004_0014(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateTentative = new __MIDL___MIDL_itf_uc_0001_0004_0014(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateOutsideWorkPeriod = new __MIDL___MIDL_itf_uc_0001_0004_0014(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateBusy = new __MIDL___MIDL_itf_uc_0001_0004_0014(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateOutOfOffice = new __MIDL___MIDL_itf_uc_0001_0004_0014(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateNotAvailable = new __MIDL___MIDL_itf_uc_0001_0004_0014(5);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateUnknown = new __MIDL___MIDL_itf_uc_0001_0004_0014(6);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0014 ucCalendarStateWorkingElsewhere = new __MIDL___MIDL_itf_uc_0001_0004_0014(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucCalendarStateAvailable = 0;
  public final static int _ucCalendarStateTentative = 1;
  public final static int _ucCalendarStateOutsideWorkPeriod = 2;
  public final static int _ucCalendarStateBusy = 3;
  public final static int _ucCalendarStateOutOfOffice = 4;
  public final static int _ucCalendarStateNotAvailable = 5;
  public final static int _ucCalendarStateUnknown = 6;
  public final static int _ucCalendarStateWorkingElsewhere = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0014(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0014 valueOf(int value) {
    switch(value) {
    case 0: return ucCalendarStateAvailable;
    case 1: return ucCalendarStateTentative;
    case 2: return ucCalendarStateOutsideWorkPeriod;
    case 3: return ucCalendarStateBusy;
    case 4: return ucCalendarStateOutOfOffice;
    case 5: return ucCalendarStateNotAvailable;
    case 6: return ucCalendarStateUnknown;
    case 7: return ucCalendarStateWorkingElsewhere;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0014(value);
    }
  }
}
