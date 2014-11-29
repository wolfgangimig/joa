/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlStorageIdentifierType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlStorageIdentifierType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlStorageIdentifierType olIdentifyBySubject = new OlStorageIdentifierType(0);
  public final static OlStorageIdentifierType olIdentifyByEntryID = new OlStorageIdentifierType(1);
  public final static OlStorageIdentifierType olIdentifyByMessageClass = new OlStorageIdentifierType(2);

  // Integer constants for bitsets and switch statements
  public final static int _olIdentifyBySubject = 0;
  public final static int _olIdentifyByEntryID = 1;
  public final static int _olIdentifyByMessageClass = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlStorageIdentifierType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlStorageIdentifierType valueOf(int value) {
    switch(value) {
    case 0: return olIdentifyBySubject;
    case 1: return olIdentifyByEntryID;
    case 2: return olIdentifyByMessageClass;
    default: return new OlStorageIdentifierType(value);
    }
  }
}
