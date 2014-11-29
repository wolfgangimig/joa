/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0006.
 * Enumerates the room properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0006 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0006 ucRoomUri = new __MIDL___MIDL_itf_uc_0001_0191_0006(983040);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0006 ucRoomDomainUrl = new __MIDL___MIDL_itf_uc_0001_0191_0006(983041);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0006 ucRoomDescription = new __MIDL___MIDL_itf_uc_0001_0191_0006(983042);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0006 ucRoomTitle = new __MIDL___MIDL_itf_uc_0001_0191_0006(983043);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0006 ucRoomType = new __MIDL___MIDL_itf_uc_0001_0191_0006(806289412);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomUri = 983040;
  public final static int _ucRoomDomainUrl = 983041;
  public final static int _ucRoomDescription = 983042;
  public final static int _ucRoomTitle = 983043;
  public final static int _ucRoomType = 806289412;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0006 valueOf(int value) {
    switch(value) {
    case 983040: return ucRoomUri;
    case 983041: return ucRoomDomainUrl;
    case 983042: return ucRoomDescription;
    case 983043: return ucRoomTitle;
    case 806289412: return ucRoomType;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0006(value);
    }
  }
}
