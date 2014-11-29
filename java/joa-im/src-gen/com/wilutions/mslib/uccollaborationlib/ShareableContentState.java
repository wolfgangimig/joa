/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentState.
 * Enumerates the various states an IContent object could be in. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ShareableContentState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ShareableContentState ucShareableContentStateInitializing = new ShareableContentState(0);
  public final static ShareableContentState ucShareableContentStateOffline = new ShareableContentState(1);
  public final static ShareableContentState ucShareableContentStateConnecting = new ShareableContentState(2);
  public final static ShareableContentState ucShareableContentStateOnline = new ShareableContentState(3);
  public final static ShareableContentState ucShareableContentStateDisconnecting = new ShareableContentState(4);
  public final static ShareableContentState ucShareableContentStateActive = new ShareableContentState(5);
  public final static ShareableContentState ucShareableContentStateUnusable = new ShareableContentState(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentStateInitializing = 0;
  public final static int _ucShareableContentStateOffline = 1;
  public final static int _ucShareableContentStateConnecting = 2;
  public final static int _ucShareableContentStateOnline = 3;
  public final static int _ucShareableContentStateDisconnecting = 4;
  public final static int _ucShareableContentStateActive = 5;
  public final static int _ucShareableContentStateUnusable = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ShareableContentState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ShareableContentState valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentStateInitializing;
    case 1: return ucShareableContentStateOffline;
    case 2: return ucShareableContentStateConnecting;
    case 3: return ucShareableContentStateOnline;
    case 4: return ucShareableContentStateDisconnecting;
    case 5: return ucShareableContentStateActive;
    case 6: return ucShareableContentStateUnusable;
    default: return new ShareableContentState(value);
    }
  }
}
