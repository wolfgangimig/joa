/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDiagramNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDiagramNodeType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoDiagramNodeType msoDiagramNode = new MsoDiagramNodeType(1);
  public final static MsoDiagramNodeType msoDiagramAssistant = new MsoDiagramNodeType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoDiagramNode = 1;
  public final static int _msoDiagramAssistant = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDiagramNodeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoDiagramNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoDiagramNode;
    case 2: return msoDiagramAssistant;
    default: return new MsoDiagramNodeType(value);
    }
  }
}
