/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A9A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ContactCardImpl extends Dispatch implements com.wilutions.mslib.office.ContactCard {
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
  @DeclDISPID(1)  public void Close() throws ComException {
    this._dispatchCall(1,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void Show(com.wilutions.mslib.office.MsoContactCardStyle CardStyle, Integer RectangleLeft, Integer RectangleRight, Integer RectangleTop, Integer RectangleBottom, Integer HorizontalPosition, Boolean ShowWithDelay) throws ComException {
    assert(CardStyle != null);
    assert(RectangleLeft != null);
    assert(RectangleRight != null);
    assert(RectangleTop != null);
    assert(RectangleBottom != null);
    assert(HorizontalPosition != null);
    assert(ShowWithDelay != null);
    this._dispatchCall(2,"Show", DISPATCH_METHOD,null,CardStyle.value,RectangleLeft,RectangleRight,RectangleTop,RectangleBottom,HorizontalPosition,ShowWithDelay);
  }
  public ContactCardImpl(String progId) throws ComException {
    super(progId, "{000C03F1-0000-0000-C000-000000000046}");
  }
  protected ContactCardImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactCardImpl" + super.toString() + "]";
  }
}
