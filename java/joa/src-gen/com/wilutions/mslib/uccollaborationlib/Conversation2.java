/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Conversation2.
 * Conversation class describes a conversation. It includes details such as the conversation 
 * participants, modalities, state, etc., and implements actions like merge, park, terminate, 
 * etc. This class handles events defined in the interface IConversationEvents. 
 */
@CoClass(guid="{46B5E644-A89E-4C63-86E5-34666807EE75}")
public class Conversation2 extends Dispatch implements IConversation2 {
  public Conversation2() throws ComException {
    super("{46B5E644-A89E-4C63-86E5-34666807EE75}", "{37C7F935-E215-46D2-82A3-A451840EC733}");
  }
  protected Conversation2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Conversation2" + super.toString() + "]";
  }
}
