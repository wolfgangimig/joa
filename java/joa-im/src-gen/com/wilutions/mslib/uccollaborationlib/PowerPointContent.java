/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PowerPointContent.
 * PowerPointContent Class 
 */
@CoClass(guid="{2D1A91B0-A593-4327-A7B2-F7DD01574BF3}")
public class PowerPointContent extends Dispatch implements IPowerPointContent {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ShareableContentType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ShareableContentType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public ShareableContentState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ShareableContentState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public IContact getOwner() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Owner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743812)  public IParticipant getPresenter() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Presenter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743813)  public java.util.Date getCreationTime() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"CreationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743814)  public Boolean getIsActive() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"IsActive", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public IShareableContentPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IShareableContentPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743816)  public IModality getModality() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Modality", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743817)  public void Upload() throws ComException {
    this._dispatchCall(1610743817,"Upload", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743818)  public void Remove() throws ComException {
    this._dispatchCall(1610743818,"Remove", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743819)  public void Present() throws ComException {
    this._dispatchCall(1610743819,"Present", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public void StopPresenting() throws ComException {
    this._dispatchCall(1610743820,"StopPresenting", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743821)  public void SaveAnnotation(final String _fileName, final ContentSavingFileType _fileType) throws ComException {
    assert(_fileName != null);
    assert(_fileType != null);
    this._dispatchCall(1610743821,"SaveAnnotation", DISPATCH_METHOD,null,_fileName,_fileType.value);
  }
  @DeclDISPID(1610743822)  public IAsynchronousOperation DownloadFile(final String _localPath, final Object _callback, final Object _state) throws ComException {
    assert(_localPath != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"DownloadFile", DISPATCH_METHOD,null,_localPath,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public Boolean CanInvoke(final ShareableContentAction _action, final ByRef<HRESULT> _hrReason) throws ComException {
    assert(_action != null);
    assert(_hrReason != null);
    final Object obj = this._dispatchCall(1610743823,"CanInvoke", DISPATCH_METHOD,null,_action.value,_hrReason);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743824)  public void TakeOverAsPresenter() throws ComException {
    this._dispatchCall(1610743824,"TakeOverAsPresenter", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743825)  public void ClearAllAnnotations() throws ComException {
    this._dispatchCall(1610743825,"ClearAllAnnotations", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809344)  public void GoForward() throws ComException {
    this._dispatchCall(1610809344,"GoForward", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809345)  public void GoBackward() throws ComException {
    this._dispatchCall(1610809345,"GoBackward", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809346)  public void SyncWithPresenter() throws ComException {
    this._dispatchCall(1610809346,"SyncWithPresenter", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809347)  public Boolean getIsInSyncWithPresenter() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"IsInSyncWithPresenter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public PowerPointContent() throws ComException {
    super("{2D1A91B0-A593-4327-A7B2-F7DD01574BF3}", "{AAFE380B-B079-4B55-B81B-A9401D77B776}");
  }
  protected PowerPointContent(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PowerPointContent" + super.toString() + "]";
  }
}
