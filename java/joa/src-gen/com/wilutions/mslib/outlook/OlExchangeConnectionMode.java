/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlExchangeConnectionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlExchangeConnectionMode {
  olNoExchange(0),
  olOffline(100),
  olCachedOffline(200),
  olDisconnected(300),
  olCachedDisconnected(400),
  olCachedConnectedHeaders(500),
  olCachedConnectedDrizzle(600),
  olCachedConnectedFull(700),
  olOnline(800);

  public final int value;
  private OlExchangeConnectionMode(int value) { this.value = value; }
  public static  OlExchangeConnectionMode valueOf(int value) {
    switch(value) {
    case 0: return olNoExchange;
    case 100: return olOffline;
    case 200: return olCachedOffline;
    case 300: return olDisconnected;
    case 400: return olCachedDisconnected;
    case 500: return olCachedConnectedHeaders;
    case 600: return olCachedConnectedDrizzle;
    case 700: return olCachedConnectedFull;
    case 800: return olOnline;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlExchangeConnectionMode.class);
    }
  }
}
