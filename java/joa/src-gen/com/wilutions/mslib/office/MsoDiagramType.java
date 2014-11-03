/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDiagramType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDiagramType {
  msoDiagramMixed(-2),
  msoDiagramOrgChart(1),
  msoDiagramCycle(2),
  msoDiagramRadial(3),
  msoDiagramPyramid(4),
  msoDiagramVenn(5),
  msoDiagramTarget(6);

  public final int value;
  private MsoDiagramType(int value) { this.value = value; }
  public static  MsoDiagramType valueOf(int value) {
    switch(value) {
    case -2: return msoDiagramMixed;
    case 1: return msoDiagramOrgChart;
    case 2: return msoDiagramCycle;
    case 3: return msoDiagramRadial;
    case 4: return msoDiagramPyramid;
    case 5: return msoDiagramVenn;
    case 6: return msoDiagramTarget;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDiagramType.class);
    }
  }
}
