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


@Mapping("AVAudio3DVector") @Library("AVFoundation/AVFoundation.h")
public class AVAudio3DVector 
    extends Struct 
     {

    
    private AVAudio3DVector() {}
    
    
    @DotMapping("x")
    public native float getX();
    @DotMapping("y")
    public native float getY();
    @DotMapping("z")
    public native float getZ();

    public static native AVAudio3DVector create(float x, float y, float z) /*-[
        AVAudio3DVector __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native AVAudio3DVector copyWithx(AVAudio3DVector original, float x) /*-[
        AVAudio3DVector __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;


    public static native AVAudio3DVector copyWithy(AVAudio3DVector original, float y) /*-[
        AVAudio3DVector __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;


    public static native AVAudio3DVector copyWithz(AVAudio3DVector original, float z) /*-[
        AVAudio3DVector __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float x;
        public float y;
        public float z;
        public Adapter(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public Adapter(AVAudio3DVector original) {
            this.x = original.getX();
            this.y = original.getY();
            this.z = original.getZ();
        }
        public AVAudio3DVector convert() {
            return create(x, y, z);
        }
    }
}
