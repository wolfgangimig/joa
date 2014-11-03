package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * IJoaTestDispatch2.
 * 
 */
@CoInterface(guid="{4F50F05B-A119-4DDE-AC93-CECEC3ADFB76}")
public interface IJoaTestDispatch2 extends IDispatch {
  @DeclDISPID(1)  public void Name() throws ComException;
}
