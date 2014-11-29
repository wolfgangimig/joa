/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentProperty.
 * 
 */
@CoInterface(guid="{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperty extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public void Delete() throws ComException;
  @DeclDISPID(3)  public String getName(final Integer lcid) throws ComException;
  @DeclDISPID(3)  public void setName(final Integer lcid, final String pbstrRetVal) throws ComException;
  @DeclDISPID(0)  public Object getValue(final Integer lcid) throws ComException;
  @DeclDISPID(0)  public void setValue(final Integer lcid, final Object pvargRetVal) throws ComException;
  @DeclDISPID(5)  public MsoDocProperties getType(final Integer lcid) throws ComException;
  @DeclDISPID(5)  public void setType(final Integer lcid, final MsoDocProperties ptypeRetVal) throws ComException;
  @DeclDISPID(6)  public Boolean getLinkToContent() throws ComException;
  @DeclDISPID(6)  public void setLinkToContent(final Boolean pfLinkRetVal) throws ComException;
  @DeclDISPID(7)  public String getLinkSource() throws ComException;
  @DeclDISPID(7)  public void setLinkSource(final String pbstrSourceRetVal) throws ComException;
  @DeclDISPID(1610743820)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743821)  public Integer getCreator() throws ComException;
}
