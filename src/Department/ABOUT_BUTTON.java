package Department;

//import guipackage.UserInterface;

//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.LayoutManager;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextArea;

import mainPackage.Controller;

public class ABOUT_BUTTON //implements ActionListener
{

	private Controller tempController;
	public JLabel label3;
	public JButton button;
	public ABOUT_BUTTON(Controller x)
	{
		// TODO Auto-generated constructor stub
		tempController=x;
	}
	
	public void  about_button()
	{
		JFrame jFrame=new JFrame("About!!!!!");
		jFrame.setSize(1200, 1000);
		jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
		
		jFrame.setLayout(null);
		JLabel backroungJLabel=new JLabel(new ImageIcon(
				ABOUT_BUTTON.class.getResource("/projectrecources/nature.jpg")));
		
		jFrame.setContentPane(backroungJLabel);
		
		String text,text2,text3;
		text="<html>Kuet Website Searcher is software that helps a person to search the kuet website.<br>" +
				"Anyone can easily Search the teacher list , admission test , course credit and all<br>" +
				"other things which is in kuet website.You can easily enter the specific page of " +
				"kuet by using this software. </html>";
		
		JLabel label = new JLabel(text);
		
		label.setFont(new Font(text, Font.BOLD+Font.ITALIC, 15));
		label.setBounds(50,0,700,300);
		jFrame.add(label);
		
		
		
		text2="<html>If you want to know more about the software you can go the following search button.<br> </html>";
		
		JLabel label2=new JLabel(text2);
		label2.setBounds(50,200,500,100);
		label2.setFont(new Font(text2, Font.BOLD+Font.ITALIC, 20));
		jFrame.add(label2);
		
		button=new JButton("Know More About");
		tempController.search_ABOUT.search_about();
		button.setBounds(50,280,500,30);
		jFrame.add(button);
		
		 label3=new JLabel(new ImageIcon(
				ABOUT_BUTTON.class.getResource("/projectrecources/SF.jpg")));
		label3.setBounds(700,500,500,200);
		
		text3="<html>All right reserved by<br>" +
			 "Shuvro & sopnil<br>"+
			 "cse 2k12</html>";
		
		JLabel label4=new JLabel(text3);
		label4.setBounds(800,425,500,100);
		label4.setFont(new Font(text3, Font.BOLD+Font.ITALIC, 15));
			
		
		
		jFrame.add(label3);
		jFrame.add(label4);
		jFrame.setVisible(true);
		
    }
		
	}
	



