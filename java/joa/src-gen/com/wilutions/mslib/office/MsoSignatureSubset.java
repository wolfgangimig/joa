/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSignatureSubset.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSignatureSubset {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSignatureSubset msoSignatureSubsetSignaturesAllSigs = new MsoSignatureSubset(0);
  public final static MsoSignatureSubset msoSignatureSubsetSignaturesNonVisible = new MsoSignatureSubset(1);
  public final static MsoSignatureSubset msoSignatureSubsetSignatureLines = new MsoSignatureSubset(2);
  public final static MsoSignatureSubset msoSignatureSubsetSignatureLinesSigned = new MsoSignatureSubset(3);
  public final static MsoSignatureSubset msoSignatureSubsetSignatureLinesUnsigned = new MsoSignatureSubset(4);
  public final static MsoSignatureSubset msoSignatureSubsetAll = new MsoSignatureSubset(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoSignatureSubsetSignaturesAllSigs = 0;
  public final static int _msoSignatureSubsetSignaturesNonVisible = 1;
  public final static int _msoSignatureSubsetSignatureLines = 2;
  public final static int _msoSignatureSubsetSignatureLinesSigned = 3;
  public final static int _msoSignatureSubsetSignatureLinesUnsigned = 4;
  public final static int _msoSignatureSubsetAll = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSignatureSubset(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSignatureSubset valueOf(int value) {
    switch(value) {
    case 0: return msoSignatureSubsetSignaturesAllSigs;
    case 1: return msoSignatureSubsetSignaturesNonVisible;
    case 2: return msoSignatureSubsetSignatureLines;
    case 3: return msoSignatureSubsetSignatureLinesSigned;
    case 4: return msoSignatureSubsetSignatureLinesUnsigned;
    case 5: return msoSignatureSubsetAll;
    default: return new MsoSignatureSubset(value);
    }
  }
}
