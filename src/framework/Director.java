package framework;

class Director {

	public static void main (String[] args) {
		
		LexusES300Builder lexus = LexusES300Builder.getInstance();
		LexusES300Builder lexus2 = LexusES300Builder.getInstance();
		
		BrandNewCar newCar = buildCar(lexus);
		System.out.println(
				"Newly built car: "
					+ newCar.getCarName()
					+ "."
					+ newCar.getCarSpecs());
		
		lexus2.setCarName("Lexus ES 300 GTS");
		
		System.out.println(
				"Newly built car: "
					+ newCar.getCarName()
					+ "."
					+ newCar.getCarSpecs());
		
	}
	
	public static BrandNewCar buildCar (MidSizeCarBuilder midSizeCarBuilder) {
		
		midSizeCarBuilder.buildBrandNewCar();
		
		midSizeCarBuilder.setCarName();
		
		midSizeCarBuilder.buildChassis();
		midSizeCarBuilder.buildBody();
		
		return midSizeCarBuilder.getBrandNewCar();
		
	}
}
