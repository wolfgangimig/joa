/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IDocumentInspector.
 * 
 */
@CoInterface(guid="{000CD706-0000-0000-C000-000000000046}")
public interface IDocumentInspector extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610678272)  public void GetInfo(final ByRef<String> Name, final ByRef<String> Desc) throws ComException;
  @DeclDISPID(1610678273)  public void Inspect(final IDispatch Doc, final ByRef<MsoDocInspectorStatus> Status, final ByRef<String> Result, final ByRef<String> Action) throws ComException;
  @DeclDISPID(1610678274)  public void Fix(final IDispatch Doc, final Integer hwnd, final ByRef<MsoDocInspectorStatus> Status, final ByRef<String> Result) throws ComException;
}
