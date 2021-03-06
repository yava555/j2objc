package apple.eventkitui;


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
import apple.eventkit.*;
import apple.uikit.*;


@Library("EventKitUI/EventKitUI.h")
@Mapping("EKEventViewAction")
public final class EKEventViewAction extends ObjCEnum {
    
    @GlobalConstant("EKEventViewActionDone")
    public static final long Done = 0L;
    @GlobalConstant("EKEventViewActionResponded")
    public static final long Responded = 1L;
    @GlobalConstant("EKEventViewActionDeleted")
    public static final long Deleted = 2L;


}
