/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRuleType {
  olRuleReceive(0),
  olRuleSend(1);

  public final int value;
  private OlRuleType(int value) { this.value = value; }
  public static  OlRuleType valueOf(int value) {
    switch(value) {
    case 0: return olRuleReceive;
    case 1: return olRuleSend;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRuleType.class);
    }
  }
}
