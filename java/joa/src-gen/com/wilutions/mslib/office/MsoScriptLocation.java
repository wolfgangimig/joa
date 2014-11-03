/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScriptLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoScriptLocation {
  msoScriptLocationInHead(1),
  msoScriptLocationInBody(2);

  public final int value;
  private MsoScriptLocation(int value) { this.value = value; }
  public static  MsoScriptLocation valueOf(int value) {
    switch(value) {
    case 1: return msoScriptLocationInHead;
    case 2: return msoScriptLocationInBody;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoScriptLocation.class);
    }
  }
}
