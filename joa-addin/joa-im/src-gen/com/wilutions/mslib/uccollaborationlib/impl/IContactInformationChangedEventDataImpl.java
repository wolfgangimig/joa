/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2F7BB17D-550E-9399-0EA8-4F2FB50716AF}")
public class IContactInformationChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactInformationChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ContactInformationType[] getChangedContactInformation() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ChangedContactInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ContactInformationType[])obj;
  }
  public IContactInformationChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{EFEC2816-F16D-48D8-9306-26C810F0EA55}");
  }
  protected IContactInformationChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactInformationChangedEventDataImpl" + super.toString() + "]";
  }
}
