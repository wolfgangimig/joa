/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2CE56CFB-5716-CA8F-2446-694DA59CE693}")
public class IDataAutoWrapperImpl extends Dispatch implements com.wilutions.mslib.msforms.IDataAutoWrapper {
  @DeclDISPID(1610743808)  public void Clear() throws ComException {
    this._dispatchCall(1610743808,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743809)  public Boolean GetFormat(final Object Format) throws ComException {
    assert(Format != null);
    final Object obj = this._dispatchCall(1610743809,"GetFormat", DISPATCH_METHOD,null,Format);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String GetText(final Object Format) throws ComException {
    assert(Format != null);
    final Object obj = this._dispatchCall(1610743810,"GetText", DISPATCH_METHOD,null,Format);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void SetText(final String Text, final Object Format) throws ComException {
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
  @DeclDISPID(1610743814)  public com.wilutions.mslib.msforms.fmDropEffect StartDrag(final Object OKEffect) throws ComException {
    assert(OKEffect != null);
    final Object obj = this._dispatchCall(1610743814,"StartDrag", DISPATCH_METHOD,null,OKEffect);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmDropEffect.valueOf((Integer)obj);
  }
  public IDataAutoWrapperImpl(String progId) throws ComException {
    super(progId, "{EC72F590-F375-11CE-B9E8-00AA006B1A69}");
  }
  protected IDataAutoWrapperImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDataAutoWrapperImpl" + super.toString() + "]";
  }
}
