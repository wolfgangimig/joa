/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlStorageIdentifierType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlStorageIdentifierType {
  olIdentifyBySubject(0),
  olIdentifyByEntryID(1),
  olIdentifyByMessageClass(2);

  public final int value;
  private OlStorageIdentifierType(int value) { this.value = value; }
  public static  OlStorageIdentifierType valueOf(int value) {
    switch(value) {
    case 0: return olIdentifyBySubject;
    case 1: return olIdentifyByEntryID;
    case 2: return olIdentifyByMessageClass;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlStorageIdentifierType.class);
    }
  }
}
