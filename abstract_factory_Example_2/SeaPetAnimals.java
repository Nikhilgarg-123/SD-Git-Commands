package abstract_factory_Example_2;

public class SeaPetAnimals extends TypeFactory{
	@Override
	public IAnimal getAnimal(String animal_name) {
		// TODO Auto-generated method stub
		IAnimal Animal = null;
		if(animal_name=="Turtle") {
			Animal = new Turtle();
		}else {
			System.out.println("No Animal Exist");
			
		}
		return Animal;	}

}
