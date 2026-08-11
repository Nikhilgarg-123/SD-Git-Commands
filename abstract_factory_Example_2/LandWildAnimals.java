package abstract_factory_Example_2;

public class LandWildAnimals extends TypeFactory{
	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Lion") {
			Animal = new Lion();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;	}

}
