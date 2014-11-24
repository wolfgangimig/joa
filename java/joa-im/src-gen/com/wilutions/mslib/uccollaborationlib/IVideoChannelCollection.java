/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoChannelCollection.
 * IVideoChannelCollection Interface 
 */
@CoInterface(guid="{3CD1DB65-D85B-4912-8536-6BD8E19F1738}")
public interface IVideoChannelCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IVideoChannel getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public Integer IndexOf(IVideoChannel _videoChannel) throws ComException;
}
