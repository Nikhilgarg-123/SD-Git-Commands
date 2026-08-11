package abstract_factory_Example_2;

public abstract class AnimalFactory {
	public abstract TypeFactory getHabitat(String Habitat);

	public static HabitatFactory CreateHabitat(String habitat_name) {
		HabitatFactory habitat = null;
		if (habitat_name == "Air") {
			habitat = new AirFactory();
		} else if (habitat_name == "Land") {
			habitat = new LandFactory();
		} else if (habitat_name == "Sea") {
			habitat = new SeaFactory();
		} else {
			System.out.println("No Habitat Exists");
		}
		return habitat;
	}

}
