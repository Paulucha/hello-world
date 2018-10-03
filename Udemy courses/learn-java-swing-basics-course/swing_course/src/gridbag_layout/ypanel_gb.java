package gridbag_layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ypanel_gb extends JPanel {
	
	public JButton submit,right1,right2,right3,right4;
	public JLabel first_name,last_name,form_title;
	public JTextField first_name_txt,last_name_txt;
	public JTextArea messge_txt;
	public JCheckBox agree_terms;
	
	public GridBagConstraints gc;
	
	public ypanel_gb() {
		super();
		
		setLayout(new GridBagLayout());
		//grid
		gc = new GridBagConstraints();
		
		intantiate_components();
		add_components();
	}//end constructor
	
	public void intantiate_components()
	{
		form_title = new JLabel ("form title");
		
		first_name = new JLabel ("first name");
		first_name_txt = new JTextField (15);
		
		last_name = new JLabel ("last name");
		last_name_txt = new JTextField (15);
		
		
		messge_txt =new JTextArea(5, 20);
		
		agree_terms = new JCheckBox("agree to terms");
		
		 submit = new JButton("submit");
		 
		 //right btns
		 right1 = new JButton("right1");
		 right2 = new JButton("right2");
		 right3 = new JButton("right3");
		 right4 = new JButton("right4");
	
	}//end intantiate_components
	
	public void add_components()
	{
		
		
		Insets i = new Insets(0, 0, 0, 0);
		gc.insets = i;
		
		//title
		gc.gridx = 3;
		gc.gridy = 0;
		gc.gridwidth=3;
		add(form_title,gc);
		
		gc.gridwidth=1;//reset element grid width
		
		//row 1
	
		gc.gridx = 1;
		gc.gridy = 1;
		add(first_name,gc);
	

		gc.gridx = 3;
		add(first_name_txt,gc);
		
		//row2
		
	
		gc.gridx = 1;
		gc.gridy = 2;
		add(last_name,gc);
		
		gc.gridx = 3;
		add(last_name_txt,gc);
		
		//row3
		i = new Insets(0, 0, 10, 0);//bottom margin 10px
		gc.insets = i;
		
		gc.gridx = 3;
		gc.gridy = 3;
		add(messge_txt,gc);
		
		//row4
		gc.gridx = 3;
		gc.gridy = 4;
		add(submit,gc);
		
		gc.gridx = 4;
		add(agree_terms,gc);
		
		//right btns
		
		gc.ipady=32;//add padding to all btns
		
		gc.gridy = 1;
		gc.gridx = 4;
		add(right1,gc);
	
		gc.gridx = 5;
		add(right2,gc);
		
		gc.gridy = 2;
		gc.gridx = 4;
		add(right3,gc);
		
		gc.gridx = 5;
		add(right4,gc);
	
		
		
	}//end add_components
}
