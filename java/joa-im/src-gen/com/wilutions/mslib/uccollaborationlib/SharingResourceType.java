/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SharingResourceType.
 * Enumerates the application sharing resource type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SharingResourceType {

  // Typed constants
  public final static SharingResourceType ucSharingResourceTypeDesktop = new SharingResourceType(0);
  public final static SharingResourceType ucSharingResourceTypeMonitor = new SharingResourceType(1);
  public final static SharingResourceType ucSharingResourceTypeProcess = new SharingResourceType(2);
  public final static SharingResourceType ucSharingResourceTypeWindow = new SharingResourceType(3);
  public final static SharingResourceType ucSharingResourceTypeOther = new SharingResourceType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucSharingResourceTypeDesktop = 0;
  public final static int _ucSharingResourceTypeMonitor = 1;
  public final static int _ucSharingResourceTypeProcess = 2;
  public final static int _ucSharingResourceTypeWindow = 3;
  public final static int _ucSharingResourceTypeOther = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SharingResourceType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SharingResourceType valueOf(int value) {
    switch(value) {
    case 0: return ucSharingResourceTypeDesktop;
    case 1: return ucSharingResourceTypeMonitor;
    case 2: return ucSharingResourceTypeProcess;
    case 3: return ucSharingResourceTypeWindow;
    case 4: return ucSharingResourceTypeOther;
    default: return new SharingResourceType(value);
    }
  }
}
