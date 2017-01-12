package CIVIL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class HUMANATICS implements ActionListener
{

	private Controller tempController;
	public HUMANATICS(Controller x)
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void  human() 
	{
		tempController.menuBarobject.hum.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/39");
		
	}

}