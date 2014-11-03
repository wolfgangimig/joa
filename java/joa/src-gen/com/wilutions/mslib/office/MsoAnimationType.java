/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAnimationType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAnimationType {
  msoAnimationIdle(1),
  msoAnimationGreeting(2),
  msoAnimationGoodbye(3),
  msoAnimationBeginSpeaking(4),
  msoAnimationRestPose(5),
  msoAnimationCharacterSuccessMajor(6),
  msoAnimationGetAttentionMajor(11),
  msoAnimationGetAttentionMinor(12),
  msoAnimationSearching(13),
  msoAnimationPrinting(18),
  msoAnimationGestureRight(19),
  msoAnimationWritingNotingSomething(22),
  msoAnimationWorkingAtSomething(23),
  msoAnimationThinking(24),
  msoAnimationSendingMail(25),
  msoAnimationListensToComputer(26),
  msoAnimationDisappear(31),
  msoAnimationAppear(32),
  msoAnimationGetArtsy(100),
  msoAnimationGetTechy(101),
  msoAnimationGetWizardy(102),
  msoAnimationCheckingSomething(103),
  msoAnimationLookDown(104),
  msoAnimationLookDownLeft(105),
  msoAnimationLookDownRight(106),
  msoAnimationLookLeft(107),
  msoAnimationLookRight(108),
  msoAnimationLookUp(109),
  msoAnimationLookUpLeft(110),
  msoAnimationLookUpRight(111),
  msoAnimationSaving(112),
  msoAnimationGestureDown(113),
  msoAnimationGestureLeft(114),
  msoAnimationGestureUp(115),
  msoAnimationEmptyTrash(116);

  public final int value;
  private MsoAnimationType(int value) { this.value = value; }
  public static  MsoAnimationType valueOf(int value) {
    switch(value) {
    case 1: return msoAnimationIdle;
    case 2: return msoAnimationGreeting;
    case 3: return msoAnimationGoodbye;
    case 4: return msoAnimationBeginSpeaking;
    case 5: return msoAnimationRestPose;
    case 6: return msoAnimationCharacterSuccessMajor;
    case 11: return msoAnimationGetAttentionMajor;
    case 12: return msoAnimationGetAttentionMinor;
    case 13: return msoAnimationSearching;
    case 18: return msoAnimationPrinting;
    case 19: return msoAnimationGestureRight;
    case 22: return msoAnimationWritingNotingSomething;
    case 23: return msoAnimationWorkingAtSomething;
    case 24: return msoAnimationThinking;
    case 25: return msoAnimationSendingMail;
    case 26: return msoAnimationListensToComputer;
    case 31: return msoAnimationDisappear;
    case 32: return msoAnimationAppear;
    case 100: return msoAnimationGetArtsy;
    case 101: return msoAnimationGetTechy;
    case 102: return msoAnimationGetWizardy;
    case 103: return msoAnimationCheckingSomething;
    case 104: return msoAnimationLookDown;
    case 105: return msoAnimationLookDownLeft;
    case 106: return msoAnimationLookDownRight;
    case 107: return msoAnimationLookLeft;
    case 108: return msoAnimationLookRight;
    case 109: return msoAnimationLookUp;
    case 110: return msoAnimationLookUpLeft;
    case 111: return msoAnimationLookUpRight;
    case 112: return msoAnimationSaving;
    case 113: return msoAnimationGestureDown;
    case 114: return msoAnimationGestureLeft;
    case 115: return msoAnimationGestureUp;
    case 116: return msoAnimationEmptyTrash;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAnimationType.class);
    }
  }
}
