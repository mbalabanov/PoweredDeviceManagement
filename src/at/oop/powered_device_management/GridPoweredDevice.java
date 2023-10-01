package at.oop.powered_device_management;

class GridPoweredDevice extends PoweredDevice {

	private boolean isConnectedToGrid;
	private boolean isManageable;
	
	public GridPoweredDevice(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable) {
		super(name, isPoweredOn);
		this.isConnectedToGrid = isConnectedToGrid;
		this.isManageable = isManageable;
	}
	
	public void connectToGrid() {
		isConnectedToGrid = true;
	}
	
	public void disconnectFromGrid() {
		isConnectedToGrid = false;
	}
	
	public boolean getGridConnectionState() {
		return isConnectedToGrid;
	}
	
	public void setManageability(boolean manage) {
		isManageable = manage;
	}
	
	public boolean getManageability() {
		return isManageable;
	}

}
