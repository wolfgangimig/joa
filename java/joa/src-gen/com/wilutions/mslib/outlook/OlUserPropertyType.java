/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlUserPropertyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlUserPropertyType {
  olOutlookInternal(0),
  olText(1),
  olNumber(3),
  olDateTime(5),
  olYesNo(6),
  olDuration(7),
  olKeywords(11),
  olPercent(12),
  olCurrency(14),
  olFormula(18),
  olCombination(19),
  olInteger(20),
  olEnumeration(21),
  olSmartFrom(22);

  public final int value;
  private OlUserPropertyType(int value) { this.value = value; }
  public static  OlUserPropertyType valueOf(int value) {
    switch(value) {
    case 0: return olOutlookInternal;
    case 1: return olText;
    case 3: return olNumber;
    case 5: return olDateTime;
    case 6: return olYesNo;
    case 7: return olDuration;
    case 11: return olKeywords;
    case 12: return olPercent;
    case 14: return olCurrency;
    case 18: return olFormula;
    case 19: return olCombination;
    case 20: return olInteger;
    case 21: return olEnumeration;
    case 22: return olSmartFrom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlUserPropertyType.class);
    }
  }
}
