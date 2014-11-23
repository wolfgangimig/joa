/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RepresentationType.
 * Enumerates the representation type of the representation info. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RepresentationType {
  ucRepresentationTypeDelegate(0),
  ucRepresentationTypeTeam(1),
  ucRepresentationTypeAutomaticCallDistributor(2);

  public final int value;
  private RepresentationType(int value) { this.value = value; }
  public static  RepresentationType valueOf(int value) {
    switch(value) {
    case 0: return ucRepresentationTypeDelegate;
    case 1: return ucRepresentationTypeTeam;
    case 2: return ucRepresentationTypeAutomaticCallDistributor;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RepresentationType.class);
    }
  }
}
