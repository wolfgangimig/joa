/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityConnectOptions.
 * Enumerates the modality connect options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityConnectOptions {
  ucConnectOptionsNone(0),
  ucConnectOptionsIncludeActiveContext(1),
  ucConnectOptionsIncludeAllContexts(2);

  public final int value;
  private ModalityConnectOptions(int value) { this.value = value; }
  public static  ModalityConnectOptions valueOf(int value) {
    switch(value) {
    case 0: return ucConnectOptionsNone;
    case 1: return ucConnectOptionsIncludeActiveContext;
    case 2: return ucConnectOptionsIncludeAllContexts;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityConnectOptions.class);
    }
  }
}
