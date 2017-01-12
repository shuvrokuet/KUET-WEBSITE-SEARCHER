package EEE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class EEE implements ActionListener
{
   private Controller tempController;
	
	public EEE(Controller x) 
	{
		tempController=x;
	}
	public void eee()
	{
		tempController.menuBarobject.EEE.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
	  tempController.browserObject.openLink("http://www.kuet.ac.bd/departments/index.php/welcome/index/40");
	}

}
