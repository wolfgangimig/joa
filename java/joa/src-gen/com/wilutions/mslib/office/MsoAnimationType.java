/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAnimationType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAnimationType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAnimationType msoAnimationIdle = new MsoAnimationType(1);
  public final static MsoAnimationType msoAnimationGreeting = new MsoAnimationType(2);
  public final static MsoAnimationType msoAnimationGoodbye = new MsoAnimationType(3);
  public final static MsoAnimationType msoAnimationBeginSpeaking = new MsoAnimationType(4);
  public final static MsoAnimationType msoAnimationRestPose = new MsoAnimationType(5);
  public final static MsoAnimationType msoAnimationCharacterSuccessMajor = new MsoAnimationType(6);
  public final static MsoAnimationType msoAnimationGetAttentionMajor = new MsoAnimationType(11);
  public final static MsoAnimationType msoAnimationGetAttentionMinor = new MsoAnimationType(12);
  public final static MsoAnimationType msoAnimationSearching = new MsoAnimationType(13);
  public final static MsoAnimationType msoAnimationPrinting = new MsoAnimationType(18);
  public final static MsoAnimationType msoAnimationGestureRight = new MsoAnimationType(19);
  public final static MsoAnimationType msoAnimationWritingNotingSomething = new MsoAnimationType(22);
  public final static MsoAnimationType msoAnimationWorkingAtSomething = new MsoAnimationType(23);
  public final static MsoAnimationType msoAnimationThinking = new MsoAnimationType(24);
  public final static MsoAnimationType msoAnimationSendingMail = new MsoAnimationType(25);
  public final static MsoAnimationType msoAnimationListensToComputer = new MsoAnimationType(26);
  public final static MsoAnimationType msoAnimationDisappear = new MsoAnimationType(31);
  public final static MsoAnimationType msoAnimationAppear = new MsoAnimationType(32);
  public final static MsoAnimationType msoAnimationGetArtsy = new MsoAnimationType(100);
  public final static MsoAnimationType msoAnimationGetTechy = new MsoAnimationType(101);
  public final static MsoAnimationType msoAnimationGetWizardy = new MsoAnimationType(102);
  public final static MsoAnimationType msoAnimationCheckingSomething = new MsoAnimationType(103);
  public final static MsoAnimationType msoAnimationLookDown = new MsoAnimationType(104);
  public final static MsoAnimationType msoAnimationLookDownLeft = new MsoAnimationType(105);
  public final static MsoAnimationType msoAnimationLookDownRight = new MsoAnimationType(106);
  public final static MsoAnimationType msoAnimationLookLeft = new MsoAnimationType(107);
  public final static MsoAnimationType msoAnimationLookRight = new MsoAnimationType(108);
  public final static MsoAnimationType msoAnimationLookUp = new MsoAnimationType(109);
  public final static MsoAnimationType msoAnimationLookUpLeft = new MsoAnimationType(110);
  public final static MsoAnimationType msoAnimationLookUpRight = new MsoAnimationType(111);
  public final static MsoAnimationType msoAnimationSaving = new MsoAnimationType(112);
  public final static MsoAnimationType msoAnimationGestureDown = new MsoAnimationType(113);
  public final static MsoAnimationType msoAnimationGestureLeft = new MsoAnimationType(114);
  public final static MsoAnimationType msoAnimationGestureUp = new MsoAnimationType(115);
  public final static MsoAnimationType msoAnimationEmptyTrash = new MsoAnimationType(116);

  // Integer constants for bitsets and switch statements
  public final static int _msoAnimationIdle = 1;
  public final static int _msoAnimationGreeting = 2;
  public final static int _msoAnimationGoodbye = 3;
  public final static int _msoAnimationBeginSpeaking = 4;
  public final static int _msoAnimationRestPose = 5;
  public final static int _msoAnimationCharacterSuccessMajor = 6;
  public final static int _msoAnimationGetAttentionMajor = 11;
  public final static int _msoAnimationGetAttentionMinor = 12;
  public final static int _msoAnimationSearching = 13;
  public final static int _msoAnimationPrinting = 18;
  public final static int _msoAnimationGestureRight = 19;
  public final static int _msoAnimationWritingNotingSomething = 22;
  public final static int _msoAnimationWorkingAtSomething = 23;
  public final static int _msoAnimationThinking = 24;
  public final static int _msoAnimationSendingMail = 25;
  public final static int _msoAnimationListensToComputer = 26;
  public final static int _msoAnimationDisappear = 31;
  public final static int _msoAnimationAppear = 32;
  public final static int _msoAnimationGetArtsy = 100;
  public final static int _msoAnimationGetTechy = 101;
  public final static int _msoAnimationGetWizardy = 102;
  public final static int _msoAnimationCheckingSomething = 103;
  public final static int _msoAnimationLookDown = 104;
  public final static int _msoAnimationLookDownLeft = 105;
  public final static int _msoAnimationLookDownRight = 106;
  public final static int _msoAnimationLookLeft = 107;
  public final static int _msoAnimationLookRight = 108;
  public final static int _msoAnimationLookUp = 109;
  public final static int _msoAnimationLookUpLeft = 110;
  public final static int _msoAnimationLookUpRight = 111;
  public final static int _msoAnimationSaving = 112;
  public final static int _msoAnimationGestureDown = 113;
  public final static int _msoAnimationGestureLeft = 114;
  public final static int _msoAnimationGestureUp = 115;
  public final static int _msoAnimationEmptyTrash = 116;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAnimationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoAnimationType(value);
    }
  }
}
