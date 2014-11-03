/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonButtonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBalloonButtonType {
  msoBalloonButtonYesToAll(-15),
  msoBalloonButtonOptions(-14),
  msoBalloonButtonTips(-13),
  msoBalloonButtonClose(-12),
  msoBalloonButtonSnooze(-11),
  msoBalloonButtonSearch(-10),
  msoBalloonButtonIgnore(-9),
  msoBalloonButtonAbort(-8),
  msoBalloonButtonRetry(-7),
  msoBalloonButtonNext(-6),
  msoBalloonButtonBack(-5),
  msoBalloonButtonNo(-4),
  msoBalloonButtonYes(-3),
  msoBalloonButtonCancel(-2),
  msoBalloonButtonOK(-1),
  msoBalloonButtonNull(0);

  public final int value;
  private MsoBalloonButtonType(int value) { this.value = value; }
  public static  MsoBalloonButtonType valueOf(int value) {
    switch(value) {
    case -15: return msoBalloonButtonYesToAll;
    case -14: return msoBalloonButtonOptions;
    case -13: return msoBalloonButtonTips;
    case -12: return msoBalloonButtonClose;
    case -11: return msoBalloonButtonSnooze;
    case -10: return msoBalloonButtonSearch;
    case -9: return msoBalloonButtonIgnore;
    case -8: return msoBalloonButtonAbort;
    case -7: return msoBalloonButtonRetry;
    case -6: return msoBalloonButtonNext;
    case -5: return msoBalloonButtonBack;
    case -4: return msoBalloonButtonNo;
    case -3: return msoBalloonButtonYes;
    case -2: return msoBalloonButtonCancel;
    case -1: return msoBalloonButtonOK;
    case 0: return msoBalloonButtonNull;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBalloonButtonType.class);
    }
  }
}
