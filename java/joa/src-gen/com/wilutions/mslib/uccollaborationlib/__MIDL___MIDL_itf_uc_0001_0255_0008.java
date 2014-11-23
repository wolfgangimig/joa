/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0008.
 * Enumerates the supported features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0008 {
  ucNone(0),
  ucDelegatorContexts(1),
  ucInstantMessageGif(2),
  ucInstantMessageInk(4),
  ucInstantMessageRtf(8),
  ucInstantMessageHtml(16),
  ucPhonePairing(32),
  ucApplicationSharing(64),
  ucLegacyApplicationSharing(128),
  ucApplicationInvite(256),
  ucAudio(512),
  ucFileTransfer(1024),
  ucVideo(2048),
  ucInstantMessage(4096),
  ucBranchOfficeResiliency(8192),
  ucRegistrarClustering(16384),
  ucDhcpServerDiscovery(32768),
  ucPinBasedBootstrapping(65536),
  ucTrustModelPrompt(131072),
  ucDataConferencing(262144),
  ucRecording(524288),
  ucCanShowLobby(1048576),
  ucProcessLogonEvents(2097152),
  ucAllFeatures(-1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0008(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucNone;
    case 1: return ucDelegatorContexts;
    case 2: return ucInstantMessageGif;
    case 4: return ucInstantMessageInk;
    case 8: return ucInstantMessageRtf;
    case 16: return ucInstantMessageHtml;
    case 32: return ucPhonePairing;
    case 64: return ucApplicationSharing;
    case 128: return ucLegacyApplicationSharing;
    case 256: return ucApplicationInvite;
    case 512: return ucAudio;
    case 1024: return ucFileTransfer;
    case 2048: return ucVideo;
    case 4096: return ucInstantMessage;
    case 8192: return ucBranchOfficeResiliency;
    case 16384: return ucRegistrarClustering;
    case 32768: return ucDhcpServerDiscovery;
    case 65536: return ucPinBasedBootstrapping;
    case 131072: return ucTrustModelPrompt;
    case 262144: return ucDataConferencing;
    case 524288: return ucRecording;
    case 1048576: return ucCanShowLobby;
    case 2097152: return ucProcessLogonEvents;
    case -1: return ucAllFeatures;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0008.class);
    }
  }
}
