package abstract_factory_Example_2;

public class LandPetAnimals extends TypeFactory{
	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Dog") {
			Animal = new Dog();
		}else if(animal_name=="Cat") {
			Animal = new Cat();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;	}

}
