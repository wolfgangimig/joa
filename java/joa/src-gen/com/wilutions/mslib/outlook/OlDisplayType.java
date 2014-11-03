/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDisplayType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDisplayType {
  olUser(0),
  olDistList(1),
  olForum(2),
  olAgent(3),
  olOrganization(4),
  olPrivateDistList(5),
  olRemoteUser(6);

  public final int value;
  private OlDisplayType(int value) { this.value = value; }
  public static  OlDisplayType valueOf(int value) {
    switch(value) {
    case 0: return olUser;
    case 1: return olDistList;
    case 2: return olForum;
    case 3: return olAgent;
    case 4: return olOrganization;
    case 5: return olPrivateDistList;
    case 6: return olRemoteUser;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDisplayType.class);
    }
  }
}
