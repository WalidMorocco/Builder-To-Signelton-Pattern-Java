package framework;

class BrandNewCar {

	String carName;
	Chassis chassis;
	Body body;
	
	
	
	public String getCarName() {
		return carName;
	}



	public void setCarName(String carName) {
		this.carName = carName;
	}



	public String getCarSpecs() {
		StringBuffer carSpecs = new StringBuffer();
		carSpecs.append(" Today's car -> ");
		carSpecs.append(" Specification: ");
		carSpecs.append(this.chassis.getPartID() + ", ");
		carSpecs.append(this.body.getPartID() + ", ");
		
		return carSpecs.toString();
	}
	
	
}
