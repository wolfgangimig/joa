/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * UnifiedCommunicationType.
 * Enumerates the Unified Communication types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class UnifiedCommunicationType {

  // Typed constants
  public final static UnifiedCommunicationType ucUnifiedCommunicationUnknown = new UnifiedCommunicationType(0);
  public final static UnifiedCommunicationType ucUnifiedCommunicationEnabled = new UnifiedCommunicationType(1);
  public final static UnifiedCommunicationType ucUnifiedCommunicationNotEnabled = new UnifiedCommunicationType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucUnifiedCommunicationUnknown = 0;
  public final static int _ucUnifiedCommunicationEnabled = 1;
  public final static int _ucUnifiedCommunicationNotEnabled = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private UnifiedCommunicationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  UnifiedCommunicationType valueOf(int value) {
    switch(value) {
    case 0: return ucUnifiedCommunicationUnknown;
    case 1: return ucUnifiedCommunicationEnabled;
    case 2: return ucUnifiedCommunicationNotEnabled;
    default: return new UnifiedCommunicationType(value);
    }
  }
}
