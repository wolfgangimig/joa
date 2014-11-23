/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0231_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0231_0001 {
  ucContentSavingFileTypeXPS(806354944),
  ucContentSavingFileTypePNG(806354945);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0231_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0231_0001 valueOf(int value) {
    switch(value) {
    case 806354944: return ucContentSavingFileTypeXPS;
    case 806354945: return ucContentSavingFileTypePNG;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0231_0001.class);
    }
  }
}
