package at.oop.powered_device_management;

import java.util.ArrayList;

class RemoteControl extends BatteryPoweredDevice {

	private ArrayList<BroadcastReceiver> controlledDevices;
	
	public RemoteControl(String name, boolean isPoweredOn, int batteryLevel) {
		super(name, isPoweredOn, batteryLevel);
		controlledDevices = new ArrayList<>();
	}
	
	public void addDevice(BroadcastReceiver addedDevice ) {
		controlledDevices.add(addedDevice);
	}
	
	public boolean removeDevice(BroadcastReceiver removedDevice ) {
		if (checkBatteryEmpty()) return false;
		return controlledDevices.remove(removedDevice);
	}
	
	public String getControlledDevices() {
		if (controlledDevices.isEmpty()) return "No controlled devices yet.";
		String deviceList = "";
		for (BroadcastReceiver controlledDevice : controlledDevices) {
			deviceList += controlledDevice.getName() + " (" + controlledDevice.getClass().getSimpleName() + "), ";
		}
		depleteBattery(1);
		return deviceList;
	}
	
	public boolean remoteIncreaseVolume(BroadcastReceiver DeviceToSet) {
		if (checkBatteryEmpty()) return false;
		return DeviceToSet.remoteIncreaseVolume();
	}
	
	public boolean remoteDecreaseVolume(BroadcastReceiver DeviceToSet) {
		if (checkBatteryEmpty()) return false;
		return DeviceToSet.remoteDecreaseVolume();
	}
	
	public void remoteIncreaseVolumeAllDevices() {
		if (checkBatteryEmpty()) return;
		for (BroadcastReceiver DeviceToSet : controlledDevices) {
			DeviceToSet.remoteIncreaseVolume();
		}
		depleteBattery(5);
	}
	
	public void remoteDecreaseVolumeAllDevices() {
		if (checkBatteryEmpty()) return;
		if (!controlledDevices.isEmpty()) {
			for (BroadcastReceiver DeviceToSet : controlledDevices) {
				DeviceToSet.remoteDecreaseVolume();
			}	
		}
		depleteBattery(5);
	}
	
	public void setChannel(BroadcastReceiver DeviceToSet, int channel) {
		if (checkBatteryEmpty()) return;
		DeviceToSet.setChannel(channel);
		depleteBattery(1);
	}
	
	public void setChannelAllDevices(int channel) {
		if (checkBatteryEmpty()) return;
		if (!controlledDevices.isEmpty()) {
			for (BroadcastReceiver DeviceToSet : controlledDevices) {
				DeviceToSet.setChannel(channel);
			}	
		}
		depleteBattery(5);
	}
	
	public void remotePowerOn(BroadcastReceiver DeviceToSet) {
		if (checkBatteryEmpty()) return;
		DeviceToSet.powerOn();
	}
	
	public void remotePowerOff(BroadcastReceiver DeviceToSet) {
		if (checkBatteryEmpty()) return;
		DeviceToSet.powerOff();
	}
	
	public void remotePowerOnAllDevices() {
		if (checkBatteryEmpty()) return;
		if (!controlledDevices.isEmpty()) {
			for (BroadcastReceiver DeviceToSet : controlledDevices) {
				DeviceToSet.powerOn();
			}	
		}
		depleteBattery(5);
	}
	
	public void remotePowerOffAllDevices() {
		if (checkBatteryEmpty()) return;
		if (!controlledDevices.isEmpty()) {
			for (BroadcastReceiver DeviceToSet : controlledDevices) {
				DeviceToSet.powerOff();
			}	
		}
		depleteBattery(5);
	}
	
	@Override
	public String toString() {
		return "RemoteControl " + getName() + " (Powered on: " + getPoweredState() + "; battery level: " + getBatteryLevel() + "%)\nControlledDevices: " + getControlledDevices() + "\n";
	}
	
}
