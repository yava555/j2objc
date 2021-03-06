package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("QuartzCore/QuartzCore.h") @Mapping("CAMetalLayer")
public class CAMetalLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public CAMetalLayer() { }
    @Mapping("initWithLayer:")
    public CAMetalLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CAMetalLayer(NSCoder aDecoder) { }

    
    @Mapping("pixelFormat")
    public native @Representing("MTLPixelFormat") long getPixelFormat();
    @Mapping("setPixelFormat:")
    public native void setPixelFormat(@Representing("MTLPixelFormat") long v);
    @Mapping("framebufferOnly")
    public native boolean isFramebufferOnly();
    @Mapping("setFramebufferOnly:")
    public native void setFramebufferOnly(boolean v);
    @Mapping("drawableSize")
    public native CGSize getDrawableSize();
    @Mapping("setDrawableSize:")
    public native void setDrawableSize(CGSize v);
    @Mapping("presentsWithTransaction")
    public native boolean presentsWithTransaction();
    @Mapping("setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean v);

    
    
    @Mapping("nextDrawable")
    public native Todo nextDrawable();
    @Mapping("newDrawable")
    public native Todo newDrawable();

}
