package at.oop.powered_device_management;

class BroadcastReceiver extends GridPoweredDevice implements RemoteControllable {

	private int volume;
	private int channel;
	
	public BroadcastReceiver(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable, int volume, int channel) {
		super(name, isPoweredOn, isConnectedToGrid, isManageable);
		this.channel = channel;
		this.volume = volume;
	}
	
	public boolean increaseVolume() {
		if (volume <= 100) {
			volume++;
			return true;
		} else {
			System.out.println("The volume is already set to MAXIMUM level.");
			return false;
		}
	}
	
	public boolean decreaseVolume() {
		if (volume >= 0) {
			volume--;
			return true;
		} else {
			System.out.println("The volume is already set to MINIMUM level.");
			return false;
		}
	}

	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void remotePowerOn() {
		powerOn();
	}
	
	public void remotePowerOff() {
		powerOff();
	}
	
	public boolean remoteIncreaseVolume() {
		return increaseVolume();
	}
	
	public boolean remoteDecreaseVolume() {
		return increaseVolume();
	}
	
}
