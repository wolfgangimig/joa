/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0004.
 * Enumerates supported content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0229_0004 {
  ucShareableContentTypeUnsupported(0),
  ucShareableContentTypePowerPoint(1),
  ucShareableContentTypeWhiteboard(2),
  ucShareableContentTypeNativeFile(3),
  ucShareableContentTypePoll(4),
  ucShareableContentTypeSharedNotes(5);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0229_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0229_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentTypeUnsupported;
    case 1: return ucShareableContentTypePowerPoint;
    case 2: return ucShareableContentTypeWhiteboard;
    case 3: return ucShareableContentTypeNativeFile;
    case 4: return ucShareableContentTypePoll;
    case 5: return ucShareableContentTypeSharedNotes;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0229_0004.class);
    }
  }
}
