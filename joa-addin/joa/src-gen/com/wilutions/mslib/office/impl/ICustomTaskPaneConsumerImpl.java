/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A55-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ICustomTaskPaneConsumerImpl extends Dispatch implements com.wilutions.mslib.office.ICustomTaskPaneConsumer {
  @DeclDISPID(1)  public void CTPFactoryAvailable(final com.wilutions.mslib.office.ICTPFactory CTPFactoryInst) throws ComException {
    this._dispatchCall(1,"CTPFactoryAvailable", DISPATCH_METHOD,null,Dispatch.param(CTPFactoryInst));
  }
  public ICustomTaskPaneConsumerImpl(String progId) throws ComException {
    super(progId, "{000C033E-0000-0000-C000-000000000046}");
  }
  protected ICustomTaskPaneConsumerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICustomTaskPaneConsumerImpl" + super.toString() + "]";
  }
}
