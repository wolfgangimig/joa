/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchFields.
 * Enumerates search filter properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SearchFields {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SearchFields ucSearchFirstName = new SearchFields(1);
  public final static SearchFields ucSearchLastName = new SearchFields(2);
  public final static SearchFields ucSearchDisplayName = new SearchFields(4);
  public final static SearchFields ucSearchCompany = new SearchFields(8);
  public final static SearchFields ucSearchPrimaryEmailAddress = new SearchFields(16);
  public final static SearchFields ucSearchEmailAddresses = new SearchFields(32);
  public final static SearchFields ucSearchAlias = new SearchFields(64);
  public final static SearchFields ucSearchPhoneNumbers = new SearchFields(128);
  public final static SearchFields ucSearchPhoneExtention = new SearchFields(256);
  public final static SearchFields ucSearchAllFields = new SearchFields(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucSearchFirstName = 1;
  public final static int _ucSearchLastName = 2;
  public final static int _ucSearchDisplayName = 4;
  public final static int _ucSearchCompany = 8;
  public final static int _ucSearchPrimaryEmailAddress = 16;
  public final static int _ucSearchEmailAddresses = 32;
  public final static int _ucSearchAlias = 64;
  public final static int _ucSearchPhoneNumbers = 128;
  public final static int _ucSearchPhoneExtention = 256;
  public final static int _ucSearchAllFields = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SearchFields(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SearchFields valueOf(int value) {
    switch(value) {
    case 1: return ucSearchFirstName;
    case 2: return ucSearchLastName;
    case 4: return ucSearchDisplayName;
    case 8: return ucSearchCompany;
    case 16: return ucSearchPrimaryEmailAddress;
    case 32: return ucSearchEmailAddresses;
    case 64: return ucSearchAlias;
    case 128: return ucSearchPhoneNumbers;
    case 256: return ucSearchPhoneExtention;
    case -1: return ucSearchAllFields;
    default: return new SearchFields(value);
    }
  }
}
