/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0001.
 * Enumerates the conversation summarizer states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerNoSummarizedState = new __MIDL___MIDL_itf_uc_0001_0046_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalOutgoing = new __MIDL___MIDL_itf_uc_0001_0046_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalRinging = new __MIDL___MIDL_itf_uc_0001_0046_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerRemoteRinging = new __MIDL___MIDL_itf_uc_0001_0046_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalJoining = new __MIDL___MIDL_itf_uc_0001_0046_0001(8);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalTransferring = new __MIDL___MIDL_itf_uc_0001_0046_0001(16);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerRemoteTransferring = new __MIDL___MIDL_itf_uc_0001_0046_0001(32);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerInConversationSip = new __MIDL___MIDL_itf_uc_0001_0046_0001(64);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerInConversationTel = new __MIDL___MIDL_itf_uc_0001_0046_0001(128);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerInConferenceCall = new __MIDL___MIDL_itf_uc_0001_0046_0001(256);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalP2PSipOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(512);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalP2PTelOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(1024);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalConfOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(2048);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerAllRemoteOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(4096);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerRemoteJoining = new __MIDL___MIDL_itf_uc_0001_0046_0001(8192);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerRemoteForwarding = new __MIDL___MIDL_itf_uc_0001_0046_0001(16384);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerEarlyMediaSip = new __MIDL___MIDL_itf_uc_0001_0046_0001(32768);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerEarlyMediaTel = new __MIDL___MIDL_itf_uc_0001_0046_0001(65536);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerPairedCall = new __MIDL___MIDL_itf_uc_0001_0046_0001(131072);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerConnectingToCaller = new __MIDL___MIDL_itf_uc_0001_0046_0001(262144);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerInConversationUSB = new __MIDL___MIDL_itf_uc_0001_0046_0001(524288);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerRemoteP2POnHoldWithoutMusic = new __MIDL___MIDL_itf_uc_0001_0046_0001(1048576);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalScreenSharing = new __MIDL___MIDL_itf_uc_0001_0046_0001(2097152);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalP2POnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(1536);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerLocalOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0001(3584);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerInConversation = new __MIDL___MIDL_itf_uc_0001_0046_0001(98752);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0001 ucConversationSummarizerAllStates = new __MIDL___MIDL_itf_uc_0001_0046_0001(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationSummarizerNoSummarizedState = 0;
  public final static int _ucConversationSummarizerLocalOutgoing = 1;
  public final static int _ucConversationSummarizerLocalRinging = 2;
  public final static int _ucConversationSummarizerRemoteRinging = 4;
  public final static int _ucConversationSummarizerLocalJoining = 8;
  public final static int _ucConversationSummarizerLocalTransferring = 16;
  public final static int _ucConversationSummarizerRemoteTransferring = 32;
  public final static int _ucConversationSummarizerInConversationSip = 64;
  public final static int _ucConversationSummarizerInConversationTel = 128;
  public final static int _ucConversationSummarizerInConferenceCall = 256;
  public final static int _ucConversationSummarizerLocalP2PSipOnHold = 512;
  public final static int _ucConversationSummarizerLocalP2PTelOnHold = 1024;
  public final static int _ucConversationSummarizerLocalConfOnHold = 2048;
  public final static int _ucConversationSummarizerAllRemoteOnHold = 4096;
  public final static int _ucConversationSummarizerRemoteJoining = 8192;
  public final static int _ucConversationSummarizerRemoteForwarding = 16384;
  public final static int _ucConversationSummarizerEarlyMediaSip = 32768;
  public final static int _ucConversationSummarizerEarlyMediaTel = 65536;
  public final static int _ucConversationSummarizerPairedCall = 131072;
  public final static int _ucConversationSummarizerConnectingToCaller = 262144;
  public final static int _ucConversationSummarizerInConversationUSB = 524288;
  public final static int _ucConversationSummarizerRemoteP2POnHoldWithoutMusic = 1048576;
  public final static int _ucConversationSummarizerLocalScreenSharing = 2097152;
  public final static int _ucConversationSummarizerLocalP2POnHold = 1536;
  public final static int _ucConversationSummarizerLocalOnHold = 3584;
  public final static int _ucConversationSummarizerInConversation = 98752;
  public final static int _ucConversationSummarizerAllStates = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationSummarizerNoSummarizedState;
    case 1: return ucConversationSummarizerLocalOutgoing;
    case 2: return ucConversationSummarizerLocalRinging;
    case 4: return ucConversationSummarizerRemoteRinging;
    case 8: return ucConversationSummarizerLocalJoining;
    case 16: return ucConversationSummarizerLocalTransferring;
    case 32: return ucConversationSummarizerRemoteTransferring;
    case 64: return ucConversationSummarizerInConversationSip;
    case 128: return ucConversationSummarizerInConversationTel;
    case 256: return ucConversationSummarizerInConferenceCall;
    case 512: return ucConversationSummarizerLocalP2PSipOnHold;
    case 1024: return ucConversationSummarizerLocalP2PTelOnHold;
    case 2048: return ucConversationSummarizerLocalConfOnHold;
    case 4096: return ucConversationSummarizerAllRemoteOnHold;
    case 8192: return ucConversationSummarizerRemoteJoining;
    case 16384: return ucConversationSummarizerRemoteForwarding;
    case 32768: return ucConversationSummarizerEarlyMediaSip;
    case 65536: return ucConversationSummarizerEarlyMediaTel;
    case 131072: return ucConversationSummarizerPairedCall;
    case 262144: return ucConversationSummarizerConnectingToCaller;
    case 524288: return ucConversationSummarizerInConversationUSB;
    case 1048576: return ucConversationSummarizerRemoteP2POnHoldWithoutMusic;
    case 2097152: return ucConversationSummarizerLocalScreenSharing;
    case 1536: return ucConversationSummarizerLocalP2POnHold;
    case 3584: return ucConversationSummarizerLocalOnHold;
    case 98752: return ucConversationSummarizerInConversation;
    case -1: return ucConversationSummarizerAllStates;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0001(value);
    }
  }
}
