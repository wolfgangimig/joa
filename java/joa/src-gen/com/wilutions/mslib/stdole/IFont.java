/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * IFont.
 * Font Object 
 */
@CoInterface(guid="{BEF6E002-A874-101A-8BBA-00AA00300CAB}")
public interface IFont extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610678272)  public String getName() throws ComException;
  @DeclDISPID(1610678272)  public void setName(final String pname) throws ComException;
  @DeclDISPID(1610678274)  public Long getSize() throws ComException;
  @DeclDISPID(1610678274)  public void setSize(final Long psize) throws ComException;
  @DeclDISPID(1610678276)  public Boolean getBold() throws ComException;
  @DeclDISPID(1610678276)  public void setBold(final Boolean pbold) throws ComException;
  @DeclDISPID(1610678278)  public Boolean getItalic() throws ComException;
  @DeclDISPID(1610678278)  public void setItalic(final Boolean pitalic) throws ComException;
  @DeclDISPID(1610678280)  public Boolean getUnderline() throws ComException;
  @DeclDISPID(1610678280)  public void setUnderline(final Boolean punderline) throws ComException;
  @DeclDISPID(1610678282)  public Boolean getStrikethrough() throws ComException;
  @DeclDISPID(1610678282)  public void setStrikethrough(final Boolean pstrikethrough) throws ComException;
  @DeclDISPID(1610678284)  public Short getWeight() throws ComException;
  @DeclDISPID(1610678284)  public void setWeight(final Short pweight) throws ComException;
  @DeclDISPID(1610678286)  public Short getCharset() throws ComException;
  @DeclDISPID(1610678286)  public void setCharset(final Short pcharset) throws ComException;
  @DeclDISPID(1610678288)  public OLE_HANDLE gethFont() throws ComException;
  @DeclDISPID(1610678289)  public void Clone(final ByRef<IFont> ppfont) throws ComException;
  @DeclDISPID(1610678290)  public void IsEqual(final IFont pfontOther) throws ComException;
  @DeclDISPID(1610678291)  public void SetRatio(final Integer cyLogical, final Integer cyHimetric) throws ComException;
  @DeclDISPID(1610678292)  public void AddRefHfont(final OLE_HANDLE hFont) throws ComException;
  @DeclDISPID(1610678293)  public void ReleaseHfont(final OLE_HANDLE hFont) throws ComException;
}
