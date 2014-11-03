/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDiagramNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDiagramNodeType {
  msoDiagramNode(1),
  msoDiagramAssistant(2);

  public final int value;
  private MsoDiagramNodeType(int value) { this.value = value; }
  public static  MsoDiagramNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoDiagramNode;
    case 2: return msoDiagramAssistant;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDiagramNodeType.class);
    }
  }
}
