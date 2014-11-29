/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9E7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class NameSpaceEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.NameSpaceEvents {
  @DeclDISPID(61445)  public void onOptionsPagesAdd(com.wilutions.mslib.outlook.PropertyPages Pages, com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    this._dispatchCall(61445,"OptionsPagesAdd", DISPATCH_METHOD,null,(Pages!=null?Pages:Dispatch.NULL),(Folder!=null?Folder:Dispatch.NULL));
  }
  @DeclDISPID(64557)  public void onAutoDiscoverComplete() throws ComException {
    this._dispatchCall(64557,"AutoDiscoverComplete", DISPATCH_METHOD,null);
  }
  public NameSpaceEventsImpl(String progId) throws ComException {
    super(progId, "{0006308C-0000-0000-C000-000000000046}");
  }
  protected NameSpaceEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NameSpaceEventsImpl" + super.toString() + "]";
  }
}
