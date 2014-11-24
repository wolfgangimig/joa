/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityActionProperty.
 * Enumerates the modality control action properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityActionProperty {

  // Typed constants
  public final static ModalityActionProperty ucModalityTransferContextFailures = new ModalityActionProperty(1611464704);
  public final static ModalityActionProperty ucModalityConnectContextFailures = new ModalityActionProperty(1611464705);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityTransferContextFailures = 1611464704;
  public final static int _ucModalityConnectContextFailures = 1611464705;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityActionProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ModalityActionProperty valueOf(int value) {
    switch(value) {
    case 1611464704: return ucModalityTransferContextFailures;
    case 1611464705: return ucModalityConnectContextFailures;
    default: return new ModalityActionProperty(value);
    }
  }
}
