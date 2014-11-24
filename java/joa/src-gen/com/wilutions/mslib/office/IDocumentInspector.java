/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IDocumentInspector.
 * 
 */
@CoInterface(guid="{000CD706-0000-0000-C000-000000000046}")
public interface IDocumentInspector extends IDispatch {
  @DeclDISPID(1610678272)  public void GetInfo(ByRef<String> Name, ByRef<String> Desc) throws ComException;
  @DeclDISPID(1610678273)  public void Inspect(IDispatch Doc, ByRef<MsoDocInspectorStatus> Status, ByRef<String> Result, ByRef<String> Action) throws ComException;
  @DeclDISPID(1610678274)  public void Fix(IDispatch Doc, Integer hwnd, ByRef<MsoDocInspectorStatus> Status, ByRef<String> Result) throws ComException;
}
