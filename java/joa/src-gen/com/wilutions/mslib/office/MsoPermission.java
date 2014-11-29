/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPermission.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPermission {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPermission msoPermissionView = new MsoPermission(1);
  public final static MsoPermission msoPermissionRead = new MsoPermission(1);
  public final static MsoPermission msoPermissionEdit = new MsoPermission(2);
  public final static MsoPermission msoPermissionSave = new MsoPermission(4);
  public final static MsoPermission msoPermissionExtract = new MsoPermission(8);
  public final static MsoPermission msoPermissionChange = new MsoPermission(15);
  public final static MsoPermission msoPermissionPrint = new MsoPermission(16);
  public final static MsoPermission msoPermissionObjModel = new MsoPermission(32);
  public final static MsoPermission msoPermissionFullControl = new MsoPermission(64);
  public final static MsoPermission msoPermissionAllCommon = new MsoPermission(127);

  // Integer constants for bitsets and switch statements
  public final static int _msoPermissionView = 1;
  public final static int _msoPermissionRead = 1;
  public final static int _msoPermissionEdit = 2;
  public final static int _msoPermissionSave = 4;
  public final static int _msoPermissionExtract = 8;
  public final static int _msoPermissionChange = 15;
  public final static int _msoPermissionPrint = 16;
  public final static int _msoPermissionObjModel = 32;
  public final static int _msoPermissionFullControl = 64;
  public final static int _msoPermissionAllCommon = 127;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPermission(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPermission valueOf(int value) {
    switch(value) {
    case 1: return msoPermissionView;
    //se 1: return msoPermissionRead; // same as msoPermissionView
    case 2: return msoPermissionEdit;
    case 4: return msoPermissionSave;
    case 8: return msoPermissionExtract;
    case 15: return msoPermissionChange;
    case 16: return msoPermissionPrint;
    case 32: return msoPermissionObjModel;
    case 64: return msoPermissionFullControl;
    case 127: return msoPermissionAllCommon;
    default: return new MsoPermission(value);
    }
  }
}
