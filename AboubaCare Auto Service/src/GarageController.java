import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//The Controller is responsible for responding to user input and implementing actions according to the former. This is where you will see the actionListeners 
public class GarageController {
	
	private GarageView theView;
	private GarageModel Model;
	
	//Adding the actionListeners
	public GarageController(GarageView theView, GarageModel theModel) {
		
		this.theView = theView;
		this.Model = theModel;
		
		this.theView.addVehicleListener(new addVehicleListener());
		this.theView.removeVehicleListener(new removeVehicleListener());
		this.theView.displayVehicleListener(new displayVehicleListener());
		
	}

	class addVehicleListener implements ActionListener{
		
		//The below outlines the actions to be performed when a vehicle is added.
		public void actionPerformed(ActionEvent arg0) {
				
				String theLicensePlate = theView.getTheLicensePlate().getText();
				String theMake = theView.getTheMake().getText();
				String theModel = theView.getTheModel().getText();
				String theBodyType = theView.getBdt().getSelectedItem().toString();
				String theTransmission = theView.getTrans().getSelectedItem().toString();
				String theServicePerformed = theView.getTheServicePerformed().getText();
				if (theLicensePlate.isEmpty() || theMake.isEmpty() || theModel.isEmpty() || theView.getTheYear().getText().isEmpty() || theBodyType.isEmpty() || theTransmission.isEmpty())
				{
				  JOptionPane.showMessageDialog(null,"Please complete the fields");
				}
				
				else
				{
				try {
				int theYear = Integer.parseInt(theView.getTheYear().getText());
				Model.addVehicle(theLicensePlate, theMake, theModel, theYear, theBodyType, theTransmission, theServicePerformed);
						
			}
				catch(NumberFormatException e) { 
					JOptionPane.showMessageDialog(null,"Please enter a valid year.");
				
				}
		}
	}
	}
	//This is the action to be performed when a vehicle is removed. Since this is done based on the License Plate, an if statement is used that will show a message depending on the License plat input
class removeVehicleListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
				String response;
				response = JOptionPane.showInputDialog("Please enter the license plate you want to remove");
				if (response != null) {
				boolean didRemoveVehicle = Model.removeVehicle(response);
					if (didRemoveVehicle == true) {
						JOptionPane.showMessageDialog(null, "Vehicle removed");
					}
					else {
						JOptionPane.showMessageDialog(null, "License plate not found");
				}
			}
			}
}



//This is the display vehicle actionListener that will display information according to License Plate. 
class displayVehicleListener implements ActionListener{
			
			public void actionPerformed(ActionEvent arg0) {
					String response;
					response = JOptionPane.showInputDialog("Please enter the vehicle's license plate");
					if (response != null) {
					vehicle v = Model.getVehicle(response);
					if (v != null) {
						JOptionPane.showMessageDialog(null, v.toString());
					}
					else {
						JOptionPane.showMessageDialog(null, "License plate not found");
											
					}
					}

			}
}
}



