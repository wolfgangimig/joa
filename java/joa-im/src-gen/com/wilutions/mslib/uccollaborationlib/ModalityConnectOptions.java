/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityConnectOptions.
 * Enumerates the modality connect options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityConnectOptions {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ModalityConnectOptions ucConnectOptionsNone = new ModalityConnectOptions(0);
  public final static ModalityConnectOptions ucConnectOptionsIncludeActiveContext = new ModalityConnectOptions(1);
  public final static ModalityConnectOptions ucConnectOptionsIncludeAllContexts = new ModalityConnectOptions(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConnectOptionsNone = 0;
  public final static int _ucConnectOptionsIncludeActiveContext = 1;
  public final static int _ucConnectOptionsIncludeAllContexts = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityConnectOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ModalityConnectOptions valueOf(int value) {
    switch(value) {
    case 0: return ucConnectOptionsNone;
    case 1: return ucConnectOptionsIncludeActiveContext;
    case 2: return ucConnectOptionsIncludeAllContexts;
    default: return new ModalityConnectOptions(value);
    }
  }
}
