/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * UserProperty.
 * 
 */
@CoInterface(guid="{00063042-0000-0000-C000-000000000046}")
public interface UserProperty extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(103)  public String getFormula() throws ComException;
  @DeclDISPID(103)  public void setFormula(String value) throws ComException;
  @DeclDISPID(112)  public String getName() throws ComException;
  @DeclDISPID(109)  public OlUserPropertyType getType() throws ComException;
  @DeclDISPID(104)  public String getValidationFormula() throws ComException;
  @DeclDISPID(104)  public void setValidationFormula(String value) throws ComException;
  @DeclDISPID(105)  public String getValidationText() throws ComException;
  @DeclDISPID(105)  public void setValidationText(String value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(108)  public void Delete() throws ComException;
}
