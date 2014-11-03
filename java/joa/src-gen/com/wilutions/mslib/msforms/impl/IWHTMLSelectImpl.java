/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{95854848-F8A5-CA8E-10C9-694DA54A32E7}")
public class IWHTMLSelectImpl extends Dispatch implements com.wilutions.mslib.msforms.IWHTMLSelect {
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(611)  public void setValues(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(611,"Values", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(611)  public Object getValues() throws ComException {
    final Object obj = this._dispatchCall(611,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(612)  public void setDisplayValues(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(612,"DisplayValues", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(612)  public Object getDisplayValues() throws ComException {
    final Object obj = this._dispatchCall(612,"DisplayValues", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(613)  public void setSelected(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(613,"Selected", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(613)  public String getSelected() throws ComException {
    final Object obj = this._dispatchCall(613,"Selected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(614)  public void setMultiSelect(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(614,"MultiSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(614)  public Boolean getMultiSelect() throws ComException {
    final Object obj = this._dispatchCall(614,"MultiSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(619)  public void setSize(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(619,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(619)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(619,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IWHTMLSelectImpl(String progId) throws ComException {
    super(progId);
  }
  protected IWHTMLSelectImpl(long ndisp) {
    super(ndisp);
  }
  public IWHTMLSelectImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWHTMLSelectImpl" + super.toString() + "]";
  }
}
