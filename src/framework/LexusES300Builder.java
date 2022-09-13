package framework;


class LexusES300Builder extends MidSizeCarBuilder {
	// Add unique instance
	private static LexusES300Builder uniqueInstance; 
	
	// Make the constructor private and set values for variables
	private LexusES300Builder() {}
	
	// Method to request the Class instance from other classes
	public static LexusES300Builder getInstance() { // #3. Added
		if (uniqueInstance == null) {
			uniqueInstance = new LexusES300Builder();
		}
		return uniqueInstance;
	}
		
		
	public void setCarName() {
		brandNewCar.carName = "Lexus ES-300";
	}
	
	public void setCarName(String string) {
		brandNewCar.carName = string;
	}
}
