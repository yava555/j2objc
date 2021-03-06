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


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableVideoComposition")
public class AVMutableVideoComposition 
    extends AVVideoComposition 
     {

    
    
    @Mapping("init")
    public AVMutableVideoComposition() { }

    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositorClass")
    public native Class<? extends AVVideoCompositing> getCustomVideoCompositorClass();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCustomVideoCompositorClass:")
    public native void setCustomVideoCompositorClass(Class<? extends AVVideoCompositing> v);
    @Mapping("frameDuration")
    public native CMTime getFrameDuration();
    @Mapping("setFrameDuration:")
    public native void setFrameDuration(CMTime v);
    @Mapping("renderSize")
    public native CGSize getRenderSize();
    @Mapping("setRenderSize:")
    public native void setRenderSize(CGSize v);
    @Mapping("renderScale")
    public native float getRenderScale();
    @Mapping("setRenderScale:")
    public native void setRenderScale(float v);
    @Mapping("instructions")
    public native NSArray<AVVideoCompositionInstruction> getInstructions();
    @Mapping("setInstructions:")
    public native void setInstructions(NSArray<AVVideoCompositionInstruction> v);
    @Mapping("animationTool")
    public native AVVideoCompositionCoreAnimationTool getAnimationTool();
    @Mapping("setAnimationTool:")
    public native void setAnimationTool(AVVideoCompositionCoreAnimationTool v);

    
    
    @Mapping("videoComposition")
    public static native AVMutableVideoComposition create();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("videoCompositionWithPropertiesOfAsset:")
    public static native AVMutableVideoComposition create(AVAsset asset);

}
