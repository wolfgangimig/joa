/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPermission.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPermission {
  msoPermissionView(1),
  msoPermissionRead(1),
  msoPermissionEdit(2),
  msoPermissionSave(4),
  msoPermissionExtract(8),
  msoPermissionChange(15),
  msoPermissionPrint(16),
  msoPermissionObjModel(32),
  msoPermissionFullControl(64),
  msoPermissionAllCommon(127);

  public final int value;
  private MsoPermission(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPermission.class);
    }
  }
}
