package abstract_factory;

public class Shark implements IAnimal{

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("mostly silent 🦈");
		return "mostly silent 🦈";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		System.out.println("Shark");
		return "Shark";
	}

}
