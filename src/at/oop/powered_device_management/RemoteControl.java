package at.oop.powered_device_management;

import java.util.ArrayList;

class RemoteControl extends BatteryPoweredDevice {

	private ArrayList<BroadcastReceiver> controlledDevices;
	
	public RemoteControl(int id, String name, boolean isPoweredOn, int batteryLevel) {
		super(name, isPoweredOn, batteryLevel);
		controlledDevices = new ArrayList<>();
	}
	
	public void addDevice(BroadcastReceiver addedDevice ) {
		controlledDevices.add(addedDevice);
	}
	
	public boolean removeDevice(BroadcastReceiver removedDevice ) {
		return controlledDevices.remove(removedDevice);
	}

	// TO DO: Add methods for volume (increase / decrease one device, all devices)
	// TO DO: Add methods for setChannle (one device, all devices)
	
	@Override
	public String toString() {
		return "RemoteControl [controlledDevices=" + controlledDevices + "]";
	}
	
}
