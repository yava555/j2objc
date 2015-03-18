package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSFileSystemAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSFileSystemNumber")
    public static native NSString NumberAttribute();
    @GlobalConstant("NSFileSystemSize")
    public static native NSString SizeAttribute();
    @GlobalConstant("NSFileSystemFreeSize")
    public static native NSString FreeSizeAttribute();
    @GlobalConstant("NSFileSystemNodes")
    public static native NSString NodesAttribute();
    @GlobalConstant("NSFileSystemFreeNodes")
    public static native NSString FreeNodesAttribute();
    
}
