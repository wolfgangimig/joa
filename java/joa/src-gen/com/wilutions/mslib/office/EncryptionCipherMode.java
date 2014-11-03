/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionCipherMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum EncryptionCipherMode {
  cipherModeECB(0),
  cipherModeCBC(1);

  public final int value;
  private EncryptionCipherMode(int value) { this.value = value; }
  public static  EncryptionCipherMode valueOf(int value) {
    switch(value) {
    case 0: return cipherModeECB;
    case 1: return cipherModeCBC;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + EncryptionCipherMode.class);
    }
  }
}
