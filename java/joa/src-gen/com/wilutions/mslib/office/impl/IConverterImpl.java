/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterImpl extends Dispatch implements com.wilutions.mslib.office.IConverter {
  @DeclDISPID(1)  public void HrInitConverter(final com.wilutions.mslib.office.IConverterApplicationPreferences pcap, final ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, final com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(ppcp != null);
    this._dispatchCall(1,"HrInitConverter", DISPATCH_METHOD,null,Dispatch.param(pcap),ppcp,Dispatch.param(pcuic));
  }
  @DeclDISPID(2)  public void HrUninitConverter(final com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    this._dispatchCall(2,"HrUninitConverter", DISPATCH_METHOD,null,Dispatch.param(pcuic));
  }
  @DeclDISPID(3)  public void HrImport(final String bstrSourcePath, final String bstrDestPath, final com.wilutions.mslib.office.IConverterApplicationPreferences pcap, final ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, final com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrSourcePath != null);
    assert(bstrDestPath != null);
    assert(ppcp != null);
    this._dispatchCall(3,"HrImport", DISPATCH_METHOD,null,bstrSourcePath,bstrDestPath,Dispatch.param(pcap),ppcp,Dispatch.param(pcuic));
  }
  @DeclDISPID(4)  public void HrExport(final String bstrSourcePath, final String bstrDestPath, final String bstrClass, final com.wilutions.mslib.office.IConverterApplicationPreferences pcap, final ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, final com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrSourcePath != null);
    assert(bstrDestPath != null);
    assert(bstrClass != null);
    assert(ppcp != null);
    this._dispatchCall(4,"HrExport", DISPATCH_METHOD,null,bstrSourcePath,bstrDestPath,bstrClass,Dispatch.param(pcap),ppcp,Dispatch.param(pcuic));
  }
  @DeclDISPID(5)  public void HrGetFormat(final String bstrPath, final ByRef<String> pbstrClass, final com.wilutions.mslib.office.IConverterApplicationPreferences pcap, final ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, final com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrPath != null);
    assert(pbstrClass != null);
    assert(ppcp != null);
    this._dispatchCall(5,"HrGetFormat", DISPATCH_METHOD,null,bstrPath,pbstrClass,Dispatch.param(pcap),ppcp,Dispatch.param(pcuic));
  }
  @DeclDISPID(6)  public void HrGetErrorString(final Integer hrErr, final ByRef<String> pbstrErrorMsg, final com.wilutions.mslib.office.IConverterApplicationPreferences pcap) throws ComException {
    assert(hrErr != null);
    assert(pbstrErrorMsg != null);
    this._dispatchCall(6,"HrGetErrorString", DISPATCH_METHOD,null,hrErr,pbstrErrorMsg,Dispatch.param(pcap));
  }
  public IConverterImpl(String progId) throws ComException {
    super(progId, "{000C03D7-0000-0000-C000-000000000046}");
  }
  protected IConverterImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConverterImpl" + super.toString() + "]";
  }
}
