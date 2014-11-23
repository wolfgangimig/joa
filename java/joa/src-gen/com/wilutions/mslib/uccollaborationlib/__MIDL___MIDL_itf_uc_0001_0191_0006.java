/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0006.
 * Enumerates the room properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0006 {
  ucRoomUri(983040),
  ucRoomDomainUrl(983041),
  ucRoomDescription(983042),
  ucRoomTitle(983043),
  ucRoomType(806289412);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0006(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0006 valueOf(int value) {
    switch(value) {
    case 983040: return ucRoomUri;
    case 983041: return ucRoomDomainUrl;
    case 983042: return ucRoomDescription;
    case 983043: return ucRoomTitle;
    case 806289412: return ucRoomType;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0006.class);
    }
  }
}
