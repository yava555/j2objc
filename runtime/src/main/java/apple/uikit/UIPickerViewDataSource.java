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


@Library("UIKit/UIKit.h") @Mapping("UIPickerViewDataSource")
public interface UIPickerViewDataSource 
    extends NSObjectProtocol {

    
    


    
    @Mapping("numberOfComponentsInPickerView:")
    @MachineSizedSInt long getNumberOfComponents(UIPickerView pickerView);
    @Mapping("pickerView:numberOfRowsInComponent:")
    @MachineSizedSInt long getNumberOfRows(UIPickerView pickerView, @MachineSizedSInt long component);

    /*<adapter>*/
    /*</adapter>*/
}
