package mainPackage;
import datapackage.*; 
import guipackage.*;
import Department.*;
import EEE.*;
import CIVIL.*;
import MECA.*;

public class Controller 
{
	
	public static Browser browserObject;
	public static DomParser domparserObject;
	public static UserInterface userInterfaceObject; 
	public static BoyerMoore boyerMooreobject;
	public static Show_Information show_Informationobject;
	public static MenuBar menuBarobject;
	public static Civil_Engineering civil_Engineering;
	public static URP urpobject;
	public static EEE eeeobject;
	public static CSE cseobject;
	public static ECE eceobject;
	public static BME bmeobject;
	public static BECM becmobject;
	public static MATH mathobject;
	public static PHYSICS physicsobject;
	public static CHEMISTRY chemobject;
	public static HUMANATICS humanatics;
	public static ME meobject;
	public static IEM iemobject;
	public static LE leobject;
	public static TE teobject;
	public static ET etobject;
	public static ABOUT_BUTTON about_BUTTON;
	public static NotFound notFoundobject;
	public static NEWS news;
	public static UNDERGRADUATE undergraduate;
	
	public static POSTGRADUATE postgraduate;
	public static SEARCH_ABOUT search_ABOUT;
	public static Button2_Show_information information;
	
	public static void main(String[] args) 
	{
		Controller controllObject = new Controller();
		
		
		browserObject = new Browser(controllObject);
		domparserObject = new DomParser(controllObject);
		boyerMooreobject=new BoyerMoore(controllObject);
		show_Informationobject=new Show_Information(controllObject);
		userInterfaceObject=new UserInterface(controllObject);
		menuBarobject=new MenuBar(controllObject);
		civil_Engineering=new Civil_Engineering(controllObject);
		urpobject=new URP(controllObject);
		eeeobject=new EEE(controllObject);
		cseobject=new CSE(controllObject);
		eceobject=new ECE(controllObject);
		bmeobject=new BME(controllObject);
		becmobject=new BECM(controllObject);
		mathobject=new MATH(controllObject);
		physicsobject=new PHYSICS(controllObject);
		chemobject=new CHEMISTRY(controllObject);
		humanatics=new HUMANATICS(controllObject);
		meobject=new ME(controllObject);
		iemobject=new IEM(controllObject);
		leobject=new LE(controllObject);
		teobject=new TE(controllObject);
		etobject=new ET(controllObject);
		about_BUTTON=new ABOUT_BUTTON(controllObject);
		notFoundobject=new NotFound(controllObject);
		news=new NEWS(controllObject);
		undergraduate=new UNDERGRADUATE(controllObject);
		postgraduate=new POSTGRADUATE(controllObject);
		search_ABOUT=new SEARCH_ABOUT(controllObject);
		information=new Button2_Show_information(controllObject);
		
		UserInterface.setLookAndFeel();
		userInterfaceObject.createUI();
		
		
	}

}
