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
	
	public void depleteBattery(int usage) {
		if (batteryLevel >= usage) {
			batteryLevel = usage;
		}
	}
	
	public boolean checkBatteryEmpty() {
		if (getBatteryLevel() <= 0) {
			System.out.println("*** The battery is empty!\n");
			powerOff();
			return true;
		}
		return false;
	}
}
