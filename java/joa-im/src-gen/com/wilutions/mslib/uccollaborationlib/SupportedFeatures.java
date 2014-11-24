/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SupportedFeatures.
 * Enumerates the supported features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SupportedFeatures {

  // Typed constants
  public final static SupportedFeatures ucNone = new SupportedFeatures(0);
  public final static SupportedFeatures ucDelegatorContexts = new SupportedFeatures(1);
  public final static SupportedFeatures ucInstantMessageGif = new SupportedFeatures(2);
  public final static SupportedFeatures ucInstantMessageInk = new SupportedFeatures(4);
  public final static SupportedFeatures ucInstantMessageRtf = new SupportedFeatures(8);
  public final static SupportedFeatures ucInstantMessageHtml = new SupportedFeatures(16);
  public final static SupportedFeatures ucPhonePairing = new SupportedFeatures(32);
  public final static SupportedFeatures ucApplicationSharing = new SupportedFeatures(64);
  public final static SupportedFeatures ucLegacyApplicationSharing = new SupportedFeatures(128);
  public final static SupportedFeatures ucApplicationInvite = new SupportedFeatures(256);
  public final static SupportedFeatures ucAudio = new SupportedFeatures(512);
  public final static SupportedFeatures ucFileTransfer = new SupportedFeatures(1024);
  public final static SupportedFeatures ucVideo = new SupportedFeatures(2048);
  public final static SupportedFeatures ucInstantMessage = new SupportedFeatures(4096);
  public final static SupportedFeatures ucBranchOfficeResiliency = new SupportedFeatures(8192);
  public final static SupportedFeatures ucRegistrarClustering = new SupportedFeatures(16384);
  public final static SupportedFeatures ucDhcpServerDiscovery = new SupportedFeatures(32768);
  public final static SupportedFeatures ucPinBasedBootstrapping = new SupportedFeatures(65536);
  public final static SupportedFeatures ucTrustModelPrompt = new SupportedFeatures(131072);
  public final static SupportedFeatures ucDataConferencing = new SupportedFeatures(262144);
  public final static SupportedFeatures ucRecording = new SupportedFeatures(524288);
  public final static SupportedFeatures ucCanShowLobby = new SupportedFeatures(1048576);
  public final static SupportedFeatures ucProcessLogonEvents = new SupportedFeatures(2097152);
  public final static SupportedFeatures ucAllFeatures = new SupportedFeatures(-1);

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
  private SupportedFeatures(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SupportedFeatures valueOf(int value) {
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
    default: return new SupportedFeatures(value);
    }
  }
}
