/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchOptions.
 * Enumerates search options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SearchOptions {

  // Typed constants
  public final static SearchOptions ucSearchDefault = new SearchOptions(0);
  public final static SearchOptions ucSearchMatchWholeWord = new SearchOptions(1);
  public final static SearchOptions ucSearchContactsOnly = new SearchOptions(2);
  public final static SearchOptions ucSearchIncludeContactsWithoutSipOrTelUri = new SearchOptions(4);
  public final static SearchOptions ucSearchAllowProgressiveCallback = new SearchOptions(268435456);

  // Integer constants for bitsets and switch statements
  public final static int _ucSearchDefault = 0;
  public final static int _ucSearchMatchWholeWord = 1;
  public final static int _ucSearchContactsOnly = 2;
  public final static int _ucSearchIncludeContactsWithoutSipOrTelUri = 4;
  public final static int _ucSearchAllowProgressiveCallback = 268435456;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SearchOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SearchOptions valueOf(int value) {
    switch(value) {
    case 0: return ucSearchDefault;
    case 1: return ucSearchMatchWholeWord;
    case 2: return ucSearchContactsOnly;
    case 4: return ucSearchIncludeContactsWithoutSipOrTelUri;
    case 268435456: return ucSearchAllowProgressiveCallback;
    default: return new SearchOptions(value);
    }
  }
}
