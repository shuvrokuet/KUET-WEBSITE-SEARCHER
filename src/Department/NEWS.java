package Department;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Controller;

public class NEWS implements ActionListener
{

	private Controller tempController;
	public NEWS(Controller x) 
	{
		tempController=x;
	}
	
	public void  news()
	{
		tempController.menuBarobject.n.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		tempController.browserObject.openLink("http://www.kuet.ac.bd/index.php/welcome/shownews/277-275-276-274-271-273-269-270-267-266-272-268-265-261-260-262-264-263-259-256-");

	}	
	
}
