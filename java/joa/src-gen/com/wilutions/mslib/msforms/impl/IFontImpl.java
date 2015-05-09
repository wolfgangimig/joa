/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7E617969-0C17-CB5B-1614-694DA5C7F051}")
public class IFontImpl extends Dispatch implements com.wilutions.mslib.msforms.IFont {
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setName(final String pname) throws ComException {
    assert(pname != null);
    this._dispatchCall(0,"Name", DISPATCH_PROPERTYPUT,pname);
  }
  @DeclDISPID(2)  public Long getSize() throws ComException {
    final Object obj = this._dispatchCall(2,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Long)obj;
  }
  @DeclDISPID(2)  public void setSize(final Long psize) throws ComException {
    assert(psize != null);
    this._dispatchCall(2,"Size", DISPATCH_PROPERTYPUT,psize);
  }
  @DeclDISPID(3)  public Boolean getBold() throws ComException {
    final Object obj = this._dispatchCall(3,"Bold", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3)  public void setBold(final Boolean pbold) throws ComException {
    assert(pbold != null);
    this._dispatchCall(3,"Bold", DISPATCH_PROPERTYPUT,pbold);
  }
  @DeclDISPID(4)  public Boolean getItalic() throws ComException {
    final Object obj = this._dispatchCall(4,"Italic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(4)  public void setItalic(final Boolean pitalic) throws ComException {
    assert(pitalic != null);
    this._dispatchCall(4,"Italic", DISPATCH_PROPERTYPUT,pitalic);
  }
  @DeclDISPID(5)  public Boolean getUnderline() throws ComException {
    final Object obj = this._dispatchCall(5,"Underline", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(5)  public void setUnderline(final Boolean punderline) throws ComException {
    assert(punderline != null);
    this._dispatchCall(5,"Underline", DISPATCH_PROPERTYPUT,punderline);
  }
  @DeclDISPID(6)  public Boolean getStrikethrough() throws ComException {
    final Object obj = this._dispatchCall(6,"Strikethrough", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(6)  public void setStrikethrough(final Boolean pstrikethrough) throws ComException {
    assert(pstrikethrough != null);
    this._dispatchCall(6,"Strikethrough", DISPATCH_PROPERTYPUT,pstrikethrough);
  }
  @DeclDISPID(7)  public Short getWeight() throws ComException {
    final Object obj = this._dispatchCall(7,"Weight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(7)  public void setWeight(final Short pweight) throws ComException {
    assert(pweight != null);
    this._dispatchCall(7,"Weight", DISPATCH_PROPERTYPUT,pweight);
  }
  @DeclDISPID(8)  public Short getCharset() throws ComException {
    final Object obj = this._dispatchCall(8,"Charset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(8)  public void setCharset(final Short pcharset) throws ComException {
    assert(pcharset != null);
    this._dispatchCall(8,"Charset", DISPATCH_PROPERTYPUT,pcharset);
  }
  @DeclDISPID(1610678288)  public com.wilutions.mslib.msforms.OLE_HANDLE gethFont() throws ComException {
    final Object obj = this._dispatchCall(1610678288,"hFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.msforms.OLE_HANDLE(als);
  }
  @DeclDISPID(1610678289)  public void Clone(final ByRef<com.wilutions.mslib.msforms.IFont> lplpfont) throws ComException {
    assert(lplpfont != null);
    this._dispatchCall(1610678289,"Clone", DISPATCH_METHOD,null,lplpfont);
  }
  @DeclDISPID(1610678290)  public void IsEqual(final com.wilutions.mslib.msforms.IFont lpFontOther) throws ComException {
    this._dispatchCall(1610678290,"IsEqual", DISPATCH_METHOD,null,Dispatch.param(lpFontOther));
  }
  @DeclDISPID(1610678291)  public void SetRatio(final Integer cyLogical, final Integer cyHimetric) throws ComException {
    assert(cyLogical != null);
    assert(cyHimetric != null);
    this._dispatchCall(1610678291,"SetRatio", DISPATCH_METHOD,null,cyLogical,cyHimetric);
  }
  @DeclDISPID(1610678292)  public void AddRefHfont(final com.wilutions.mslib.msforms.OLE_HANDLE hFont) throws ComException {
    assert(hFont != null);
    this._dispatchCall(1610678292,"AddRefHfont", DISPATCH_METHOD,null,hFont.getValue());
  }
  @DeclDISPID(1610678293)  public void ReleaseHfont(final com.wilutions.mslib.msforms.OLE_HANDLE hFont) throws ComException {
    assert(hFont != null);
    this._dispatchCall(1610678293,"ReleaseHfont", DISPATCH_METHOD,null,hFont.getValue());
  }
  public IFontImpl(String progId) throws ComException {
    super(progId, "{BEF6E002-A874-101A-8BBA-00AA00300CAB}");
  }
  protected IFontImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IFontImpl" + super.toString() + "]";
  }
}
