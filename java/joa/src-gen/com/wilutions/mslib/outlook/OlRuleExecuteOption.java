/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleExecuteOption.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRuleExecuteOption {
  olRuleExecuteAllMessages(0),
  olRuleExecuteReadMessages(1),
  olRuleExecuteUnreadMessages(2);

  public final int value;
  private OlRuleExecuteOption(int value) { this.value = value; }
  public static  OlRuleExecuteOption valueOf(int value) {
    switch(value) {
    case 0: return olRuleExecuteAllMessages;
    case 1: return olRuleExecuteReadMessages;
    case 2: return olRuleExecuteUnreadMessages;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRuleExecuteOption.class);
    }
  }
}
