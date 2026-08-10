package abstract_factory;

public class SeaFactory extends AnimalFactory{

	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		if(animal_name=="Shark") {
			return new Shark();
		}else if(animal_name=="Whale") {
			return new Whale();
		}else {
			System.out.println("No Animal Found");
			return null;
		}
	}

}
