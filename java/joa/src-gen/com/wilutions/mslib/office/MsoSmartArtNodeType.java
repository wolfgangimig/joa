/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSmartArtNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSmartArtNodeType {
  msoSmartArtNodeTypeDefault(1),
  msoSmartArtNodeTypeAssistant(2);

  public final int value;
  private MsoSmartArtNodeType(int value) { this.value = value; }
  public static  MsoSmartArtNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoSmartArtNodeTypeDefault;
    case 2: return msoSmartArtNodeTypeAssistant;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSmartArtNodeType.class);
    }
  }
}
