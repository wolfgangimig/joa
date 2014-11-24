/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RepresentationType.
 * Enumerates the representation type of the representation info. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RepresentationType {

  // Typed constants
  public final static RepresentationType ucRepresentationTypeDelegate = new RepresentationType(0);
  public final static RepresentationType ucRepresentationTypeTeam = new RepresentationType(1);
  public final static RepresentationType ucRepresentationTypeAutomaticCallDistributor = new RepresentationType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRepresentationTypeDelegate = 0;
  public final static int _ucRepresentationTypeTeam = 1;
  public final static int _ucRepresentationTypeAutomaticCallDistributor = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RepresentationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RepresentationType valueOf(int value) {
    switch(value) {
    case 0: return ucRepresentationTypeDelegate;
    case 1: return ucRepresentationTypeTeam;
    case 2: return ucRepresentationTypeAutomaticCallDistributor;
    default: return new RepresentationType(value);
    }
  }
}
