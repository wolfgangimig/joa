/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SignInConfigurationType.
 * Enumerates configuration can edit types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SignInConfigurationType {

  // Typed constants
  public final static SignInConfigurationType ucCanSetMode = new SignInConfigurationType(0);
  public final static SignInConfigurationType ucCanSetTransport = new SignInConfigurationType(1);
  public final static SignInConfigurationType ucCanSetInternalServer = new SignInConfigurationType(2);
  public final static SignInConfigurationType ucCanSetExternalServer = new SignInConfigurationType(3);
  public final static SignInConfigurationType ucCanSetSavePassword = new SignInConfigurationType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucCanSetMode = 0;
  public final static int _ucCanSetTransport = 1;
  public final static int _ucCanSetInternalServer = 2;
  public final static int _ucCanSetExternalServer = 3;
  public final static int _ucCanSetSavePassword = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SignInConfigurationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SignInConfigurationType valueOf(int value) {
    switch(value) {
    case 0: return ucCanSetMode;
    case 1: return ucCanSetTransport;
    case 2: return ucCanSetInternalServer;
    case 3: return ucCanSetExternalServer;
    case 4: return ucCanSetSavePassword;
    default: return new SignInConfigurationType(value);
    }
  }
}
