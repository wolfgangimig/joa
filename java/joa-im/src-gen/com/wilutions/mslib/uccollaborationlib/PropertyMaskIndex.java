/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PropertyMaskIndex.
 * Enumerates the indexes where property ID fields reside. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PropertyMaskIndex {

  // Typed constants
  public final static PropertyMaskIndex ucPropertyMaskIndexType = new PropertyMaskIndex(28);
  public final static PropertyMaskIndex ucPropertyMaskIndexClass = new PropertyMaskIndex(16);
  public final static PropertyMaskIndex ucPropertyMaskIndexId = new PropertyMaskIndex(0);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyMaskIndexType = 28;
  public final static int _ucPropertyMaskIndexClass = 16;
  public final static int _ucPropertyMaskIndexId = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PropertyMaskIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PropertyMaskIndex valueOf(int value) {
    switch(value) {
    case 28: return ucPropertyMaskIndexType;
    case 16: return ucPropertyMaskIndexClass;
    case 0: return ucPropertyMaskIndexId;
    default: return new PropertyMaskIndex(value);
    }
  }
}
