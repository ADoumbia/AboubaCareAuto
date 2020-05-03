
public class vehicle {
	
	public String licensePlate;
	private String make;
	private String model;
	private int year;
	private String bodyType;
	private String transmission;
	private String servicePerformed;

//The Constructor that allows us to build vehicles to add to the LinkedList.
	public vehicle(String theLicensePlate, String theMake, String theModel, int theYear, String theBodyType, String theTransmission, String theServicePerformed){
		licensePlate = theLicensePlate;
		make = theMake;
		model = theModel;
		year = theYear; 
		bodyType = theBodyType;
		transmission = theTransmission;
		servicePerformed = theServicePerformed;
	}
	
	public String toString(){
		return "Vehicle information for " + licensePlate + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nBodyType: " + bodyType + "\nTransmission: " + transmission + "\nService performed: " + servicePerformed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getBodyType() {
		return bodyType;
	}


	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	

	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}


	public String getServicePerformed() {
		return servicePerformed;
	}


	public void setServicePerformed(String servicePerformed) {
		this.servicePerformed = servicePerformed;
	}

}


