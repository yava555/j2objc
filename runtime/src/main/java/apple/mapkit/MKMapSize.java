package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;


@Mapping("MKMapSize") @Library("MapKit/MapKit.h")
public class MKMapSize 
    extends Struct 
     {

    
    private MKMapSize() {}
    
    
    @DotMapping("width")
    public native double getWidth();
    @DotMapping("height")
    public native double getHeight();

    public static native MKMapSize create(double width, double height) /*-[
        MKMapSize __new = { .width = width, .height = height };
        return __new;
    ]-*/;
    public static native MKMapSize copyWithwidth(MKMapSize original, double width) /*-[
        MKMapSize __new = { .width = width, .height = original.height };
        return __new;
    ]-*/;


    public static native MKMapSize copyWithheight(MKMapSize original, double height) /*-[
        MKMapSize __new = { .width = original.width, .height = height };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double width;
        public double height;
        public Adapter(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public Adapter(MKMapSize original) {
            this.width = original.getWidth();
            this.height = original.getHeight();
        }
        public MKMapSize convert() {
            return create(width, height);
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MKMapSizeWorld")
    public static native MKMapSize getWorldSize();

}
