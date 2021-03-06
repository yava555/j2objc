package apple.multipeerconnectivity;


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
import apple.security.*;


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("MultipeerConnectivity/MultipeerConnectivity.h")
@Mapping("MCEncryptionPreference")
public final class MCEncryptionPreference extends ObjCEnum {
    
    @GlobalConstant("MCEncryptionOptional")
    public static final long Optional = 0L;
    @GlobalConstant("MCEncryptionRequired")
    public static final long Required = 1L;
    @GlobalConstant("MCEncryptionNone")
    public static final long None = 2L;


}
