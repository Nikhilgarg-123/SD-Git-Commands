package abstract_factory;

public class Lion implements IAnimal{

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("Roar");
		return "Roar";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		System.out.println("Lion");
		return "Lion";
	}

}
