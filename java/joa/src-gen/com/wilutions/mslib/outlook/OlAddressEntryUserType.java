/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAddressEntryUserType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAddressEntryUserType {
  olExchangeUserAddressEntry(0),
  olExchangeDistributionListAddressEntry(1),
  olExchangePublicFolderAddressEntry(2),
  olExchangeAgentAddressEntry(3),
  olExchangeOrganizationAddressEntry(4),
  olExchangeRemoteUserAddressEntry(5),
  olOutlookContactAddressEntry(10),
  olOutlookDistributionListAddressEntry(11),
  olLdapAddressEntry(20),
  olSmtpAddressEntry(30),
  olOtherAddressEntry(40);

  public final int value;
  private OlAddressEntryUserType(int value) { this.value = value; }
  public static  OlAddressEntryUserType valueOf(int value) {
    switch(value) {
    case 0: return olExchangeUserAddressEntry;
    case 1: return olExchangeDistributionListAddressEntry;
    case 2: return olExchangePublicFolderAddressEntry;
    case 3: return olExchangeAgentAddressEntry;
    case 4: return olExchangeOrganizationAddressEntry;
    case 5: return olExchangeRemoteUserAddressEntry;
    case 10: return olOutlookContactAddressEntry;
    case 11: return olOutlookDistributionListAddressEntry;
    case 20: return olLdapAddressEntry;
    case 30: return olSmtpAddressEntry;
    case 40: return olOtherAddressEntry;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAddressEntryUserType.class);
    }
  }
}
