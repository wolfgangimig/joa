/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityActionProperty.
 * Enumerates the modality control action properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityActionProperty {
  ucModalityTransferContextFailures(1611464704),
  ucModalityConnectContextFailures(1611464705);

  public final int value;
  private ModalityActionProperty(int value) { this.value = value; }
  public static  ModalityActionProperty valueOf(int value) {
    switch(value) {
    case 1611464704: return ucModalityTransferContextFailures;
    case 1611464705: return ucModalityConnectContextFailures;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityActionProperty.class);
    }
  }
}
