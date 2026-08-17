package builder_design_pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car.CarBuilder("SW", "AC", "B").build();
		System.out.println(c1);
		System.out.println();
		Car c2 = new Car.CarBuilder("SW", "AC", "B").setAC("5 Star AC").setMusicSystem("Punjabi Songs").build();
		System.out.println(c2);
	}

}
