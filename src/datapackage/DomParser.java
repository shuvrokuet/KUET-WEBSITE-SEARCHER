package datapackage;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import mainPackage.Controller;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class DomParser
{
	private Controller tempControll;
	
	private static String[] nameArray = {
		                                 "name1","name2","name3","name4","name5","name6",
		                                 "name7","name8","name9","name10","name11","name12",
		                                 "name13","name14","name15","name16","name17","name18"
		                                 ,"name19","name20","name21","name22","name23","name24"
		                                 ,"name25","name26","name27","name28","name29","name30"
		                                 ,"name31","name32","name33","name34","name35","name36",
		                                 "name37","name38","name39","name40","name41","name42"
		                                 ,"name43","name44","name45","name46","name47","name48"
		                                 ,"name49","name50","name51","name52","name53","name54"
		                                 ,"name55","name56","name57","name58","name59","name60"
		                                 ,"name61","name62","name63","name64","name65","name66",
		                                 "name67","name68"
		                                
		                                 };
	private static String[] nameArray1 = {
        "name1-1","name2-2","name3-3","name4-4","name5-5","name6-6",
        "name7-7","name8-8","name9-9","name10-10","name11-11","name12-12",
        "name13-13","name14-14","name15-15","name16-16","name17-17","name18-18"
        ,"name19-19","name20-20","name21-21","name22-22","name23-23","name24-24"
        ,"name25-25","name26-26","name27-27","name28-28","name29-29","name30-30"
        ,"name31-31","name32-32","name33-33","name34-34","name35-35","name36-36",
        "name37-37","name38-38","name39-39","name40-40","name41-41","name42-42"
        ,"name43-43","name44-44","name45-45","name46-46","name47-47","name48-48"
        ,"name49-49","name50-50","name51-51","name52-52","name53-53","name54-54"
        ,"name55-55","name56-56","name57-57","name58-58","name59-59","name60-60"
        ,"name61-61","name62-62","name63-63","name64-64","name65-65","name66-66",
        "name67-67","name68-68"
       
        };
	
	private static String[]websiteArray1={ "website1-1","website2-2","website3-3","website4-4","website5-5",
                                            "website6-6","website7-7","website8-8","website9-9","website10-10",
                                            "website11-11","website12-12","website13-13","website14-14","website15-15",
                                            "website16-16","website17-17","website18-18","website19-19","website20-20"
                                           ,"website21-21","website22-22","website23-23","website24-24","website25-25"
                                            ,"website26-26","website27-27","website28-28","website29-29","website30-30"
                                            ,"website31-31","website32-32","website33-33","website34-34","website35-35"
                                           ,"website36-36","website37-37","website38-38","website39-39","website40-40"
                                           ,"website41-41","website42-42","website43-43","website44-44","website45-45"
                                           ,"website46-46","website47-47","website48-48","website49-49","website50-50",
                                            "website51-51","website52-52","website53-53","website54-54","website55-55",
                                           "website56-56","website57-57","website58-58","website59-59","website60-60"
                                          ,"website61-61","website62-62","website63-63","website64-64","website65-65"
                                           ,"website66-66","website67-67","website68-68"
		
	};
	private static String[] websiteArray = {"website1","website2","website3","website4","website5",
		                                    "website6","website7","website8","website9","website10",
		                                    "website11","website12","website13","website14","website15",
		                                    "website16","website17","website18","website19","website20"
		                                    ,"website21","website22","website23","website24","website25"
		                                    ,"website26","website27","website28","website29","website30"
		                                    ,"website31","website32","website33","website34","website35"
		                                    ,"website36","website37","website38","website39","website40"
		                                    ,"website41","website42","website43","website44","website45"
		                                    ,"website46","website47","website48","website49","website50",
		                                    "website51","website52","website53","website54","website55",
		                                    "website56","website57","website58","website59","website60"
		                                    ,"website61","website62","website63","website64","website65"
		                                    ,"website66","website67","website68"
		                                    };
	
	private static String[] dataArray = {"data1","data2","data3","data4","data5",
		                                 "data6","data7","data8","data9","data10",
		                                 "data11","data12","data13","data14","data15",
		                                 "data16","data17","data18","data19","data20"
		                                 ,"data21","data22","data23","data24","data25"
		                                 ,"data26","data27","data28","data29","data30"
		                                 ,"data31","data32","data33","data34","data35"
		                                 ,"data36","data37","data38","data39","data40"
		                                 ,"data41","data42","data43","data44","data45"
		                                 ,"data46","data47","data48","data49","data50",
		                                 "data51","data52","data53","data54","data55",
		                                 "data56","data57","data58","data59","data60",
		                                 "data61","data62","data63","data64","data65",
		                                 "data66","data67","data68"
		                                 };
	
	private static String[] dataArray1 = {"data1-1","data2-2","data3-3","data4-4","data5-5",
                                         "data6-6","data7-7","data8-8","data9-9","data10-10",
                                          "data11-11","data12-12","data13-13","data14-14","data15-15",
                                          "data16-16","data17-17","data18-18","data19-19","data20-20"
                                           ,"data21-21","data22-22","data23-23","data24-24","data25-25"
                                         ,"data26-26","data27-27","data28-28","data29-29","data30-30"
                                         ,"data31-31","data32-32","data33-33","data34-34","data35-35"
                                         ,"data36-36","data37-37","data38-38","data39-39","data40-40"
                                          ,"data41-41","data42-42","data43-43","data44-44","data45-45"
                                          ,"data46-46","data47-47","data48-48","data49-49","data50-50",
                                          "data51-51","data52-52","data53-53","data54-54","data55-55",
                                          "data56-56","data57-57","data58-58","data59-59","data60-60",
                                         "data61-61","data62-62","data63-63","data64-64","data65-65",
                                          "data66-66","data67-67","data68-68"
        };
	
	String s;
	Element eElement;
	Node nNode;
	int n;//delete after sometime
	Scanner scanner=new Scanner(System.in);
	
	//BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String input;
	
	public DomParser(Controller x) 
	{
		this.tempControll = x;
	}

	public void KuetWebsiteSearcher(String s)
	{
	    try 
	    {
			File fXmlFile = new File("./src/projectrecources/kuet.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			NodeList nList =doc.getElementsByTagName("CSE");
			
			input = s.toUpperCase();
				
			int indexNumber=-1;
				
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
				nNode = nList.item(temp);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					eElement = (Element) nNode;
					 indexNumber = returnNameFromXML(input);
					if(indexNumber!=-1)
					{
						doInDetails(indexNumber);
						break;
					}
				}
			}
			
			if(indexNumber==-1)
			{
				tempControll.show_Informationobject.SHOW_INFORMATION("Not found!!!!", "not found","not found!!!","not found","not found");
			}
			
			
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
 
	
	public int returnNameFromXML(String inputName)
	{
		int indexNumber=-1;
		
		for(int i=0;i<nameArray.length;i++)
		{

			int receive;
			String temp=eElement.getElementsByTagName(nameArray[i]).item(0).getTextContent();
			receive=tempControll.boyerMooreobject.findPattern(temp, inputName);
	
			if(receive==0)
			{
				indexNumber=i;
				break;
			}
			
		} 
		
		return indexNumber;
	}
	
	
	public void doInDetails(int indexNumber)
	{
		
		if(eElement.getElementsByTagName(nameArray[indexNumber]).item(0).getTextContent() != null)
		{
			
			
			String data,link,name,data1,link1,secondname;
			int receive;
			//name=eElement.getElementsByTagName(nameArray[indexNumber]).item(0).getTextContent();
			data=eElement.getElementsByTagName(dataArray[indexNumber]).item(0).getTextContent();
			link=eElement.getElementsByTagName(websiteArray[indexNumber]).item(0).getTextContent();
			
			data1=eElement.getElementsByTagName(dataArray1[indexNumber]).item(0).getTextContent();
			link1=eElement.getElementsByTagName(websiteArray1[indexNumber]).item(0).getTextContent();
			
			secondname=eElement.getElementsByTagName(nameArray1[indexNumber]).item(0).getTextContent();
			
			tempControll.show_Informationobject.SHOW_INFORMATION(data,link,data1,link1,secondname);
			
		}
		
	}
}

