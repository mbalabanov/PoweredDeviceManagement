package at.oop.powered_device_management;

class CoffeeMaker extends GridPoweredDevice{

	private int coffeePowderLevel;
	private int waterLevel;
	private boolean hasFilter;
	private int coffeeLevel = 0;
	
	public CoffeeMaker(String name, boolean isPoweredOn, boolean isConnectedToGrid, boolean isManageable, int coffeePowderLevel, int waterLevel, boolean hasFilter) {
		super(name, isPoweredOn, isConnectedToGrid, isManageable);
		this.coffeePowderLevel = coffeePowderLevel;
		this.waterLevel = waterLevel;
		this.hasFilter = hasFilter;
	}
	
	public void setCoffeePowderLevel(int amount) {
		coffeePowderLevel = amount;
	}
	
	public int getCoffeePowderLevel() {
		return coffeePowderLevel;
	}
	
	public void setWaterLevel(int amount) {
		waterLevel = amount;
	}
	
	public int getWaterLevel() {
		return waterLevel;
	}
	
	public void addFilter() {
		hasFilter = true; 
	}
	
	public boolean getFilterState() {
		return hasFilter;
	}
	
	public int getCoffeeLevel() {
		return coffeeLevel;
	}
	
	public boolean makeCoffee() {
		if (getGridConnectionState() == false || getPoweredState() == false) {
			System.out.println("*** Make sure that " + getName() + " is connected to the grid and powered on.\n");
		} else if (coffeeLevel > 0) {
			System.out.println("*** No need to make new coffee, there already is some coffee ready for you.\n");
		} else if (coffeePowderLevel > 0 && waterLevel > 0 && hasFilter) {
			System.out.println("*** Freshly brewed coffee is ready for you.\n");
			coffeeLevel = waterLevel;
			coffeePowderLevel = 0;
			waterLevel = 0;
			hasFilter = false;
			return true;
		} else {
			System.out.println("*** You can't make any coffee, check coffee powder, water level and filter first.\n");
		}
		return false;
	}
	
	public void drinkCoffee() {
		if (coffeeLevel > 0) {
			System.out.println("*** You drink the coffee.\n");
			coffeeLevel = 0;
		} else {
			System.out.println("There is no coffee left, make some new coffee.");
		}
	}

	@Override
	public String toString() {
		return "CoffeeMaker " + getName() + " (Is connected to grid: " + getGridConnectionState() + "; is powered on: " + getPoweredState() + "; is mangageable by device manager: " + getManageability() + ")\nCoffee Powder Level: " + coffeePowderLevel + "\nWater Level: " + waterLevel
				+ "\nHas a filter: " + hasFilter + "\nLevel of ready coffee: " + coffeeLevel
				+ "\n";
	}
	
}
