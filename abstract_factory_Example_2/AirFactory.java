package abstract_factory_Example_2;

public class AirFactory extends HabitatFactory{
	@Override
	public TypeFactory CreateType(String type_name) {
		// TODO Auto-generated method stub
		TypeFactory type = null;
		if (type_name=="Pet") {
			type = new AirPetAnimals();
		}else if (type_name=="Wild") {
			type = new AirWildAnimals();
		}else {
			System.out.println("No Type Exist");
		}
		
		return type;
	}

}
