package abstract_factory_Example_2;

public class SeaFactory extends HabitatFactory{
	@Override
	public TypeFactory CreateType(String type_name) {
		TypeFactory type = null;
		if (type_name=="Pet") {
			type = new SeaPetAnimals();
		}else if (type_name=="Wild") {
			type = new SeaWildAnimals();
		}else {
			System.out.println("No Type Exist");
		}
		
		return type;
	}

}
