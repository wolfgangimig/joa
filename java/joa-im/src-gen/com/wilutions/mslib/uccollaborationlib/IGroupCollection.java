/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IGroupCollection.
 * IGroupCollection Interface 
 */
@CoInterface(guid="{0C81EC90-9469-4ED4-ACAD-ADB86E11039C}")
public interface IGroupCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IGroup getItem(final Integer _index) throws ComException;
  @DeclDISPID(1610743811)  public Boolean TryGetGroup(final String _groupName, final ByRef<IGroup> _value) throws ComException;
  @DeclDISPID(1610743812)  public IGroupCollection GetGroupsByType(final GroupType _groupType) throws ComException;
  @DeclDISPID(1610743813)  public Integer IndexOf(final IGroup _group) throws ComException;
}
