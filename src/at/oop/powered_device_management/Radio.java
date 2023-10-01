package at.oop.powered_device_management;

import java.util.ArrayList;

class Radio extends BroadcastReceiver {

	private final ArrayList<Double> channels = new ArrayList<>();;
	
	public Radio(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable, int volume,
			int channel) {
		super(name, isPoweredOn, isConnectedToGrid, isManageable, volume, channel);
	}
	
    public void setFrequencyOnChannel(int index, double value) {
        while(index >= channels.size()) {
            channels.add(null);
        }
        channels.set(index, value);
    }
    
    public Double getFrequencyOnChannel(int index) {
    	return channels.get(index);
    }
    
    public String getFrequenciesAllChannels() {
    	return channels.toString();
    }
	
	@Override
	public String toString() {
		return "Radio " + getName() + " (Is connected to grid: " + getGridConnectionState() + "; is powered on: " + getPoweredState() + "; is mangageable by device manager: " + getManageability() + ")"
				+ "\nVolume: " + getVolume() + "\nCurrently selected channel:  " + getChannel() + "\nAll available channel frequencies: " + getFrequenciesAllChannels() + "\n";
	}
}
