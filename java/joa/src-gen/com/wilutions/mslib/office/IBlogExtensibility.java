/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IBlogExtensibility.
 * 
 */
@CoInterface(guid="{000C03C4-0000-0000-C000-000000000046}")
public interface IBlogExtensibility extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void BlogProviderProperties(final ByRef<String> BlogProvider, final ByRef<String> FriendlyName, final ByRef<MsoBlogCategorySupport> CategorySupport, final ByRef<Boolean> Padding) throws ComException;
  @DeclDISPID(2)  public void SetupBlogAccount(final String Account, final Integer ParentWindow, final IDispatch Document, final Boolean NewAccount, final ByRef<Boolean> ShowPictureUI) throws ComException;
  @DeclDISPID(3)  public void GetUserBlogs(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> BlogNames, final ByRef<String[]> BlogIDs, final ByRef<String[]> BlogURLs) throws ComException;
  @DeclDISPID(4)  public void GetRecentPosts(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> PostTitles, final ByRef<String[]> PostDates, final ByRef<String[]> PostIDs) throws ComException;
  @DeclDISPID(5)  public void Open(final String Account, final String PostID, final Integer ParentWindow, final ByRef<String> xHTML, final ByRef<String> Title, final ByRef<String> DatePosted, final ByRef<String[]> Categories) throws ComException;
  @DeclDISPID(6)  public void PublishPost(final String Account, final Integer ParentWindow, final IDispatch Document, final String xHTML, final String Title, final String DateTime, final String[] Categories, final Boolean Draft, final ByRef<String> PostID, final ByRef<String> PublishMessage) throws ComException;
  @DeclDISPID(7)  public void RepublishPost(final String Account, final Integer ParentWindow, final IDispatch Document, final String PostID, final String xHTML, final String Title, final String DateTime, final String[] Categories, final Boolean Draft, final ByRef<String> PublishMessage) throws ComException;
  @DeclDISPID(8)  public void GetCategories(final String Account, final Integer ParentWindow, final IDispatch Document, final ByRef<String[]> Categories) throws ComException;
}
