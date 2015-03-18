package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFMutableArray 
    extends CFArray 
     {

    
    
    
    
    
    @GlobalFunction("CFArrayCreateMutable")
    public static native CFMutableArray createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFArrayCallBacks callBacks);
    @GlobalFunction("CFArrayCreateMutableCopy")
    public static native CFMutableArray createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFArray theArray);
    @GlobalFunction("CFArrayAppendValue")
    public static native void appendValue(CFArray theArray, Todo value);
    @GlobalFunction("CFArrayInsertValueAtIndex")
    public static native void insertValueAtIndex(CFArray theArray, @MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArraySetValueAtIndex")
    public static native void setValueAtIndex(CFArray theArray, @MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArrayRemoveValueAtIndex")
    public static native void removeValueAtIndex(CFArray theArray, @MachineSizedSInt long idx);
    @GlobalFunction("CFArrayRemoveAllValues")
    public static native void removeAllValues(CFArray theArray);
    @GlobalFunction("CFArrayReplaceValues")
    public static native void replaceValues(CFArray theArray, CFRange range, Todo newValues, @MachineSizedSInt long newCount);
    @GlobalFunction("CFArrayExchangeValuesAtIndices")
    public static native void exchangeValuesAtIndices(CFArray theArray, @MachineSizedSInt long idx1, @MachineSizedSInt long idx2);
    @GlobalFunction("CFArraySortValues")
    public static native void sortValues(CFArray theArray, CFRange range, FunctionPtr comparator, Todo context);
    @GlobalFunction("CFArrayAppendArray")
    public static native void appendArray(CFArray theArray, CFArray otherArray, CFRange otherRange);
    
}
