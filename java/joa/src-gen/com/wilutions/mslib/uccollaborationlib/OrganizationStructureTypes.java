/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OrganizationStructureTypes.
 * Enumerates organization info types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OrganizationStructureTypes {
  ucOrganizationInfoManagers(1),
  ucOrganizationInfoPeers(2),
  ucOrganizationInfoDirectReports(4);

  public final int value;
  private OrganizationStructureTypes(int value) { this.value = value; }
  public static  OrganizationStructureTypes valueOf(int value) {
    switch(value) {
    case 1: return ucOrganizationInfoManagers;
    case 2: return ucOrganizationInfoPeers;
    case 4: return ucOrganizationInfoDirectReports;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OrganizationStructureTypes.class);
    }
  }
}
