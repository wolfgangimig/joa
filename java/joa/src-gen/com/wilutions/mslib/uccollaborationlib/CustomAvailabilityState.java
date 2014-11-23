/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CustomAvailabilityState.
 * CustomAvailabilityState Class which is used to get the custom presence availability type, Id 
 * and dispaly string of the custom presence state. This class object can be obtained from using 
 * the method GetPublishableCustomAvailabilityStates in the class Self. 
 */
@CoClass(guid="{859D1502-64E6-4977-A9B3-D131D68C723B}")
public class CustomAvailabilityState extends Dispatch implements ICustomAvailabilityState {
  @DeclDISPID(1610743808)  public ContactAvailability getAvailability() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Availability", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ContactAvailability.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public String getActivity() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Activity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public CustomAvailabilityState() throws ComException {
    super("{859D1502-64E6-4977-A9B3-D131D68C723B}", "{D0984CEF-E323-4574-B07B-5C970C9CAEE0}");
  }
  protected CustomAvailabilityState(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomAvailabilityState" + super.toString() + "]";
  }
}
