package CIVIL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class BECM implements ActionListener
{

	private Controller tempController;
	
	public BECM(Controller x) 
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	public void becm() 
	{
		tempController.menuBarobject.becm.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/312");
		
	}

}
