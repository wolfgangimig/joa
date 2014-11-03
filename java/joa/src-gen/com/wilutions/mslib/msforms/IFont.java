/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IFont.
 * 
 */
@CoInterface(guid="{BEF6E002-A874-101A-8BBA-00AA00300CAB}")
public interface IFont extends IDispatch {
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String pname) throws ComException;
  @DeclDISPID(2)  public Long getSize() throws ComException;
  @DeclDISPID(2)  public void setSize(Long psize) throws ComException;
  @DeclDISPID(3)  public Boolean getBold() throws ComException;
  @DeclDISPID(3)  public void setBold(Boolean pbold) throws ComException;
  @DeclDISPID(4)  public Boolean getItalic() throws ComException;
  @DeclDISPID(4)  public void setItalic(Boolean pitalic) throws ComException;
  @DeclDISPID(5)  public Boolean getUnderline() throws ComException;
  @DeclDISPID(5)  public void setUnderline(Boolean punderline) throws ComException;
  @DeclDISPID(6)  public Boolean getStrikethrough() throws ComException;
  @DeclDISPID(6)  public void setStrikethrough(Boolean pstrikethrough) throws ComException;
  @DeclDISPID(7)  public Short getWeight() throws ComException;
  @DeclDISPID(7)  public void setWeight(Short pweight) throws ComException;
  @DeclDISPID(8)  public Short getCharset() throws ComException;
  @DeclDISPID(8)  public void setCharset(Short pcharset) throws ComException;
  @DeclDISPID(1610678288)  public OLE_HANDLE gethFont() throws ComException;
  @DeclDISPID(1610678289)  public void Clone(ByRef<IFont> lplpfont) throws ComException;
  @DeclDISPID(1610678290)  public void IsEqual(IFont lpFontOther) throws ComException;
  @DeclDISPID(1610678291)  public void SetRatio(Integer cyLogical, Integer cyHimetric) throws ComException;
  @DeclDISPID(1610678292)  public void AddRefHfont(OLE_HANDLE hFont) throws ComException;
  @DeclDISPID(1610678293)  public void ReleaseHfont(OLE_HANDLE hFont) throws ComException;
}
