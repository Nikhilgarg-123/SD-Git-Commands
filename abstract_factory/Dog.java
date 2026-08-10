package abstract_factory;

public class Dog implements IAnimal{
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
		return "Bark";
	}
	@Override
	public String type() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
		return "DOG";
	}

}
