/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0016.
 * Defines default note type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0016 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0016 ucNoteTypeUnknown = new __MIDL___MIDL_itf_uc_0001_0004_0016(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0016 ucNoteTypePersonal = new __MIDL___MIDL_itf_uc_0001_0004_0016(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0016 ucNoteTypeOutOfOffice = new __MIDL___MIDL_itf_uc_0001_0004_0016(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucNoteTypeUnknown = 0;
  public final static int _ucNoteTypePersonal = 1;
  public final static int _ucNoteTypeOutOfOffice = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0016(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0016 valueOf(int value) {
    switch(value) {
    case 0: return ucNoteTypeUnknown;
    case 1: return ucNoteTypePersonal;
    case 2: return ucNoteTypeOutOfOffice;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0016(value);
    }
  }
}
