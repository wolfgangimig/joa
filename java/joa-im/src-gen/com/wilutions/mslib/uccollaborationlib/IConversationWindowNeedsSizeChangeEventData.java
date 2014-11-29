/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindowNeedsSizeChangeEventData.
 * IConversationWindowNeedsSizeChangeEventData Interface 
 */
@CoInterface(guid="{CA62E6F3-3E6D-451B-AEAA-6A1B7AACF8D4}")
public interface IConversationWindowNeedsSizeChangeEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getRecommendedWindowWidth() throws ComException;
  @DeclDISPID(1610743809)  public Integer getRecommendedWindowHeight() throws ComException;
  @DeclDISPID(1610743810)  public Integer getMinimumWindowWidth() throws ComException;
  @DeclDISPID(1610743811)  public Integer getMinimumWindowHeight() throws ComException;
  @DeclDISPID(1610743812)  public Integer getMaximumWindowWidth() throws ComException;
  @DeclDISPID(1610743813)  public Integer getMaximumWindowHeight() throws ComException;
}
