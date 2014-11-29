/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlUserPropertyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlUserPropertyType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlUserPropertyType olOutlookInternal = new OlUserPropertyType(0);
  public final static OlUserPropertyType olText = new OlUserPropertyType(1);
  public final static OlUserPropertyType olNumber = new OlUserPropertyType(3);
  public final static OlUserPropertyType olDateTime = new OlUserPropertyType(5);
  public final static OlUserPropertyType olYesNo = new OlUserPropertyType(6);
  public final static OlUserPropertyType olDuration = new OlUserPropertyType(7);
  public final static OlUserPropertyType olKeywords = new OlUserPropertyType(11);
  public final static OlUserPropertyType olPercent = new OlUserPropertyType(12);
  public final static OlUserPropertyType olCurrency = new OlUserPropertyType(14);
  public final static OlUserPropertyType olFormula = new OlUserPropertyType(18);
  public final static OlUserPropertyType olCombination = new OlUserPropertyType(19);
  public final static OlUserPropertyType olInteger = new OlUserPropertyType(20);
  public final static OlUserPropertyType olEnumeration = new OlUserPropertyType(21);
  public final static OlUserPropertyType olSmartFrom = new OlUserPropertyType(22);

  // Integer constants for bitsets and switch statements
  public final static int _olOutlookInternal = 0;
  public final static int _olText = 1;
  public final static int _olNumber = 3;
  public final static int _olDateTime = 5;
  public final static int _olYesNo = 6;
  public final static int _olDuration = 7;
  public final static int _olKeywords = 11;
  public final static int _olPercent = 12;
  public final static int _olCurrency = 14;
  public final static int _olFormula = 18;
  public final static int _olCombination = 19;
  public final static int _olInteger = 20;
  public final static int _olEnumeration = 21;
  public final static int _olSmartFrom = 22;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlUserPropertyType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlUserPropertyType(value);
    }
  }
}
