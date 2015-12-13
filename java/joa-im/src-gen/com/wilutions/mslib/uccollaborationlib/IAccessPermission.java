/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAccessPermission.
 * IAccessPermission Interface 
 */
@CoInterface(guid="{DD181E97-EEE0-4D65-BAD1-16866D0C7953}")
public interface IAccessPermission extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public AccessLevel getAccessLevel() throws ComException;
  @DeclDISPID(1610743809)  public IAccessEntry[] getAccessEntries() throws ComException;
  @DeclDISPID(1610743810)  public Boolean TryGetValue(final AccessEntryScope _scope, final String _entryId, final ByRef<IAccessEntry> _accessEntry) throws ComException;
  @DeclDISPID(1610743811)  public void GetAccessEntry(final AccessEntryScope _scope, final String _entryId, final ByRef<IAccessEntry> _accessEntry) throws ComException;
}
