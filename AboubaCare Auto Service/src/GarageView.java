import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

//The GarageView is where the information of our GUI is displayed. This is where our buttons, Labels, Panels, and Frames are initialized and constructed. 

public class GarageView extends JFrame{
	
	String[] transmissions = {"Automatic", "Manual", "Electric"};
	JComboBox trans = new JComboBox(transmissions);
	String[] bodyTypes = {"Sedan", "Coupe", "SUV", "Convertible", "Wagon","Van", "Hatchback"};
	JComboBox bdt = new JComboBox(bodyTypes);
	private JLabel lp;
	private JLabel mk;
	private JLabel mdl;
	private JLabel yr;
	private JLabel bt;
	private JLabel trns;
	private JLabel sp;
	JLabel Signature = new JLabel("", SwingConstants.CENTER);
	
		
	private JTextField theLicensePlate = new JTextField(10);
	private JTextField theMake = new JTextField(10);
	private JTextField theModel = new JTextField(10);
	private JTextField theYear = new JTextField(4);
	private JTextField theServicePerformed = new JTextField(20);
	private JButton addVehicle = new JButton("Add vehicle");
	private JButton removeVehicle = new JButton("Remove vehicle");
	private JButton displayVehicle = new JButton("Show vehicle history");

	public GarageView(){
		lp = new JLabel("License plate");
		mk = new JLabel("Make");
		mdl = new JLabel("Model");
		yr = new JLabel("Year");
		bt = new JLabel("Body Type");
		trns = new JLabel("Transmission");
		sp = new JLabel("Service performed");
		
	
		
		JPanel garagePanel = new JPanel();
		setTitle("AboubaCare Auto Service");
		this.setSize(600, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		GridLayout g1 = new GridLayout(18, 10);
		garagePanel.setLayout(g1);
		Signature.setText("Welcome to AboubaCare Auto Service");
		
		//image.setIcon(new ImageIcon("Logo.png"));
		//garagePanel.add(image);
		//validate();
		
		
		garagePanel.add(Signature);
		garagePanel.add(lp);
		garagePanel.add(theLicensePlate);
		garagePanel.add(mk);
		garagePanel.add(theMake);
		garagePanel.add(mdl);
		garagePanel.add(theModel);
		garagePanel.add(yr);
		garagePanel.add(theYear);
		garagePanel.add(bt);
		garagePanel.add(bdt);
		garagePanel.add(trns);
		garagePanel.add(trans);
		garagePanel.add(sp);
		garagePanel.add(theServicePerformed);
		garagePanel.add(addVehicle);
		garagePanel.add(removeVehicle);
		garagePanel.add(displayVehicle);
		
			
		Font f = new Font("Verdana", Font.CENTER_BASELINE, 20);
		Font c = new Font("Corbel", Font.CENTER_BASELINE, 50);
		Signature.setFont(c);
		lp.setFont(f);
		mk.setFont(f);
		mdl.setFont(f);
		yr.setFont(f);
		bt.setFont(f);
		bdt.setFont(f);
		bdt.setBackground(new Color(255,255,255));
		trns.setFont(f);
		trans.setFont(f);
		trans.setBackground(new Color(255,255,255));
		sp.setFont(f);
		theLicensePlate.setFont(f);
		theMake.setFont(f);
		theModel.setFont(f);
		theYear.setFont(f);
		theServicePerformed.setFont(f);
		
					
		
		this.add(garagePanel);
	
	}
	

	public JTextField getTheLicensePlate() {
		return theLicensePlate;
	}

	public void setTheLicensePlate(JTextField theLicensePlate) {
		this.theLicensePlate = theLicensePlate;
	}

	public JTextField getTheMake() {
		return theMake;
	}

	public void setTheMake(JTextField theMake) {
		this.theMake = theMake;
	}

	public JTextField getTheModel() {
		return theModel;
	}

	public void setTheModel(JTextField theModel) {
		this.theModel = theModel;
	}

	public JTextField getTheYear() {
		return theYear;
	}

	public void setTheYear(JTextField theYear) {
		this.theYear = theYear;
	}

	public JComboBox getTrans() {
		return trans;
	}


	public void setTrans(JComboBox trans) {
		this.trans = trans;
	}


	public JComboBox getBdt() {
		return bdt;
	}


	public void setBdt(JComboBox bdt) {
		this.bdt = bdt;
	}


	public JTextField getTheServicePerformed() {
		return theServicePerformed;
	}


	public void setTheServicePerformed(JTextField theServicePerformed) {
		this.theServicePerformed = theServicePerformed;
	}


	public JButton getRemoveVehicle() {
		return removeVehicle;
	}

	public void setRemoveVehicle(JButton removeVehicle) {
		this.removeVehicle = removeVehicle;
	}

	public void removeVehicleListener(ActionListener listenForRemoveVehicleButton) {
		removeVehicle.addActionListener(listenForRemoveVehicleButton);
		
	}
	
	public JButton getAddVehicle() {
		return addVehicle;
	}

	public void setAddVehicle(JButton addVehicle) {
		this.addVehicle = addVehicle;
	}

	void addVehicleListener(ActionListener listenForAddVehicleButton) {
		addVehicle.addActionListener(listenForAddVehicleButton);
	}
	void diplayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, "Please complete all entries.");
	}
	
	public JButton getDisplayVehicle() {
		return displayVehicle;
	}

	public void setDisplayVehicle(JButton displayVehicle) {
		this.displayVehicle = displayVehicle;
	}

	void displayVehicleListener(ActionListener listenForDisplayVehicleButton) {
		displayVehicle.addActionListener(listenForDisplayVehicleButton);
}
}

