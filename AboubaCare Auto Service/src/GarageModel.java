import java.util.LinkedList;

import javax.swing.JOptionPane;


public class GarageModel {
	private LinkedList<vehicle> vehicleList;
	
	//The Model is responsible for managing the data of our GUI which is stored in the form of a LinkedList which unlike an Array can store a unfixed number of objects.

public GarageModel() {
	
	vehicleList = new LinkedList<vehicle>();
	}
			
	public void addVehicle(String theLicensePlate, String theMake, String theModel, int theYear, String theBodyType, String theTransmission, String theServicePerformed){
		for (vehicle v : vehicleList) {
			if (v.licensePlate.equals(theLicensePlate)) {
				JOptionPane.showMessageDialog(null, "Vehicle already exists.");
				return;
			}
		
		}
		
				
		vehicleList.add(new vehicle(theLicensePlate, theMake, theModel, theYear, theBodyType, theTransmission, theServicePerformed));
		JOptionPane.showMessageDialog(null,"Vehicle added.");
		//addVehicle method that implements a for loop that will verify if a vehicle already exist.
	} 
	
	public boolean removeVehicle(String theLicensePlate){
		for (vehicle v : vehicleList) {
			if (v.licensePlate.equals(theLicensePlate)) {
				vehicleList.remove(v);
				return true;
			}
		}
				return false;
	}
	//Remove vehicle method that removes an object according to a unique license plate.

	public vehicle getVehicle(String theLicensePlate) {
		for (vehicle v : vehicleList) {
			if (v.licensePlate.equals(theLicensePlate)) {
				return v;
			}
		}
		return null;
	}
	//Method that will display vehicle information that exist in the system.
}