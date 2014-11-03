/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionProviderDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum EncryptionProviderDetail {
  encprovdetUrl(0),
  encprovdetAlgorithm(1),
  encprovdetBlockCipher(2),
  encprovdetCipherBlockSize(3),
  encprovdetCipherMode(4);

  public final int value;
  private EncryptionProviderDetail(int value) { this.value = value; }
  public static  EncryptionProviderDetail valueOf(int value) {
    switch(value) {
    case 0: return encprovdetUrl;
    case 1: return encprovdetAlgorithm;
    case 2: return encprovdetBlockCipher;
    case 3: return encprovdetCipherBlockSize;
    case 4: return encprovdetCipherMode;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + EncryptionProviderDetail.class);
    }
  }
}
