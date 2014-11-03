/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentProperty.
 * 
 */
@CoInterface(guid="{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperty extends IDispatch {
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(2)  public void Delete() throws ComException;
  @DeclDISPID(3)  public String getName(Integer lcid) throws ComException;
  @DeclDISPID(3)  public void setName(Integer lcid, String pbstrRetVal) throws ComException;
  @DeclDISPID(0)  public Object getValue(Integer lcid) throws ComException;
  @DeclDISPID(0)  public void setValue(Integer lcid, Object pvargRetVal) throws ComException;
  @DeclDISPID(5)  public MsoDocProperties getType(Integer lcid) throws ComException;
  @DeclDISPID(5)  public void setType(Integer lcid, MsoDocProperties ptypeRetVal) throws ComException;
  @DeclDISPID(6)  public Boolean getLinkToContent() throws ComException;
  @DeclDISPID(6)  public void setLinkToContent(Boolean pfLinkRetVal) throws ComException;
  @DeclDISPID(7)  public String getLinkSource() throws ComException;
  @DeclDISPID(7)  public void setLinkSource(String pbstrSourceRetVal) throws ComException;
  @DeclDISPID(1610743820)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743821)  public Integer getCreator() throws ComException;
}
