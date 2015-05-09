/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * DataObject2.
 * 
 */
@CoClass(guid="{646BE917-EFED-46C6-AFC9-CA1FBD3C5100}")
public class DataObject2 extends Dispatch implements IDataAutoWrapper {
  static boolean __typelib__loaded = __TypeLib.load();
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
    final Object obj = this._dispatchCall(1610743810,"GetText", DISPATCH_METHOD,null,Variant.param(Format));
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void SetText(final String Text, final Object Format) throws ComException {
    assert(Text != null);
    assert(Format != null);
    this._dispatchCall(1610743811,"SetText", DISPATCH_METHOD,null,Text,Variant.param(Format));
  }
  @DeclDISPID(1610743812)  public void PutInClipboard() throws ComException {
    this._dispatchCall(1610743812,"PutInClipboard", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public void GetFromClipboard() throws ComException {
    this._dispatchCall(1610743813,"GetFromClipboard", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743814)  public fmDropEffect StartDrag(final Object OKEffect) throws ComException {
    assert(OKEffect != null);
    final Object obj = this._dispatchCall(1610743814,"StartDrag", DISPATCH_METHOD,null,Variant.param(OKEffect));
    if (obj == null) return null;
    return fmDropEffect.valueOf((Integer)obj);
  }
  public DataObject2() throws ComException {
    super("{646BE917-EFED-46C6-AFC9-CA1FBD3C5100}", "{EC72F590-F375-11CE-B9E8-00AA006B1A69}");
  }
  protected DataObject2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DataObject2" + super.toString() + "]";
  }
}
