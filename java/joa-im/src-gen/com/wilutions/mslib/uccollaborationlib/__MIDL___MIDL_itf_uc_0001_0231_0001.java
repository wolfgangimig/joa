/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0231_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0231_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0231_0001 ucContentSavingFileTypeXPS = new __MIDL___MIDL_itf_uc_0001_0231_0001(806354944);
  public final static __MIDL___MIDL_itf_uc_0001_0231_0001 ucContentSavingFileTypePNG = new __MIDL___MIDL_itf_uc_0001_0231_0001(806354945);

  // Integer constants for bitsets and switch statements
  public final static int _ucContentSavingFileTypeXPS = 806354944;
  public final static int _ucContentSavingFileTypePNG = 806354945;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0231_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0231_0001 valueOf(int value) {
    switch(value) {
    case 806354944: return ucContentSavingFileTypeXPS;
    case 806354945: return ucContentSavingFileTypePNG;
    default: return new __MIDL___MIDL_itf_uc_0001_0231_0001(value);
    }
  }
}
