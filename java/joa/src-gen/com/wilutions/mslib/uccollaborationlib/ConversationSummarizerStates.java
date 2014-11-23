/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationSummarizerStates.
 * Enumerates the conversation summarizer states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationSummarizerStates {
  ucConversationSummarizerNoSummarizedState(0),
  ucConversationSummarizerLocalOutgoing(1),
  ucConversationSummarizerLocalRinging(2),
  ucConversationSummarizerRemoteRinging(4),
  ucConversationSummarizerLocalJoining(8),
  ucConversationSummarizerLocalTransferring(16),
  ucConversationSummarizerRemoteTransferring(32),
  ucConversationSummarizerInConversationSip(64),
  ucConversationSummarizerInConversationTel(128),
  ucConversationSummarizerInConferenceCall(256),
  ucConversationSummarizerLocalP2PSipOnHold(512),
  ucConversationSummarizerLocalP2PTelOnHold(1024),
  ucConversationSummarizerLocalConfOnHold(2048),
  ucConversationSummarizerAllRemoteOnHold(4096),
  ucConversationSummarizerRemoteJoining(8192),
  ucConversationSummarizerRemoteForwarding(16384),
  ucConversationSummarizerEarlyMediaSip(32768),
  ucConversationSummarizerEarlyMediaTel(65536),
  ucConversationSummarizerPairedCall(131072),
  ucConversationSummarizerConnectingToCaller(262144),
  ucConversationSummarizerInConversationUSB(524288),
  ucConversationSummarizerRemoteP2POnHoldWithoutMusic(1048576),
  ucConversationSummarizerLocalScreenSharing(2097152),
  ucConversationSummarizerLocalP2POnHold(1536),
  ucConversationSummarizerLocalOnHold(3584),
  ucConversationSummarizerInConversation(98752),
  ucConversationSummarizerAllStates(-1);

  public final int value;
  private ConversationSummarizerStates(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationSummarizerStates.class);
    }
  }
}
