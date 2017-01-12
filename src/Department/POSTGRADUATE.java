package Department;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class POSTGRADUATE implements ActionListener
{

	private Controller tempController;
	
	public POSTGRADUATE(Controller x)
	{
		tempController=x;
	}
	
	public void postgraduate()
	{
		tempController.menuBarobject.postgraduate.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		tempController.browserObject.openLink("http://www.kuet.ac.bd/pgadmission/");
	}

}
