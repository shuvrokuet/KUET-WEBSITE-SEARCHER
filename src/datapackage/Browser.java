package datapackage;
import java.awt.Desktop; 
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import mainPackage.Controller;

public class Browser {
	
	private Controller tempControll;
	
	public Browser(Controller x) 
	{
		this.tempControll = x;
	}

	public void openLink(String url)
	{
	    if(Desktop.isDesktopSupported())
	    {
            Desktop desktop = Desktop.getDesktop();
            try 
            {
                desktop.browse(new URI(url));
            } 
            catch (IOException | URISyntaxException e) 
            {
                e.printStackTrace();
            }
        }
	    else
	    {
            Runtime runtime = Runtime.getRuntime();
            try 
            {
                runtime.exec("xdg-open " + url);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
	}
}