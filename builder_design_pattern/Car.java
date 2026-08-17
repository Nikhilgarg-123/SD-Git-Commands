package builder_design_pattern;

public class Car {
	// Mandatory Attributes
	public String Brake;
	public String Acc;
	public String SteeringWheel;
	
	
	// Optional Attributes
	public String seatCover;
	public String musicSystem;
	public String ac;
	
	public Car(CarBuilder carBuilder) {
		this.SteeringWheel = carBuilder.SteeringWheel;
		this.Brake = carBuilder.Brake;
		this.Acc = carBuilder.Acc;
		this.ac = carBuilder.ac;
		this.musicSystem = carBuilder.musicSystem;
		this.seatCover = carBuilder.seatCover;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Car details : ";
		str += "steering wheel : " + SteeringWheel;
		str += "\nACC : " + Acc;
		str += "\nbrake : " + Brake;
		str += "\nac : "+ ac;
		str += "\nmusic system :"+ musicSystem;
		str += "\nseat cover : "+ seatCover;
		return str;
	}
	
	public static class CarBuilder{
		// Mandatory Attributes
		public String Brake;
		public String Acc;
		public String SteeringWheel;
		
		
		// Optional Attributes
		public String seatCover;
		public String musicSystem;
		public String ac;
		
		//Set Mandatory Attributes
		public CarBuilder(String SteeringWheel, String Acc, String Brake) {
			this.SteeringWheel=SteeringWheel;
			this.Acc = Acc;
			this.Brake = Brake;
		}
		 
		//Create Setters for optional attributes
		
		public CarBuilder setAC(String ac) {
			this.ac = ac;
			return this;
		} 
		
		public CarBuilder setSeatcover(String seatCover) {
			this.seatCover = seatCover;
			return this;
		}
		
		public CarBuilder setMusicSystem(String musicSystem) {
			this.musicSystem = musicSystem;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}

}
