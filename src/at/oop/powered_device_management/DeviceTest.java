package at.oop.powered_device_management;

class DeviceTest {

	public static void main(String[] args) {
		
		System.out.println("\nTests for CoffeeMaker - Individual Device");
		CoffeeMaker firstCoffeeMaker = new CoffeeMaker("Nespresso Ravioli", true, true, true, 100, 100, true);

		System.out.println("New CoffeeMaker with initial values.");
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Powering off.");
		firstCoffeeMaker.powerOff();
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Disconnecting from grid.");
		firstCoffeeMaker.disconnectFromGrid();
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Try to make coffee while disconnected from grid and powered off.");
		firstCoffeeMaker.makeCoffee();
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Reconnect to grid and power on. Make fresh coffee.");
		firstCoffeeMaker.powerOn();
		firstCoffeeMaker.connectToGrid();
		firstCoffeeMaker.makeCoffee();
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Drink coffee.");
		firstCoffeeMaker.drinkCoffee();
		System.out.println(firstCoffeeMaker);
		
		System.out.println("Add water, coffee powder and filter. Make fresh coffee.");
		firstCoffeeMaker.setWaterLevel(50);
		firstCoffeeMaker.setCoffeePowderLevel(50);
		firstCoffeeMaker.addFilter();
		firstCoffeeMaker.makeCoffee();
		System.out.println(firstCoffeeMaker);


		System.out.println("\n* * * *");
		System.out.println("Tests for TableLamp - Individual Device");
		System.out.println("New TableLamp with initial values.");
		TableLamp firstTableLamp = new TableLamp("Ikea Lindby", true, true, true, 0);
		System.out.println(firstTableLamp);
		
		System.out.println("Increase brightness by three levels.");
		for (int level = 0; level <= 2; level++) {
			firstTableLamp.increaseBrightness();			
		}
		System.out.println(firstTableLamp);
		
		System.out.println("Decrease brightness by two levels.");
		for (int level = 0; level <= 1; level++) {
			firstTableLamp.decreaseBrightness();			
		}
		System.out.println(firstTableLamp);
		
		System.out.println("Decrease brightness below 0.");
		for (int level = 0; level <= 1; level++) {
			firstTableLamp.decreaseBrightness();			
		}
		System.out.println(firstTableLamp);
		
		System.out.println("Power lamp off.");
		firstTableLamp.powerOff();
		System.out.println(firstTableLamp);
		
		System.out.println("Power lamp on and increase brightness by one level.");
		firstTableLamp.powerOn();
		firstTableLamp.increaseBrightness();
		System.out.println(firstTableLamp);


		
		System.out.println("\n* * * *");
		System.out.println("Tests for Radio - Individual Device");
		System.out.println("New Radio with initial values.");
		Radio firstRadio = new Radio("Sony WaveRider", true, true, true, 10, 4);
		System.out.println(firstRadio);
		
		System.out.println("Increasing radio volume by two levels.");
		firstRadio.increaseVolume();
		firstRadio.increaseVolume();
		System.out.println(firstRadio);
	
		System.out.println("Setting radio channel to 12.");
		firstRadio.setChannel(12);
		System.out.println(firstRadio);
		
		System.out.println("Setting frequency 88.8 on channel 3 and frequency 103.5 on channel 1.");
		firstRadio.setFrequencyOnChannel(3, 88.8);
		firstRadio.setFrequencyOnChannel(1, 103.5);
		System.out.println(firstRadio);
		
		
		System.out.println("\n* * * *");
		System.out.println("Tests for Television - Individual Device.");
		System.out.println("New Television with initial values.");
		Television firstTelevision = new Television("LG 546", true, true, true, 6, 7, 8);
		System.out.println(firstTelevision);
		
		System.out.println("Increasing TV volume by two levels.");
		firstTelevision.increaseVolume();
		firstTelevision.increaseVolume();
		System.out.println(firstTelevision);
		
		System.out.println("Setting TV brightness to 10.");
		firstTelevision.setBrightness(10);
		System.out.println(firstTelevision);
		
		System.out.println("Setting TV channel to 5.");
		firstTelevision.setChannel(5);
		System.out.println(firstTelevision);


		System.out.println("\n* * * *");
		System.out.println("Tests for RemoteControl - Individual and Multiple Devices.");
		System.out.println("New RemoteControl with initial values.");
		RemoteControl firstRemote = new RemoteControl("UnversalBeam", true, 100);
		System.out.println(firstRemote);
		
		System.out.println("Television and radio added to controlledDevices.");
		firstRemote.addDevice(firstTelevision);
		firstRemote.addDevice(firstRadio);
		System.out.println(firstRemote);
		
		System.out.println("Increase volume of radio by two using the remote control.");
		System.out.println("Original radio volume: " + firstRadio.getVolume());
		firstRemote.remoteIncreaseVolume(firstRadio);
		firstRemote.remoteIncreaseVolume(firstRadio);
		System.out.println("Increased radio volume: " + firstRadio.getVolume() + "\n");
		
		System.out.println("Decrease volume of television using the remote control.");
		System.out.println("Original TV volume: " + firstTelevision.getVolume());
		firstRemote.remoteDecreaseVolume(firstTelevision);
		System.out.println("Increased TV volume: " + firstTelevision.getVolume() + "\n");
		
		System.out.println("Set channel on television to 8 using the remote control.");
		System.out.println("Original TV channel: " + firstTelevision.getChannel());
		firstRemote.setChannel(firstTelevision, 8);
		System.out.println("Changed TV channel: " + firstTelevision.getChannel() + "\n");
		
		System.out.println("Set channel to 0 on both devices using the remote control.");
		System.out.println("Original TV channel: " + firstTelevision.getChannel());
		System.out.println("Original Radio channel: " + firstRadio.getChannel());
		firstRemote.setChannelAllDevices(0);
		System.out.println("Changed TV channel: " + firstTelevision.getChannel());
		System.out.println("Changed Radio channel: " + firstRadio.getChannel() + "\n");
		
		System.out.println("Increase volume by 3 on both devices using the remote control.");
		System.out.println("Original TV volume: " + firstTelevision.getVolume() + ". Original Radio volume: " + firstRadio.getVolume());
		firstRemote.remoteIncreaseVolumeAllDevices();
		firstRemote.remoteIncreaseVolumeAllDevices();
		firstRemote.remoteIncreaseVolumeAllDevices();
		System.out.println("Changed TV volume: " + firstTelevision.getVolume() + ". Changed Radio volume: " + firstRadio.getVolume() + "\n");
		
		System.out.println("Power off Television using remote control");
		firstRemote.remotePowerOff(firstTelevision);
		System.out.println(firstTelevision);
		
		System.out.println("Power Television back on using remote control");
		firstRemote.remotePowerOn(firstTelevision);
		System.out.println(firstTelevision);
		
		System.out.println("Power off all controlled devices using remote control");
		firstRemote.remotePowerOffAllDevices();
		System.out.println(firstTelevision);
		System.out.println(firstRadio);
		
		System.out.println("Power on all controlled devices using remote control");
		firstRemote.remotePowerOnAllDevices();
		System.out.println(firstTelevision);
		System.out.println(firstRadio);

		
		System.out.println("\n* * * *");
		System.out.println("Tests for GridPoweredDevicesManager - Individual and Multiple Devices.");
		System.out.println("New DeviceManager with initial values.");
		GridPoweredDevicesManager firstDeviceManager = new GridPoweredDevicesManager("Director");
		System.out.println(firstDeviceManager);
		
		System.out.println("Add all four devices to DeviceManager.");
		firstDeviceManager.addDevice(firstCoffeeMaker);
		firstDeviceManager.addDevice(firstTableLamp);
		firstDeviceManager.addDevice(firstTelevision);
		firstDeviceManager.addDevice(firstRadio);
		System.out.println(firstDeviceManager);
		
		System.out.println("Current power state of each devices:");
		System.out.println("CoffeMaker powered: " + firstCoffeeMaker.getPoweredState() + "\nTable Lamp powered: " + firstTableLamp.getPoweredState() + "\nRadio powered: " + firstRadio.getPoweredState() + "\nTelevision powered: " + firstTelevision.getPoweredState() + "\n");
		
		System.out.println("Power off all devices.");
		firstDeviceManager.powerOffAllDevices();
		System.out.println("New changed power state of each devices:");
		System.out.println("CoffeMaker powered: " + firstCoffeeMaker.getPoweredState() + "\nTable Lamp powered: " + firstTableLamp.getPoweredState() + "\nRadio powered: " + firstRadio.getPoweredState() + "\nTelevision powered: " + firstTelevision.getPoweredState() + "\n");
		
	}

}
