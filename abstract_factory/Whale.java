package abstract_factory;

public class Whale implements IAnimal{

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("Sings");
		return "Sings";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		System.out.println("Whale");
		return "Whale";
	}

}
