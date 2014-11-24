/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlogCategorySupport.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBlogCategorySupport {

  // Typed constants
  public final static MsoBlogCategorySupport msoBlogNoCategories = new MsoBlogCategorySupport(0);
  public final static MsoBlogCategorySupport msoBlogOneCategory = new MsoBlogCategorySupport(1);
  public final static MsoBlogCategorySupport msoBlogMultipleCategories = new MsoBlogCategorySupport(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoBlogNoCategories = 0;
  public final static int _msoBlogOneCategory = 1;
  public final static int _msoBlogMultipleCategories = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBlogCategorySupport(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBlogCategorySupport valueOf(int value) {
    switch(value) {
    case 0: return msoBlogNoCategories;
    case 1: return msoBlogOneCategory;
    case 2: return msoBlogMultipleCategories;
    default: return new MsoBlogCategorySupport(value);
    }
  }
}
