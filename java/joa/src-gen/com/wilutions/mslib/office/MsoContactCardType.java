/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{310803CD-C69D-4371-98C9-40CE4E9BFD5A}")
public enum MsoContactCardType {
  msoContactCardTypeEnterpriseContact(0),
  msoContactCardTypePersonalContact(1),
  msoContactCardTypeUnknownContact(2),
  msoContactCardTypeEnterpriseGroup(3),
  msoContactCardTypePersonalDistributionList(4);

  public final int value;
  private MsoContactCardType(int value) { this.value = value; }
  public static  MsoContactCardType valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardTypeEnterpriseContact;
    case 1: return msoContactCardTypePersonalContact;
    case 2: return msoContactCardTypeUnknownContact;
    case 3: return msoContactCardTypeEnterpriseGroup;
    case 4: return msoContactCardTypePersonalDistributionList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoContactCardType.class);
    }
  }
}
