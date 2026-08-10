package abstract_factory;

public abstract class AnimalFactory {
	public abstract IAnimal getAnimal(String animal_name);
	
	public static AnimalFactory createAnimalFactory(String factory_type) {
		
		AnimalFactory factory=null;
		
		if (factory_type=="Land") {
			factory = new LandFactory();
		}
		else if(factory_type=="Sea") {
			factory = new SeaFactory();
		}else {
			System.out.println("NO Factory Exist");
		}
		
		
		
		return factory;
		
	}
	
}
