/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AAD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SmartArtImpl extends Dispatch implements com.wilutions.mslib.office.SmartArt {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.SmartArtNodes getAllNodes() throws ComException {
    final Object obj = this._dispatchCall(2,"AllNodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SmartArtNodesImpl.class);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.SmartArtNodes getNodes() throws ComException {
    final Object obj = this._dispatchCall(3,"Nodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SmartArtNodesImpl.class);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.SmartArtLayout getLayout() throws ComException {
    final Object obj = this._dispatchCall(4,"Layout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SmartArtLayoutImpl.class);
  }
  @DeclDISPID(4)  public void setLayout(com.wilutions.mslib.office.SmartArtLayout value) throws ComException {
    this._dispatchCall(4,"Layout", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.SmartArtQuickStyle getQuickStyle() throws ComException {
    final Object obj = this._dispatchCall(5,"QuickStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SmartArtQuickStyleImpl.class);
  }
  @DeclDISPID(5)  public void setQuickStyle(com.wilutions.mslib.office.SmartArtQuickStyle value) throws ComException {
    this._dispatchCall(5,"QuickStyle", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.SmartArtColor getColor() throws ComException {
    final Object obj = this._dispatchCall(6,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SmartArtColorImpl.class);
  }
  @DeclDISPID(6)  public void setColor(com.wilutions.mslib.office.SmartArtColor value) throws ComException {
    this._dispatchCall(6,"Color", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(7)  public com.wilutions.mslib.office.MsoTriState getReverse() throws ComException {
    final Object obj = this._dispatchCall(7,"Reverse", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(7)  public void setReverse(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"Reverse", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8)  public void Reset() throws ComException {
    this._dispatchCall(8,"Reset", DISPATCH_METHOD,null);
  }
  public SmartArtImpl(String progId) throws ComException {
    super(progId, "{000C03C6-0000-0000-C000-000000000046}");
  }
  protected SmartArtImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SmartArtImpl" + super.toString() + "]";
  }
}
