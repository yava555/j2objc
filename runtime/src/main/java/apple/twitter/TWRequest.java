package apple.twitter;


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
import apple.social.*;
import apple.accounts.*;


/**
 * @since Available in iOS 5.0 and later.
 * @deprecated Deprecated in iOS 6.0.
 */
@Deprecated
@Library("Twitter/Twitter.h") @Mapping("TWRequest")
public class TWRequest 
    extends NSObject 
     {

    
    
    @Mapping("initWithURL:parameters:requestMethod:")
    public TWRequest(NSURL url, NSDictionary<?, ?> parameters, @Representing("TWRequestMethod") long requestMethod) { }
    @Mapping("init")
    public TWRequest() { }

    
    @Mapping("account")
    public native ACAccount getAccount();
    @Mapping("setAccount:")
    public native void setAccount(ACAccount v);
    @Mapping("requestMethod")
    public native @Representing("TWRequestMethod") long getRequestMethod();
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("parameters")
    public native NSDictionary<NSString, ?> getParameters();

    
    
    @Mapping("addMultiPartData:withName:type:")
    public native void addMultiPartData(NSData data, String name, String type);
    @Mapping("signedURLRequest")
    public native NSURLRequest getSignedURLRequest();

}
