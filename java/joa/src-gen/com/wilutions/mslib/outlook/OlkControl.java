/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkControl.
 * 
 */
@CoInterface(guid="{00067366-0000-0000-C000-000000000046}")
public interface OlkControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147356671)  public String getItemProperty() throws ComException;
  @DeclDISPID(-2147356671)  public void setItemProperty(String value) throws ComException;
  @DeclDISPID(-2147356669)  public String getControlProperty() throws ComException;
  @DeclDISPID(-2147356669)  public void setControlProperty(String value) throws ComException;
  @DeclDISPID(-2147356668)  public String getPossibleValues() throws ComException;
  @DeclDISPID(-2147356668)  public void setPossibleValues(String value) throws ComException;
  @DeclDISPID(-2147356670)  public Integer getFormat() throws ComException;
  @DeclDISPID(-2147356670)  public void setFormat(Integer value) throws ComException;
  @DeclDISPID(-2147356655)  public Boolean getEnableAutoLayout() throws ComException;
  @DeclDISPID(-2147356655)  public void setEnableAutoLayout(Boolean value) throws ComException;
  @DeclDISPID(-2147356654)  public Integer getMinimumWidth() throws ComException;
  @DeclDISPID(-2147356654)  public void setMinimumWidth(Integer value) throws ComException;
  @DeclDISPID(-2147356653)  public Integer getMinimumHeight() throws ComException;
  @DeclDISPID(-2147356653)  public void setMinimumHeight(Integer value) throws ComException;
  @DeclDISPID(-2147356652)  public OlHorizontalLayout getHorizontalLayout() throws ComException;
  @DeclDISPID(-2147356652)  public void setHorizontalLayout(OlHorizontalLayout value) throws ComException;
  @DeclDISPID(-2147356651)  public OlVerticalLayout getVerticalLayout() throws ComException;
  @DeclDISPID(-2147356651)  public void setVerticalLayout(OlVerticalLayout value) throws ComException;
}
