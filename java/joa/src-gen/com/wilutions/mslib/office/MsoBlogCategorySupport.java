/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlogCategorySupport.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBlogCategorySupport {
  msoBlogNoCategories(0),
  msoBlogOneCategory(1),
  msoBlogMultipleCategories(2);

  public final int value;
  private MsoBlogCategorySupport(int value) { this.value = value; }
  public static  MsoBlogCategorySupport valueOf(int value) {
    switch(value) {
    case 0: return msoBlogNoCategories;
    case 1: return msoBlogOneCategory;
    case 2: return msoBlogMultipleCategories;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBlogCategorySupport.class);
    }
  }
}
