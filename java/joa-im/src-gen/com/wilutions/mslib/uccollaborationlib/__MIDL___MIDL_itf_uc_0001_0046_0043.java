/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0043.
 * Enumerates the InstantMessage content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0043 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentPlainText = new __MIDL___MIDL_itf_uc_0001_0046_0043(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentHtml = new __MIDL___MIDL_itf_uc_0001_0046_0043(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentRichText = new __MIDL___MIDL_itf_uc_0001_0046_0043(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentGif = new __MIDL___MIDL_itf_uc_0001_0046_0043(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentInk = new __MIDL___MIDL_itf_uc_0001_0046_0043(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0043 ucInstantMessageContentUnknown = new __MIDL___MIDL_itf_uc_0001_0046_0043(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucInstantMessageContentPlainText = 0;
  public final static int _ucInstantMessageContentHtml = 1;
  public final static int _ucInstantMessageContentRichText = 2;
  public final static int _ucInstantMessageContentGif = 3;
  public final static int _ucInstantMessageContentInk = 4;
  public final static int _ucInstantMessageContentUnknown = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0043(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0043 valueOf(int value) {
    switch(value) {
    case 0: return ucInstantMessageContentPlainText;
    case 1: return ucInstantMessageContentHtml;
    case 2: return ucInstantMessageContentRichText;
    case 3: return ucInstantMessageContentGif;
    case 4: return ucInstantMessageContentInk;
    case 5: return ucInstantMessageContentUnknown;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0043(value);
    }
  }
}
