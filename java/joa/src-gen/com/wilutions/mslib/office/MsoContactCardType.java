/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{310803CD-C69D-4371-98C9-40CE4E9BFD5A}")
public class MsoContactCardType {

  // Typed constants
  public final static MsoContactCardType msoContactCardTypeEnterpriseContact = new MsoContactCardType(0);
  public final static MsoContactCardType msoContactCardTypePersonalContact = new MsoContactCardType(1);
  public final static MsoContactCardType msoContactCardTypeUnknownContact = new MsoContactCardType(2);
  public final static MsoContactCardType msoContactCardTypeEnterpriseGroup = new MsoContactCardType(3);
  public final static MsoContactCardType msoContactCardTypePersonalDistributionList = new MsoContactCardType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoContactCardTypeEnterpriseContact = 0;
  public final static int _msoContactCardTypePersonalContact = 1;
  public final static int _msoContactCardTypeUnknownContact = 2;
  public final static int _msoContactCardTypeEnterpriseGroup = 3;
  public final static int _msoContactCardTypePersonalDistributionList = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoContactCardType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoContactCardType valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardTypeEnterpriseContact;
    case 1: return msoContactCardTypePersonalContact;
    case 2: return msoContactCardTypeUnknownContact;
    case 3: return msoContactCardTypeEnterpriseGroup;
    case 4: return msoContactCardTypePersonalDistributionList;
    default: return new MsoContactCardType(value);
    }
  }
}
