package at.oop.powered_device_management;

class Television extends BroadcastReceiver {

	private int brightness;
	
	public Television(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable, int volume,
			int channel, int brightness) {
		super(name, isPoweredOn, isConnectedToGrid, isManageable, volume, channel);
		this.brightness = brightness;
	}
	
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
	public int getBrightness() {
		return brightness;
	}
	
	@Override
	public String toString() {
		return "Television " + getName() + " (Is connected to grid: " + getGridConnectionState() + "; is powered on: " + getPoweredState() + "; is mangageable by device manager: " + getManageability() + ")"
				+ "\nVolume: " + getVolume() + "\nCurrently selected channel:  " + getChannel() + "\nCurrent brightness: " + getBrightness() + "\n";
	}
	
}
