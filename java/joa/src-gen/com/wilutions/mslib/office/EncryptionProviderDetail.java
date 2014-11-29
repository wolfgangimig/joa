/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionProviderDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class EncryptionProviderDetail {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static EncryptionProviderDetail encprovdetUrl = new EncryptionProviderDetail(0);
  public final static EncryptionProviderDetail encprovdetAlgorithm = new EncryptionProviderDetail(1);
  public final static EncryptionProviderDetail encprovdetBlockCipher = new EncryptionProviderDetail(2);
  public final static EncryptionProviderDetail encprovdetCipherBlockSize = new EncryptionProviderDetail(3);
  public final static EncryptionProviderDetail encprovdetCipherMode = new EncryptionProviderDetail(4);

  // Integer constants for bitsets and switch statements
  public final static int _encprovdetUrl = 0;
  public final static int _encprovdetAlgorithm = 1;
  public final static int _encprovdetBlockCipher = 2;
  public final static int _encprovdetCipherBlockSize = 3;
  public final static int _encprovdetCipherMode = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private EncryptionProviderDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  EncryptionProviderDetail valueOf(int value) {
    switch(value) {
    case 0: return encprovdetUrl;
    case 1: return encprovdetAlgorithm;
    case 2: return encprovdetBlockCipher;
    case 3: return encprovdetCipherBlockSize;
    case 4: return encprovdetCipherMode;
    default: return new EncryptionProviderDetail(value);
    }
  }
}
