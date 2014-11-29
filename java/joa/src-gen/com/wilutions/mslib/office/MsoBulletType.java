/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBulletType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBulletType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBulletType msoBulletMixed = new MsoBulletType(-2);
  public final static MsoBulletType msoBulletNone = new MsoBulletType(0);
  public final static MsoBulletType msoBulletUnnumbered = new MsoBulletType(1);
  public final static MsoBulletType msoBulletNumbered = new MsoBulletType(2);
  public final static MsoBulletType msoBulletPicture = new MsoBulletType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoBulletMixed = -2;
  public final static int _msoBulletNone = 0;
  public final static int _msoBulletUnnumbered = 1;
  public final static int _msoBulletNumbered = 2;
  public final static int _msoBulletPicture = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBulletType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBulletType valueOf(int value) {
    switch(value) {
    case -2: return msoBulletMixed;
    case 0: return msoBulletNone;
    case 1: return msoBulletUnnumbered;
    case 2: return msoBulletNumbered;
    case 3: return msoBulletPicture;
    default: return new MsoBulletType(value);
    }
  }
}
