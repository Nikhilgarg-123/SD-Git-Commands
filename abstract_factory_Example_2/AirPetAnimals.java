package abstract_factory_Example_2;

public class AirPetAnimals extends TypeFactory{
	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Parrot") {
			Animal = new Parrot();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;
	}

}
