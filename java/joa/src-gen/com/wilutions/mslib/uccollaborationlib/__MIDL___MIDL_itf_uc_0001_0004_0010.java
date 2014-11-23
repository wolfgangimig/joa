/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0010.
 * Enumerates search options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0010 {
  ucSearchDefault(0),
  ucSearchMatchWholeWord(1),
  ucSearchContactsOnly(2),
  ucSearchIncludeContactsWithoutSipOrTelUri(4),
  ucSearchAllowProgressiveCallback(268435456);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0010(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0010 valueOf(int value) {
    switch(value) {
    case 0: return ucSearchDefault;
    case 1: return ucSearchMatchWholeWord;
    case 2: return ucSearchContactsOnly;
    case 4: return ucSearchIncludeContactsWithoutSipOrTelUri;
    case 268435456: return ucSearchAllowProgressiveCallback;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0010.class);
    }
  }
}
