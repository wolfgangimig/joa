/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlExchangeConnectionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlExchangeConnectionMode {

  // Typed constants
  public final static OlExchangeConnectionMode olNoExchange = new OlExchangeConnectionMode(0);
  public final static OlExchangeConnectionMode olOffline = new OlExchangeConnectionMode(100);
  public final static OlExchangeConnectionMode olCachedOffline = new OlExchangeConnectionMode(200);
  public final static OlExchangeConnectionMode olDisconnected = new OlExchangeConnectionMode(300);
  public final static OlExchangeConnectionMode olCachedDisconnected = new OlExchangeConnectionMode(400);
  public final static OlExchangeConnectionMode olCachedConnectedHeaders = new OlExchangeConnectionMode(500);
  public final static OlExchangeConnectionMode olCachedConnectedDrizzle = new OlExchangeConnectionMode(600);
  public final static OlExchangeConnectionMode olCachedConnectedFull = new OlExchangeConnectionMode(700);
  public final static OlExchangeConnectionMode olOnline = new OlExchangeConnectionMode(800);

  // Integer constants for bitsets and switch statements
  public final static int _olNoExchange = 0;
  public final static int _olOffline = 100;
  public final static int _olCachedOffline = 200;
  public final static int _olDisconnected = 300;
  public final static int _olCachedDisconnected = 400;
  public final static int _olCachedConnectedHeaders = 500;
  public final static int _olCachedConnectedDrizzle = 600;
  public final static int _olCachedConnectedFull = 700;
  public final static int _olOnline = 800;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlExchangeConnectionMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlExchangeConnectionMode(value);
    }
  }
}
