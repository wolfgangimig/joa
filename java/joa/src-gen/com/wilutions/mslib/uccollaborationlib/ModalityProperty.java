/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityProperty.
 * Enumerates the modality properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityProperty {
  ucInstantMessageModalitySharedCapabilities(537591808),
  ucInstantMessageModalityInviteMessage(720897),
  ucInstantMessageModalityNoAutoAccept(269156354),
  ucInstantMessageModalityInviteForked(269156355),
  ucAVModalityAudioRenderVolume(537591812),
  ucAVModalityAudioRenderMute(269156357),
  ucAVModalityAudioRenderIntensity(537591814),
  ucAVModalityAudioRenderIntensityMin(537591815),
  ucAVModalityAudioRenderIntensityMax(537591816),
  ucAVModalityAudioCaptureVolume(537591817),
  ucAVModalityAudioCaptureMute(269156362),
  ucAVModalityAudioCaptureIntensity(537591819),
  ucAVModalityAudioCaptureIntensityMin(537591820),
  ucAVModalityAudioCaptureIntensityMax(537591821),
  ucAVModalityAudioCanCallComputer(269156366),
  ucAVModalityAudioCanCallTelephone(269156367),
  ucAVModalityAudioRenderDevice(720912),
  ucAVModalityAudioCaptureDevice(720913),
  ucAVModalityAudioSpeakerMode(806027282),
  ucAVModalityAudioHistoryInfo(1074462739),
  ucAVModalityAudioOriginalTargetUri(720916),
  ucAVModalityAudioReferredByUri(720917),
  ucAVModalityAudioSupportsAdvancedTransfer(269156374),
  ucAVModalityAudioQuality(806027287),
  ucAVModalityAudioOnHoldSource(720920),
  ucAVModalityAudioOnHoldRepeated(269156377),
  ucAVModalityAudioRemoteHoldFeature(806027290),
  ucAVModalityIsAutoAccepted(269156379),
  ucAVModalityAudioSupportsSafeTransfer(269156380),
  ucAVModalityAudioNetworkQuality(806027293),
  ucAVModalityAudioBandwidthQuality(806027294),
  ucAVModalityAudioDeviceQuality(806027295),
  ucAVModalityVoicemailItemId(720928),
  ucAVModalityVideoNetworkQuality(806027297),
  ucAVModalityVideoBandwidthQuality(806027298),
  ucAVModalityVideoDeviceQuality(806027299),
  ucAVModalityAudioIsEmergencyCall(806027300),
  ucAVModalityUsbOffHookLedStatus(269156389),
  ucAVModalityUsbDisplayName(720934),
  ucApplicationSharingModalityCanShareMonitor(806027303),
  ucApplicationSharingModalityCanShareApplications(806027304),
  ucAVModalityAudioLocationSent(1074495488),
  ucAVModalityAudioPrivateCall(269189121),
  ucAVModalityAudioIsPersistentSession(269189122),
  ucAVModalityAudioCannotDisconnectSession(269189123),
  ucAVModalityAudioIsAudioMCUModeAllowed(269189124),
  ucAVModalityAudioMCUSession(269189125),
  ucAVModalityAudioRemoteSupportsReferExtensions(269189126),
  ucAVModalityAudioRemoteSupportsSafeTransfer(269189127),
  ucAVModalityAudioStartTime(537624584),
  ucAVModalityAudioSupportsReplaces(269189129),
  ucAVModalityExtendedAudioQuality(1074495498),
  ucAVModalityVideoCapturePaused(269189131),
  ucAVModalityVideoRenderPaused(269189132),
  ucAVModalityVideoIsAVMCUModeAllowed(269189133),
  ucAVModalityVideoStartTime(537624590),
  ucAVModalityExtendedVideoQuality(1074495503),
  ucAVModalityDTMFDigits(753680),
  ucAVModalityUsbConvId(753681),
  ucContentModalityPresentedContentIdAtDisconnect(537624594);

  public final int value;
  private ModalityProperty(int value) { this.value = value; }
  public static  ModalityProperty valueOf(int value) {
    switch(value) {
    case 537591808: return ucInstantMessageModalitySharedCapabilities;
    case 720897: return ucInstantMessageModalityInviteMessage;
    case 269156354: return ucInstantMessageModalityNoAutoAccept;
    case 269156355: return ucInstantMessageModalityInviteForked;
    case 537591812: return ucAVModalityAudioRenderVolume;
    case 269156357: return ucAVModalityAudioRenderMute;
    case 537591814: return ucAVModalityAudioRenderIntensity;
    case 537591815: return ucAVModalityAudioRenderIntensityMin;
    case 537591816: return ucAVModalityAudioRenderIntensityMax;
    case 537591817: return ucAVModalityAudioCaptureVolume;
    case 269156362: return ucAVModalityAudioCaptureMute;
    case 537591819: return ucAVModalityAudioCaptureIntensity;
    case 537591820: return ucAVModalityAudioCaptureIntensityMin;
    case 537591821: return ucAVModalityAudioCaptureIntensityMax;
    case 269156366: return ucAVModalityAudioCanCallComputer;
    case 269156367: return ucAVModalityAudioCanCallTelephone;
    case 720912: return ucAVModalityAudioRenderDevice;
    case 720913: return ucAVModalityAudioCaptureDevice;
    case 806027282: return ucAVModalityAudioSpeakerMode;
    case 1074462739: return ucAVModalityAudioHistoryInfo;
    case 720916: return ucAVModalityAudioOriginalTargetUri;
    case 720917: return ucAVModalityAudioReferredByUri;
    case 269156374: return ucAVModalityAudioSupportsAdvancedTransfer;
    case 806027287: return ucAVModalityAudioQuality;
    case 720920: return ucAVModalityAudioOnHoldSource;
    case 269156377: return ucAVModalityAudioOnHoldRepeated;
    case 806027290: return ucAVModalityAudioRemoteHoldFeature;
    case 269156379: return ucAVModalityIsAutoAccepted;
    case 269156380: return ucAVModalityAudioSupportsSafeTransfer;
    case 806027293: return ucAVModalityAudioNetworkQuality;
    case 806027294: return ucAVModalityAudioBandwidthQuality;
    case 806027295: return ucAVModalityAudioDeviceQuality;
    case 720928: return ucAVModalityVoicemailItemId;
    case 806027297: return ucAVModalityVideoNetworkQuality;
    case 806027298: return ucAVModalityVideoBandwidthQuality;
    case 806027299: return ucAVModalityVideoDeviceQuality;
    case 806027300: return ucAVModalityAudioIsEmergencyCall;
    case 269156389: return ucAVModalityUsbOffHookLedStatus;
    case 720934: return ucAVModalityUsbDisplayName;
    case 806027303: return ucApplicationSharingModalityCanShareMonitor;
    case 806027304: return ucApplicationSharingModalityCanShareApplications;
    case 1074495488: return ucAVModalityAudioLocationSent;
    case 269189121: return ucAVModalityAudioPrivateCall;
    case 269189122: return ucAVModalityAudioIsPersistentSession;
    case 269189123: return ucAVModalityAudioCannotDisconnectSession;
    case 269189124: return ucAVModalityAudioIsAudioMCUModeAllowed;
    case 269189125: return ucAVModalityAudioMCUSession;
    case 269189126: return ucAVModalityAudioRemoteSupportsReferExtensions;
    case 269189127: return ucAVModalityAudioRemoteSupportsSafeTransfer;
    case 537624584: return ucAVModalityAudioStartTime;
    case 269189129: return ucAVModalityAudioSupportsReplaces;
    case 1074495498: return ucAVModalityExtendedAudioQuality;
    case 269189131: return ucAVModalityVideoCapturePaused;
    case 269189132: return ucAVModalityVideoRenderPaused;
    case 269189133: return ucAVModalityVideoIsAVMCUModeAllowed;
    case 537624590: return ucAVModalityVideoStartTime;
    case 1074495503: return ucAVModalityExtendedVideoQuality;
    case 753680: return ucAVModalityDTMFDigits;
    case 753681: return ucAVModalityUsbConvId;
    case 537624594: return ucContentModalityPresentedContentIdAtDisconnect;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityProperty.class);
    }
  }
}
