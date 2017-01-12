package guipackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import mainPackage.Controller;

public class MenuBar
{

	private Controller tempController;
	public JMenuItem CIVIL;
	public JMenuItem urp;
	public JMenuItem EEE;
	public JMenuItem CSE;
	public JMenuItem ece;
	public JMenuItem bme;
	public JMenuItem becm;
	public JMenuItem math;
	public JMenuItem phy;
	public JMenuItem chem;
	public JMenuItem hum;
	public JMenuItem ME;
	public JMenuItem iem;
	public JMenuItem le;
	public JMenuItem te;
	public JMenuItem et;
	public JMenuItem n;
	public JMenuItem undergraduate;
	public JMenuItem postgraduate;
	
	
	
	public MenuBar(Controller x) {
		// TODO Auto-generated constructor stub
		this.tempController=x;
	}
	public JMenuBar name()
	{
		JMenuBar menuBar=new JMenuBar();
	    JMenu faculty=new JMenu("  Faculty");
	   
	    JMenu eee=new JMenu("Electrical and Electronic Engineering");
	    
	    EEE=new JMenuItem("Electrical and Electronic Engineering");
	    tempController.eeeobject.eee();
	    
	    CSE=new JMenuItem("Computer science and Engineering");
	    tempController.cseobject.cse();
	    
	    ece =new JMenuItem("Electronics & Communication Engineering");
	    tempController.eceobject.ece();
	    
	    bme=new JMenuItem("Biomedical Engineering");
	    tempController.bmeobject.bme();
	    
	   
	    
	    eee.add(EEE);
	    eee.addSeparator();
	    eee.add(CSE);
	    eee.addSeparator();
	    eee.add(ece);
	    eee.addSeparator();
	    eee.add(bme);
	    
	    JMenu civil=new JMenu("Civil Engineering");
	    
	    CIVIL=new JMenuItem("Civil Engineering");
	    tempController.civil_Engineering.civil();
	    
	    urp=new JMenuItem("Urban and Regional Planning");
	    tempController.urpobject.urp();
	    
	    
	    becm=new JMenuItem("Building Engineering & Construction Management");
	    tempController.becmobject.becm();
	    
	    math=new JMenuItem("Mathematics");
	    tempController.mathobject.math();
	    
	    
	    chem=new JMenuItem("Chemistry");
	    tempController.chemobject.chemistry();
	    
	    phy=new JMenuItem("Physics");
	    tempController.physicsobject.physics();
	    
	    hum=new JMenuItem("Humanities");
	    tempController.humanatics.human();
	    
	    civil.add(CIVIL);
	    civil.addSeparator();
	    civil.add(urp);
	    civil.addSeparator();
	    civil.add(becm);
	    civil.addSeparator();
	    civil.add(math);
	    civil.addSeparator();
	    civil.add(chem);
	    civil.addSeparator();
	    civil.add(phy);
	    civil.addSeparator();
	    civil.add(hum);
	    
	    
	    
	    JMenu me=new JMenu("Mechanical Engineering");
	    
	    ME=new JMenuItem("Mechanical Engineering");
	    tempController.meobject.me();
	    
	    iem=new JMenuItem("Industrial Engineering and Management");
	    tempController.iemobject.iem();
	    
	     le=new JMenuItem("Leather Engineering");
	    tempController.leobject.le();
	    
	    te=new JMenuItem("Textile Engineering");
	    tempController.teobject.te();
	    
	    et=new JMenuItem("Energy  Technology");
	    tempController.etobject.et();
	    
	    me.add(ME);
	    me.addSeparator();
	    me.add(iem);
	    me.addSeparator();
	    me.add(le);
	    me.addSeparator();
	    me.add(le);
	    me.addSeparator();
	    me.add(te);
	    me.addSeparator();
	    me.add(et);
	    
	    faculty.add(eee);
	    //faculty.add(cse);
	    faculty.addSeparator();
	    faculty.add(civil);
	    faculty.addSeparator();
	    faculty.add(me);
	    
	    
	    JMenu admission=new JMenu("  Admission");
	    
	    undergraduate=new JMenuItem("Undergraduate");
	    tempController.undergraduate.undergraduate();
	    
	    postgraduate=new JMenuItem("Postgraduate");
	    tempController.postgraduate.postgraduate();
	    
	    
	    admission.add(undergraduate);
	    admission.add(postgraduate);
	    
	    JMenu news=new JMenu(" News");
	    
	     n=new JMenuItem("News");
	     news.add(n);
	    tempController.news.news();
	    
	    
	    
		menuBar.add(faculty);
		menuBar.add(admission);
		menuBar.add(news);
		
		return menuBar;
	}
	

}
