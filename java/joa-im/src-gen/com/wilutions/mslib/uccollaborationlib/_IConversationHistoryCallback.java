/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationHistoryCallback.
 * _IConversationHistoryCallback Interface 
 */
@CoInterface(guid="{5FA92EA7-6E6E-4A82-8F0D-107FEAF5A75D}")
public interface _IConversationHistoryCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1091)  public void OnSaveAllHistory(IConversationHistory _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1092)  public void OnRetrievePastHistory(IConversationHistory _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1093)  public void OnRetrievePastHistoryByEntryId(IConversationHistory _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
