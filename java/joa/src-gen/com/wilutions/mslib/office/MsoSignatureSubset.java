/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSignatureSubset.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSignatureSubset {
  msoSignatureSubsetSignaturesAllSigs(0),
  msoSignatureSubsetSignaturesNonVisible(1),
  msoSignatureSubsetSignatureLines(2),
  msoSignatureSubsetSignatureLinesSigned(3),
  msoSignatureSubsetSignatureLinesUnsigned(4),
  msoSignatureSubsetAll(5);

  public final int value;
  private MsoSignatureSubset(int value) { this.value = value; }
  public static  MsoSignatureSubset valueOf(int value) {
    switch(value) {
    case 0: return msoSignatureSubsetSignaturesAllSigs;
    case 1: return msoSignatureSubsetSignaturesNonVisible;
    case 2: return msoSignatureSubsetSignatureLines;
    case 3: return msoSignatureSubsetSignatureLinesSigned;
    case 4: return msoSignatureSubsetSignatureLinesUnsigned;
    case 5: return msoSignatureSubsetAll;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSignatureSubset.class);
    }
  }
}
