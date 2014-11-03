package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * IJoaTestDispatch1.
 * 
 */
@CoInterface(guid="{E69A774E-FCD4-4CF9-B209-1FD67A61F6A0}")
public interface IJoaTestDispatch1 extends IDispatch {
  @DeclDISPID(1)  public String getName() throws ComException;
  @DeclDISPID(1)  public void setName(String value) throws ComException;
}
