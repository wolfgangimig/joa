/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDropEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{10BB4720-F797-11CE-B9EC-00AA006B1A69}")
public enum fmDropEffect {
  fmDropEffectNone(0),
  fmDropEffectCopy(1),
  fmDropEffectMove(2),
  fmDropEffectCopyOrMove(3);

  public final int value;
  private fmDropEffect(int value) { this.value = value; }
  public static  fmDropEffect valueOf(int value) {
    switch(value) {
    case 0: return fmDropEffectNone;
    case 1: return fmDropEffectCopy;
    case 2: return fmDropEffectMove;
    case 3: return fmDropEffectCopyOrMove;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmDropEffect.class);
    }
  }
}
