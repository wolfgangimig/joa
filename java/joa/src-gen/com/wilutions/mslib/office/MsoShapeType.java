/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoShapeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoShapeType {
  msoShapeTypeMixed(-2),
  msoAutoShape(1),
  msoCallout(2),
  msoChart(3),
  msoComment(4),
  msoFreeform(5),
  msoGroup(6),
  msoEmbeddedOLEObject(7),
  msoFormControl(8),
  msoLine(9),
  msoLinkedOLEObject(10),
  msoLinkedPicture(11),
  msoOLEControlObject(12),
  msoPicture(13),
  msoPlaceholder(14),
  msoTextEffect(15),
  msoMedia(16),
  msoTextBox(17),
  msoScriptAnchor(18),
  msoTable(19),
  msoCanvas(20),
  msoDiagram(21),
  msoInk(22),
  msoInkComment(23),
  msoSmartArt(24),
  msoSlicer(25),
  msoWebVideo(26),
  msoContentApp(27);

  public final int value;
  private MsoShapeType(int value) { this.value = value; }
  public static  MsoShapeType valueOf(int value) {
    switch(value) {
    case -2: return msoShapeTypeMixed;
    case 1: return msoAutoShape;
    case 2: return msoCallout;
    case 3: return msoChart;
    case 4: return msoComment;
    case 5: return msoFreeform;
    case 6: return msoGroup;
    case 7: return msoEmbeddedOLEObject;
    case 8: return msoFormControl;
    case 9: return msoLine;
    case 10: return msoLinkedOLEObject;
    case 11: return msoLinkedPicture;
    case 12: return msoOLEControlObject;
    case 13: return msoPicture;
    case 14: return msoPlaceholder;
    case 15: return msoTextEffect;
    case 16: return msoMedia;
    case 17: return msoTextBox;
    case 18: return msoScriptAnchor;
    case 19: return msoTable;
    case 20: return msoCanvas;
    case 21: return msoDiagram;
    case 22: return msoInk;
    case 23: return msoInkComment;
    case 24: return msoSmartArt;
    case 25: return msoSlicer;
    case 26: return msoWebVideo;
    case 27: return msoContentApp;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoShapeType.class);
    }
  }
}
