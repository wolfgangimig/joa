/**
 * Experimental Instant Messaging integration with Outlook.
 * 
 * Current state: Outlook queries the interfaces IUCOfficeIntegration and IMessenger
 * and connects to DMessengerEvents. But it does not call any interface methods.
 * Maybe because IMessengerAdvanced is missing. For this interface, I have found only IDLs
 * in the Microsoft Office Communicator 2007 SDK.
 * 
 * MS documentation about integration: http://msdn.microsoft.com/en-us/library/office/jj900715(v=office.15).aspx
 * 
 * Someone who also tried to develop an IM: https://social.msdn.microsoft.com/Forums/office/en-US/ba3965e0-4f7a-42af-8e17-0d9acd111c82/impresence-integration-between-3rd-party-im-client-and-outlook?forum=outlookdev
 * 
 * 
 */
package imcl;
