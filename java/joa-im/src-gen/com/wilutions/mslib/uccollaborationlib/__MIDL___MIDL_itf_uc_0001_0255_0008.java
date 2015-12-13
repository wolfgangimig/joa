/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0008.
 * Enumerates the supported features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0008 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucNone = new __MIDL___MIDL_itf_uc_0001_0255_0008(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucDelegatorContexts = new __MIDL___MIDL_itf_uc_0001_0255_0008(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucInstantMessageGif = new __MIDL___MIDL_itf_uc_0001_0255_0008(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucInstantMessageInk = new __MIDL___MIDL_itf_uc_0001_0255_0008(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucInstantMessageRtf = new __MIDL___MIDL_itf_uc_0001_0255_0008(8);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucInstantMessageHtml = new __MIDL___MIDL_itf_uc_0001_0255_0008(16);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucPhonePairing = new __MIDL___MIDL_itf_uc_0001_0255_0008(32);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucApplicationSharing = new __MIDL___MIDL_itf_uc_0001_0255_0008(64);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucLegacyApplicationSharing = new __MIDL___MIDL_itf_uc_0001_0255_0008(128);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucApplicationInvite = new __MIDL___MIDL_itf_uc_0001_0255_0008(256);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucAudio = new __MIDL___MIDL_itf_uc_0001_0255_0008(512);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucFileTransfer = new __MIDL___MIDL_itf_uc_0001_0255_0008(1024);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucVideo = new __MIDL___MIDL_itf_uc_0001_0255_0008(2048);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucInstantMessage = new __MIDL___MIDL_itf_uc_0001_0255_0008(4096);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucBranchOfficeResiliency = new __MIDL___MIDL_itf_uc_0001_0255_0008(8192);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucRegistrarClustering = new __MIDL___MIDL_itf_uc_0001_0255_0008(16384);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucDhcpServerDiscovery = new __MIDL___MIDL_itf_uc_0001_0255_0008(32768);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucPinBasedBootstrapping = new __MIDL___MIDL_itf_uc_0001_0255_0008(65536);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucTrustModelPrompt = new __MIDL___MIDL_itf_uc_0001_0255_0008(131072);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucDataConferencing = new __MIDL___MIDL_itf_uc_0001_0255_0008(262144);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucRecording = new __MIDL___MIDL_itf_uc_0001_0255_0008(524288);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucCanShowLobby = new __MIDL___MIDL_itf_uc_0001_0255_0008(1048576);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucProcessLogonEvents = new __MIDL___MIDL_itf_uc_0001_0255_0008(2097152);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0008 ucAllFeatures = new __MIDL___MIDL_itf_uc_0001_0255_0008(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucNone = 0;
  public final static int _ucDelegatorContexts = 1;
  public final static int _ucInstantMessageGif = 2;
  public final static int _ucInstantMessageInk = 4;
  public final static int _ucInstantMessageRtf = 8;
  public final static int _ucInstantMessageHtml = 16;
  public final static int _ucPhonePairing = 32;
  public final static int _ucApplicationSharing = 64;
  public final static int _ucLegacyApplicationSharing = 128;
  public final static int _ucApplicationInvite = 256;
  public final static int _ucAudio = 512;
  public final static int _ucFileTransfer = 1024;
  public final static int _ucVideo = 2048;
  public final static int _ucInstantMessage = 4096;
  public final static int _ucBranchOfficeResiliency = 8192;
  public final static int _ucRegistrarClustering = 16384;
  public final static int _ucDhcpServerDiscovery = 32768;
  public final static int _ucPinBasedBootstrapping = 65536;
  public final static int _ucTrustModelPrompt = 131072;
  public final static int _ucDataConferencing = 262144;
  public final static int _ucRecording = 524288;
  public final static int _ucCanShowLobby = 1048576;
  public final static int _ucProcessLogonEvents = 2097152;
  public final static int _ucAllFeatures = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0008(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0008(value);
    }
  }
}
