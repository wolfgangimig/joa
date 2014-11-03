/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IBlogExtensibility.
 * 
 */
@CoInterface(guid="{000C03C4-0000-0000-C000-000000000046}")
public interface IBlogExtensibility extends IDispatch {
  @DeclDISPID(1)  public void BlogProviderProperties(ByRef<String> BlogProvider, ByRef<String> FriendlyName, ByRef<MsoBlogCategorySupport> CategorySupport, ByRef<Boolean> Padding) throws ComException;
  @DeclDISPID(2)  public void SetupBlogAccount(String Account, Integer ParentWindow, Dispatch Document, Boolean NewAccount, ByRef<Boolean> ShowPictureUI) throws ComException;
  @DeclDISPID(3)  public void GetUserBlogs(String Account, Integer ParentWindow, Dispatch Document, ByRef<String[]> BlogNames, ByRef<String[]> BlogIDs, ByRef<String[]> BlogURLs) throws ComException;
  @DeclDISPID(4)  public void GetRecentPosts(String Account, Integer ParentWindow, Dispatch Document, ByRef<String[]> PostTitles, ByRef<String[]> PostDates, ByRef<String[]> PostIDs) throws ComException;
  @DeclDISPID(5)  public void Open(String Account, String PostID, Integer ParentWindow, ByRef<String> xHTML, ByRef<String> Title, ByRef<String> DatePosted, ByRef<String[]> Categories) throws ComException;
  @DeclDISPID(6)  public void PublishPost(String Account, Integer ParentWindow, Dispatch Document, String xHTML, String Title, String DateTime, String[] Categories, Boolean Draft, ByRef<String> PostID, ByRef<String> PublishMessage) throws ComException;
  @DeclDISPID(7)  public void RepublishPost(String Account, Integer ParentWindow, Dispatch Document, String PostID, String xHTML, String Title, String DateTime, String[] Categories, Boolean Draft, ByRef<String> PublishMessage) throws ComException;
  @DeclDISPID(8)  public void GetCategories(String Account, Integer ParentWindow, Dispatch Document, ByRef<String[]> Categories) throws ComException;
}
