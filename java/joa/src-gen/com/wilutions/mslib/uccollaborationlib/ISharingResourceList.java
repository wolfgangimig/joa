/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISharingResourceList.
 * IResourceList Interface 
 */
@CoInterface(guid="{6A7FF112-42CE-4D03-8922-D02AC6C5759F}")
public interface ISharingResourceList extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public ISharingResource getItem(Integer index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public void Add(ISharingResource _resource) throws ComException;
  @DeclDISPID(1610743812)  public void Remove(ISharingResource _resource) throws ComException;
  @DeclDISPID(1610743813)  public Boolean getIsShareable() throws ComException;
}
