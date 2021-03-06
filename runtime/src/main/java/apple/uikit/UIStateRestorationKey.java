package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class UIStateRestorationKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIStateRestorationViewControllerStoryboardKey")
    public static native String ViewControllerStoryboardKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationBundleVersionKey")
    public static native String ApplicationBundleVersionKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationUserInterfaceIdiomKey")
    public static native String ApplicationUserInterfaceIdiomKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationTimestampKey")
    public static native String ApplicationTimestampKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationSystemVersionKey")
    public static native String ApplicationSystemVersionKey();

}
