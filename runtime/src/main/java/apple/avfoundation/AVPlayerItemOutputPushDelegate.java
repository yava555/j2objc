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


@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemOutputPushDelegate")
public interface AVPlayerItemOutputPushDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("outputSequenceWasFlushed:")
    void wasFlushed(AVPlayerItemOutput output);

    /*<adapter>*/
    /*</adapter>*/
}
