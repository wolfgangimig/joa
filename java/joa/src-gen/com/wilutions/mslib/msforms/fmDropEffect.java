/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDropEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{10BB4720-F797-11CE-B9EC-00AA006B1A69}")
public class fmDropEffect {

  // Typed constants
  public final static fmDropEffect fmDropEffectNone = new fmDropEffect(0);
  public final static fmDropEffect fmDropEffectCopy = new fmDropEffect(1);
  public final static fmDropEffect fmDropEffectMove = new fmDropEffect(2);
  public final static fmDropEffect fmDropEffectCopyOrMove = new fmDropEffect(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmDropEffectNone = 0;
  public final static int _fmDropEffectCopy = 1;
  public final static int _fmDropEffectMove = 2;
  public final static int _fmDropEffectCopyOrMove = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmDropEffect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmDropEffect valueOf(int value) {
    switch(value) {
    case 0: return fmDropEffectNone;
    case 1: return fmDropEffectCopy;
    case 2: return fmDropEffectMove;
    case 3: return fmDropEffectCopyOrMove;
    default: return new fmDropEffect(value);
    }
  }
}
