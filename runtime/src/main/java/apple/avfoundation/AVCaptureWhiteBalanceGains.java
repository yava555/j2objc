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


@Mapping("AVCaptureWhiteBalanceGains") @Library("AVFoundation/AVFoundation.h")
public class AVCaptureWhiteBalanceGains 
    extends Struct 
     {

    
    private AVCaptureWhiteBalanceGains() {}
    
    
    @DotMapping("redGain")
    public native float getRedGain();
    @DotMapping("greenGain")
    public native float getGreenGain();
    @DotMapping("blueGain")
    public native float getBlueGain();

    public static native AVCaptureWhiteBalanceGains create(float redGain, float greenGain, float blueGain) /*-[
        AVCaptureWhiteBalanceGains __new = { .redGain = redGain, .greenGain = greenGain, .blueGain = blueGain };
        return __new;
    ]-*/;
    public static native AVCaptureWhiteBalanceGains copyWithredGain(AVCaptureWhiteBalanceGains original, float redGain) /*-[
        AVCaptureWhiteBalanceGains __new = { .redGain = redGain, .greenGain = original.greenGain, .blueGain = original.blueGain };
        return __new;
    ]-*/;


    public static native AVCaptureWhiteBalanceGains copyWithgreenGain(AVCaptureWhiteBalanceGains original, float greenGain) /*-[
        AVCaptureWhiteBalanceGains __new = { .redGain = original.redGain, .greenGain = greenGain, .blueGain = original.blueGain };
        return __new;
    ]-*/;


    public static native AVCaptureWhiteBalanceGains copyWithblueGain(AVCaptureWhiteBalanceGains original, float blueGain) /*-[
        AVCaptureWhiteBalanceGains __new = { .redGain = original.redGain, .greenGain = original.greenGain, .blueGain = blueGain };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float redGain;
        public float greenGain;
        public float blueGain;
        public Adapter(float redGain, float greenGain, float blueGain) {
            this.redGain = redGain;
            this.greenGain = greenGain;
            this.blueGain = blueGain;
        }
        public Adapter(AVCaptureWhiteBalanceGains original) {
            this.redGain = original.getRedGain();
            this.greenGain = original.getGreenGain();
            this.blueGain = original.getBlueGain();
        }
        public AVCaptureWhiteBalanceGains convert() {
            return create(redGain, greenGain, blueGain);
        }
    }
}
