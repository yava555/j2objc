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
public class SCNShaderModifierEntryPoint 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNShaderModifierEntryPointGeometry")
    public static native NSString GeometryValue();
    @GlobalConstant("SCNShaderModifierEntryPointSurface")
    public static native NSString SurfaceValue();
    @GlobalConstant("SCNShaderModifierEntryPointLightingModel")
    public static native NSString LightingModelValue();
    @GlobalConstant("SCNShaderModifierEntryPointFragment")
    public static native NSString FragmentValue();

}
