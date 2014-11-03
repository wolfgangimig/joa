package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * JoaTestEvents.
 * 
 */
@CoClass(guid="{F28556CB-1929-449E-A904-7521ED711A0E}")
public class JoaTestEvents extends Dispatch {
  public JoaTestEvents() throws ComException {
    super("{F28556CB-1929-449E-A904-7521ED711A0E}");
  }
  protected JoaTestEvents(long ndisp) {
    super(ndisp);
  }
  public JoaTestEvents(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaTestEvents" + super.toString() + "]";
  }
}
