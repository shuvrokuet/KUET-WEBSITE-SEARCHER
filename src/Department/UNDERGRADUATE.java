package Department;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class UNDERGRADUATE implements ActionListener
{

	private Controller tempController;
	
	public UNDERGRADUATE(Controller x)
	{
		tempController=x;
	}
	
	public void undergraduate() 
	{
		tempController.menuBarobject.undergraduate.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
     
		tempController.browserObject.openLink("http://admission.kuet.ac.bd");
	}

}
