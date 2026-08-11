package abstract_factory_Example_2;

public class SeaWildAnimals extends TypeFactory{

	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Shark") {
			Animal = new Shark();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;	}

}
