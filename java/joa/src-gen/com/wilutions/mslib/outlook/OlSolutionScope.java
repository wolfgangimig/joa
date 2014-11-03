/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSolutionScope.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSolutionScope {
  olHideInDefaultModules(0),
  olShowInDefaultModules(1);

  public final int value;
  private OlSolutionScope(int value) { this.value = value; }
  public static  OlSolutionScope valueOf(int value) {
    switch(value) {
    case 0: return olHideInDefaultModules;
    case 1: return olShowInDefaultModules;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSolutionScope.class);
    }
  }
}
