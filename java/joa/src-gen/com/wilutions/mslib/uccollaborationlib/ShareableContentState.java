/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentState.
 * Enumerates the various states an IContent object could be in. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ShareableContentState {
  ucShareableContentStateInitializing(0),
  ucShareableContentStateOffline(1),
  ucShareableContentStateConnecting(2),
  ucShareableContentStateOnline(3),
  ucShareableContentStateDisconnecting(4),
  ucShareableContentStateActive(5),
  ucShareableContentStateUnusable(6);

  public final int value;
  private ShareableContentState(int value) { this.value = value; }
  public static  ShareableContentState valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentStateInitializing;
    case 1: return ucShareableContentStateOffline;
    case 2: return ucShareableContentStateConnecting;
    case 3: return ucShareableContentStateOnline;
    case 4: return ucShareableContentStateDisconnecting;
    case 5: return ucShareableContentStateActive;
    case 6: return ucShareableContentStateUnusable;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ShareableContentState.class);
    }
  }
}
