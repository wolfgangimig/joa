/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRuleType {

  // Typed constants
  public final static OlRuleType olRuleReceive = new OlRuleType(0);
  public final static OlRuleType olRuleSend = new OlRuleType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olRuleReceive = 0;
  public final static int _olRuleSend = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRuleType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRuleType valueOf(int value) {
    switch(value) {
    case 0: return olRuleReceive;
    case 1: return olRuleSend;
    default: return new OlRuleType(value);
    }
  }
}
