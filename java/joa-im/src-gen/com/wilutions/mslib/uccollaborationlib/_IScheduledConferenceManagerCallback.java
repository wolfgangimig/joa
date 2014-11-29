/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IScheduledConferenceManagerCallback.
 * _IScheduledConferenceManagerCallback Interface 
 */
@CoInterface(guid="{219DC126-9A48-483F-80C2-3F22B3B47829}")
public interface _IScheduledConferenceManagerCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5130)  public void OnGetScheduledConferenceItems(final IScheduledConferenceManager _source, final IScheduledConferenceCollection _items, final IAsynchronousOperation _asyncOperation) throws ComException;
}
