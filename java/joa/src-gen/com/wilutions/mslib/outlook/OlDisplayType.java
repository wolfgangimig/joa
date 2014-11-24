/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDisplayType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDisplayType {

  // Typed constants
  public final static OlDisplayType olUser = new OlDisplayType(0);
  public final static OlDisplayType olDistList = new OlDisplayType(1);
  public final static OlDisplayType olForum = new OlDisplayType(2);
  public final static OlDisplayType olAgent = new OlDisplayType(3);
  public final static OlDisplayType olOrganization = new OlDisplayType(4);
  public final static OlDisplayType olPrivateDistList = new OlDisplayType(5);
  public final static OlDisplayType olRemoteUser = new OlDisplayType(6);

  // Integer constants for bitsets and switch statements
  public final static int _olUser = 0;
  public final static int _olDistList = 1;
  public final static int _olForum = 2;
  public final static int _olAgent = 3;
  public final static int _olOrganization = 4;
  public final static int _olPrivateDistList = 5;
  public final static int _olRemoteUser = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDisplayType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDisplayType valueOf(int value) {
    switch(value) {
    case 0: return olUser;
    case 1: return olDistList;
    case 2: return olForum;
    case 3: return olAgent;
    case 4: return olOrganization;
    case 5: return olPrivateDistList;
    case 6: return olRemoteUser;
    default: return new OlDisplayType(value);
    }
  }
}
