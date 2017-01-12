package CIVIL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class MATH implements ActionListener
{

	private Controller tempController;
	public MATH(Controller x) 
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void math()
	{
		tempController.menuBarobject.math.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/37");
	}

}
