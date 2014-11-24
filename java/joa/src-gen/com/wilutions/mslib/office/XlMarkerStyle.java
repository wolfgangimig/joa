/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlMarkerStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7CC8C2D6-8F8A-490B-B6F8-3C410554F9E4}")
public class XlMarkerStyle {

  // Typed constants
  public final static XlMarkerStyle xlMarkerStyleAutomatic = new XlMarkerStyle(-4105);
  public final static XlMarkerStyle xlMarkerStyleCircle = new XlMarkerStyle(8);
  public final static XlMarkerStyle xlMarkerStyleDash = new XlMarkerStyle(-4115);
  public final static XlMarkerStyle xlMarkerStyleDiamond = new XlMarkerStyle(2);
  public final static XlMarkerStyle xlMarkerStyleDot = new XlMarkerStyle(-4118);
  public final static XlMarkerStyle xlMarkerStyleNone = new XlMarkerStyle(-4142);
  public final static XlMarkerStyle xlMarkerStylePicture = new XlMarkerStyle(-4147);
  public final static XlMarkerStyle xlMarkerStylePlus = new XlMarkerStyle(9);
  public final static XlMarkerStyle xlMarkerStyleSquare = new XlMarkerStyle(1);
  public final static XlMarkerStyle xlMarkerStyleStar = new XlMarkerStyle(5);
  public final static XlMarkerStyle xlMarkerStyleTriangle = new XlMarkerStyle(3);
  public final static XlMarkerStyle xlMarkerStyleX = new XlMarkerStyle(-4168);

  // Integer constants for bitsets and switch statements
  public final static int _xlMarkerStyleAutomatic = -4105;
  public final static int _xlMarkerStyleCircle = 8;
  public final static int _xlMarkerStyleDash = -4115;
  public final static int _xlMarkerStyleDiamond = 2;
  public final static int _xlMarkerStyleDot = -4118;
  public final static int _xlMarkerStyleNone = -4142;
  public final static int _xlMarkerStylePicture = -4147;
  public final static int _xlMarkerStylePlus = 9;
  public final static int _xlMarkerStyleSquare = 1;
  public final static int _xlMarkerStyleStar = 5;
  public final static int _xlMarkerStyleTriangle = 3;
  public final static int _xlMarkerStyleX = -4168;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlMarkerStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlMarkerStyle valueOf(int value) {
    switch(value) {
    case -4105: return xlMarkerStyleAutomatic;
    case 8: return xlMarkerStyleCircle;
    case -4115: return xlMarkerStyleDash;
    case 2: return xlMarkerStyleDiamond;
    case -4118: return xlMarkerStyleDot;
    case -4142: return xlMarkerStyleNone;
    case -4147: return xlMarkerStylePicture;
    case 9: return xlMarkerStylePlus;
    case 1: return xlMarkerStyleSquare;
    case 5: return xlMarkerStyleStar;
    case 3: return xlMarkerStyleTriangle;
    case -4168: return xlMarkerStyleX;
    default: return new XlMarkerStyle(value);
    }
  }
}
