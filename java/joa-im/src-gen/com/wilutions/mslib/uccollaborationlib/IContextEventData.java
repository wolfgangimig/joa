/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContextEventData.
 * IContextEventData Interface 
 */
@CoInterface(guid="{21629AB6-9557-4985-9237-49177F618692}")
public interface IContextEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getApplicationId() throws ComException;
  @DeclDISPID(1610743809)  public String getContextDataType() throws ComException;
  @DeclDISPID(1610743810)  public String getContextData() throws ComException;
}
