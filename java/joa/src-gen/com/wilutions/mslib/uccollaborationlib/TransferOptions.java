/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * TransferOptions.
 * Enumerates the transfer options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum TransferOptions {
  ucTransferOptionsNone(0),
  ucTransferOptionsDisallowRedirection(1),
  ucTransferOptionsIncludeActiveContext(2),
  ucTransferOptionsIncludeAllContexts(4);

  public final int value;
  private TransferOptions(int value) { this.value = value; }
  public static  TransferOptions valueOf(int value) {
    switch(value) {
    case 0: return ucTransferOptionsNone;
    case 1: return ucTransferOptionsDisallowRedirection;
    case 2: return ucTransferOptionsIncludeActiveContext;
    case 4: return ucTransferOptionsIncludeAllContexts;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + TransferOptions.class);
    }
  }
}
