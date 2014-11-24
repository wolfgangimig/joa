/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSmartArtNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSmartArtNodeType {

  // Typed constants
  public final static MsoSmartArtNodeType msoSmartArtNodeTypeDefault = new MsoSmartArtNodeType(1);
  public final static MsoSmartArtNodeType msoSmartArtNodeTypeAssistant = new MsoSmartArtNodeType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoSmartArtNodeTypeDefault = 1;
  public final static int _msoSmartArtNodeTypeAssistant = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSmartArtNodeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSmartArtNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoSmartArtNodeTypeDefault;
    case 2: return msoSmartArtNodeTypeAssistant;
    default: return new MsoSmartArtNodeType(value);
    }
  }
}
