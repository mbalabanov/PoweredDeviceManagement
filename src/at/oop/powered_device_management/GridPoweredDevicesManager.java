package at.oop.powered_device_management;

import java.util.ArrayList;

class GridPoweredDevicesManager {

	private ArrayList<GridPoweredDevice> managedDevices;
	private String name;
	
	public GridPoweredDevicesManager(String name) {
		managedDevices = new ArrayList<>();
		this.name = name;
	}
	
	public String getname() {
		return name;
	}

	public void addDevice(GridPoweredDevice addedDevice ) {
		managedDevices.add(addedDevice);
	}
	
	public boolean removeDevice(GridPoweredDevice removedDevice ) {
		return managedDevices.remove(removedDevice);
	}
	
	public String getAllManagedDevices() {
		if (managedDevices.isEmpty()) return "No managed devices yet.";
		String deviceList = "";
		for (GridPoweredDevice managedDevice : managedDevices) {
			deviceList += managedDevice.getName() + " (" + managedDevice.getClass().getSimpleName() + "), ";
		}
		return deviceList;
	}
	
	public void powerOnAllDevices() {
		if (!managedDevices.isEmpty()) {
			for (GridPoweredDevice DeviceToSet : managedDevices) {
				DeviceToSet.powerOn();
			}	
		}
	}
	
	public void powerOffAllDevices() {
		if (!managedDevices.isEmpty()) {
			for (GridPoweredDevice DeviceToSet : managedDevices) {
				DeviceToSet.powerOff();
			}	
		}
	}
	
	public void powerOnDevice(GridPoweredDevice deviceToPowerOn) {
		deviceToPowerOn.powerOn();
	}
	
	public void powerOffDevice(GridPoweredDevice deviceToPowerOff) {
		deviceToPowerOff.powerOff();
	}

	@Override
	public String toString() {
		return "GridPoweredDevicesManager: " + name + "\nManagedDevices: " + getAllManagedDevices() + "\n";
	}

	
}
