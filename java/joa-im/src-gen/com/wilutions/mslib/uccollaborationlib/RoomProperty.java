/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomProperty.
 * Enumerates the room properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomProperty {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomProperty ucRoomUri = new RoomProperty(983040);
  public final static RoomProperty ucRoomDomainUrl = new RoomProperty(983041);
  public final static RoomProperty ucRoomDescription = new RoomProperty(983042);
  public final static RoomProperty ucRoomTitle = new RoomProperty(983043);
  public final static RoomProperty ucRoomType = new RoomProperty(806289412);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomUri = 983040;
  public final static int _ucRoomDomainUrl = 983041;
  public final static int _ucRoomDescription = 983042;
  public final static int _ucRoomTitle = 983043;
  public final static int _ucRoomType = 806289412;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomProperty valueOf(int value) {
    switch(value) {
    case 983040: return ucRoomUri;
    case 983041: return ucRoomDomainUrl;
    case 983042: return ucRoomDescription;
    case 983043: return ucRoomTitle;
    case 806289412: return ucRoomType;
    default: return new RoomProperty(value);
    }
  }
}
