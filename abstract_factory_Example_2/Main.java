package abstract_factory_Example_2;

public class Main {
	public static void get_animal(String Habitat, String Type, String Animal_type) {

		HabitatFactory factory_habitat = AnimalFactory.CreateHabitat(Habitat);

		if (factory_habitat != null) {
			TypeFactory factory_type = factory_habitat.CreateType(Type);
			if (factory_type != null) {
				IAnimal animal = factory_type.getAnimal(Animal_type);
				if (animal != null) {
					animal.getName();
				}

			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_animal("Sky", "Pet", "Dog");
		get_animal("Land", "Farm", "Dog");
		get_animal("Land", "Pet", "Dog");
		get_animal("Land", "Pet", "Cat");
		get_animal("Land", "Pet", "Lion");
		get_animal("Land", "Wild", "Lion");
		get_animal("Air", "Pet", "Dog");
		get_animal("Air", "Pet", "Parrot");
		get_animal("Air", "Wild", "Parrot");
		get_animal("Air", "Wild", "Eagle");
		get_animal("Sea", "Pet", "Turtle");
		get_animal("Sea", "Pet", "Shark");
		get_animal("Sea", "Wild", "Shark");

	}

}
