/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityTypes.
 * Enumerates the modality types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityTypes {

  // Typed constants
  public final static ModalityTypes ucModalityNone = new ModalityTypes(0);
  public final static ModalityTypes ucModalityInstantMessage = new ModalityTypes(1);
  public final static ModalityTypes ucModalityAudioVideo = new ModalityTypes(2);
  public final static ModalityTypes ucModalityApplicationSharing = new ModalityTypes(4);
  public final static ModalityTypes ucModalityContentSharing = new ModalityTypes(8);
  public final static ModalityTypes ucModalityAppSharing = new ModalityTypes(16);
  public final static ModalityTypes ucModalityContent = new ModalityTypes(32);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityNone = 0;
  public final static int _ucModalityInstantMessage = 1;
  public final static int _ucModalityAudioVideo = 2;
  public final static int _ucModalityApplicationSharing = 4;
  public final static int _ucModalityContentSharing = 8;
  public final static int _ucModalityAppSharing = 16;
  public final static int _ucModalityContent = 32;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ModalityTypes valueOf(int value) {
    switch(value) {
    case 0: return ucModalityNone;
    case 1: return ucModalityInstantMessage;
    case 2: return ucModalityAudioVideo;
    case 4: return ucModalityApplicationSharing;
    case 8: return ucModalityContentSharing;
    case 16: return ucModalityAppSharing;
    case 32: return ucModalityContent;
    default: return new ModalityTypes(value);
    }
  }
}
