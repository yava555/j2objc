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
 * @since Available in iOS 4.3 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemErrorLogEvent")
public class AVPlayerItemErrorLogEvent 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVPlayerItemErrorLogEvent() { }
    
    
    @Mapping("date")
    public native NSDate getDate();
    @Mapping("URI")
    public native String getURI();
    @Mapping("serverAddress")
    public native String getServerAddress();
    @Mapping("playbackSessionID")
    public native String getPlaybackSessionID();
    @Mapping("errorStatusCode")
    public native @MachineSizedSInt long getErrorStatusCode();
    @Mapping("errorDomain")
    public native String getErrorDomain();
    @Mapping("errorComment")
    public native String getErrorComment();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
