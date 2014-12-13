/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleExecuteOption.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRuleExecuteOption implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlRuleExecuteOption olRuleExecuteAllMessages = new OlRuleExecuteOption(0);
  public final static OlRuleExecuteOption olRuleExecuteReadMessages = new OlRuleExecuteOption(1);
  public final static OlRuleExecuteOption olRuleExecuteUnreadMessages = new OlRuleExecuteOption(2);

  // Integer constants for bitsets and switch statements
  public final static int _olRuleExecuteAllMessages = 0;
  public final static int _olRuleExecuteReadMessages = 1;
  public final static int _olRuleExecuteUnreadMessages = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRuleExecuteOption(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRuleExecuteOption valueOf(int value) {
    switch(value) {
    case 0: return olRuleExecuteAllMessages;
    case 1: return olRuleExecuteReadMessages;
    case 2: return olRuleExecuteUnreadMessages;
    default: return new OlRuleExecuteOption(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olRuleExecuteAllMessages";
    case 1: return "olRuleExecuteReadMessages";
    case 2: return "olRuleExecuteUnreadMessages";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olRuleExecuteAllMessages");
      if ((value & 1) != 0) sbuf.append("|olRuleExecuteReadMessages");
      if ((value & 2) != 0) sbuf.append("|olRuleExecuteUnreadMessages");
      return sbuf.toString();
      }
    }
  }
}
