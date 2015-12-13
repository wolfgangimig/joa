/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AB9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PictureEffectsImpl extends Dispatch implements com.wilutions.mslib.office.PictureEffects {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.PictureEffect getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PictureEffectImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.PictureEffect Insert(final com.wilutions.mslib.office.MsoPictureEffectType EffectType, final Integer Position) throws ComException {
    assert(EffectType != null);
    assert(Position != null);
    final Object obj = this._dispatchCall(2,"Insert", DISPATCH_METHOD,null,EffectType.value,Position);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PictureEffectImpl.class);
  }
  @DeclDISPID(3)  public void Delete(final Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(3,"Delete", DISPATCH_METHOD,null,Index);
  }
  public PictureEffectsImpl(String progId) throws ComException {
    super(progId, "{000C03D2-0000-0000-C000-000000000046}");
  }
  protected PictureEffectsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PictureEffectsImpl" + super.toString() + "]";
  }
}
