/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoControlType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoControlType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoControlType msoControlCustom = new MsoControlType(0);
  public final static MsoControlType msoControlButton = new MsoControlType(1);
  public final static MsoControlType msoControlEdit = new MsoControlType(2);
  public final static MsoControlType msoControlDropdown = new MsoControlType(3);
  public final static MsoControlType msoControlComboBox = new MsoControlType(4);
  public final static MsoControlType msoControlButtonDropdown = new MsoControlType(5);
  public final static MsoControlType msoControlSplitDropdown = new MsoControlType(6);
  public final static MsoControlType msoControlOCXDropdown = new MsoControlType(7);
  public final static MsoControlType msoControlGenericDropdown = new MsoControlType(8);
  public final static MsoControlType msoControlGraphicDropdown = new MsoControlType(9);
  public final static MsoControlType msoControlPopup = new MsoControlType(10);
  public final static MsoControlType msoControlGraphicPopup = new MsoControlType(11);
  public final static MsoControlType msoControlButtonPopup = new MsoControlType(12);
  public final static MsoControlType msoControlSplitButtonPopup = new MsoControlType(13);
  public final static MsoControlType msoControlSplitButtonMRUPopup = new MsoControlType(14);
  public final static MsoControlType msoControlLabel = new MsoControlType(15);
  public final static MsoControlType msoControlExpandingGrid = new MsoControlType(16);
  public final static MsoControlType msoControlSplitExpandingGrid = new MsoControlType(17);
  public final static MsoControlType msoControlGrid = new MsoControlType(18);
  public final static MsoControlType msoControlGauge = new MsoControlType(19);
  public final static MsoControlType msoControlGraphicCombo = new MsoControlType(20);
  public final static MsoControlType msoControlPane = new MsoControlType(21);
  public final static MsoControlType msoControlActiveX = new MsoControlType(22);
  public final static MsoControlType msoControlSpinner = new MsoControlType(23);
  public final static MsoControlType msoControlLabelEx = new MsoControlType(24);
  public final static MsoControlType msoControlWorkPane = new MsoControlType(25);
  public final static MsoControlType msoControlAutoCompleteCombo = new MsoControlType(26);

  // Integer constants for bitsets and switch statements
  public final static int _msoControlCustom = 0;
  public final static int _msoControlButton = 1;
  public final static int _msoControlEdit = 2;
  public final static int _msoControlDropdown = 3;
  public final static int _msoControlComboBox = 4;
  public final static int _msoControlButtonDropdown = 5;
  public final static int _msoControlSplitDropdown = 6;
  public final static int _msoControlOCXDropdown = 7;
  public final static int _msoControlGenericDropdown = 8;
  public final static int _msoControlGraphicDropdown = 9;
  public final static int _msoControlPopup = 10;
  public final static int _msoControlGraphicPopup = 11;
  public final static int _msoControlButtonPopup = 12;
  public final static int _msoControlSplitButtonPopup = 13;
  public final static int _msoControlSplitButtonMRUPopup = 14;
  public final static int _msoControlLabel = 15;
  public final static int _msoControlExpandingGrid = 16;
  public final static int _msoControlSplitExpandingGrid = 17;
  public final static int _msoControlGrid = 18;
  public final static int _msoControlGauge = 19;
  public final static int _msoControlGraphicCombo = 20;
  public final static int _msoControlPane = 21;
  public final static int _msoControlActiveX = 22;
  public final static int _msoControlSpinner = 23;
  public final static int _msoControlLabelEx = 24;
  public final static int _msoControlWorkPane = 25;
  public final static int _msoControlAutoCompleteCombo = 26;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoControlType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoControlType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 18: return "msoControlGrid";
    case 8: return "msoControlGenericDropdown";
    case 10: return "msoControlPopup";
    case 0: return "msoControlCustom";
    case 1: return "msoControlButton";
    case 2: return "msoControlEdit";
    case 3: return "msoControlDropdown";
    case 4: return "msoControlComboBox";
    case 5: return "msoControlButtonDropdown";
    case 6: return "msoControlSplitDropdown";
    case 7: return "msoControlOCXDropdown";
    case 20: return "msoControlGraphicCombo";
    case 9: return "msoControlGraphicDropdown";
    case 11: return "msoControlGraphicPopup";
    case 12: return "msoControlButtonPopup";
    case 13: return "msoControlSplitButtonPopup";
    case 14: return "msoControlSplitButtonMRUPopup";
    case 15: return "msoControlLabel";
    case 16: return "msoControlExpandingGrid";
    case 17: return "msoControlSplitExpandingGrid";
    case 19: return "msoControlGauge";
    case 21: return "msoControlPane";
    case 22: return "msoControlActiveX";
    case 23: return "msoControlSpinner";
    case 24: return "msoControlLabelEx";
    case 25: return "msoControlWorkPane";
    case 26: return "msoControlAutoCompleteCombo";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 18) != 0) sbuf.append("|msoControlGrid");
      if ((value & 8) != 0) sbuf.append("|msoControlGenericDropdown");
      if ((value & 10) != 0) sbuf.append("|msoControlPopup");
      if ((value & 0) != 0) sbuf.append("|msoControlCustom");
      if ((value & 1) != 0) sbuf.append("|msoControlButton");
      if ((value & 2) != 0) sbuf.append("|msoControlEdit");
      if ((value & 3) != 0) sbuf.append("|msoControlDropdown");
      if ((value & 4) != 0) sbuf.append("|msoControlComboBox");
      if ((value & 5) != 0) sbuf.append("|msoControlButtonDropdown");
      if ((value & 6) != 0) sbuf.append("|msoControlSplitDropdown");
      if ((value & 7) != 0) sbuf.append("|msoControlOCXDropdown");
      if ((value & 20) != 0) sbuf.append("|msoControlGraphicCombo");
      if ((value & 9) != 0) sbuf.append("|msoControlGraphicDropdown");
      if ((value & 11) != 0) sbuf.append("|msoControlGraphicPopup");
      if ((value & 12) != 0) sbuf.append("|msoControlButtonPopup");
      if ((value & 13) != 0) sbuf.append("|msoControlSplitButtonPopup");
      if ((value & 14) != 0) sbuf.append("|msoControlSplitButtonMRUPopup");
      if ((value & 15) != 0) sbuf.append("|msoControlLabel");
      if ((value & 16) != 0) sbuf.append("|msoControlExpandingGrid");
      if ((value & 17) != 0) sbuf.append("|msoControlSplitExpandingGrid");
      if ((value & 19) != 0) sbuf.append("|msoControlGauge");
      if ((value & 21) != 0) sbuf.append("|msoControlPane");
      if ((value & 22) != 0) sbuf.append("|msoControlActiveX");
      if ((value & 23) != 0) sbuf.append("|msoControlSpinner");
      if ((value & 24) != 0) sbuf.append("|msoControlLabelEx");
      if ((value & 25) != 0) sbuf.append("|msoControlWorkPane");
      if ((value & 26) != 0) sbuf.append("|msoControlAutoCompleteCombo");
      return sbuf.toString();
      }
    }
  }
}
