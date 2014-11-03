/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCategoryShortcutKey.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlCategoryShortcutKey {
  olCategoryShortcutKeyNone(0),
  olCategoryShortcutKeyCtrlF2(1),
  olCategoryShortcutKeyCtrlF3(2),
  olCategoryShortcutKeyCtrlF4(3),
  olCategoryShortcutKeyCtrlF5(4),
  olCategoryShortcutKeyCtrlF6(5),
  olCategoryShortcutKeyCtrlF7(6),
  olCategoryShortcutKeyCtrlF8(7),
  olCategoryShortcutKeyCtrlF9(8),
  olCategoryShortcutKeyCtrlF10(9),
  olCategoryShortcutKeyCtrlF11(10),
  olCategoryShortcutKeyCtrlF12(11);

  public final int value;
  private OlCategoryShortcutKey(int value) { this.value = value; }
  public static  OlCategoryShortcutKey valueOf(int value) {
    switch(value) {
    case 0: return olCategoryShortcutKeyNone;
    case 1: return olCategoryShortcutKeyCtrlF2;
    case 2: return olCategoryShortcutKeyCtrlF3;
    case 3: return olCategoryShortcutKeyCtrlF4;
    case 4: return olCategoryShortcutKeyCtrlF5;
    case 5: return olCategoryShortcutKeyCtrlF6;
    case 6: return olCategoryShortcutKeyCtrlF7;
    case 7: return olCategoryShortcutKeyCtrlF8;
    case 8: return olCategoryShortcutKeyCtrlF9;
    case 9: return olCategoryShortcutKeyCtrlF10;
    case 10: return olCategoryShortcutKeyCtrlF11;
    case 11: return olCategoryShortcutKeyCtrlF12;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlCategoryShortcutKey.class);
    }
  }
}
