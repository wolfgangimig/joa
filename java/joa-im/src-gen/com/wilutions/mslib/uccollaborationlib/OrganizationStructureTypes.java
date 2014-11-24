/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OrganizationStructureTypes.
 * Enumerates organization info types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OrganizationStructureTypes {

  // Typed constants
  public final static OrganizationStructureTypes ucOrganizationInfoManagers = new OrganizationStructureTypes(1);
  public final static OrganizationStructureTypes ucOrganizationInfoPeers = new OrganizationStructureTypes(2);
  public final static OrganizationStructureTypes ucOrganizationInfoDirectReports = new OrganizationStructureTypes(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucOrganizationInfoManagers = 1;
  public final static int _ucOrganizationInfoPeers = 2;
  public final static int _ucOrganizationInfoDirectReports = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OrganizationStructureTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OrganizationStructureTypes valueOf(int value) {
    switch(value) {
    case 1: return ucOrganizationInfoManagers;
    case 2: return ucOrganizationInfoPeers;
    case 4: return ucOrganizationInfoDirectReports;
    default: return new OrganizationStructureTypes(value);
    }
  }
}
