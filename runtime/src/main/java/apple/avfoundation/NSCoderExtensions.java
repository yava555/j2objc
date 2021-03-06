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
@Library("AVFoundation/AVFoundation.h") @Mapping("NSCoder")
public final class NSCoderExtensions 
    extends NSExtensions 
     {

    
    
    private NSCoderExtensions() {}

    


    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("encodeCMTime:forKey:")
    public static native void encodeCMTime(NSCoder thiz, CMTime time, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("decodeCMTimeForKey:")
    public static native CMTime decodeCMTime(NSCoder thiz, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("encodeCMTimeRange:forKey:")
    public static native void encodeCMTimeRange(NSCoder thiz, CMTimeRange timeRange, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("decodeCMTimeRangeForKey:")
    public static native CMTimeRange decodeCMTimeRange(NSCoder thiz, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("encodeCMTimeMapping:forKey:")
    public static native void encodeCMTimeMapping(NSCoder thiz, CMTimeMapping timeMapping, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ExtensionMapping("decodeCMTimeMappingForKey:")
    public static native CMTimeMapping decodeCMTimeMapping(NSCoder thiz, String key);

}
