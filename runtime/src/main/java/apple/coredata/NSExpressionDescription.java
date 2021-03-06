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
@Library("CoreData/CoreData.h") @Mapping("NSExpressionDescription")
public class NSExpressionDescription 
    extends NSPropertyDescription 
     {

    
    
    @Mapping("initWithCoder:")
    public NSExpressionDescription(NSCoder aDecoder) { }
    @Mapping("init")
    public NSExpressionDescription() { }

    
    @Mapping("expression")
    public native NSExpression getExpression();
    @Mapping("setExpression:")
    public native void setExpression(NSExpression v);
    @Mapping("expressionResultType")
    public native @Representing("NSAttributeType") long getExpressionResultType();
    @Mapping("setExpressionResultType:")
    public native void setExpressionResultType(@Representing("NSAttributeType") long v);

    
    


}
