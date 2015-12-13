/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CommandBarComboBox.
 * 
 */
@CoInterface(guid="{000C030C-0000-0000-C000-000000000046}")
public interface _CommandBarComboBox extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610809344)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610874880)  public Boolean getBeginGroup() throws ComException;
  @DeclDISPID(1610874880)  public void setBeginGroup(final Boolean value) throws ComException;
  @DeclDISPID(1610874882)  public Boolean getBuiltIn() throws ComException;
  @DeclDISPID(1610874883)  public String getCaption() throws ComException;
  @DeclDISPID(1610874883)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(1610874886)  public CommandBarControl Copy(final Object Bar, final Object Before) throws ComException;
  @DeclDISPID(1610874887)  public void Delete(final Object Temporary) throws ComException;
  @DeclDISPID(1610874888)  public String getDescriptionText() throws ComException;
  @DeclDISPID(1610874888)  public void setDescriptionText(final String value) throws ComException;
  @DeclDISPID(1610874890)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(1610874890)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(1610874892)  public void Execute() throws ComException;
  @DeclDISPID(1610874893)  public Integer getHeight() throws ComException;
  @DeclDISPID(1610874893)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(1610874895)  public Integer getHelpContextId() throws ComException;
  @DeclDISPID(1610874895)  public void setHelpContextId(final Integer value) throws ComException;
  @DeclDISPID(1610874897)  public String getHelpFile() throws ComException;
  @DeclDISPID(1610874897)  public void setHelpFile(final String value) throws ComException;
  @DeclDISPID(1610874899)  public Integer getId() throws ComException;
  @DeclDISPID(1610874900)  public Integer getIndex() throws ComException;
  @DeclDISPID(1610874902)  public CommandBarControl Move(final Object Bar, final Object Before) throws ComException;
  @DeclDISPID(1610874903)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610874904)  public MsoControlOLEUsage getOLEUsage() throws ComException;
  @DeclDISPID(1610874904)  public void setOLEUsage(final MsoControlOLEUsage value) throws ComException;
  @DeclDISPID(1610874906)  public String getOnAction() throws ComException;
  @DeclDISPID(1610874906)  public void setOnAction(final String value) throws ComException;
  @DeclDISPID(1610874908)  public CommandBar getParent() throws ComException;
  @DeclDISPID(1610874909)  public String getParameter() throws ComException;
  @DeclDISPID(1610874909)  public void setParameter(final String value) throws ComException;
  @DeclDISPID(1610874911)  public Integer getPriority() throws ComException;
  @DeclDISPID(1610874911)  public void setPriority(final Integer value) throws ComException;
  @DeclDISPID(1610874913)  public void Reset() throws ComException;
  @DeclDISPID(1610874914)  public void SetFocus() throws ComException;
  @DeclDISPID(1610874915)  public String getTag() throws ComException;
  @DeclDISPID(1610874915)  public void setTag(final String value) throws ComException;
  @DeclDISPID(1610874917)  public String getTooltipText() throws ComException;
  @DeclDISPID(1610874917)  public void setTooltipText(final String value) throws ComException;
  @DeclDISPID(1610874919)  public Integer getTop() throws ComException;
  @DeclDISPID(1610874920)  public MsoControlType getType() throws ComException;
  @DeclDISPID(1610874921)  public Boolean getVisible() throws ComException;
  @DeclDISPID(1610874921)  public void setVisible(final Boolean value) throws ComException;
  @DeclDISPID(1610874923)  public Integer getWidth() throws ComException;
  @DeclDISPID(1610874923)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(1610874925)  public Boolean getIsPriorityDropped() throws ComException;
  @DeclDISPID(1610940416)  public void AddItem(final String Text, final Object Index) throws ComException;
  @DeclDISPID(1610940417)  public void Clear() throws ComException;
  @DeclDISPID(1610940418)  public Integer getDropDownLines() throws ComException;
  @DeclDISPID(1610940418)  public void setDropDownLines(final Integer value) throws ComException;
  @DeclDISPID(1610940420)  public Integer getDropDownWidth() throws ComException;
  @DeclDISPID(1610940420)  public void setDropDownWidth(final Integer value) throws ComException;
  @DeclDISPID(1610940422)  public String getList(final Integer Index) throws ComException;
  @DeclDISPID(1610940422)  public void setList(final Integer Index, final String value2) throws ComException;
  @DeclDISPID(1610940424)  public Integer getListCount() throws ComException;
  @DeclDISPID(1610940425)  public Integer getListHeaderCount() throws ComException;
  @DeclDISPID(1610940425)  public void setListHeaderCount(final Integer value) throws ComException;
  @DeclDISPID(1610940427)  public Integer getListIndex() throws ComException;
  @DeclDISPID(1610940427)  public void setListIndex(final Integer value) throws ComException;
  @DeclDISPID(1610940429)  public void RemoveItem(final Integer Index) throws ComException;
  @DeclDISPID(1610940430)  public MsoComboStyle getStyle() throws ComException;
  @DeclDISPID(1610940430)  public void setStyle(final MsoComboStyle value) throws ComException;
  @DeclDISPID(1610940432)  public String getText() throws ComException;
  @DeclDISPID(1610940432)  public void setText(final String value) throws ComException;
}
