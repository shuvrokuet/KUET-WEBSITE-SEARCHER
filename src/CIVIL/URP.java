package CIVIL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class URP implements ActionListener
{
    
	private Controller tempController;
	
	public URP(Controller x) 
	{
		tempController=x;
	}
	
	public void  urp()
	{
		tempController.menuBarobject.urp.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/35");
	}

}
