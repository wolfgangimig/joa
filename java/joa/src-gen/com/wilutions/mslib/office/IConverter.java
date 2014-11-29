/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IConverter.
 * 
 */
@CoInterface(guid="{000C03D7-0000-0000-C000-000000000046}")
public interface IConverter extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void HrInitConverter(IConverterApplicationPreferences pcap, ByRef<IConverterPreferences> ppcp, IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(2)  public void HrUninitConverter(IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(3)  public void HrImport(String bstrSourcePath, String bstrDestPath, IConverterApplicationPreferences pcap, ByRef<IConverterPreferences> ppcp, IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(4)  public void HrExport(String bstrSourcePath, String bstrDestPath, String bstrClass, IConverterApplicationPreferences pcap, ByRef<IConverterPreferences> ppcp, IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(5)  public void HrGetFormat(String bstrPath, ByRef<String> pbstrClass, IConverterApplicationPreferences pcap, ByRef<IConverterPreferences> ppcp, IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(6)  public void HrGetErrorString(Integer hrErr, ByRef<String> pbstrErrorMsg, IConverterApplicationPreferences pcap) throws ComException;
}
