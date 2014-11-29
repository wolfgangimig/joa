/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AAF-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IBlogExtensibilityImpl extends Dispatch implements com.wilutions.mslib.office.IBlogExtensibility {
  @DeclDISPID(1)  public void BlogProviderProperties(final ByRef<String> BlogProvider, final ByRef<String> FriendlyName, final ByRef<com.wilutions.mslib.office.MsoBlogCategorySupport> CategorySupport, final ByRef<Boolean> Padding) throws ComException {
    assert(BlogProvider != null);
    assert(FriendlyName != null);
    assert(CategorySupport != null);
    assert(Padding != null);
    this._dispatchCall(1,"BlogProviderProperties", DISPATCH_METHOD,null,BlogProvider,FriendlyName,CategorySupport,Padding);
  }
  @DeclDISPID(2)  public void SetupBlogAccount(final String Account, final Integer ParentWindow, final IDispatch Document, final Boolean NewAccount, final ByRef<Boolean> ShowPictureUI) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(NewAccount != null);
    assert(ShowPictureUI != null);
    this._dispatchCall(2,"SetupBlogAccount", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),NewAccount,ShowPictureUI);
  }
  @DeclDISPID(3)  public void GetUserBlogs(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> BlogNames, final ByRef<String[]> BlogIDs, final ByRef<String[]> BlogURLs) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(BlogNames != null);
    assert(BlogIDs != null);
    assert(BlogURLs != null);
    this._dispatchCall(3,"GetUserBlogs", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),BlogNames,BlogIDs,BlogURLs);
  }
  @DeclDISPID(4)  public void GetRecentPosts(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> PostTitles, final ByRef<String[]> PostDates, final ByRef<String[]> PostIDs) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(PostTitles != null);
    assert(PostDates != null);
    assert(PostIDs != null);
    this._dispatchCall(4,"GetRecentPosts", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),PostTitles,PostDates,PostIDs);
  }
  @DeclDISPID(5)  public void Open(final String Account, final String PostID, final Integer ParentWindow, final ByRef<String> xHTML, final ByRef<String> Title, final ByRef<String> DatePosted, final ByRef<String[]> Categories) throws ComException {
    assert(Account != null);
    assert(PostID != null);
    assert(ParentWindow != null);
    assert(xHTML != null);
    assert(Title != null);
    assert(DatePosted != null);
    assert(Categories != null);
    this._dispatchCall(5,"Open", DISPATCH_METHOD,null,Account,PostID,ParentWindow,xHTML,Title,DatePosted,Categories);
  }
  @DeclDISPID(6)  public void PublishPost(final String Account, final Integer ParentWindow, final IDispatch Document, final String xHTML, final String Title, final String DateTime, final String[] Categories, final Boolean Draft, final ByRef<String> PostID, final ByRef<String> PublishMessage) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(xHTML != null);
    assert(Title != null);
    assert(DateTime != null);
    assert(Categories != null);
    assert(Draft != null);
    assert(PostID != null);
    assert(PublishMessage != null);
    this._dispatchCall(6,"PublishPost", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),xHTML,Title,DateTime,Categories,Draft,PostID,PublishMessage);
  }
  @DeclDISPID(7)  public void RepublishPost(final String Account, final Integer ParentWindow, final IDispatch Document, final String PostID, final String xHTML, final String Title, final String DateTime, final String[] Categories, final Boolean Draft, final ByRef<String> PublishMessage) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(PostID != null);
    assert(xHTML != null);
    assert(Title != null);
    assert(DateTime != null);
    assert(Categories != null);
    assert(Draft != null);
    assert(PublishMessage != null);
    this._dispatchCall(7,"RepublishPost", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),PostID,xHTML,Title,DateTime,Categories,Draft,PublishMessage);
  }
  @DeclDISPID(8)  public void GetCategories(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> Categories) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(Categories != null);
    this._dispatchCall(8,"GetCategories", DISPATCH_METHOD,null,Account,ParentWindow,(Document!=null?Document:Dispatch.NULL),Categories);
  }
  public IBlogExtensibilityImpl(String progId) throws ComException {
    super(progId, "{000C03C4-0000-0000-C000-000000000046}");
  }
  protected IBlogExtensibilityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IBlogExtensibilityImpl" + super.toString() + "]";
  }
}
