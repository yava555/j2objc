package apple.avfoundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVMediaCharacteristic 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicVisual")
    public static native String VisualValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicAudible")
    public static native String AudibleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicLegible")
    public static native String LegibleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicFrameBased")
    public static native String FrameBasedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicIsMainProgramContent")
    public static native String IsMainProgramContentValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicIsAuxiliaryContent")
    public static native String IsAuxiliaryContentValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicContainsOnlyForcedSubtitles")
    public static native String ContainsOnlyForcedSubtitlesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicTranscribesSpokenDialogForAccessibility")
    public static native String TranscribesSpokenDialogForAccessibilityValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicDescribesMusicAndSoundForAccessibility")
    public static native String DescribesMusicAndSoundForAccessibilityValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicEasyToRead")
    public static native String EasyToReadValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMediaCharacteristicDescribesVideoForAccessibility")
    public static native String DescribesVideoForAccessibilityValue();

}
