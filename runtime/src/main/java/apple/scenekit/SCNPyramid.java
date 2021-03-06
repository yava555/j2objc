package apple.scenekit;


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
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;


@Library("SceneKit/SceneKit.h") @Mapping("SCNPyramid")
public class SCNPyramid 
    extends SCNGeometry 
     {

    
    
    @Mapping("init")
    public SCNPyramid() { }

    
    @Mapping("width")
    public native @MachineSizedFloat double getWidth();
    @Mapping("setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    @Mapping("height")
    public native @MachineSizedFloat double getHeight();
    @Mapping("setHeight:")
    public native void setHeight(@MachineSizedFloat double v);
    @Mapping("length")
    public native @MachineSizedFloat double getLength();
    @Mapping("setLength:")
    public native void setLength(@MachineSizedFloat double v);
    @Mapping("widthSegmentCount")
    public native @MachineSizedSInt long getWidthSegmentCount();
    @Mapping("setWidthSegmentCount:")
    public native void setWidthSegmentCount(@MachineSizedSInt long v);
    @Mapping("heightSegmentCount")
    public native @MachineSizedSInt long getHeightSegmentCount();
    @Mapping("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@MachineSizedSInt long v);
    @Mapping("lengthSegmentCount")
    public native @MachineSizedSInt long getLengthSegmentCount();
    @Mapping("setLengthSegmentCount:")
    public native void setLengthSegmentCount(@MachineSizedSInt long v);

    
    
    @Mapping("pyramidWithWidth:height:length:")
    public static native SCNPyramid create(@MachineSizedFloat double width, @MachineSizedFloat double height, @MachineSizedFloat double length);

}
