/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Signature.
 * 
 */
@CoInterface(guid="{000C0411-0000-0000-C000-000000000046}")
public interface Signature extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809350)  public void Delete() throws ComException;
  @DeclDISPID(1610809351)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809355)  public Boolean getIsSigned() throws ComException;
  @DeclDISPID(1610809356)  public void Sign(Object varSigImg, Object varDelSuggSigner, Object varDelSuggSignerLine2, Object varDelSuggSignerEmail) throws ComException;
  @DeclDISPID(1610809357)  public SignatureInfo getDetails() throws ComException;
  @DeclDISPID(1610809358)  public void ShowDetails() throws ComException;
  @DeclDISPID(1610809359)  public Boolean getCanSetup() throws ComException;
  @DeclDISPID(1610809360)  public SignatureSetup getSetup() throws ComException;
  @DeclDISPID(1610809361)  public Boolean getIsSignatureLine() throws ComException;
  @DeclDISPID(1610809362)  public IDispatch getSignatureLineShape() throws ComException;
  @DeclDISPID(1610809363)  public Integer getSortHint() throws ComException;
}
