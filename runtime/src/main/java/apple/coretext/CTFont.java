package apple.coretext;


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
@Library("CoreText/CoreText.h")
public class CTFont 
    extends CFType 
     {

    
    
    protected CTFont() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithName")
    public static native CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithFontDescriptor")
    public static native CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithNameAndOptions")
    public static native CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithFontDescriptorAndOptions")
    public static native CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateUIFontForLanguage")
    public static native CTFont create(CTFontUIFontType uiType, @MachineSizedFloat double size, String language);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithAttributes")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithSymbolicTraits")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontSymbolicTraits symTraitValue, CTFontSymbolicTraits symTraitMask);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithFamily")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, String family);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateForString")
    public static native CTFont create(CTFont currentFont, String string, CFRange range);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFontDescriptor")
    public static native CTFontDescriptor getFontDescriptor(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyAttribute")
    public static native CFType getAttribute(CTFont font, String attribute);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSize")
    public static native @MachineSizedFloat double getSize(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetMatrix")
    public static native CGAffineTransform getMatrix(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSymbolicTraits")
    public static native CTFontSymbolicTraits getSymbolicTraits(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyTraits")
    public static native CTFontTraits getTraits(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyPostScriptName")
    public static native String getPostScriptName(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFamilyName")
    public static native String getFamilyName(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFullName")
    public static native String getFullName(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyDisplayName")
    public static native String getDisplayName(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyName")
    protected static native String getName(CTFont font, String nameKey);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyLocalizedName")
    protected static native String getLocalizedName(CTFont font, String nameKey, Todo actualLanguage);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyCharacterSet")
    public static native NSCharacterSet getCharacterSet(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetStringEncoding")
    public static native int getStringEncoding(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopySupportedLanguages")
    public static native List<String> getSupportedLanguages(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphsForCharacters")
    protected static native boolean getGlyphs(CTFont font, Todo characters, Todo glyphs, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetAscent")
    public static native @MachineSizedFloat double getAscent(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetDescent")
    public static native @MachineSizedFloat double getDescent(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetLeading")
    public static native @MachineSizedFloat double getLeading(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnitsPerEm")
    public static native int getUnitsPerEm(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphCount")
    public static native @MachineSizedSInt long getGlyphCount(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetBoundingBox")
    public static native CGRect getBoundingBox(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnderlinePosition")
    public static native @MachineSizedFloat double getUnderlinePosition(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnderlineThickness")
    public static native @MachineSizedFloat double getUnderlineThickness(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSlantAngle")
    public static native @MachineSizedFloat double getSlantAngle(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetCapHeight")
    public static native @MachineSizedFloat double getCapHeight(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetXHeight")
    public static native @MachineSizedFloat double getXHeight(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphWithName")
    public static native short getGlyph(CTFont font, String glyphName);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetBoundingRectsForGlyphs")
    protected static native CGRect getBoundingRects(CTFont font, CTFontOrientation orientation, Todo glyphs, CGRect boundingRects, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontGetOpticalBoundsForGlyphs")
    protected static native CGRect getOpticalBounds(CTFont font, Todo glyphs, CGRect boundingRects, @MachineSizedSInt long count, @MachineSizedUInt long options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetAdvancesForGlyphs")
    protected static native double getAdvances(CTFont font, CTFontOrientation orientation, Todo glyphs, CGSize advances, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetVerticalTranslationsForGlyphs")
    protected static native void getVerticalTranslations(CTFont font, Todo glyphs, CGSize translations, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreatePathForGlyph")
    public static native CGPath createPath(CTFont font, short glyph, CGAffineTransform transform);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyVariationAxes")
    public static native List<CTFontVariationAxes> getVariationAxes(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyVariation")
    public static native CFDictionary getVariation(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFeatures")
    public static native CFArray getFeatures(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFeatureSettings")
    public static native CFArray getFeatureSettings(CTFont font);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyGraphicsFont")
    public static native CGFont getGraphicsFont(CTFont font, Todo attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithGraphicsFont")
    public static native CTFont create(CGFont graphicsFont, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyAvailableTables")
    public static native CFArray getAvailableTables(CTFont font, CTFontTableOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyTable")
    public static native NSData getTable(CTFont font, CTFontTableTag table, CTFontTableOptions options);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("CTFontDrawGlyphs")
    public static native void drawGlyphs(CTFont font, Todo glyphs, CGPoint positions, @MachineSizedUInt long count, CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetLigatureCaretPositions")
    public static native @MachineSizedSInt long getLigatureCaretPositions(CTFont font, short glyph, Todo positions, @MachineSizedSInt long maxPositions);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontCopyDefaultCascadeListForLanguages")
    public static native CFArray getDefaultCascadeList(CTFont font, CFArray languagePrefList);
    
}