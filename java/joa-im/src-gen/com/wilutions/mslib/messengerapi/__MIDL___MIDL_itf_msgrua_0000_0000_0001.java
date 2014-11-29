/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_UNKNOWN = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_OFFLINE = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_ONLINE = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(2);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_INVISIBLE = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(6);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_BUSY = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(10);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_BE_RIGHT_BACK = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(14);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_IDLE = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(18);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_AWAY = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(34);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_ON_THE_PHONE = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(50);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_OUT_TO_LUNCH = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(66);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_LOCAL_FINDING_SERVER = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(256);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_LOCAL_CONNECTING_TO_SERVER = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(512);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_LOCAL_SYNCHRONIZING_WITH_SERVER = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(768);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0001 MISTATUS_LOCAL_DISCONNECTING_FROM_SERVER = new __MIDL___MIDL_itf_msgrua_0000_0000_0001(1024);

  // Integer constants for bitsets and switch statements
  public final static int _MISTATUS_UNKNOWN = 0;
  public final static int _MISTATUS_OFFLINE = 1;
  public final static int _MISTATUS_ONLINE = 2;
  public final static int _MISTATUS_INVISIBLE = 6;
  public final static int _MISTATUS_BUSY = 10;
  public final static int _MISTATUS_BE_RIGHT_BACK = 14;
  public final static int _MISTATUS_IDLE = 18;
  public final static int _MISTATUS_AWAY = 34;
  public final static int _MISTATUS_ON_THE_PHONE = 50;
  public final static int _MISTATUS_OUT_TO_LUNCH = 66;
  public final static int _MISTATUS_LOCAL_FINDING_SERVER = 256;
  public final static int _MISTATUS_LOCAL_CONNECTING_TO_SERVER = 512;
  public final static int _MISTATUS_LOCAL_SYNCHRONIZING_WITH_SERVER = 768;
  public final static int _MISTATUS_LOCAL_DISCONNECTING_FROM_SERVER = 1024;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0001 valueOf(int value) {
    switch(value) {
    case 0: return MISTATUS_UNKNOWN;
    case 1: return MISTATUS_OFFLINE;
    case 2: return MISTATUS_ONLINE;
    case 6: return MISTATUS_INVISIBLE;
    case 10: return MISTATUS_BUSY;
    case 14: return MISTATUS_BE_RIGHT_BACK;
    case 18: return MISTATUS_IDLE;
    case 34: return MISTATUS_AWAY;
    case 50: return MISTATUS_ON_THE_PHONE;
    case 66: return MISTATUS_OUT_TO_LUNCH;
    case 256: return MISTATUS_LOCAL_FINDING_SERVER;
    case 512: return MISTATUS_LOCAL_CONNECTING_TO_SERVER;
    case 768: return MISTATUS_LOCAL_SYNCHRONIZING_WITH_SERVER;
    case 1024: return MISTATUS_LOCAL_DISCONNECTING_FROM_SERVER;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0001(value);
    }
  }
}
