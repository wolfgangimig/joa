/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTrendlineType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlTrendlineType {
  xlExponential(5),
  xlLinear(-4132),
  xlLogarithmic(-4133),
  xlMovingAvg(6),
  xlPolynomial(3),
  xlPower(4);

  public final int value;
  private XlTrendlineType(int value) { this.value = value; }
  public static  XlTrendlineType valueOf(int value) {
    switch(value) {
    case 5: return xlExponential;
    case -4132: return xlLinear;
    case -4133: return xlLogarithmic;
    case 6: return xlMovingAvg;
    case 3: return xlPolynomial;
    case 4: return xlPower;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlTrendlineType.class);
    }
  }
}
