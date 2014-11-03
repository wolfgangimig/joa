/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlChartType {
  xlColumnClustered(51),
  xlColumnStacked(52),
  xlColumnStacked100(53),
  xl3DColumnClustered(54),
  xl3DColumnStacked(55),
  xl3DColumnStacked100(56),
  xlBarClustered(57),
  xlBarStacked(58),
  xlBarStacked100(59),
  xl3DBarClustered(60),
  xl3DBarStacked(61),
  xl3DBarStacked100(62),
  xlLineStacked(63),
  xlLineStacked100(64),
  xlLineMarkers(65),
  xlLineMarkersStacked(66),
  xlLineMarkersStacked100(67),
  xlPieOfPie(68),
  xlPieExploded(69),
  xl3DPieExploded(70),
  xlBarOfPie(71),
  xlXYScatterSmooth(72),
  xlXYScatterSmoothNoMarkers(73),
  xlXYScatterLines(74),
  xlXYScatterLinesNoMarkers(75),
  xlAreaStacked(76),
  xlAreaStacked100(77),
  xl3DAreaStacked(78),
  xl3DAreaStacked100(79),
  xlDoughnutExploded(80),
  xlRadarMarkers(81),
  xlRadarFilled(82),
  xlSurface(83),
  xlSurfaceWireframe(84),
  xlSurfaceTopView(85),
  xlSurfaceTopViewWireframe(86),
  xlBubble(15),
  xlBubble3DEffect(87),
  xlStockHLC(88),
  xlStockOHLC(89),
  xlStockVHLC(90),
  xlStockVOHLC(91),
  xlCylinderColClustered(92),
  xlCylinderColStacked(93),
  xlCylinderColStacked100(94),
  xlCylinderBarClustered(95),
  xlCylinderBarStacked(96),
  xlCylinderBarStacked100(97),
  xlCylinderCol(98),
  xlConeColClustered(99),
  xlConeColStacked(100),
  xlConeColStacked100(101),
  xlConeBarClustered(102),
  xlConeBarStacked(103),
  xlConeBarStacked100(104),
  xlConeCol(105),
  xlPyramidColClustered(106),
  xlPyramidColStacked(107),
  xlPyramidColStacked100(108),
  xlPyramidBarClustered(109),
  xlPyramidBarStacked(110),
  xlPyramidBarStacked100(111),
  xlPyramidCol(112),
  xl3DColumn(-4100),
  xlLine(4),
  xl3DLine(-4101),
  xl3DPie(-4102),
  xlPie(5),
  xlXYScatter(-4169),
  xl3DArea(-4098),
  xlArea(1),
  xlDoughnut(-4120),
  xlRadar(-4151),
  xlCombo(-4152),
  xlComboColumnClusteredLine(113),
  xlComboColumnClusteredLineSecondaryAxis(114),
  xlComboAreaStackedColumnClustered(115),
  xlOtherCombinations(116),
  xlSuggestedChart(-2);

  public final int value;
  private XlChartType(int value) { this.value = value; }
  public static  XlChartType valueOf(int value) {
    switch(value) {
    case 51: return xlColumnClustered;
    case 52: return xlColumnStacked;
    case 53: return xlColumnStacked100;
    case 54: return xl3DColumnClustered;
    case 55: return xl3DColumnStacked;
    case 56: return xl3DColumnStacked100;
    case 57: return xlBarClustered;
    case 58: return xlBarStacked;
    case 59: return xlBarStacked100;
    case 60: return xl3DBarClustered;
    case 61: return xl3DBarStacked;
    case 62: return xl3DBarStacked100;
    case 63: return xlLineStacked;
    case 64: return xlLineStacked100;
    case 65: return xlLineMarkers;
    case 66: return xlLineMarkersStacked;
    case 67: return xlLineMarkersStacked100;
    case 68: return xlPieOfPie;
    case 69: return xlPieExploded;
    case 70: return xl3DPieExploded;
    case 71: return xlBarOfPie;
    case 72: return xlXYScatterSmooth;
    case 73: return xlXYScatterSmoothNoMarkers;
    case 74: return xlXYScatterLines;
    case 75: return xlXYScatterLinesNoMarkers;
    case 76: return xlAreaStacked;
    case 77: return xlAreaStacked100;
    case 78: return xl3DAreaStacked;
    case 79: return xl3DAreaStacked100;
    case 80: return xlDoughnutExploded;
    case 81: return xlRadarMarkers;
    case 82: return xlRadarFilled;
    case 83: return xlSurface;
    case 84: return xlSurfaceWireframe;
    case 85: return xlSurfaceTopView;
    case 86: return xlSurfaceTopViewWireframe;
    case 15: return xlBubble;
    case 87: return xlBubble3DEffect;
    case 88: return xlStockHLC;
    case 89: return xlStockOHLC;
    case 90: return xlStockVHLC;
    case 91: return xlStockVOHLC;
    case 92: return xlCylinderColClustered;
    case 93: return xlCylinderColStacked;
    case 94: return xlCylinderColStacked100;
    case 95: return xlCylinderBarClustered;
    case 96: return xlCylinderBarStacked;
    case 97: return xlCylinderBarStacked100;
    case 98: return xlCylinderCol;
    case 99: return xlConeColClustered;
    case 100: return xlConeColStacked;
    case 101: return xlConeColStacked100;
    case 102: return xlConeBarClustered;
    case 103: return xlConeBarStacked;
    case 104: return xlConeBarStacked100;
    case 105: return xlConeCol;
    case 106: return xlPyramidColClustered;
    case 107: return xlPyramidColStacked;
    case 108: return xlPyramidColStacked100;
    case 109: return xlPyramidBarClustered;
    case 110: return xlPyramidBarStacked;
    case 111: return xlPyramidBarStacked100;
    case 112: return xlPyramidCol;
    case -4100: return xl3DColumn;
    case 4: return xlLine;
    case -4101: return xl3DLine;
    case -4102: return xl3DPie;
    case 5: return xlPie;
    case -4169: return xlXYScatter;
    case -4098: return xl3DArea;
    case 1: return xlArea;
    case -4120: return xlDoughnut;
    case -4151: return xlRadar;
    case -4152: return xlCombo;
    case 113: return xlComboColumnClusteredLine;
    case 114: return xlComboColumnClusteredLineSecondaryAxis;
    case 115: return xlComboAreaStackedColumnClustered;
    case 116: return xlOtherCombinations;
    case -2: return xlSuggestedChart;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartType.class);
    }
  }
}
