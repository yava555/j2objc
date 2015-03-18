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
public class CFLocale 
    extends CFType 
     {

    
    
    protected CFLocale() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFLocaleCurrentLocaleDidChangeNotification")
    public static native NSString CurrentLocaleDidChangeNotification();
    
    @GlobalFunction("CFLocaleGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFLocaleGetSystem")
    public static native CFLocale getSystem();
    @GlobalFunction("CFLocaleCopyCurrent")
    public static native CFLocale getCurrent();
    @GlobalFunction("CFLocaleCopyAvailableLocaleIdentifiers")
    public static native List<String> getAvailableLocaleIdentifiers();
    @GlobalFunction("CFLocaleCopyISOLanguageCodes")
    public static native List<String> getISOLanguageCodes();
    @GlobalFunction("CFLocaleCopyISOCountryCodes")
    public static native List<String> getISOCountryCodes();
    @GlobalFunction("CFLocaleCopyISOCurrencyCodes")
    public static native List<String> getISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFLocaleCopyCommonISOCurrencyCodes")
    public static native List<String> getCommonISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFLocaleCopyPreferredLanguages")
    public static native List<String> getPreferredLanguages();
    @GlobalFunction("CFLocaleCreateCanonicalLanguageIdentifierFromString")
    public static native String getCanonicalLanguageIdentifier(CFAllocator allocator, String localeIdentifier);
    @GlobalFunction("CFLocaleCreateCanonicalLocaleIdentifierFromString")
    public static native String getCanonicalLocaleIdentifier(CFAllocator allocator, String localeIdentifier);
    @GlobalFunction("CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes")
    public static native String getCanonicalLocaleIdentifier(CFAllocator allocator, short lcode, short rcode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode")
    public static native String getLocaleIdentifierFromWindowsLocaleCode(CFAllocator allocator, int lcid);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier")
    public static native int getWindowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFLocaleGetLanguageCharacterDirection")
    public static native CFLocaleLanguageDirection getLanguageCharacterDirection(String isoLangCode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFLocaleGetLanguageLineDirection")
    public static native CFLocaleLanguageDirection getLanguageLineDirection(String isoLangCode);
    @GlobalFunction("CFLocaleCreateComponentsFromLocaleIdentifier")
    public static native Map<CFLocaleComponent, NSObject> getComponentsFromLocaleIdentifier(CFAllocator allocator, String localeID);
    @GlobalFunction("CFLocaleCreateLocaleIdentifierFromComponents")
    public static native String getLocaleIdentifierFromComponents(CFAllocator allocator, CFDictionary dictionary);
    @GlobalFunction("CFLocaleCreate")
    public static native CFLocale create(CFAllocator allocator, String localeIdentifier);
    @GlobalFunction("CFLocaleCreateCopy")
    public static native CFLocale createCopy(CFAllocator allocator, CFLocale locale);
    @GlobalFunction("CFLocaleGetIdentifier")
    public static native String getIdentifier(CFLocale locale);
    @GlobalFunction("CFLocaleGetValue")
    public static native CFType getComponent(CFLocale locale, String key);
    @GlobalFunction("CFLocaleCopyDisplayNameForPropertyValue")
    public static native String getComponentDisplayName(CFLocale displayLocale, String key, String value);
    
}
