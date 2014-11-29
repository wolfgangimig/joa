/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib;
import com.wilutions.com.*;

/**
 * JoaUtilAddin.
 * 
 */
@CoClass(guid="{7B57EC55-0A9C-4AB0-A2CC-AF81C680CFAC}")
public class JoaUtilAddin extends Dispatch implements IJoaUtilAddin {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public IJoaBridgeDialog CreateBridgeDialog() throws ComException {
    final Object obj = this._dispatchCall(1,"CreateBridgeDialog", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.joactrllib.impl.IJoaBridgeDialogImpl.class);
  }
  public JoaUtilAddin() throws ComException {
    super("{7B57EC55-0A9C-4AB0-A2CC-AF81C680CFAC}", "{403444E9-2793-4450-AB21-0C1DB4754F3F}");
  }
  protected JoaUtilAddin(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaUtilAddin" + super.toString() + "]";
  }
}
