/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * TransferOptions.
 * Enumerates the transfer options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class TransferOptions {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static TransferOptions ucTransferOptionsNone = new TransferOptions(0);
  public final static TransferOptions ucTransferOptionsDisallowRedirection = new TransferOptions(1);
  public final static TransferOptions ucTransferOptionsIncludeActiveContext = new TransferOptions(2);
  public final static TransferOptions ucTransferOptionsIncludeAllContexts = new TransferOptions(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucTransferOptionsNone = 0;
  public final static int _ucTransferOptionsDisallowRedirection = 1;
  public final static int _ucTransferOptionsIncludeActiveContext = 2;
  public final static int _ucTransferOptionsIncludeAllContexts = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private TransferOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  TransferOptions valueOf(int value) {
    switch(value) {
    case 0: return ucTransferOptionsNone;
    case 1: return ucTransferOptionsDisallowRedirection;
    case 2: return ucTransferOptionsIncludeActiveContext;
    case 4: return ucTransferOptionsIncludeAllContexts;
    default: return new TransferOptions(value);
    }
  }
}
