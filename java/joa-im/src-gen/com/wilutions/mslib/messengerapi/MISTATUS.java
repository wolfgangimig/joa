/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MISTATUS.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MISTATUS {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MISTATUS MISTATUS_UNKNOWN = new MISTATUS(0);
  public final static MISTATUS MISTATUS_OFFLINE = new MISTATUS(1);
  public final static MISTATUS MISTATUS_ONLINE = new MISTATUS(2);
  public final static MISTATUS MISTATUS_INVISIBLE = new MISTATUS(6);
  public final static MISTATUS MISTATUS_BUSY = new MISTATUS(10);
  public final static MISTATUS MISTATUS_BE_RIGHT_BACK = new MISTATUS(14);
  public final static MISTATUS MISTATUS_IDLE = new MISTATUS(18);
  public final static MISTATUS MISTATUS_AWAY = new MISTATUS(34);
  public final static MISTATUS MISTATUS_ON_THE_PHONE = new MISTATUS(50);
  public final static MISTATUS MISTATUS_OUT_TO_LUNCH = new MISTATUS(66);
  public final static MISTATUS MISTATUS_LOCAL_FINDING_SERVER = new MISTATUS(256);
  public final static MISTATUS MISTATUS_LOCAL_CONNECTING_TO_SERVER = new MISTATUS(512);
  public final static MISTATUS MISTATUS_LOCAL_SYNCHRONIZING_WITH_SERVER = new MISTATUS(768);
  public final static MISTATUS MISTATUS_LOCAL_DISCONNECTING_FROM_SERVER = new MISTATUS(1024);

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
  private MISTATUS(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MISTATUS valueOf(int value) {
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
    default: return new MISTATUS(value);
    }
  }
}
