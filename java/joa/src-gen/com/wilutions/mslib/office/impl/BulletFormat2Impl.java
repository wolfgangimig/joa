/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD2-A463-DB41-5DAE-69E7A5F7FCBC}")
public class BulletFormat2Impl extends Dispatch implements com.wilutions.mslib.office.BulletFormat2 {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCharacter() throws ComException {
    final Object obj = this._dispatchCall(2,"Character", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public void setCharacter(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Character", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.Font2 getFont() throws ComException {
    final Object obj = this._dispatchCall(3,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.Font2Impl.class);
  }
  @DeclDISPID(4)  public Integer getNumber() throws ComException {
    final Object obj = this._dispatchCall(4,"Number", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public void Picture(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(5,"Picture", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(6)  public Float getRelativeSize() throws ComException {
    final Object obj = this._dispatchCall(6,"RelativeSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(6)  public void setRelativeSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"RelativeSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public Integer getStartValue() throws ComException {
    final Object obj = this._dispatchCall(7,"StartValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(7)  public void setStartValue(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"StartValue", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.MsoNumberedBulletStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(8,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoNumberedBulletStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(8)  public void setStyle(com.wilutions.mslib.office.MsoNumberedBulletStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(9)  public com.wilutions.mslib.office.MsoBulletType getType() throws ComException {
    final Object obj = this._dispatchCall(9,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBulletType.valueOf((Integer)obj);
  }
  @DeclDISPID(9)  public void setType(com.wilutions.mslib.office.MsoBulletType value) throws ComException {
    assert(value != null);
    this._dispatchCall(9,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.MsoTriState getUseTextColor() throws ComException {
    final Object obj = this._dispatchCall(10,"UseTextColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(10)  public void setUseTextColor(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"UseTextColor", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.MsoTriState getUseTextFont() throws ComException {
    final Object obj = this._dispatchCall(11,"UseTextFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(11)  public void setUseTextFont(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"UseTextFont", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(12,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setVisible(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  public BulletFormat2Impl(String progId) throws ComException {
    super(progId);
  }
  protected BulletFormat2Impl(long ndisp) {
    super(ndisp);
  }
  public BulletFormat2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[BulletFormat2Impl" + super.toString() + "]";
  }
}
