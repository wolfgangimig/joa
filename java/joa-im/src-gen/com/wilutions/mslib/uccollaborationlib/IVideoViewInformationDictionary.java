/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoViewInformationDictionary.
 * IVideoViewInformationDictionary Interface 
 */
@CoInterface(guid="{B00F2520-029C-47D0-B4E8-8FBEF47CAA7E}")
public interface IVideoViewInformationDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(VideoViewInformationType _key) throws ComException;
  @DeclDISPID(1610743810)  public VideoViewInformationType[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(VideoViewInformationType _key, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public VideoViewInformationType GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(VideoViewInformationType _key) throws ComException;
}
