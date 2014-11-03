/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlSizeRepresents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{8B544093-ECC1-43E3-80EF-25D6FBCC7540}")
public enum XlSizeRepresents {
  xlSizeIsWidth(2),
  xlSizeIsArea(1);

  public final int value;
  private XlSizeRepresents(int value) { this.value = value; }
  public static  XlSizeRepresents valueOf(int value) {
    switch(value) {
    case 2: return xlSizeIsWidth;
    case 1: return xlSizeIsArea;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlSizeRepresents.class);
    }
  }
}
