package abstract_factory_Example_2;

public class AirWildAnimals extends TypeFactory{
	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Eagle") {
			Animal = new Eagle();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;	
		}

}
