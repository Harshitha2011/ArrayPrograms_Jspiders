package Style2Programming;

public class CarMainClass {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.carInitialise("Jaguar", "TN-12-7777",8000000, "Petrol", 50);
		car2.carInitialise("Wagonar", "TN-07-9999", 1200000, "Diesel",55);
		car3.carInitialise("LandRover", "TN-09-0001", 10000000, "Electric", 550);
		
		car1.carDetails();
		car2.carDetails();
		car3.carDetails();
	}

}
