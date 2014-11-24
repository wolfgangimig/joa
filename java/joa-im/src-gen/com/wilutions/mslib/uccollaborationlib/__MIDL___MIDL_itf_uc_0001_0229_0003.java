/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0003.
 * Enumerates the various states an IContent object could be in. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0229_0003 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateInitializing = new __MIDL___MIDL_itf_uc_0001_0229_0003(0);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateOffline = new __MIDL___MIDL_itf_uc_0001_0229_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateConnecting = new __MIDL___MIDL_itf_uc_0001_0229_0003(2);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateOnline = new __MIDL___MIDL_itf_uc_0001_0229_0003(3);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateDisconnecting = new __MIDL___MIDL_itf_uc_0001_0229_0003(4);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateActive = new __MIDL___MIDL_itf_uc_0001_0229_0003(5);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0003 ucShareableContentStateUnusable = new __MIDL___MIDL_itf_uc_0001_0229_0003(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentStateInitializing = 0;
  public final static int _ucShareableContentStateOffline = 1;
  public final static int _ucShareableContentStateConnecting = 2;
  public final static int _ucShareableContentStateOnline = 3;
  public final static int _ucShareableContentStateDisconnecting = 4;
  public final static int _ucShareableContentStateActive = 5;
  public final static int _ucShareableContentStateUnusable = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0229_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0229_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentStateInitializing;
    case 1: return ucShareableContentStateOffline;
    case 2: return ucShareableContentStateConnecting;
    case 3: return ucShareableContentStateOnline;
    case 4: return ucShareableContentStateDisconnecting;
    case 5: return ucShareableContentStateActive;
    case 6: return ucShareableContentStateUnusable;
    default: return new __MIDL___MIDL_itf_uc_0001_0229_0003(value);
    }
  }
}
