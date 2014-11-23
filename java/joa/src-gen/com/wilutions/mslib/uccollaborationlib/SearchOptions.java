/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchOptions.
 * Enumerates search options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SearchOptions {
  ucSearchDefault(0),
  ucSearchMatchWholeWord(1),
  ucSearchContactsOnly(2),
  ucSearchIncludeContactsWithoutSipOrTelUri(4),
  ucSearchAllowProgressiveCallback(268435456);

  public final int value;
  private SearchOptions(int value) { this.value = value; }
  public static  SearchOptions valueOf(int value) {
    switch(value) {
    case 0: return ucSearchDefault;
    case 1: return ucSearchMatchWholeWord;
    case 2: return ucSearchContactsOnly;
    case 4: return ucSearchIncludeContactsWithoutSipOrTelUri;
    case 268435456: return ucSearchAllowProgressiveCallback;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SearchOptions.class);
    }
  }
}
