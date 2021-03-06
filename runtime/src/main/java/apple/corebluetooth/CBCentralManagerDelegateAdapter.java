package apple.corebluetooth;


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
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class CBCentralManagerDelegateAdapter 
    extends Object 
    implements CBCentralManagerDelegate {

    
    
    


    
    
    @NotImplemented("centralManagerDidUpdateState:")
    public void didUpdateState(CBCentralManager central) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:willRestoreState:")
    public void willRestoreState(CBCentralManager central, NSDictionary<?, ?> dict) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didRetrievePeripherals:")
    public void didRetrievePeripherals(CBCentralManager central, NSArray<?> peripherals) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didRetrieveConnectedPeripherals:")
    public void didRetrieveConnectedPeripherals(CBCentralManager central, NSArray<?> peripherals) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didDiscoverPeripheral:advertisementData:RSSI:")
    public void didDiscoverPeripheral(CBCentralManager central, CBPeripheral peripheral, NSDictionary<?, ?> advertisementData, NSNumber RSSI) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didConnectPeripheral:")
    public void didConnectPeripheral(CBCentralManager central, CBPeripheral peripheral) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didFailToConnectPeripheral:error:")
    public void didFailToConnectPeripheral(CBCentralManager central, CBPeripheral peripheral, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("centralManager:didDisconnectPeripheral:error:")
    public void didDisconnectPeripheral(CBCentralManager central, CBPeripheral peripheral, NSError error) { throw new UnsupportedOperationException(); }

}
