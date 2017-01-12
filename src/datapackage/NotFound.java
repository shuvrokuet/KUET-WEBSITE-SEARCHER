package datapackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainPackage.Controller;

public class NotFound 
{
 
	private Controller tempController;
	
	public NotFound(Controller x)
	{
		tempController=x;
	}
	public void notfound() 
	{
		JFrame frame = null; 
	//	frame.setUndecorated(true);
		int s;
		s=JOptionPane.showConfirmDialog
				(frame,
			    "This is not found in the xml file!!!\n" +
			    "Press yes for help..................\n" +
			    "press no for exit...................\n",
			    "INVALID",
			    //JOptionPane.WARNING_MESSAGE
			    JOptionPane.YES_NO_OPTION
			    //JOptionPane.QUESTION_MESSAGE, null, null, null
			    );
		if (s == JOptionPane.YES_OPTION)
		{
		    tempController.browserObject.openLink("https://www.facebook.com/kuetwebsite.searcher.khulna?ref=notif&notif_t=page_new_likes");
		}
		if(s==JOptionPane.NO_OPTION)
		{
			System.exit(1);
		}
	}

}
