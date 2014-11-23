/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVoiceMailCollection.
 * IVoiceMailCollection Interface 
 */
@CoInterface(guid="{F644C610-A146-4A56-8338-A69C45C71CEF}")
public interface IVoiceMailCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IVoiceMail getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
