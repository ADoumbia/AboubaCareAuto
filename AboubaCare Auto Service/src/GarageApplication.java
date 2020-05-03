import javax.swing.JFrame;

//The Application is the simplest class in our project. This class is where we run the application using the Main method, which initializes our View.

public class GarageApplication {
	
	public static void main(String[] args) {

		GarageView theView = new GarageView();
		GarageModel Model = new GarageModel();
		GarageController theController = new GarageController(theView, Model);
		theView.setVisible(true);
		
	}
}