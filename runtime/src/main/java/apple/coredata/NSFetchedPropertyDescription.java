package apple.coredata;


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


/**
 * @since Available in iOS 3.0 and later.
 */
@Library("CoreData/CoreData.h") @Mapping("NSFetchedPropertyDescription")
public class NSFetchedPropertyDescription 
    extends NSPropertyDescription 
     {

    
    
    @Mapping("initWithCoder:")
    public NSFetchedPropertyDescription(NSCoder aDecoder) { }
    @Mapping("init")
    public NSFetchedPropertyDescription() { }

    
    @Mapping("fetchRequest")
    public native NSFetchRequest getFetchRequest();
    @Mapping("setFetchRequest:")
    public native void setFetchRequest(NSFetchRequest v);

    
    


}
