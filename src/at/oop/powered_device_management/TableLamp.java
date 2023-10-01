package at.oop.powered_device_management;

class TableLamp extends GridPoweredDevice {

	private int brightnessLevel;
	
	public TableLamp(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable, int brightnessLevel) {
		super(name, isPoweredOn, isConnectedToGrid, isManageable);
		this.brightnessLevel= brightnessLevel;
	}
	
	public void increaseBrightness() {
		if (getPoweredState() == false) {
			System.out.println("*** Can't set brightness level. The table lamp is powered off.\n");
			return;			
		}
		if (brightnessLevel >= 100) {
			System.out.println("*** The table lamp is already set to MAXIMUM brightness.\n");
			return;
		}
		brightnessLevel++;
	}
	
	public void decreaseBrightness() {
		if (brightnessLevel <= 0) {
			System.out.println("*** The table lamp is already set to MINIMUM brightness.\n");
			return;
		}
		brightnessLevel--;
	}
	
	public int getBrightnessLevel() {
		return brightnessLevel;
	}
	
	@Override
	public String toString() {
		return "TableLamp " + getName() + " (Is connected to grid: " + getGridConnectionState() + "; is powered on: " + getPoweredState() + "; is mangageable by device manager: " + getManageability() + ")\nBrightness Level: "
				+ brightnessLevel + "\n";
	}
	
}
