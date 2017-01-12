package guipackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class Button2_Show_information implements ActionListener
{

	private Controller tempController;
	public String link;
	
	public Button2_Show_information(Controller x)
	{
		tempController=x;
	}
	
	public void button2(String x)
	{
		link=x;
		tempController.show_Informationobject.button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		tempController.browserObject.openLink(link);
	}

}
