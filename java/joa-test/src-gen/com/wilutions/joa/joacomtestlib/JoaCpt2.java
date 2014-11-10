/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * JoaCpt2.
 * 
 */
@CoClass(guid="{07216BB8-429D-45F3-85EC-826D8A15C5D3}")
public class JoaCpt2 extends Dispatch implements IJoaCpt2 {
  @DeclDISPID(1)  public void TriggerConnpointsInLibFolder() throws ComException {
    this._dispatchCall(1,"TriggerConnpointsInLibFolder", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void TriggerGrrr(String Grrr) throws ComException {
    assert(Grrr != null);
    this._dispatchCall(2,"TriggerGrrr", DISPATCH_METHOD,null,Grrr);
  }
  public JoaCpt2() throws ComException {
    super("{07216BB8-429D-45F3-85EC-826D8A15C5D3}");
  }
  protected JoaCpt2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaCpt2" + super.toString() + "]";
  }
}
