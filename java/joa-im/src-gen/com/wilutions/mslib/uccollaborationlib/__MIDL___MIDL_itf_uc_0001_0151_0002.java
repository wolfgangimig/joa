/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0151_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0151_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0151_0002 ucAlertModeVisual = new __MIDL___MIDL_itf_uc_0001_0151_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0151_0002 ucAlertModeAudio = new __MIDL___MIDL_itf_uc_0001_0151_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0151_0002 ucAlertModeAny = new __MIDL___MIDL_itf_uc_0001_0151_0002(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucAlertModeVisual = 1;
  public final static int _ucAlertModeAudio = 2;
  public final static int _ucAlertModeAny = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0151_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0151_0002 valueOf(int value) {
    switch(value) {
    case 1: return ucAlertModeVisual;
    case 2: return ucAlertModeAudio;
    case -1: return ucAlertModeAny;
    default: return new __MIDL___MIDL_itf_uc_0001_0151_0002(value);
    }
  }
}
