package MECA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class LE implements ActionListener
{

	private Controller tempController;
	public LE(Controller x)
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void  le() 
	{
		tempController.menuBarobject.le.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/33");
		
	}

}