/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPowerPointContent.
 * IPowerPointContent Interface 
 */
@CoInterface(guid="{AAFE380B-B079-4B55-B81B-A9401D77B776}")
public interface IPowerPointContent extends IDispatch {
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
  @DeclDISPID(1610743821)  public void SaveAnnotation(final String _fileName, final ContentSavingFileType _fileType) throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation DownloadFile(final String _localPath, final Object _callback, final Object _state) throws ComException;
  @DeclDISPID(1610743823)  public Boolean CanInvoke(final ShareableContentAction _action, final ByRef<HRESULT> _hrReason) throws ComException;
  @DeclDISPID(1610743824)  public void TakeOverAsPresenter() throws ComException;
  @DeclDISPID(1610743825)  public void ClearAllAnnotations() throws ComException;
  @DeclDISPID(1610809344)  public void GoForward() throws ComException;
  @DeclDISPID(1610809345)  public void GoBackward() throws ComException;
  @DeclDISPID(1610809346)  public void SyncWithPresenter() throws ComException;
  @DeclDISPID(1610809347)  public Boolean getIsInSyncWithPresenter() throws ComException;
}
