package apple.coregraphics;


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
import apple.uikit.*;


@Mapping("CGSize") @Library("CoreGraphics/CoreGraphics.h")
public class CGSize 
    extends Struct 
     {

    
    private CGSize() {}
    
    
    @DotMapping("width")
    public native @MachineSizedFloat double getWidth();
    @DotMapping("height")
    public native @MachineSizedFloat double getHeight();

    public static native CGSize create(@MachineSizedFloat double width, @MachineSizedFloat double height) /*-[
        CGSize __new = { .width = width, .height = height };
        return __new;
    ]-*/;
    public static native CGSize copyWithwidth(CGSize original, @MachineSizedFloat double width) /*-[
        CGSize __new = { .width = width, .height = original.height };
        return __new;
    ]-*/;


    public static native CGSize copyWithheight(CGSize original, @MachineSizedFloat double height) /*-[
        CGSize __new = { .width = original.width, .height = height };
        return __new;
    ]-*/;


    public static final class Adapter {

        public @MachineSizedFloat double width;
        public @MachineSizedFloat double height;
        public Adapter(@MachineSizedFloat double width, @MachineSizedFloat double height) {
            this.width = width;
            this.height = height;
        }
        public Adapter(CGSize original) {
            this.width = original.getWidth();
            this.height = original.getHeight();
        }
        public CGSize convert() {
            return create(width, height);
        }
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGSizeZero")
    public static native CGSize Zero();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGSizeEqualToSize")
    public static native boolean equalToSize(CGSize size1, CGSize size2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGSizeCreateDictionaryRepresentation")
    public static native NSDictionary<NSString, NSNumber> toDictionary(CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGSizeMakeWithDictionaryRepresentation")
    public static native boolean fromDictionary(CFDictionary dict, CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGSizeApplyAffineTransform")
    public static native CGSize apply(CGSize size, CGAffineTransform t);

}
