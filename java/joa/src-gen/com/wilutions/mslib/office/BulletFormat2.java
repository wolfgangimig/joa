/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BulletFormat2.
 * 
 */
@CoInterface(guid="{000C03B9-0000-0000-C000-000000000046}")
public interface BulletFormat2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCharacter() throws ComException;
  @DeclDISPID(2)  public void setCharacter(final Integer value) throws ComException;
  @DeclDISPID(3)  public Font2 getFont() throws ComException;
  @DeclDISPID(4)  public Integer getNumber() throws ComException;
  @DeclDISPID(5)  public void Picture(final String FileName) throws ComException;
  @DeclDISPID(6)  public Float getRelativeSize() throws ComException;
  @DeclDISPID(6)  public void setRelativeSize(final Float value) throws ComException;
  @DeclDISPID(7)  public Integer getStartValue() throws ComException;
  @DeclDISPID(7)  public void setStartValue(final Integer value) throws ComException;
  @DeclDISPID(8)  public MsoNumberedBulletStyle getStyle() throws ComException;
  @DeclDISPID(8)  public void setStyle(final MsoNumberedBulletStyle value) throws ComException;
  @DeclDISPID(9)  public MsoBulletType getType() throws ComException;
  @DeclDISPID(9)  public void setType(final MsoBulletType value) throws ComException;
  @DeclDISPID(10)  public MsoTriState getUseTextColor() throws ComException;
  @DeclDISPID(10)  public void setUseTextColor(final MsoTriState value) throws ComException;
  @DeclDISPID(11)  public MsoTriState getUseTextFont() throws ComException;
  @DeclDISPID(11)  public void setUseTextFont(final MsoTriState value) throws ComException;
  @DeclDISPID(12)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(12)  public void setVisible(final MsoTriState value) throws ComException;
}
