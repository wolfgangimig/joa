/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CanShareDetail.
 * Enumerates the detail of why sharing a particular resource is allowed or not allowed. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CanShareDetail {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static CanShareDetail ucCanShareDetailAllowed = new CanShareDetail(0);
  public final static CanShareDetail ucCanShareDetailDisabledByPolicy = new CanShareDetail(1);
  public final static CanShareDetail ucCanShareDetailDisabledByOrganizerPolicy = new CanShareDetail(2);
  public final static CanShareDetail ucCanShareDetailDisabledByRole = new CanShareDetail(3);
  public final static CanShareDetail ucCanShareDetailCannotConnect = new CanShareDetail(4);
  public final static CanShareDetail ucCanShareDetailDisabledForOtherReason = new CanShareDetail(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucCanShareDetailAllowed = 0;
  public final static int _ucCanShareDetailDisabledByPolicy = 1;
  public final static int _ucCanShareDetailDisabledByOrganizerPolicy = 2;
  public final static int _ucCanShareDetailDisabledByRole = 3;
  public final static int _ucCanShareDetailCannotConnect = 4;
  public final static int _ucCanShareDetailDisabledForOtherReason = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CanShareDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  CanShareDetail valueOf(int value) {
    switch(value) {
    case 0: return ucCanShareDetailAllowed;
    case 1: return ucCanShareDetailDisabledByPolicy;
    case 2: return ucCanShareDetailDisabledByOrganizerPolicy;
    case 3: return ucCanShareDetailDisabledByRole;
    case 4: return ucCanShareDetailCannotConnect;
    case 5: return ucCanShareDetailDisabledForOtherReason;
    default: return new CanShareDetail(value);
    }
  }
}
