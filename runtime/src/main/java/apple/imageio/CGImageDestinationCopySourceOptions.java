package apple.imageio;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO/ImageIO.h")
public class CGImageDestinationCopySourceOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageDestinationMetadata")
    public static native CFString DestinationMetadataKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageDestinationMergeMetadata")
    public static native CFString DestinationMergeMetadataKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataShouldExcludeXMP")
    public static native CFString MetadataShouldExcludeXMPKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImageMetadataShouldExcludeGPS")
    public static native CFString MetadataShouldExcludeGPSKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageDestinationDateTime")
    public static native CFString DestinationDateTimeKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageDestinationOrientation")
    public static native CFString DestinationOrientationKey();

}
