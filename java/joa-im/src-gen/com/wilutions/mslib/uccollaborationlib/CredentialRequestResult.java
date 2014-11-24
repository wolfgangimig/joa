/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CredentialRequestResult.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CredentialRequestResult {

  // Typed constants
  public final static CredentialRequestResult ucCredsResultUnknown = new CredentialRequestResult(0);
  public final static CredentialRequestResult ucCredsResultSuccess = new CredentialRequestResult(1);
  public final static CredentialRequestResult ucCredsResultFailure = new CredentialRequestResult(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucCredsResultUnknown = 0;
  public final static int _ucCredsResultSuccess = 1;
  public final static int _ucCredsResultFailure = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CredentialRequestResult(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  CredentialRequestResult valueOf(int value) {
    switch(value) {
    case 0: return ucCredsResultUnknown;
    case 1: return ucCredsResultSuccess;
    case 2: return ucCredsResultFailure;
    default: return new CredentialRequestResult(value);
    }
  }
}
