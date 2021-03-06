package apple.coremotion;


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


@Mapping("CMRotationMatrix") @Library("CoreMotion/CoreMotion.h")
public class CMRotationMatrix 
    extends Struct 
     {

    
    private CMRotationMatrix() {}
    
    
    @DotMapping("m11")
    public native double getM11();
    @DotMapping("m12")
    public native double getM12();
    @DotMapping("m13")
    public native double getM13();
    @DotMapping("m21")
    public native double getM21();
    @DotMapping("m22")
    public native double getM22();
    @DotMapping("m23")
    public native double getM23();
    @DotMapping("m31")
    public native double getM31();
    @DotMapping("m32")
    public native double getM32();
    @DotMapping("m33")
    public native double getM33();

    public static native CMRotationMatrix create(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33) /*-[
        CMRotationMatrix __new = { .m11 = m11, .m12 = m12, .m13 = m13, .m21 = m21, .m22 = m22, .m23 = m23, .m31 = m31, .m32 = m32, .m33 = m33 };
        return __new;
    ]-*/;
    public static native CMRotationMatrix copyWithm11(CMRotationMatrix original, double m11) /*-[
        CMRotationMatrix __new = { .m11 = m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm12(CMRotationMatrix original, double m12) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm13(CMRotationMatrix original, double m13) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm21(CMRotationMatrix original, double m21) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm22(CMRotationMatrix original, double m22) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm23(CMRotationMatrix original, double m23) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = m23, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm31(CMRotationMatrix original, double m31) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = m31, .m32 = original.m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm32(CMRotationMatrix original, double m32) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = m32, .m33 = original.m33 };
        return __new;
    ]-*/;


    public static native CMRotationMatrix copyWithm33(CMRotationMatrix original, double m33) /*-[
        CMRotationMatrix __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m31 = original.m31, .m32 = original.m32, .m33 = m33 };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double m11;
        public double m12;
        public double m13;
        public double m21;
        public double m22;
        public double m23;
        public double m31;
        public double m32;
        public double m33;
        public Adapter(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33) {
            this.m11 = m11;
            this.m12 = m12;
            this.m13 = m13;
            this.m21 = m21;
            this.m22 = m22;
            this.m23 = m23;
            this.m31 = m31;
            this.m32 = m32;
            this.m33 = m33;
        }
        public Adapter(CMRotationMatrix original) {
            this.m11 = original.getM11();
            this.m12 = original.getM12();
            this.m13 = original.getM13();
            this.m21 = original.getM21();
            this.m22 = original.getM22();
            this.m23 = original.getM23();
            this.m31 = original.getM31();
            this.m32 = original.getM32();
            this.m33 = original.getM33();
        }
        public CMRotationMatrix convert() {
            return create(m11, m12, m13, m21, m22, m23, m31, m32, m33);
        }
    }
}
