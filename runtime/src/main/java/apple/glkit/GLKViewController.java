package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 5.0 and later.
 */
@Library("GLKit/GLKit.h") @Mapping("GLKViewController")
public class GLKViewController 
    extends UIViewController 
    implements NSCoding, GLKViewDelegate {

    
    
    @Mapping("initWithNibName:bundle:")
    public GLKViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public GLKViewController() { }

    
    @Mapping("delegate")
    public native GLKViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(GLKViewControllerDelegate v);
    @Mapping("preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();
    @Mapping("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);
    @Mapping("framesPerSecond")
    public native @MachineSizedSInt long getFramesPerSecond();
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("setPaused:")
    public native void setPaused(boolean v);
    @Mapping("framesDisplayed")
    public native @MachineSizedSInt long getFramesDisplayed();
    @Mapping("timeSinceFirstResume")
    public native double getTimeSinceFirstResume();
    @Mapping("timeSinceLastResume")
    public native double getTimeSinceLastResume();
    @Mapping("timeSinceLastUpdate")
    public native double getTimeSinceLastUpdate();
    @Mapping("timeSinceLastDraw")
    public native double getTimeSinceLastDraw();
    @Mapping("pauseOnWillResignActive")
    public native boolean pausesOnWillResignActive();
    @Mapping("setPauseOnWillResignActive:")
    public native void setPausesOnWillResignActive(boolean v);
    @Mapping("resumeOnDidBecomeActive")
    public native boolean resumesOnDidBecomeActive();
    @Mapping("setResumeOnDidBecomeActive:")
    public native void setResumesOnDidBecomeActive(boolean v);

    
    
    @Mapping("glkView:drawInRect:")
    public native void draw(GLKView view, CGRect rect);

}
