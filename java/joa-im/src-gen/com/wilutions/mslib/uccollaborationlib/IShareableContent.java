/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IShareableContent.
 * IShareableContent serves as the common interface for all types of content 
 */
@CoInterface(guid="{B335AE5E-E4EA-49D3-B03B-646A96FE66D3}")
public interface IShareableContent extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ShareableContentType getType() throws ComException;
  @DeclDISPID(1610743809)  public ShareableContentState getState() throws ComException;
  @DeclDISPID(1610743810)  public String getTitle() throws ComException;
  @DeclDISPID(1610743811)  public IContact getOwner() throws ComException;
  @DeclDISPID(1610743812)  public IParticipant getPresenter() throws ComException;
  @DeclDISPID(1610743813)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(1610743814)  public Boolean getIsActive() throws ComException;
  @DeclDISPID(1610743815)  public IShareableContentPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743816)  public IModality getModality() throws ComException;
  @DeclDISPID(1610743817)  public void Upload() throws ComException;
  @DeclDISPID(1610743818)  public void Remove() throws ComException;
  @DeclDISPID(1610743819)  public void Present() throws ComException;
  @DeclDISPID(1610743820)  public void StopPresenting() throws ComException;
  @DeclDISPID(1610743821)  public void SaveAnnotation(String _fileName, ContentSavingFileType _fileType) throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation DownloadFile(String _localPath, Object _callback, Object _state) throws ComException;
  @DeclDISPID(1610743823)  public Boolean CanInvoke(ShareableContentAction _action, ByRef<HRESULT> _hrReason) throws ComException;
  @DeclDISPID(1610743824)  public void TakeOverAsPresenter() throws ComException;
  @DeclDISPID(1610743825)  public void ClearAllAnnotations() throws ComException;
}
