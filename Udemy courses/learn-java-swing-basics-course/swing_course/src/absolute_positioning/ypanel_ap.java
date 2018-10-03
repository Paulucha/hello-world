package absolute_positioning;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ypanel_ap extends JPanel {
	
	public JButton submit,right1,right2,right3,right4;
	public JLabel first_name,last_name,form_title;
	public JTextField first_name_txt,last_name_txt;
	public JTextArea messge_txt;
	public JCheckBox agree_terms;
	
	 public ypanel_ap() {
		super();
		setLayout (null);
		intantiate_components();
		add_components();
		position_components();
		
		
	}//end constructor
	
	public void intantiate_components()
	{
		form_title = new JLabel ("form title");
		
		first_name = new JLabel ("first name");
		first_name_txt = new JTextField (5);
		
		last_name = new JLabel ("last name");
		last_name_txt = new JTextField (5);
		
		
		messge_txt =new JTextArea(5, 20);
		
		agree_terms = new JCheckBox("agree to terms");
		
		 submit = new JButton("submit");
		 
		 //right btns
		 right1 = new JButton("right1");
		 right2 = new JButton("right2");
		 right3 = new JButton("right3");
		 right4 = new JButton("right4");
	
	}//end intantiate_components
	
	public void position_components()
	{
		
		form_title.setBounds(245, 15, 100, 25);
		
		first_name.setBounds (35, 80, 100, 25);
		first_name_txt.setBounds (150, 80, 280, 25);
		
		last_name.setBounds (35, 130, 100, 25);
		last_name_txt.setBounds (150, 130, 280, 25);
		
		
		messge_txt.setBounds (35, 205, 395, 85);
		
		agree_terms.setBounds (295, 310, 135, 25);
		
		 submit.setBounds (165, 310, 100, 25);
		 
		 //right btns
		 right1.setBounds (465, 55, 80, 65);
		 right2.setBounds (560, 55, 80, 65);
		 right3.setBounds (465, 130, 80, 65);
		 right4.setBounds (560, 130, 80, 65);
		 revalidate();
		 repaint();
	}//end position_components
	
	public void add_components()
	{
		
		add(submit);
		add(right1);
		add(right2);
		add(right3);
		add(right4);
		add(first_name);
		add(last_name);
		add(form_title);
		add(first_name_txt);
		add(last_name_txt);
		add(messge_txt);
		add(agree_terms);
		
		
		
	}//end add_components
	 
	 
}
