/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Items.
 * 
 */
@CoClass(guid="{00063052-0000-0000-C000-000000000046}")
public class Items extends Dispatch implements _Items {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public Dispatch Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(206)  public Boolean getIncludeRecurrences() throws ComException {
    final Object obj = this._dispatchCall(206,"IncludeRecurrences", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(206)  public void setIncludeRecurrences(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(206,"IncludeRecurrences", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(95)  public Dispatch Add(Object Type) throws ComException {
    assert(Type != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Type);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(98)  public Dispatch Find(String Filter) throws ComException {
    assert(Filter != null);
    final Object obj = this._dispatchCall(98,"Find", DISPATCH_METHOD,null,Filter);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(99)  public Dispatch FindNext() throws ComException {
    final Object obj = this._dispatchCall(99,"FindNext", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(86)  public Dispatch GetFirst() throws ComException {
    final Object obj = this._dispatchCall(86,"GetFirst", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(88)  public Dispatch GetLast() throws ComException {
    final Object obj = this._dispatchCall(88,"GetLast", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(87)  public Dispatch GetNext() throws ComException {
    final Object obj = this._dispatchCall(87,"GetNext", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(89)  public Dispatch GetPrevious() throws ComException {
    final Object obj = this._dispatchCall(89,"GetPrevious", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(84)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(84,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(93)  public void ResetColumns() throws ComException {
    this._dispatchCall(93,"ResetColumns", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public _Items Restrict(String Filter) throws ComException {
    assert(Filter != null);
    final Object obj = this._dispatchCall(100,"Restrict", DISPATCH_METHOD,null,Filter);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ItemsImpl.class);
  }
  @DeclDISPID(92)  public void SetColumns(String Columns) throws ComException {
    assert(Columns != null);
    this._dispatchCall(92,"SetColumns", DISPATCH_METHOD,null,Columns);
  }
  @DeclDISPID(97)  public void Sort(String Property, Object Descending) throws ComException {
    assert(Property != null);
    assert(Descending != null);
    this._dispatchCall(97,"Sort", DISPATCH_METHOD,null,Property,Descending);
  }
  public Items() throws ComException {
    super("{00063052-0000-0000-C000-000000000046}");
  }
  protected Items(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Items" + super.toString() + "]";
  }
}
