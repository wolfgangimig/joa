/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartItem.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlChartItem {
  xlDataLabel(0),
  xlChartArea(2),
  xlSeries(3),
  xlChartTitle(4),
  xlWalls(5),
  xlCorners(6),
  xlDataTable(7),
  xlTrendline(8),
  xlErrorBars(9),
  xlXErrorBars(10),
  xlYErrorBars(11),
  xlLegendEntry(12),
  xlLegendKey(13),
  xlShape(14),
  xlMajorGridlines(15),
  xlMinorGridlines(16),
  xlAxisTitle(17),
  xlUpBars(18),
  xlPlotArea(19),
  xlDownBars(20),
  xlAxis(21),
  xlSeriesLines(22),
  xlFloor(23),
  xlLegend(24),
  xlHiLoLines(25),
  xlDropLines(26),
  xlRadarAxisLabels(27),
  xlNothing(28),
  xlLeaderLines(29),
  xlDisplayUnitLabel(30),
  xlPivotChartFieldButton(31),
  xlPivotChartDropZone(32);

  public final int value;
  private XlChartItem(int value) { this.value = value; }
  public static  XlChartItem valueOf(int value) {
    switch(value) {
    case 0: return xlDataLabel;
    case 2: return xlChartArea;
    case 3: return xlSeries;
    case 4: return xlChartTitle;
    case 5: return xlWalls;
    case 6: return xlCorners;
    case 7: return xlDataTable;
    case 8: return xlTrendline;
    case 9: return xlErrorBars;
    case 10: return xlXErrorBars;
    case 11: return xlYErrorBars;
    case 12: return xlLegendEntry;
    case 13: return xlLegendKey;
    case 14: return xlShape;
    case 15: return xlMajorGridlines;
    case 16: return xlMinorGridlines;
    case 17: return xlAxisTitle;
    case 18: return xlUpBars;
    case 19: return xlPlotArea;
    case 20: return xlDownBars;
    case 21: return xlAxis;
    case 22: return xlSeriesLines;
    case 23: return xlFloor;
    case 24: return xlLegend;
    case 25: return xlHiLoLines;
    case 26: return xlDropLines;
    case 27: return xlRadarAxisLabels;
    case 28: return xlNothing;
    case 29: return xlLeaderLines;
    case 30: return xlDisplayUnitLabel;
    case 31: return xlPivotChartFieldButton;
    case 32: return xlPivotChartDropZone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartItem.class);
    }
  }
}
