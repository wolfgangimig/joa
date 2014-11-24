/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F391A099-47FA-938A-1B91-3F42AFD05DC2}")
public class IWebAppExtensionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IWebAppExtension {
  @DeclDISPID(1610743808)  public String getParameters() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Parameters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IWebAppExtensionImpl(String progId) throws ComException {
    super(progId, "{330639F2-E399-48CB-863F-56A50A27A138}");
  }
  protected IWebAppExtensionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWebAppExtensionImpl" + super.toString() + "]";
  }
}
