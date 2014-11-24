/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{73A23735-4089-9292-2D95-0D8D33099A29}")
public class IShareableContentImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContent {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ShareableContentType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ShareableContentState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IContact getOwner() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Owner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IParticipant getPresenter() throws ComException {
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
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IShareableContentPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IShareableContentPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IModality getModality() throws ComException {
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
  @DeclDISPID(1610743821)  public void SaveAnnotation(String _fileName, com.wilutions.mslib.uccollaborationlib.ContentSavingFileType _fileType) throws ComException {
    assert(_fileName != null);
    assert(_fileType != null);
    this._dispatchCall(1610743821,"SaveAnnotation", DISPATCH_METHOD,null,_fileName,_fileType.value);
  }
  @DeclDISPID(1610743822)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation DownloadFile(String _localPath, Object _callback, Object _state) throws ComException {
    assert(_localPath != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"DownloadFile", DISPATCH_METHOD,null,_localPath,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ShareableContentAction _action, ByRef<HRESULT> _hrReason) throws ComException {
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
  public IShareableContentImpl(String progId) throws ComException {
    super(progId, "{B335AE5E-E4EA-49D3-B03B-646A96FE66D3}");
  }
  protected IShareableContentImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentImpl" + super.toString() + "]";
  }
}
