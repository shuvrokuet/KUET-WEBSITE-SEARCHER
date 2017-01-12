package MECA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class ET implements ActionListener
{

	private Controller tempController;
	public ET(Controller x)
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void  et() 
	{
		tempController.menuBarobject.et.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/32");
		
	}

}