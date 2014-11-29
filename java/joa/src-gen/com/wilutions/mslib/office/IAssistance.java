/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IAssistance.
 * 
 */
@CoInterface(guid="{4291224C-DEFE-485B-8E69-6CF8AA85CB76}")
public interface IAssistance extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void ShowHelp(String HelpId, String Scope) throws ComException;
  @DeclDISPID(1610743809)  public void SearchHelp(String Query, String Scope) throws ComException;
  @DeclDISPID(1610743810)  public void SetDefaultContext(String HelpId) throws ComException;
  @DeclDISPID(1610743811)  public void ClearDefaultContext(String HelpId) throws ComException;
}
