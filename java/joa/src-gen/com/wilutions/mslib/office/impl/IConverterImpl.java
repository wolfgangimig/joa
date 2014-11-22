/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterImpl extends Dispatch implements com.wilutions.mslib.office.IConverter {
  @DeclDISPID(1)  public void HrInitConverter(com.wilutions.mslib.office.IConverterApplicationPreferences pcap, ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(ppcp != null);
    this._dispatchCall(1,"HrInitConverter", DISPATCH_METHOD,null,(pcap!=null?pcap:Dispatch.NULL),ppcp,(pcuic!=null?pcuic:Dispatch.NULL));
  }
  @DeclDISPID(2)  public void HrUninitConverter(com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    this._dispatchCall(2,"HrUninitConverter", DISPATCH_METHOD,null,(pcuic!=null?pcuic:Dispatch.NULL));
  }
  @DeclDISPID(3)  public void HrImport(String bstrSourcePath, String bstrDestPath, com.wilutions.mslib.office.IConverterApplicationPreferences pcap, ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrSourcePath != null);
    assert(bstrDestPath != null);
    assert(ppcp != null);
    this._dispatchCall(3,"HrImport", DISPATCH_METHOD,null,bstrSourcePath,bstrDestPath,(pcap!=null?pcap:Dispatch.NULL),ppcp,(pcuic!=null?pcuic:Dispatch.NULL));
  }
  @DeclDISPID(4)  public void HrExport(String bstrSourcePath, String bstrDestPath, String bstrClass, com.wilutions.mslib.office.IConverterApplicationPreferences pcap, ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrSourcePath != null);
    assert(bstrDestPath != null);
    assert(bstrClass != null);
    assert(ppcp != null);
    this._dispatchCall(4,"HrExport", DISPATCH_METHOD,null,bstrSourcePath,bstrDestPath,bstrClass,(pcap!=null?pcap:Dispatch.NULL),ppcp,(pcuic!=null?pcuic:Dispatch.NULL));
  }
  @DeclDISPID(5)  public void HrGetFormat(String bstrPath, ByRef<String> pbstrClass, com.wilutions.mslib.office.IConverterApplicationPreferences pcap, ByRef<com.wilutions.mslib.office.IConverterPreferences> ppcp, com.wilutions.mslib.office.IConverterUICallback pcuic) throws ComException {
    assert(bstrPath != null);
    assert(pbstrClass != null);
    assert(ppcp != null);
    this._dispatchCall(5,"HrGetFormat", DISPATCH_METHOD,null,bstrPath,pbstrClass,(pcap!=null?pcap:Dispatch.NULL),ppcp,(pcuic!=null?pcuic:Dispatch.NULL));
  }
  @DeclDISPID(6)  public void HrGetErrorString(Integer hrErr, ByRef<String> pbstrErrorMsg, com.wilutions.mslib.office.IConverterApplicationPreferences pcap) throws ComException {
    assert(hrErr != null);
    assert(pbstrErrorMsg != null);
    this._dispatchCall(6,"HrGetErrorString", DISPATCH_METHOD,null,hrErr,pbstrErrorMsg,(pcap!=null?pcap:Dispatch.NULL));
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
