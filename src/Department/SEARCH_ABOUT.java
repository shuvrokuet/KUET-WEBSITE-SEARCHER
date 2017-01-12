package Department;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class SEARCH_ABOUT implements ActionListener
{

	private Controller tempController;
	
	public SEARCH_ABOUT(Controller x) 
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	
	public void search_about()
	{
		tempController.about_BUTTON.button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		tempController.browserObject.openLink("https://www.facebook.com/kuetwebsite.searcher.khulna");
		
	}

}
