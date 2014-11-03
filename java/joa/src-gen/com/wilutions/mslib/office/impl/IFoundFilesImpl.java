/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A53-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IFoundFilesImpl extends Dispatch implements com.wilutions.mslib.office.IFoundFiles {
  @DeclDISPID(0)  public String getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IFoundFilesImpl(String progId) throws ComException {
    super(progId);
  }
  protected IFoundFilesImpl(long ndisp) {
    super(ndisp);
  }
  public IFoundFilesImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IFoundFilesImpl" + super.toString() + "]";
  }
}
