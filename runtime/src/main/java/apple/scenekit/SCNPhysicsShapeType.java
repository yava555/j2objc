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

/*<javadoc>*/
/*</javadoc>*/
@Library("SceneKit/SceneKit.h")
public class SCNPhysicsShapeType 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNPhysicsShapeTypeBoundingBox")
    public static native NSString BoundingBoxValue();
    @GlobalConstant("SCNPhysicsShapeTypeConvexHull")
    public static native NSString ConvexHullValue();
    @GlobalConstant("SCNPhysicsShapeTypeConcavePolyhedron")
    public static native NSString ConcavePolyhedronValue();

}
