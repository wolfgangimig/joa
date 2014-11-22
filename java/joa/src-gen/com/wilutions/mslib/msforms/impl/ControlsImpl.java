/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C4CE16AC-220F-CA8E-36D2-694DA5377335}")
public class ControlsImpl extends Dispatch implements com.wilutions.mslib.msforms.Controls {
  @DeclDISPID(60)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(60,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public Dispatch Item(Object varg) throws ComException {
    assert(varg != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,varg);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(62)  public void Clear() throws ComException {
    this._dispatchCall(62,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public void _Move(Integer cx, Integer cy) throws ComException {
    assert(cx != null);
    assert(cy != null);
    this._dispatchCall(1610743812,"_Move", DISPATCH_METHOD,null,cx,cy);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.msforms.Control _AddByClass(Integer clsid) throws ComException {
    assert(clsid != null);
    final Object obj = this._dispatchCall(1610743814,"_AddByClass", DISPATCH_METHOD,null,clsid);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(1610743820)  public Object Enum() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Enum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.msforms.Control _GetItemByIndex(Integer lIndex) throws ComException {
    assert(lIndex != null);
    final Object obj = this._dispatchCall(1610743821,"_GetItemByIndex", DISPATCH_METHOD,null,lIndex);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(1610743822)  public com.wilutions.mslib.msforms.Control _GetItemByName(String pstr) throws ComException {
    assert(pstr != null);
    final Object obj = this._dispatchCall(1610743822,"_GetItemByName", DISPATCH_METHOD,null,pstr);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.msforms.Control _GetItemByID(Integer ID) throws ComException {
    assert(ID != null);
    final Object obj = this._dispatchCall(1610743823,"_GetItemByID", DISPATCH_METHOD,null,ID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(1610743824)  public void SendBackward() throws ComException {
    this._dispatchCall(1610743824,"SendBackward", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743825)  public void SendToBack() throws ComException {
    this._dispatchCall(1610743825,"SendToBack", DISPATCH_METHOD,null);
  }
  @DeclDISPID(63)  public void Move(Float cx, Float cy) throws ComException {
    assert(cx != null);
    assert(cy != null);
    this._dispatchCall(63,"Move", DISPATCH_METHOD,null,cx,cy);
  }
  @DeclDISPID(66)  public com.wilutions.mslib.msforms.Control Add(String bstrProgID, Object Name, Object Visible) throws ComException {
    assert(bstrProgID != null);
    assert(Name != null);
    assert(Visible != null);
    final Object obj = this._dispatchCall(66,"Add", DISPATCH_METHOD,null,bstrProgID,Name,Visible);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(67)  public void Remove(Object varg) throws ComException {
    assert(varg != null);
    this._dispatchCall(67,"Remove", DISPATCH_METHOD,null,varg);
  }
  public ControlsImpl(String progId) throws ComException {
    super(progId, "{04598FC7-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected ControlsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ControlsImpl" + super.toString() + "]";
  }
}
