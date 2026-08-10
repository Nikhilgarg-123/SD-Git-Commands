package abstract_factory;

public class LandFactory extends AnimalFactory{

	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		if(animal_name=="Cat") {
			return new Cat();
		}else if(animal_name=="Dog") {
			return new Dog();
		}else if(animal_name=="Lion") {
			return new Lion();
		}else {
			System.out.println("No Animal Found");
			return null;
		}
	}

}
