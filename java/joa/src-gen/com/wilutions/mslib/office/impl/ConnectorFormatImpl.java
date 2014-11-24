/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A78-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ConnectorFormatImpl extends Dispatch implements com.wilutions.mslib.office.ConnectorFormat {
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
  @DeclDISPID(10)  public void BeginConnect(com.wilutions.mslib.office.Shape ConnectedShape, Integer ConnectionSite) throws ComException {
    assert(ConnectionSite != null);
    this._dispatchCall(10,"BeginConnect", DISPATCH_METHOD,null,(ConnectedShape!=null?ConnectedShape:Dispatch.NULL),ConnectionSite);
  }
  @DeclDISPID(11)  public void BeginDisconnect() throws ComException {
    this._dispatchCall(11,"BeginDisconnect", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12)  public void EndConnect(com.wilutions.mslib.office.Shape ConnectedShape, Integer ConnectionSite) throws ComException {
    assert(ConnectionSite != null);
    this._dispatchCall(12,"EndConnect", DISPATCH_METHOD,null,(ConnectedShape!=null?ConnectedShape:Dispatch.NULL),ConnectionSite);
  }
  @DeclDISPID(13)  public void EndDisconnect() throws ComException {
    this._dispatchCall(13,"EndDisconnect", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.MsoTriState getBeginConnected() throws ComException {
    final Object obj = this._dispatchCall(100,"BeginConnected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.Shape getBeginConnectedShape() throws ComException {
    final Object obj = this._dispatchCall(101,"BeginConnectedShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(102)  public Integer getBeginConnectionSite() throws ComException {
    final Object obj = this._dispatchCall(102,"BeginConnectionSite", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoTriState getEndConnected() throws ComException {
    final Object obj = this._dispatchCall(103,"EndConnected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.Shape getEndConnectedShape() throws ComException {
    final Object obj = this._dispatchCall(104,"EndConnectedShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(105)  public Integer getEndConnectionSite() throws ComException {
    final Object obj = this._dispatchCall(105,"EndConnectionSite", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoConnectorType getType() throws ComException {
    final Object obj = this._dispatchCall(106,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoConnectorType.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setType(com.wilutions.mslib.office.MsoConnectorType value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  public ConnectorFormatImpl(String progId) throws ComException {
    super(progId, "{000C0313-0000-0000-C000-000000000046}");
  }
  protected ConnectorFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConnectorFormatImpl" + super.toString() + "]";
  }
}
