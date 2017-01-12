package CIVIL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class Civil_Engineering implements ActionListener
{
    private Controller tempController;
	
	public Civil_Engineering(Controller x) 
	{
		this.tempController=x;
	}
	
	public void  civil()
	{
		tempController.menuBarobject.CIVIL.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/34");
		
	}

}
