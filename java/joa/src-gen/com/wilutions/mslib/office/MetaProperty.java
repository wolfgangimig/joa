/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MetaProperty.
 * 
 */
@CoInterface(guid="{000C038F-0000-0000-C000-000000000046}")
public interface MetaProperty extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(1)  public String getName() throws ComException;
  @DeclDISPID(2)  public String getId() throws ComException;
  @DeclDISPID(3)  public Boolean getIsReadOnly() throws ComException;
  @DeclDISPID(4)  public Boolean getIsRequired() throws ComException;
  @DeclDISPID(5)  public MsoMetaPropertyType getType() throws ComException;
  @DeclDISPID(6)  public String Validate() throws ComException;
  @DeclDISPID(8)  public Dispatch getParent() throws ComException;
}
