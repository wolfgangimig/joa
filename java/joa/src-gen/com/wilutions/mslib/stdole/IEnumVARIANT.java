/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * IEnumVARIANT.
 * 
 */
@CoInterface(guid="{00020404-0000-0000-C000-000000000046}")
public interface IEnumVARIANT extends IDispatch {
  @DeclDISPID(1610678272)  public void Next(Integer celt, Object rgvar, ByRef<Integer> pceltFetched) throws ComException;
  @DeclDISPID(1610678273)  public void Skip(Integer celt) throws ComException;
  @DeclDISPID(1610678274)  public void Reset() throws ComException;
  @DeclDISPID(1610678275)  public void Clone(ByRef<IEnumVARIANT> ppenum) throws ComException;
}
