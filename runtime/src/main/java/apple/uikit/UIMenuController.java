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


/**
 * @since Available in iOS 3.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIMenuController")
public class UIMenuController 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIMenuController() { }

    
    @Mapping("isMenuVisible")
    public native boolean isMenuVisible();
    @Mapping("setMenuVisible:")
    public native void setMenuVisible(boolean v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("arrowDirection")
    public native @Representing("UIMenuControllerArrowDirection") long getArrowDirection();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setArrowDirection:")
    public native void setArrowDirection(@Representing("UIMenuControllerArrowDirection") long v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("menuItems")
    public native NSArray<UIMenuItem> getMenuItems();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setMenuItems:")
    public native void setMenuItems(NSArray<UIMenuItem> v);
    @Mapping("menuFrame")
    public native CGRect getMenuFrame();

    
    
    @GlobalConstant("UIMenuControllerWillShowMenuNotification")
    public static native String WillShowMenuNotification();
    @GlobalConstant("UIMenuControllerDidShowMenuNotification")
    public static native String DidShowMenuNotification();
    @GlobalConstant("UIMenuControllerWillHideMenuNotification")
    public static native String WillHideMenuNotification();
    @GlobalConstant("UIMenuControllerDidHideMenuNotification")
    public static native String DidHideMenuNotification();
    @GlobalConstant("UIMenuControllerMenuFrameDidChangeNotification")
    public static native String MenuFrameDidChangeNotification();

    @Mapping("setMenuVisible:animated:")
    public native void setMenuVisible(boolean menuVisible, boolean animated);
    @Mapping("setTargetRect:inView:")
    public native void setTargetRect(CGRect targetRect, UIView targetView);
    @Mapping("update")
    public native void update();
    @Mapping("sharedMenuController")
    public static native UIMenuController getSharedMenuController();

}
