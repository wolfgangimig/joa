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
  @DeclDISPID(1)  public void HrInitConverter(final IConverterApplicationPreferences pcap, final ByRef<IConverterPreferences> ppcp, final IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(2)  public void HrUninitConverter(final IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(3)  public void HrImport(final String bstrSourcePath, final String bstrDestPath, final IConverterApplicationPreferences pcap, final ByRef<IConverterPreferences> ppcp, final IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(4)  public void HrExport(final String bstrSourcePath, final String bstrDestPath, final String bstrClass, final IConverterApplicationPreferences pcap, final ByRef<IConverterPreferences> ppcp, final IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(5)  public void HrGetFormat(final String bstrPath, final ByRef<String> pbstrClass, final IConverterApplicationPreferences pcap, final ByRef<IConverterPreferences> ppcp, final IConverterUICallback pcuic) throws ComException;
  @DeclDISPID(6)  public void HrGetErrorString(final Integer hrErr, final ByRef<String> pbstrErrorMsg, final IConverterApplicationPreferences pcap) throws ComException;
}
