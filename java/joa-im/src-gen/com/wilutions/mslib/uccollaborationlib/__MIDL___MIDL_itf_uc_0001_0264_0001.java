/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0264_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0264_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0264_0001 ucCredsResultUnknown = new __MIDL___MIDL_itf_uc_0001_0264_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0264_0001 ucCredsResultSuccess = new __MIDL___MIDL_itf_uc_0001_0264_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0264_0001 ucCredsResultFailure = new __MIDL___MIDL_itf_uc_0001_0264_0001(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucCredsResultUnknown = 0;
  public final static int _ucCredsResultSuccess = 1;
  public final static int _ucCredsResultFailure = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0264_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0264_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucCredsResultUnknown;
    case 1: return ucCredsResultSuccess;
    case 2: return ucCredsResultFailure;
    default: return new __MIDL___MIDL_itf_uc_0001_0264_0001(value);
    }
  }
}
