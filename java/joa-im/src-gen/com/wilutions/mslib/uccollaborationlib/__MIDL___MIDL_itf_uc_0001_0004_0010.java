/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0010.
 * Enumerates search options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0010 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0010 ucSearchDefault = new __MIDL___MIDL_itf_uc_0001_0004_0010(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0010 ucSearchMatchWholeWord = new __MIDL___MIDL_itf_uc_0001_0004_0010(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0010 ucSearchContactsOnly = new __MIDL___MIDL_itf_uc_0001_0004_0010(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0010 ucSearchIncludeContactsWithoutSipOrTelUri = new __MIDL___MIDL_itf_uc_0001_0004_0010(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0010 ucSearchAllowProgressiveCallback = new __MIDL___MIDL_itf_uc_0001_0004_0010(268435456);

  // Integer constants for bitsets and switch statements
  public final static int _ucSearchDefault = 0;
  public final static int _ucSearchMatchWholeWord = 1;
  public final static int _ucSearchContactsOnly = 2;
  public final static int _ucSearchIncludeContactsWithoutSipOrTelUri = 4;
  public final static int _ucSearchAllowProgressiveCallback = 268435456;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0010(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0010 valueOf(int value) {
    switch(value) {
    case 0: return ucSearchDefault;
    case 1: return ucSearchMatchWholeWord;
    case 2: return ucSearchContactsOnly;
    case 4: return ucSearchIncludeContactsWithoutSipOrTelUri;
    case 268435456: return ucSearchAllowProgressiveCallback;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0010(value);
    }
  }
}
