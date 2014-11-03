/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlMarkerStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7CC8C2D6-8F8A-490B-B6F8-3C410554F9E4}")
public enum XlMarkerStyle {
  xlMarkerStyleAutomatic(-4105),
  xlMarkerStyleCircle(8),
  xlMarkerStyleDash(-4115),
  xlMarkerStyleDiamond(2),
  xlMarkerStyleDot(-4118),
  xlMarkerStyleNone(-4142),
  xlMarkerStylePicture(-4147),
  xlMarkerStylePlus(9),
  xlMarkerStyleSquare(1),
  xlMarkerStyleStar(5),
  xlMarkerStyleTriangle(3),
  xlMarkerStyleX(-4168);

  public final int value;
  private XlMarkerStyle(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlMarkerStyle.class);
    }
  }
}
