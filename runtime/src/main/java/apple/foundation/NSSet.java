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


@Library("Foundation/Foundation.h") @Mapping("NSSet")
public class NSSet <T>
    extends NSObject 
    implements NSFastEnumeration {

    
    
    public NSSet() {}
    @Mapping("initWithObjects:count:")
    public NSSet(Todo objects, @MachineSizedUInt long cnt) { }
    @Mapping("initWithSet:")
    public NSSet(NSSet<?> set) { }
    @Mapping("initWithArray:")
    public NSSet(NSArray<?> array) { }

    
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    @Mapping("allObjects")
    public native NSArray<T> getValues();

    
    
    @Mapping("member:")
    public native Object isMember(Object object);
    @Mapping("objectEnumerator")
    public native NSEnumerator<T> objectEnumerator();
    @Mapping("anyObject")
    public native T any();
    @Mapping("containsObject:")
    public native boolean containsObject(Object anObject);

}
