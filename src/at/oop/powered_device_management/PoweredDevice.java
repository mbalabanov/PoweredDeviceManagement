package at.oop.powered_device_management;

class PoweredDevice {
	private String name;
	private boolean isPoweredOn;
	
	public PoweredDevice(String name, boolean isPoweredOn) {
		this.name = name;
		this.isPoweredOn = isPoweredOn;
	}

	public boolean getPoweredState() {
		return isPoweredOn;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
			return true;
		}
		return false;
	}
	
	public void powerOn() {
		isPoweredOn = true;
	}
	
	public void powerOff() {
		isPoweredOn = false;
	}
	
	public void setPowerState(boolean state) {
		isPoweredOn = state;
	}	

}
