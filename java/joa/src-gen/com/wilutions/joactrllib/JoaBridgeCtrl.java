/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib;
import com.wilutions.com.*;

/**
 * JoaBridgeCtrl.
 * 
 */
@CoClass(guid="{246D42EA-0513-447B-B7E6-86FE0400B3EA}")
public class JoaBridgeCtrl extends Dispatch implements IJoaBridgeCtrl {
  @DeclDISPID(-515)  public LONG_PTR getHWND() throws ComException {
    final Object obj = this._dispatchCall(-515,"HWND", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new LONG_PTR(als);
  }
  public JoaBridgeCtrl() throws ComException {
    super("{246D42EA-0513-447B-B7E6-86FE0400B3EA}");
  }
  protected JoaBridgeCtrl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaBridgeCtrl" + super.toString() + "]";
  }
}
