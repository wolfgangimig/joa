/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * UnifiedCommunicationType.
 * Enumerates the Unified Communication types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum UnifiedCommunicationType {
  ucUnifiedCommunicationUnknown(0),
  ucUnifiedCommunicationEnabled(1),
  ucUnifiedCommunicationNotEnabled(2);

  public final int value;
  private UnifiedCommunicationType(int value) { this.value = value; }
  public static  UnifiedCommunicationType valueOf(int value) {
    switch(value) {
    case 0: return ucUnifiedCommunicationUnknown;
    case 1: return ucUnifiedCommunicationEnabled;
    case 2: return ucUnifiedCommunicationNotEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + UnifiedCommunicationType.class);
    }
  }
}
