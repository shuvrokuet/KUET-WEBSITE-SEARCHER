package EEE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class BME implements ActionListener
{

	private Controller tempController;
	
	public BME(Controller x) 
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void bme()
	{
		tempController.menuBarobject.bme.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tempController.browserObject.openLink("http://www.kuet.ac.bd/BME");
		
	}

}
