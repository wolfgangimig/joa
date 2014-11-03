/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoControlType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoControlType {
  msoControlCustom(0),
  msoControlButton(1),
  msoControlEdit(2),
  msoControlDropdown(3),
  msoControlComboBox(4),
  msoControlButtonDropdown(5),
  msoControlSplitDropdown(6),
  msoControlOCXDropdown(7),
  msoControlGenericDropdown(8),
  msoControlGraphicDropdown(9),
  msoControlPopup(10),
  msoControlGraphicPopup(11),
  msoControlButtonPopup(12),
  msoControlSplitButtonPopup(13),
  msoControlSplitButtonMRUPopup(14),
  msoControlLabel(15),
  msoControlExpandingGrid(16),
  msoControlSplitExpandingGrid(17),
  msoControlGrid(18),
  msoControlGauge(19),
  msoControlGraphicCombo(20),
  msoControlPane(21),
  msoControlActiveX(22),
  msoControlSpinner(23),
  msoControlLabelEx(24),
  msoControlWorkPane(25),
  msoControlAutoCompleteCombo(26);

  public final int value;
  private MsoControlType(int value) { this.value = value; }
  public static  MsoControlType valueOf(int value) {
    switch(value) {
    case 0: return msoControlCustom;
    case 1: return msoControlButton;
    case 2: return msoControlEdit;
    case 3: return msoControlDropdown;
    case 4: return msoControlComboBox;
    case 5: return msoControlButtonDropdown;
    case 6: return msoControlSplitDropdown;
    case 7: return msoControlOCXDropdown;
    case 8: return msoControlGenericDropdown;
    case 9: return msoControlGraphicDropdown;
    case 10: return msoControlPopup;
    case 11: return msoControlGraphicPopup;
    case 12: return msoControlButtonPopup;
    case 13: return msoControlSplitButtonPopup;
    case 14: return msoControlSplitButtonMRUPopup;
    case 15: return msoControlLabel;
    case 16: return msoControlExpandingGrid;
    case 17: return msoControlSplitExpandingGrid;
    case 18: return msoControlGrid;
    case 19: return msoControlGauge;
    case 20: return msoControlGraphicCombo;
    case 21: return msoControlPane;
    case 22: return msoControlActiveX;
    case 23: return msoControlSpinner;
    case 24: return msoControlLabelEx;
    case 25: return msoControlWorkPane;
    case 26: return msoControlAutoCompleteCombo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoControlType.class);
    }
  }
}
