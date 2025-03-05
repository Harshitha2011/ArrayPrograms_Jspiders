package Style2Programming;

public class Car {

	private String carName;
	private String carNum;
	private long carPrice;
	private String fuelType;
	private int carMileage;
	
	public void carInitialise(String carName , String carNum,long carPrice,String fuelType,int carMileage)
	{
		if (CarValidation.validateName(carName))
			this.carName = carName;
		else
			System.err.println("Invalid car name..");
		
		if(CarValidation.validateNum(carNum))
			this.carNum = carNum;
		else
			System.err.println("Invalid car number..");
			
		if(CarValidation.priceValidation(carPrice))
			this.carPrice =  carPrice;
		else
			System.err.println("Invalid car price..");
		
		if(CarValidation.fuelValidation(fuelType))
			this.fuelType = fuelType;
		else
			System.err.println("Invalid fuel type..");
		
		if(CarValidation.mileageValidation(fuelType, carMileage))
			this.carMileage = carMileage;
		else
			System.err.println("Invalid car mileage..");
	}
	
	public double onRoadPrice()
	{
		return carPrice*1.1;
	}
	
	public String isEcofriendly() 
	{
		if (fuelType.equalsIgnoreCase("Electric"))
			return "Yes";
		else
			return "No";
	}
	
	public void carDetails() {
		System.out.println("The "+carName+" car with number plate "+carNum+" is a "+fuelType+"type car ,it's showroom price is "+carPrice);
		System.out.println("It's on-road price is "+onRoadPrice());
		System.out.println("Is it eco-friendly: "+isEcofriendly());
		System.out.println("-------------------------------------------");
	}
}
