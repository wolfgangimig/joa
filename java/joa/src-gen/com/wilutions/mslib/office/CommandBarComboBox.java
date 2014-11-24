/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CommandBarComboBox.
 * 
 */
@CoClass(guid="{55F88897-7708-11D1-ACEB-006008961DA5}")
public class CommandBarComboBox extends Dispatch implements _CommandBarComboBox {
  @DeclDISPID(1610809344)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874880)  public Boolean getBeginGroup() throws ComException {
    final Object obj = this._dispatchCall(1610874880,"BeginGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874880)  public void setBeginGroup(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874880,"BeginGroup", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874882)  public Boolean getBuiltIn() throws ComException {
    final Object obj = this._dispatchCall(1610874882,"BuiltIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874883)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(1610874883,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874883)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874883,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874886)  public CommandBarControl Copy(Object Bar, Object Before) throws ComException {
    assert(Bar != null);
    assert(Before != null);
    final Object obj = this._dispatchCall(1610874886,"Copy", DISPATCH_METHOD,null,Bar,Before);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610874887)  public void Delete(Object Temporary) throws ComException {
    assert(Temporary != null);
    this._dispatchCall(1610874887,"Delete", DISPATCH_METHOD,null,Temporary);
  }
  @DeclDISPID(1610874888)  public String getDescriptionText() throws ComException {
    final Object obj = this._dispatchCall(1610874888,"DescriptionText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874888)  public void setDescriptionText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874888,"DescriptionText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874890)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610874890,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874890)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874890,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874892)  public void Execute() throws ComException {
    this._dispatchCall(1610874892,"Execute", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874893)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610874893,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874893)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874893,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874895)  public Integer getHelpContextId() throws ComException {
    final Object obj = this._dispatchCall(1610874895,"HelpContextId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874895)  public void setHelpContextId(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874895,"HelpContextId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874897)  public String getHelpFile() throws ComException {
    final Object obj = this._dispatchCall(1610874897,"HelpFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874897)  public void setHelpFile(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874897,"HelpFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874899)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610874899,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874900)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1610874900,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874902)  public CommandBarControl Move(Object Bar, Object Before) throws ComException {
    assert(Bar != null);
    assert(Before != null);
    final Object obj = this._dispatchCall(1610874902,"Move", DISPATCH_METHOD,null,Bar,Before);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610874903)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610874903,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874904)  public MsoControlOLEUsage getOLEUsage() throws ComException {
    final Object obj = this._dispatchCall(1610874904,"OLEUsage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoControlOLEUsage.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874904)  public void setOLEUsage(MsoControlOLEUsage value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874904,"OLEUsage", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610874906)  public String getOnAction() throws ComException {
    final Object obj = this._dispatchCall(1610874906,"OnAction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874906)  public void setOnAction(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874906,"OnAction", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874908)  public CommandBar getParent() throws ComException {
    final Object obj = this._dispatchCall(1610874908,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  @DeclDISPID(1610874909)  public String getParameter() throws ComException {
    final Object obj = this._dispatchCall(1610874909,"Parameter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874909)  public void setParameter(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874909,"Parameter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874911)  public Integer getPriority() throws ComException {
    final Object obj = this._dispatchCall(1610874911,"Priority", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874911)  public void setPriority(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874911,"Priority", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874913)  public void Reset() throws ComException {
    this._dispatchCall(1610874913,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874914)  public void SetFocus() throws ComException {
    this._dispatchCall(1610874914,"SetFocus", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874915)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(1610874915,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874915)  public void setTag(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874915,"Tag", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874917)  public String getTooltipText() throws ComException {
    final Object obj = this._dispatchCall(1610874917,"TooltipText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874917)  public void setTooltipText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874917,"TooltipText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874919)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610874919,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874920)  public MsoControlType getType() throws ComException {
    final Object obj = this._dispatchCall(1610874920,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoControlType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874921)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(1610874921,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874921)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874921,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874923)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610874923,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874923)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874923,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874925)  public Boolean getIsPriorityDropped() throws ComException {
    final Object obj = this._dispatchCall(1610874925,"IsPriorityDropped", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610940416)  public void AddItem(String Text, Object Index) throws ComException {
    assert(Text != null);
    assert(Index != null);
    this._dispatchCall(1610940416,"AddItem", DISPATCH_METHOD,null,Text,Index);
  }
  @DeclDISPID(1610940417)  public void Clear() throws ComException {
    this._dispatchCall(1610940417,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610940418)  public Integer getDropDownLines() throws ComException {
    final Object obj = this._dispatchCall(1610940418,"DropDownLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940418)  public void setDropDownLines(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940418,"DropDownLines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940420)  public Integer getDropDownWidth() throws ComException {
    final Object obj = this._dispatchCall(1610940420,"DropDownWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940420)  public void setDropDownWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940420,"DropDownWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940422)  public String getList(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(1610940422,"List", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610940422)  public void setList(Integer Index, String value2) throws ComException {
    assert(value2 != null);
    assert(Index != null);
    this._dispatchCall(1610940422,"List", DISPATCH_PROPERTYPUT,value2,Index);
  }
  @DeclDISPID(1610940424)  public Integer getListCount() throws ComException {
    final Object obj = this._dispatchCall(1610940424,"ListCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940425)  public Integer getListHeaderCount() throws ComException {
    final Object obj = this._dispatchCall(1610940425,"ListHeaderCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940425)  public void setListHeaderCount(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940425,"ListHeaderCount", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940427)  public Integer getListIndex() throws ComException {
    final Object obj = this._dispatchCall(1610940427,"ListIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940427)  public void setListIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940427,"ListIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940429)  public void RemoveItem(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(1610940429,"RemoveItem", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(1610940430)  public MsoComboStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(1610940430,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoComboStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(1610940430)  public void setStyle(MsoComboStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940430,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610940432)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610940432,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610940432)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940432,"Text", DISPATCH_PROPERTYPUT,value);
  }
  public CommandBarComboBox() throws ComException {
    super("{55F88897-7708-11D1-ACEB-006008961DA5}", "{000C030C-0000-0000-C000-000000000046}");
  }
  protected CommandBarComboBox(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CommandBarComboBox" + super.toString() + "]";
  }
}
