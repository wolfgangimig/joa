/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0004.
 * Enumerates supported content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0229_0004 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypeUnsupported = new __MIDL___MIDL_itf_uc_0001_0229_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypePowerPoint = new __MIDL___MIDL_itf_uc_0001_0229_0004(1);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypeWhiteboard = new __MIDL___MIDL_itf_uc_0001_0229_0004(2);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypeNativeFile = new __MIDL___MIDL_itf_uc_0001_0229_0004(3);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypePoll = new __MIDL___MIDL_itf_uc_0001_0229_0004(4);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0004 ucShareableContentTypeSharedNotes = new __MIDL___MIDL_itf_uc_0001_0229_0004(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentTypeUnsupported = 0;
  public final static int _ucShareableContentTypePowerPoint = 1;
  public final static int _ucShareableContentTypeWhiteboard = 2;
  public final static int _ucShareableContentTypeNativeFile = 3;
  public final static int _ucShareableContentTypePoll = 4;
  public final static int _ucShareableContentTypeSharedNotes = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0229_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0229_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentTypeUnsupported;
    case 1: return ucShareableContentTypePowerPoint;
    case 2: return ucShareableContentTypeWhiteboard;
    case 3: return ucShareableContentTypeNativeFile;
    case 4: return ucShareableContentTypePoll;
    case 5: return ucShareableContentTypeSharedNotes;
    default: return new __MIDL___MIDL_itf_uc_0001_0229_0004(value);
    }
  }
}
