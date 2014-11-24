/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFeatureInstall.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFeatureInstall {

  // Typed constants
  public final static MsoFeatureInstall msoFeatureInstallNone = new MsoFeatureInstall(0);
  public final static MsoFeatureInstall msoFeatureInstallOnDemand = new MsoFeatureInstall(1);
  public final static MsoFeatureInstall msoFeatureInstallOnDemandWithUI = new MsoFeatureInstall(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoFeatureInstallNone = 0;
  public final static int _msoFeatureInstallOnDemand = 1;
  public final static int _msoFeatureInstallOnDemandWithUI = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFeatureInstall(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFeatureInstall valueOf(int value) {
    switch(value) {
    case 0: return msoFeatureInstallNone;
    case 1: return msoFeatureInstallOnDemand;
    case 2: return msoFeatureInstallOnDemandWithUI;
    default: return new MsoFeatureInstall(value);
    }
  }
}
