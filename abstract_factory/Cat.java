package abstract_factory;

public class Cat implements IAnimal{

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
		return "Meow";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		System.out.println("Cat");
		return "Cat";
	}

}
