package datapackage;

import guipackage.UserInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.prism.paint.Color;

import mainPackage.Controller;

public class Show_Information implements ActionListener
{
	private JFrame jFrame;
	private JTextField jTextField;
	private Controller tempController;
	private JLabel jLabel;
	private JButton jButton;
	private String link;
	private JLabel jLabel2;
	private JMenuBar menuBar;
	public JButton button2;
	
	private String k_data,k_data1,link1,second;
	
	public Show_Information(Controller x)
	{
		this.tempController=x;
	}

	public void SHOW_INFORMATION(String x,String y ,String z ,String m,String n) 
	{
		k_data=x;
		link=y;
		
		k_data1=z;
		link1=m;
		
		second=n;
		
		
		jFrame=new JFrame();
		jFrame.setTitle("KUET WEBSITE SEARCHER");
		jFrame.setSize(1400, 700);
		jFrame.setLocationRelativeTo(null);
		
		jLabel=new JLabel(new ImageIcon(
				UserInterface.class.getResource("/projectrecources/nature.jpg")));
		jFrame.setContentPane(jLabel);
		
		jFrame.setLayout(null);
		
		
		JTextArea area = new JTextArea(k_data);
		area.setFont(new Font(k_data, Font.BOLD+Font.ITALIC,20));

		area.setLineWrap(true);
	    area.setWrapStyleWord(true);
	    area.setEditable(false);
	    
	    tempController.userInterfaceObject.setLookAndFeel();
	        
		area.setBounds(180,80,1000,250);
		
		//**********textarea2*******************************
		
		JTextArea area1 = new JTextArea(k_data1);
		area1.setFont(new Font(k_data, Font.BOLD+Font.ITALIC,20));

		area1.setLineWrap(true);
	    area1.setWrapStyleWord(true);
	    area1.setEditable(false);
	    
	    tempController.userInterfaceObject.setLookAndFeel();
	        
		area1.setBounds(180,424,1000,250);
		
		jFrame.add(area1);
		
		
		jLabel2=new JLabel("KUET");
		jLabel2.setFont(new Font("KUET", Font.BOLD+Font.ITALIC, 30));
		jLabel2.setForeground(java.awt.Color.BLACK);
		
		jLabel2.setBounds(20,40,100,70);
		
		JLabel jLabel3=new JLabel("press any button to ");
		
		
		String name;
		name=tempController.userInterfaceObject.searchName;
				
		jButton =new JButton(name);
	
		
		jButton.setToolTipText("press here to go to the webpage");
		jButton.setBounds(180,20,1000,30);
		jButton.setBackground(java.awt.Color.lightGray);
		jButton.setForeground(java.awt.Color.BLUE);
		jButton.setFont(new Font(name, Font.BOLD+Font.ITALIC, 25));
		jButton.addActionListener(this);
		
		 button2=new JButton(second);
		button2.setBounds(180,360,1000,30);
		button2.setBackground(java.awt.Color.lightGray);
		button2.setForeground(java.awt.Color.BLUE);
		button2.setFont(new Font(name, Font.BOLD+Font.ITALIC, 25));
		
		//button2.addActionListener(this);
		tempController.information.button2(link1);
		
		
		jFrame.add(button2);
		
		
		JLabel jLabel=new JLabel(link);
		jLabel.setBounds(180,52,1000,30);
		
		jLabel.setFont(new Font(link, Font.BOLD+Font.ITALIC, 20));
		jLabel.setBackground(java.awt.Color.green);
		jLabel.setForeground(java.awt.Color.BLUE);
		
		JLabel label=new JLabel(link1);
        label.setBounds(180,392,1000,30);
		
		label.setFont(new Font(link, Font.BOLD+Font.ITALIC, 20));
		label.setBackground(java.awt.Color.green);
		label.setForeground(java.awt.Color.BLUE);
		
		
		jFrame.add(jLabel);
		jFrame.add(label);
		
		jFrame.add(area);
		
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		
		jFrame.setVisible(true);
		
	}
	
  public void actionPerformed(ActionEvent e)
  {
	  tempController.browserObject.openLink(link);
	  
  }
}
