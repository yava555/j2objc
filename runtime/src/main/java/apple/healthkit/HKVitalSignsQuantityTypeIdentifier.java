package apple.healthkit;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("HealthKit/HealthKit.h")
public class HKVitalSignsQuantityTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierHeartRate")
    public static native NSString HeartRateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBodyTemperature")
    public static native NSString BodyTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodPressureSystolic")
    public static native NSString BloodPressureSystolicValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodPressureDiastolic")
    public static native NSString BloodPressureDiastolicValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierRespiratoryRate")
    public static native NSString RespiratoryRateValue();

}
