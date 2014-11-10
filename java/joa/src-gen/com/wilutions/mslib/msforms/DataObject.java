/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * DataObject.
 * 
 */
@CoClass(guid="{1C3B4210-F441-11CE-B9EA-00AA006B1A69}")
public class DataObject extends Dispatch implements IDataAutoWrapper {
  @DeclDISPID(1610743808)  public void Clear() throws ComException {
    this._dispatchCall(1610743808,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743809)  public Boolean GetFormat(Object Format) throws ComException {
    assert(Format != null);
    final Object obj = this._dispatchCall(1610743809,"GetFormat", DISPATCH_METHOD,null,Format);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String GetText(Object Format) throws ComException {
    assert(Format != null);
    final Object obj = this._dispatchCall(1610743810,"GetText", DISPATCH_METHOD,null,Format);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void SetText(String Text, Object Format) throws ComException {
    assert(Text != null);
    assert(Format != null);
    this._dispatchCall(1610743811,"SetText", DISPATCH_METHOD,null,Text,Format);
  }
  @DeclDISPID(1610743812)  public void PutInClipboard() throws ComException {
    this._dispatchCall(1610743812,"PutInClipboard", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public void GetFromClipboard() throws ComException {
    this._dispatchCall(1610743813,"GetFromClipboard", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743814)  public fmDropEffect StartDrag(Object OKEffect) throws ComException {
    assert(OKEffect != null);
    final Object obj = this._dispatchCall(1610743814,"StartDrag", DISPATCH_METHOD,null,OKEffect);
    if (obj == null) return null;
    return fmDropEffect.valueOf((Integer)obj);
  }
  public DataObject() throws ComException {
    super("{1C3B4210-F441-11CE-B9EA-00AA006B1A69}");
  }
  protected DataObject(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DataObject" + super.toString() + "]";
  }
}
