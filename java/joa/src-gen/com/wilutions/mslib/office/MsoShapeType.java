/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoShapeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoShapeType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoShapeType msoShapeTypeMixed = new MsoShapeType(-2);
  public final static MsoShapeType msoAutoShape = new MsoShapeType(1);
  public final static MsoShapeType msoCallout = new MsoShapeType(2);
  public final static MsoShapeType msoChart = new MsoShapeType(3);
  public final static MsoShapeType msoComment = new MsoShapeType(4);
  public final static MsoShapeType msoFreeform = new MsoShapeType(5);
  public final static MsoShapeType msoGroup = new MsoShapeType(6);
  public final static MsoShapeType msoEmbeddedOLEObject = new MsoShapeType(7);
  public final static MsoShapeType msoFormControl = new MsoShapeType(8);
  public final static MsoShapeType msoLine = new MsoShapeType(9);
  public final static MsoShapeType msoLinkedOLEObject = new MsoShapeType(10);
  public final static MsoShapeType msoLinkedPicture = new MsoShapeType(11);
  public final static MsoShapeType msoOLEControlObject = new MsoShapeType(12);
  public final static MsoShapeType msoPicture = new MsoShapeType(13);
  public final static MsoShapeType msoPlaceholder = new MsoShapeType(14);
  public final static MsoShapeType msoTextEffect = new MsoShapeType(15);
  public final static MsoShapeType msoMedia = new MsoShapeType(16);
  public final static MsoShapeType msoTextBox = new MsoShapeType(17);
  public final static MsoShapeType msoScriptAnchor = new MsoShapeType(18);
  public final static MsoShapeType msoTable = new MsoShapeType(19);
  public final static MsoShapeType msoCanvas = new MsoShapeType(20);
  public final static MsoShapeType msoDiagram = new MsoShapeType(21);
  public final static MsoShapeType msoInk = new MsoShapeType(22);
  public final static MsoShapeType msoInkComment = new MsoShapeType(23);
  public final static MsoShapeType msoSmartArt = new MsoShapeType(24);
  public final static MsoShapeType msoSlicer = new MsoShapeType(25);
  public final static MsoShapeType msoWebVideo = new MsoShapeType(26);
  public final static MsoShapeType msoContentApp = new MsoShapeType(27);

  // Integer constants for bitsets and switch statements
  public final static int _msoShapeTypeMixed = -2;
  public final static int _msoAutoShape = 1;
  public final static int _msoCallout = 2;
  public final static int _msoChart = 3;
  public final static int _msoComment = 4;
  public final static int _msoFreeform = 5;
  public final static int _msoGroup = 6;
  public final static int _msoEmbeddedOLEObject = 7;
  public final static int _msoFormControl = 8;
  public final static int _msoLine = 9;
  public final static int _msoLinkedOLEObject = 10;
  public final static int _msoLinkedPicture = 11;
  public final static int _msoOLEControlObject = 12;
  public final static int _msoPicture = 13;
  public final static int _msoPlaceholder = 14;
  public final static int _msoTextEffect = 15;
  public final static int _msoMedia = 16;
  public final static int _msoTextBox = 17;
  public final static int _msoScriptAnchor = 18;
  public final static int _msoTable = 19;
  public final static int _msoCanvas = 20;
  public final static int _msoDiagram = 21;
  public final static int _msoInk = 22;
  public final static int _msoInkComment = 23;
  public final static int _msoSmartArt = 24;
  public final static int _msoSlicer = 25;
  public final static int _msoWebVideo = 26;
  public final static int _msoContentApp = 27;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoShapeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoShapeType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 7: return "msoEmbeddedOLEObject";
    case -2: return "msoShapeTypeMixed";
    case 1: return "msoAutoShape";
    case 2: return "msoCallout";
    case 3: return "msoChart";
    case 4: return "msoComment";
    case 5: return "msoFreeform";
    case 6: return "msoGroup";
    case 8: return "msoFormControl";
    case 9: return "msoLine";
    case 10: return "msoLinkedOLEObject";
    case 11: return "msoLinkedPicture";
    case 12: return "msoOLEControlObject";
    case 13: return "msoPicture";
    case 14: return "msoPlaceholder";
    case 15: return "msoTextEffect";
    case 16: return "msoMedia";
    case 17: return "msoTextBox";
    case 21: return "msoDiagram";
    case 18: return "msoScriptAnchor";
    case 20: return "msoCanvas";
    case 19: return "msoTable";
    case 22: return "msoInk";
    case 23: return "msoInkComment";
    case 24: return "msoSmartArt";
    case 25: return "msoSlicer";
    case 26: return "msoWebVideo";
    case 27: return "msoContentApp";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoEmbeddedOLEObject");
      if ((value & -2) != 0) sbuf.append("|msoShapeTypeMixed");
      if ((value & 1) != 0) sbuf.append("|msoAutoShape");
      if ((value & 2) != 0) sbuf.append("|msoCallout");
      if ((value & 3) != 0) sbuf.append("|msoChart");
      if ((value & 4) != 0) sbuf.append("|msoComment");
      if ((value & 5) != 0) sbuf.append("|msoFreeform");
      if ((value & 6) != 0) sbuf.append("|msoGroup");
      if ((value & 8) != 0) sbuf.append("|msoFormControl");
      if ((value & 9) != 0) sbuf.append("|msoLine");
      if ((value & 10) != 0) sbuf.append("|msoLinkedOLEObject");
      if ((value & 11) != 0) sbuf.append("|msoLinkedPicture");
      if ((value & 12) != 0) sbuf.append("|msoOLEControlObject");
      if ((value & 13) != 0) sbuf.append("|msoPicture");
      if ((value & 14) != 0) sbuf.append("|msoPlaceholder");
      if ((value & 15) != 0) sbuf.append("|msoTextEffect");
      if ((value & 16) != 0) sbuf.append("|msoMedia");
      if ((value & 17) != 0) sbuf.append("|msoTextBox");
      if ((value & 21) != 0) sbuf.append("|msoDiagram");
      if ((value & 18) != 0) sbuf.append("|msoScriptAnchor");
      if ((value & 20) != 0) sbuf.append("|msoCanvas");
      if ((value & 19) != 0) sbuf.append("|msoTable");
      if ((value & 22) != 0) sbuf.append("|msoInk");
      if ((value & 23) != 0) sbuf.append("|msoInkComment");
      if ((value & 24) != 0) sbuf.append("|msoSmartArt");
      if ((value & 25) != 0) sbuf.append("|msoSlicer");
      if ((value & 26) != 0) sbuf.append("|msoWebVideo");
      if ((value & 27) != 0) sbuf.append("|msoContentApp");
      return sbuf.toString();
      }
    }
  }
}
