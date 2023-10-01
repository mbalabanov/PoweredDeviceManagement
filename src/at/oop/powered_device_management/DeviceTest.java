package at.oop.powered_device_management;

class DeviceTest {

	public static void main(String[] args) {
		
		// Tests for CoffeeMaker - Individual
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


		// Tests for TableLamp - Individual
		System.out.println("* * * *");
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

		// Tests for Radio - Individual
		System.out.println("* * * *");
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
		
		
		// Tests for Television - Individual
		System.out.println("* * * *");
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
				
	}

}
