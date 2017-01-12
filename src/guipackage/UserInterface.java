package guipackage;
import mainPackage.Controller; 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class UserInterface  implements ActionListener 
{
	
	private Controller tempControll;
	private JLabel backroungJLabel;
	private JLabel textJLabel;
	private JTextField textField;
	private JButton searchButton;
	public JButton abouButton;
	private JFrame frame; 
	public String searchName;
	
	
	public UserInterface(Controller x)
	{
		this.tempControll = x;
	}
	
	public JFrame getUIFrame()
	{
		return frame;
	}
	
	
	public  void createUI()
	{ 
		//setLocationRelativeTo(null);
		frame=new JFrame();
		
		frame.setTitle("KUET WEBSITE SEARCHER");
		frame.setSize(1100, 700);
		frame.setIconImage(new ImageIcon(getClass().getResource("/projectrecources/kuet-logo.jpg")).getImage());
		frame.setForeground(Color.RED);
		//setCursor(HAND_CURSOR);
	    //setCursor(TEXT_CURSOR);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	//****************SET BACKROUND********************************
        
		frame.setLayout(null);
		backroungJLabel=new JLabel(new ImageIcon(
				UserInterface.class.getResource("/projectrecources/kuetweb.PNG")));
		frame.setContentPane(backroungJLabel);
		//****************SET BACKROUND********************************
		
		textJLabel=new JLabel("KUET WEBSITE SEARCHER");
		textJLabel.setFont(new Font("KUET WEBSITE SEARCHER", Font.BOLD+Font.ITALIC, 30));
		//textJLabel.setBounds(310,250,850,50);
		textJLabel.setBounds(810,15,450,30);
		
		//label2.setBackground(Color.RED);
		//label2.setOpaque(true);
		textJLabel.setForeground(Color.BLACK);
		frame.add(textJLabel);
		
//		JLabel colorlabel=new JLabel();
//		colorlabel.setBackground(Color.black);
//		colorlabel.setBounds(810,15,450,30); 
//		frame.add(colorlabel);
		
		//*********************jtextfield****************************************************
		
		
		textField=new JTextField("");//making a textbar in jlabel
		//textField.setBounds(300,310,800,40);
		textField.setBounds(908,55,200,30);
		
		textField.setBackground(Color.WHITE);
		
//	    textField.setEditable(false);
		
		
		frame.add(textField);
		//*********************jtextfield****************************************************
		
		//****************add search button under the jtextfield for search*******************
		
		searchButton=new JButton("search");
		//searchButton.setBounds(550,360,140,30);
		
		searchButton.setBounds(1100,55,100,30);
		searchButton.setBackground(Color.BLACK);
	    searchButton.setForeground(Color.WHITE);
	    searchButton.setToolTipText("press button to search");
	    
	    //searchButton.addActionListener(this);
	    searchButton.addActionListener(this);
	   
	    
	    frame.add(searchButton);
		//****************add search button under the jtextfield for search*******************
		
		//****************add  about button under the jtextfield*****************************
		
		abouButton=new JButton("about");
		//abouButton.setBounds(700,360,140,30);
		
		abouButton.setBounds(1210,55,100,30);
		
		abouButton.setBackground(Color.BLACK);
	    abouButton.setForeground(Color.WHITE);
	    abouButton.setToolTipText("press button to about");
	    abouButton.addActionListener(this);
	    
	    frame.add(abouButton);
		
		//****************add  about button under the jtextfield******************************
	    
	    
	    
	    
		JMenuBar bar=new JMenuBar();
		bar= tempControll.menuBarobject.name(); 
	    frame.add(bar);
		frame.setJMenuBar(bar);
		
		
		frame.pack();
		
		frame.setVisible(true);
	}

	
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==searchButton)
			{
				 searchName = textField.getText().toString();

				tempControll.domparserObject.KuetWebsiteSearcher(searchName);
				
			}
			
			if(e.getSource()==abouButton)
			{
				tempControll.about_BUTTON.about_button();
			}
			
     
		}
		
	public static void setLookAndFeel()
	{
		try 
		{ 
		     UIManager.setLookAndFeel(new NimbusLookAndFeel());           
		} catch (Exception e) 
		{
		    e.printStackTrace();
		}
	}
}
