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


@Mapping("MKCoordinateSpan") @Library("MapKit/MapKit.h")
public class MKCoordinateSpan 
    extends Struct 
     {

    
    private MKCoordinateSpan() {}
    
    
    @DotMapping("latitudeDelta")
    public native double getLatitudeDelta();
    @DotMapping("longitudeDelta")
    public native double getLongitudeDelta();

    public static native MKCoordinateSpan create(double latitudeDelta, double longitudeDelta) /*-[
        MKCoordinateSpan __new = { .latitudeDelta = latitudeDelta, .longitudeDelta = longitudeDelta };
        return __new;
    ]-*/;
    public static native MKCoordinateSpan copyWithlatitudeDelta(MKCoordinateSpan original, double latitudeDelta) /*-[
        MKCoordinateSpan __new = { .latitudeDelta = latitudeDelta, .longitudeDelta = original.longitudeDelta };
        return __new;
    ]-*/;


    public static native MKCoordinateSpan copyWithlongitudeDelta(MKCoordinateSpan original, double longitudeDelta) /*-[
        MKCoordinateSpan __new = { .latitudeDelta = original.latitudeDelta, .longitudeDelta = longitudeDelta };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double latitudeDelta;
        public double longitudeDelta;
        public Adapter(double latitudeDelta, double longitudeDelta) {
            this.latitudeDelta = latitudeDelta;
            this.longitudeDelta = longitudeDelta;
        }
        public Adapter(MKCoordinateSpan original) {
            this.latitudeDelta = original.getLatitudeDelta();
            this.longitudeDelta = original.getLongitudeDelta();
        }
        public MKCoordinateSpan convert() {
            return create(latitudeDelta, longitudeDelta);
        }
    }
}
