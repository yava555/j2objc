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
 * @since Available in iOS 8.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIDocumentMenuViewController")
public class UIDocumentMenuViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithDocumentTypes:inMode:")
    public UIDocumentMenuViewController(NSArray<?> allowedUTIs, @Representing("UIDocumentPickerMode") long mode) { }
    @Mapping("initWithURL:inMode:")
    public UIDocumentMenuViewController(NSURL url, @Representing("UIDocumentPickerMode") long mode) { }
    @Mapping("initWithNibName:bundle:")
    public UIDocumentMenuViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UIDocumentMenuViewController(NSCoder aDecoder) { }
    @Mapping("init")
    public UIDocumentMenuViewController() { }

    
    @Mapping("delegate")
    public native UIDocumentMenuDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIDocumentMenuDelegate v);

    
    
    @Mapping("addOptionWithTitle:image:order:handler:")
    public native void addOption(String title, UIImage image, @Representing("UIDocumentMenuOrder") long order, @Block Runnable handler);

}
