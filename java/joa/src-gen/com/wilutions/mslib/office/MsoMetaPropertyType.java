/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMetaPropertyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoMetaPropertyType {
  msoMetaPropertyTypeUnknown(0),
  msoMetaPropertyTypeBoolean(1),
  msoMetaPropertyTypeChoice(2),
  msoMetaPropertyTypeCalculated(3),
  msoMetaPropertyTypeComputed(4),
  msoMetaPropertyTypeCurrency(5),
  msoMetaPropertyTypeDateTime(6),
  msoMetaPropertyTypeFillInChoice(7),
  msoMetaPropertyTypeGuid(8),
  msoMetaPropertyTypeInteger(9),
  msoMetaPropertyTypeLookup(10),
  msoMetaPropertyTypeMultiChoiceLookup(11),
  msoMetaPropertyTypeMultiChoice(12),
  msoMetaPropertyTypeMultiChoiceFillIn(13),
  msoMetaPropertyTypeNote(14),
  msoMetaPropertyTypeNumber(15),
  msoMetaPropertyTypeText(16),
  msoMetaPropertyTypeUrl(17),
  msoMetaPropertyTypeUser(18),
  msoMetaPropertyTypeUserMulti(19),
  msoMetaPropertyTypeBusinessData(20),
  msoMetaPropertyTypeBusinessDataSecondary(21),
  msoMetaPropertyTypeMax(22);

  public final int value;
  private MsoMetaPropertyType(int value) { this.value = value; }
  public static  MsoMetaPropertyType valueOf(int value) {
    switch(value) {
    case 0: return msoMetaPropertyTypeUnknown;
    case 1: return msoMetaPropertyTypeBoolean;
    case 2: return msoMetaPropertyTypeChoice;
    case 3: return msoMetaPropertyTypeCalculated;
    case 4: return msoMetaPropertyTypeComputed;
    case 5: return msoMetaPropertyTypeCurrency;
    case 6: return msoMetaPropertyTypeDateTime;
    case 7: return msoMetaPropertyTypeFillInChoice;
    case 8: return msoMetaPropertyTypeGuid;
    case 9: return msoMetaPropertyTypeInteger;
    case 10: return msoMetaPropertyTypeLookup;
    case 11: return msoMetaPropertyTypeMultiChoiceLookup;
    case 12: return msoMetaPropertyTypeMultiChoice;
    case 13: return msoMetaPropertyTypeMultiChoiceFillIn;
    case 14: return msoMetaPropertyTypeNote;
    case 15: return msoMetaPropertyTypeNumber;
    case 16: return msoMetaPropertyTypeText;
    case 17: return msoMetaPropertyTypeUrl;
    case 18: return msoMetaPropertyTypeUser;
    case 19: return msoMetaPropertyTypeUserMulti;
    case 20: return msoMetaPropertyTypeBusinessData;
    case 21: return msoMetaPropertyTypeBusinessDataSecondary;
    case 22: return msoMetaPropertyTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoMetaPropertyType.class);
    }
  }
}
