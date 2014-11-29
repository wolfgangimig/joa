/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureSet.
 * 
 */
@CoInterface(guid="{000C0410-0000-0000-C000-000000000046}")
public interface SignatureSet extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Signature getItem(final Integer iSig) throws ComException;
  @DeclDISPID(1610809349)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809350)  public Signature AddNonVisibleSignature(final Object varSigProv) throws ComException;
  @DeclDISPID(1610809351)  public Boolean getCanAddSignatureLine() throws ComException;
  @DeclDISPID(1610809352)  public Signature AddSignatureLine(final Object varSigProv) throws ComException;
  @DeclDISPID(1610809353)  public MsoSignatureSubset getSubset() throws ComException;
  @DeclDISPID(1610809353)  public void setSubset(final MsoSignatureSubset value) throws ComException;
  @DeclDISPID(1610809355)  public void setShowSignaturesPane(final Boolean value) throws ComException;
}
