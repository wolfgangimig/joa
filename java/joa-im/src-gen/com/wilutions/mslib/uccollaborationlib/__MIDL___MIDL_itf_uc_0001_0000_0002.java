/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0002.
 * Enumerates the indexes where property ID fields reside. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0000_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0000_0002 ucPropertyMaskIndexType = new __MIDL___MIDL_itf_uc_0001_0000_0002(28);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0002 ucPropertyMaskIndexClass = new __MIDL___MIDL_itf_uc_0001_0000_0002(16);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0002 ucPropertyMaskIndexId = new __MIDL___MIDL_itf_uc_0001_0000_0002(0);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyMaskIndexType = 28;
  public final static int _ucPropertyMaskIndexClass = 16;
  public final static int _ucPropertyMaskIndexId = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0000_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0000_0002 valueOf(int value) {
    switch(value) {
    case 28: return ucPropertyMaskIndexType;
    case 16: return ucPropertyMaskIndexClass;
    case 0: return ucPropertyMaskIndexId;
    default: return new __MIDL___MIDL_itf_uc_0001_0000_0002(value);
    }
  }
}
