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
public final class NSAttributedStringExtensions 
    extends NSExtensions 
     {

    
    
    private NSAttributedStringExtensions() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("attributedStringWithAttachment:")
    public static native NSAttributedString create(NSTextAttachment attachment);
    
}