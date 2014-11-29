/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IDataAutoWrapper.
 * 
 */
@CoInterface(guid="{EC72F590-F375-11CE-B9E8-00AA006B1A69}")
public interface IDataAutoWrapper extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void Clear() throws ComException;
  @DeclDISPID(1610743809)  public Boolean GetFormat(Object Format) throws ComException;
  @DeclDISPID(1610743810)  public String GetText(Object Format) throws ComException;
  @DeclDISPID(1610743811)  public void SetText(String Text, Object Format) throws ComException;
  @DeclDISPID(1610743812)  public void PutInClipboard() throws ComException;
  @DeclDISPID(1610743813)  public void GetFromClipboard() throws ComException;
  @DeclDISPID(1610743814)  public fmDropEffect StartDrag(Object OKEffect) throws ComException;
}
