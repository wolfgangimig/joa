/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CredentialRequestResult.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum CredentialRequestResult {
  ucCredsResultUnknown(0),
  ucCredsResultSuccess(1),
  ucCredsResultFailure(2);

  public final int value;
  private CredentialRequestResult(int value) { this.value = value; }
  public static  CredentialRequestResult valueOf(int value) {
    switch(value) {
    case 0: return ucCredsResultUnknown;
    case 1: return ucCredsResultSuccess;
    case 2: return ucCredsResultFailure;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + CredentialRequestResult.class);
    }
  }
}
