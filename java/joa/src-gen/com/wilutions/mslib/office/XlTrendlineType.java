/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTrendlineType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlTrendlineType {

  // Typed constants
  public final static XlTrendlineType xlExponential = new XlTrendlineType(5);
  public final static XlTrendlineType xlLinear = new XlTrendlineType(-4132);
  public final static XlTrendlineType xlLogarithmic = new XlTrendlineType(-4133);
  public final static XlTrendlineType xlMovingAvg = new XlTrendlineType(6);
  public final static XlTrendlineType xlPolynomial = new XlTrendlineType(3);
  public final static XlTrendlineType xlPower = new XlTrendlineType(4);

  // Integer constants for bitsets and switch statements
  public final static int _xlExponential = 5;
  public final static int _xlLinear = -4132;
  public final static int _xlLogarithmic = -4133;
  public final static int _xlMovingAvg = 6;
  public final static int _xlPolynomial = 3;
  public final static int _xlPower = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlTrendlineType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlTrendlineType valueOf(int value) {
    switch(value) {
    case 5: return xlExponential;
    case -4132: return xlLinear;
    case -4133: return xlLogarithmic;
    case 6: return xlMovingAvg;
    case 3: return xlPolynomial;
    case 4: return xlPower;
    default: return new XlTrendlineType(value);
    }
  }
}
