package abstract_factory;

public class Main {
	public static void get_animal(String factory_name, String Animal_type) {
		
		AnimalFactory fac= AnimalFactory.createAnimalFactory(factory_name);
		
		if (fac!=null) {
			IAnimal a1 = fac.getAnimal(Animal_type);
			if(a1!=null) {
				a1.speak();
				a1.type();
				
			}
		}
		System.out.println();
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_animal("Land","Dog");
		get_animal("Land","Cat");
		get_animal("Land","Lion");
		get_animal("Air","Dog");
		get_animal("Sea","Whale");
		get_animal("Sea","Shark");
		get_animal("Sea","Octupus");
		
		
		
		

	}

}
