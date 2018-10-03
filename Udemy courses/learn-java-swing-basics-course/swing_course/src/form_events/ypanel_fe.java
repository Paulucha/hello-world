package form_events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ypanel_fe extends JPanel implements ActionListener{
	
	//btn Action Listener lesson
	JButton click_me;
	
	//get form data lesson
	public JTextField text;
	public JButton submit_form;
	
	public ypanel_fe() {
		super();
		
		//btn Action Listener lesson
		click_me = new JButton("click me");
		click_me.addActionListener(this);
		add(click_me);
		
		//get form data lesson
		init_get_form_data();
		
	}//end constructor

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton click = (JButton) e.getSource();//get btn clicked var name
		
		//btn Action Listener lesson
		if(click == click_me) 
		{
			click_me.setBackground(Color.green);
			System.out.print("click");
		}

		//get form data lesson
		if(click == submit_form) 
		{
			get_form_data();
		}
		
		
	}//end actionPerformed
	
	//get form data lesson
	public void get_form_data() 
	{
		System.out.print(" ----clicked submit---- ");
		
		String txt = text.getText();
		
		JOptionPane.showMessageDialog(null, txt, "you wrote", JOptionPane.INFORMATION_MESSAGE);
		 
		System.out.print(" you wrote: "+txt);
		
	}//end get_form_data
	
	//get form data lesson
	public void init_get_form_data() 
	{
		//Initialize the submit button
		submit_form = new JButton("submit");
		submit_form.addActionListener(this);
		
		text = new JTextField(36);//36 character width
		text.setText("your txt");//set default text
		
		//add components to panel
		add(text);
		add(submit_form);

	}//end get_form_data

}
