/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFeatureInstall.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFeatureInstall {
  msoFeatureInstallNone(0),
  msoFeatureInstallOnDemand(1),
  msoFeatureInstallOnDemandWithUI(2);

  public final int value;
  private MsoFeatureInstall(int value) { this.value = value; }
  public static  MsoFeatureInstall valueOf(int value) {
    switch(value) {
    case 0: return msoFeatureInstallNone;
    case 1: return msoFeatureInstallOnDemand;
    case 2: return msoFeatureInstallOnDemandWithUI;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFeatureInstall.class);
    }
  }
}
