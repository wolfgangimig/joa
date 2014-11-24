/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * HoldFeature.
 * Enumerates the hold features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class HoldFeature {

  // Typed constants
  public final static HoldFeature ucHoldFeatureNone = new HoldFeature(0);
  public final static HoldFeature ucHoldFeatureMusicOnHold = new HoldFeature(1);
  public final static HoldFeature ucHoldFeatureOther = new HoldFeature(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucHoldFeatureNone = 0;
  public final static int _ucHoldFeatureMusicOnHold = 1;
  public final static int _ucHoldFeatureOther = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private HoldFeature(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  HoldFeature valueOf(int value) {
    switch(value) {
    case 0: return ucHoldFeatureNone;
    case 1: return ucHoldFeatureMusicOnHold;
    case 2: return ucHoldFeatureOther;
    default: return new HoldFeature(value);
    }
  }
}
