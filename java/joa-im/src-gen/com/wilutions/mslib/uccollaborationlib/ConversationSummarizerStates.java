/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationSummarizerStates.
 * Enumerates the conversation summarizer states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationSummarizerStates {

  // Typed constants
  public final static ConversationSummarizerStates ucConversationSummarizerNoSummarizedState = new ConversationSummarizerStates(0);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalOutgoing = new ConversationSummarizerStates(1);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalRinging = new ConversationSummarizerStates(2);
  public final static ConversationSummarizerStates ucConversationSummarizerRemoteRinging = new ConversationSummarizerStates(4);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalJoining = new ConversationSummarizerStates(8);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalTransferring = new ConversationSummarizerStates(16);
  public final static ConversationSummarizerStates ucConversationSummarizerRemoteTransferring = new ConversationSummarizerStates(32);
  public final static ConversationSummarizerStates ucConversationSummarizerInConversationSip = new ConversationSummarizerStates(64);
  public final static ConversationSummarizerStates ucConversationSummarizerInConversationTel = new ConversationSummarizerStates(128);
  public final static ConversationSummarizerStates ucConversationSummarizerInConferenceCall = new ConversationSummarizerStates(256);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalP2PSipOnHold = new ConversationSummarizerStates(512);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalP2PTelOnHold = new ConversationSummarizerStates(1024);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalConfOnHold = new ConversationSummarizerStates(2048);
  public final static ConversationSummarizerStates ucConversationSummarizerAllRemoteOnHold = new ConversationSummarizerStates(4096);
  public final static ConversationSummarizerStates ucConversationSummarizerRemoteJoining = new ConversationSummarizerStates(8192);
  public final static ConversationSummarizerStates ucConversationSummarizerRemoteForwarding = new ConversationSummarizerStates(16384);
  public final static ConversationSummarizerStates ucConversationSummarizerEarlyMediaSip = new ConversationSummarizerStates(32768);
  public final static ConversationSummarizerStates ucConversationSummarizerEarlyMediaTel = new ConversationSummarizerStates(65536);
  public final static ConversationSummarizerStates ucConversationSummarizerPairedCall = new ConversationSummarizerStates(131072);
  public final static ConversationSummarizerStates ucConversationSummarizerConnectingToCaller = new ConversationSummarizerStates(262144);
  public final static ConversationSummarizerStates ucConversationSummarizerInConversationUSB = new ConversationSummarizerStates(524288);
  public final static ConversationSummarizerStates ucConversationSummarizerRemoteP2POnHoldWithoutMusic = new ConversationSummarizerStates(1048576);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalScreenSharing = new ConversationSummarizerStates(2097152);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalP2POnHold = new ConversationSummarizerStates(1536);
  public final static ConversationSummarizerStates ucConversationSummarizerLocalOnHold = new ConversationSummarizerStates(3584);
  public final static ConversationSummarizerStates ucConversationSummarizerInConversation = new ConversationSummarizerStates(98752);
  public final static ConversationSummarizerStates ucConversationSummarizerAllStates = new ConversationSummarizerStates(-1);

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
  private ConversationSummarizerStates(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationSummarizerStates valueOf(int value) {
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
    default: return new ConversationSummarizerStates(value);
    }
  }
}
