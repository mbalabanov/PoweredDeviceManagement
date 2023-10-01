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

	// TO DO: Add methods for setChannel (one device, all devices)
	
	public boolean remoteIncreaseVolume(BroadcastReceiver ControlledDevice) {
		return ControlledDevice.increaseRemoteVolume();
	}
	
	public boolean remoteIncreaseVolumeAllDevices(BroadcastReceiver ControlledDevice) {
		ControlledDevice.increaseVolume();
	}
	
	// TO DO: Add methods for volume (increase / decrease one device, all devices)
	
	@Override
	public String toString() {
		return "RemoteControl [controlledDevices=" + controlledDevices + "]";
	}
	
}
