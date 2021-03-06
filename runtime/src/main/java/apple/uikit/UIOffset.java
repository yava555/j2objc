package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


@Mapping("UIOffset") @Library("UIKit/UIKit.h")
public class UIOffset 
    extends Struct 
     {

    
    private UIOffset() {}
    
    
    @DotMapping("horizontal")
    public native @MachineSizedFloat double getHorizontal();
    @DotMapping("vertical")
    public native @MachineSizedFloat double getVertical();

    public static native UIOffset create(@MachineSizedFloat double horizontal, @MachineSizedFloat double vertical) /*-[
        UIOffset __new = { .horizontal = horizontal, .vertical = vertical };
        return __new;
    ]-*/;
    public static native UIOffset copyWithhorizontal(UIOffset original, @MachineSizedFloat double horizontal) /*-[
        UIOffset __new = { .horizontal = horizontal, .vertical = original.vertical };
        return __new;
    ]-*/;


    public static native UIOffset copyWithvertical(UIOffset original, @MachineSizedFloat double vertical) /*-[
        UIOffset __new = { .horizontal = original.horizontal, .vertical = vertical };
        return __new;
    ]-*/;


    public static final class Adapter {

        public @MachineSizedFloat double horizontal;
        public @MachineSizedFloat double vertical;
        public Adapter(@MachineSizedFloat double horizontal, @MachineSizedFloat double vertical) {
            this.horizontal = horizontal;
            this.vertical = vertical;
        }
        public Adapter(UIOffset original) {
            this.horizontal = original.getHorizontal();
            this.vertical = original.getVertical();
        }
        public UIOffset convert() {
            return create(horizontal, vertical);
        }
    }
    @GlobalConstant("UIOffsetZero")
    public static native UIOffset Zero();

    @GlobalFunction("NSStringFromUIOffset")
    public static native String toString(UIOffset offset);
    @GlobalFunction("UIOffsetFromString")
    public static native UIOffset fromString(String string);

}
