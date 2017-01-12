package EEE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class CSE implements ActionListener
{

	private Controller tempController;
	
	public CSE(Controller x) 
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void cse() 
	{
		//tempController.menuBarobject.cse.addActionListener(this);
		tempController.menuBarobject.CSE.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		tempController.browserObject.openLink("http://cse.kuet.ac.bd");
		
	}

}
