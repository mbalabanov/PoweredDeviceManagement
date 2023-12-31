package at.oop.powered_device_management;

interface RemoteControllable {
	public abstract void remotePowerOn();
	public abstract void remotePowerOff();
	public abstract boolean remoteIncreaseVolume();
	public abstract boolean remoteDecreaseVolume();
}
