package at.oop.powered_device_management;

class BatteryPoweredDevice extends PoweredDevice {

	private int batteryLevel;
	
	public BatteryPoweredDevice(String name, boolean isPoweredOn, int batteryLevel) {
		super(name, isPoweredOn);
		this.batteryLevel = batteryLevel; 
	}
	
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	public void chargeBatteryLevel() {
		batteryLevel = 100;
	}
}
