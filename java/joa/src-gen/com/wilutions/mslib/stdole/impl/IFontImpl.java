/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7E617969-0C17-CB5B-1614-694DA5C7F051}")
public class IFontImpl extends Dispatch implements com.wilutions.mslib.stdole.IFont {
  @DeclDISPID(1610678272)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610678272,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610678272)  public void setName(final String pname) throws ComException {
    assert(pname != null);
    this._dispatchCall(1610678272,"Name", DISPATCH_PROPERTYPUT,pname);
  }
  @DeclDISPID(1610678274)  public Long getSize() throws ComException {
    final Object obj = this._dispatchCall(1610678274,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Long)obj;
  }
  @DeclDISPID(1610678274)  public void setSize(final Long psize) throws ComException {
    assert(psize != null);
    this._dispatchCall(1610678274,"Size", DISPATCH_PROPERTYPUT,psize);
  }
  @DeclDISPID(1610678276)  public Boolean getBold() throws ComException {
    final Object obj = this._dispatchCall(1610678276,"Bold", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610678276)  public void setBold(final Boolean pbold) throws ComException {
    assert(pbold != null);
    this._dispatchCall(1610678276,"Bold", DISPATCH_PROPERTYPUT,pbold);
  }
  @DeclDISPID(1610678278)  public Boolean getItalic() throws ComException {
    final Object obj = this._dispatchCall(1610678278,"Italic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610678278)  public void setItalic(final Boolean pitalic) throws ComException {
    assert(pitalic != null);
    this._dispatchCall(1610678278,"Italic", DISPATCH_PROPERTYPUT,pitalic);
  }
  @DeclDISPID(1610678280)  public Boolean getUnderline() throws ComException {
    final Object obj = this._dispatchCall(1610678280,"Underline", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610678280)  public void setUnderline(final Boolean punderline) throws ComException {
    assert(punderline != null);
    this._dispatchCall(1610678280,"Underline", DISPATCH_PROPERTYPUT,punderline);
  }
  @DeclDISPID(1610678282)  public Boolean getStrikethrough() throws ComException {
    final Object obj = this._dispatchCall(1610678282,"Strikethrough", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610678282)  public void setStrikethrough(final Boolean pstrikethrough) throws ComException {
    assert(pstrikethrough != null);
    this._dispatchCall(1610678282,"Strikethrough", DISPATCH_PROPERTYPUT,pstrikethrough);
  }
  @DeclDISPID(1610678284)  public Short getWeight() throws ComException {
    final Object obj = this._dispatchCall(1610678284,"Weight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(1610678284)  public void setWeight(final Short pweight) throws ComException {
    assert(pweight != null);
    this._dispatchCall(1610678284,"Weight", DISPATCH_PROPERTYPUT,pweight);
  }
  @DeclDISPID(1610678286)  public Short getCharset() throws ComException {
    final Object obj = this._dispatchCall(1610678286,"Charset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(1610678286)  public void setCharset(final Short pcharset) throws ComException {
    assert(pcharset != null);
    this._dispatchCall(1610678286,"Charset", DISPATCH_PROPERTYPUT,pcharset);
  }
  @DeclDISPID(1610678288)  public com.wilutions.mslib.stdole.OLE_HANDLE gethFont() throws ComException {
    final Object obj = this._dispatchCall(1610678288,"hFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_HANDLE(als);
  }
  @DeclDISPID(1610678289)  public void Clone(final ByRef<com.wilutions.mslib.stdole.IFont> ppfont) throws ComException {
    assert(ppfont != null);
    this._dispatchCall(1610678289,"Clone", DISPATCH_METHOD,null,ppfont);
  }
  @DeclDISPID(1610678290)  public void IsEqual(final com.wilutions.mslib.stdole.IFont pfontOther) throws ComException {
    this._dispatchCall(1610678290,"IsEqual", DISPATCH_METHOD,null,(pfontOther!=null?pfontOther:Dispatch.NULL));
  }
  @DeclDISPID(1610678291)  public void SetRatio(final Integer cyLogical, final Integer cyHimetric) throws ComException {
    assert(cyLogical != null);
    assert(cyHimetric != null);
    this._dispatchCall(1610678291,"SetRatio", DISPATCH_METHOD,null,cyLogical,cyHimetric);
  }
  @DeclDISPID(1610678292)  public void AddRefHfont(final com.wilutions.mslib.stdole.OLE_HANDLE hFont) throws ComException {
    assert(hFont != null);
    this._dispatchCall(1610678292,"AddRefHfont", DISPATCH_METHOD,null,hFont.getValue());
  }
  @DeclDISPID(1610678293)  public void ReleaseHfont(final com.wilutions.mslib.stdole.OLE_HANDLE hFont) throws ComException {
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
