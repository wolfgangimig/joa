/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMetaPropertyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoMetaPropertyType {

  // Typed constants
  public final static MsoMetaPropertyType msoMetaPropertyTypeUnknown = new MsoMetaPropertyType(0);
  public final static MsoMetaPropertyType msoMetaPropertyTypeBoolean = new MsoMetaPropertyType(1);
  public final static MsoMetaPropertyType msoMetaPropertyTypeChoice = new MsoMetaPropertyType(2);
  public final static MsoMetaPropertyType msoMetaPropertyTypeCalculated = new MsoMetaPropertyType(3);
  public final static MsoMetaPropertyType msoMetaPropertyTypeComputed = new MsoMetaPropertyType(4);
  public final static MsoMetaPropertyType msoMetaPropertyTypeCurrency = new MsoMetaPropertyType(5);
  public final static MsoMetaPropertyType msoMetaPropertyTypeDateTime = new MsoMetaPropertyType(6);
  public final static MsoMetaPropertyType msoMetaPropertyTypeFillInChoice = new MsoMetaPropertyType(7);
  public final static MsoMetaPropertyType msoMetaPropertyTypeGuid = new MsoMetaPropertyType(8);
  public final static MsoMetaPropertyType msoMetaPropertyTypeInteger = new MsoMetaPropertyType(9);
  public final static MsoMetaPropertyType msoMetaPropertyTypeLookup = new MsoMetaPropertyType(10);
  public final static MsoMetaPropertyType msoMetaPropertyTypeMultiChoiceLookup = new MsoMetaPropertyType(11);
  public final static MsoMetaPropertyType msoMetaPropertyTypeMultiChoice = new MsoMetaPropertyType(12);
  public final static MsoMetaPropertyType msoMetaPropertyTypeMultiChoiceFillIn = new MsoMetaPropertyType(13);
  public final static MsoMetaPropertyType msoMetaPropertyTypeNote = new MsoMetaPropertyType(14);
  public final static MsoMetaPropertyType msoMetaPropertyTypeNumber = new MsoMetaPropertyType(15);
  public final static MsoMetaPropertyType msoMetaPropertyTypeText = new MsoMetaPropertyType(16);
  public final static MsoMetaPropertyType msoMetaPropertyTypeUrl = new MsoMetaPropertyType(17);
  public final static MsoMetaPropertyType msoMetaPropertyTypeUser = new MsoMetaPropertyType(18);
  public final static MsoMetaPropertyType msoMetaPropertyTypeUserMulti = new MsoMetaPropertyType(19);
  public final static MsoMetaPropertyType msoMetaPropertyTypeBusinessData = new MsoMetaPropertyType(20);
  public final static MsoMetaPropertyType msoMetaPropertyTypeBusinessDataSecondary = new MsoMetaPropertyType(21);
  public final static MsoMetaPropertyType msoMetaPropertyTypeMax = new MsoMetaPropertyType(22);

  // Integer constants for bitsets and switch statements
  public final static int _msoMetaPropertyTypeUnknown = 0;
  public final static int _msoMetaPropertyTypeBoolean = 1;
  public final static int _msoMetaPropertyTypeChoice = 2;
  public final static int _msoMetaPropertyTypeCalculated = 3;
  public final static int _msoMetaPropertyTypeComputed = 4;
  public final static int _msoMetaPropertyTypeCurrency = 5;
  public final static int _msoMetaPropertyTypeDateTime = 6;
  public final static int _msoMetaPropertyTypeFillInChoice = 7;
  public final static int _msoMetaPropertyTypeGuid = 8;
  public final static int _msoMetaPropertyTypeInteger = 9;
  public final static int _msoMetaPropertyTypeLookup = 10;
  public final static int _msoMetaPropertyTypeMultiChoiceLookup = 11;
  public final static int _msoMetaPropertyTypeMultiChoice = 12;
  public final static int _msoMetaPropertyTypeMultiChoiceFillIn = 13;
  public final static int _msoMetaPropertyTypeNote = 14;
  public final static int _msoMetaPropertyTypeNumber = 15;
  public final static int _msoMetaPropertyTypeText = 16;
  public final static int _msoMetaPropertyTypeUrl = 17;
  public final static int _msoMetaPropertyTypeUser = 18;
  public final static int _msoMetaPropertyTypeUserMulti = 19;
  public final static int _msoMetaPropertyTypeBusinessData = 20;
  public final static int _msoMetaPropertyTypeBusinessDataSecondary = 21;
  public final static int _msoMetaPropertyTypeMax = 22;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoMetaPropertyType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoMetaPropertyType(value);
    }
  }
}
