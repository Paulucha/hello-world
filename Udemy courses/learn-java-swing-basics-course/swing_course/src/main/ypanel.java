package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ypanel extends JPanel {
	
	//JButton and jlabel lesson
	public JButton ybtn;
	public JLabel text_label,img_label;
	
	//jtextfield and textarea lesson
	public JTextField tf;
	public JTextArea ta;
	public JScrollPane jp;
	
	//jcombobox and jlist lesson
	public JComboBox petList,male_female;
	public JList jl;
	
	//JCheckBox  lesson
	public JCheckBox has_insurence,do_like_shnitzel;
	
	// JRadioButton lesson
	public JRadioButton[] rs;
	public String[] rs_s = {"radio 1","some option","bla bla" ,"lorem ipsum"};
	public ButtonGroup r_group;
	
	public JRadioButton[] m_f;
	public String[] m_f_s = {"male","female"};
	public ButtonGroup m_f_s_g;
	
	
	public ypanel() {
		super();
		setSize( 500, 500 );//set banel size
		//setBackground(Color.DARK_GRAY);//set panel background color
		
		//JButton and jlabel lesson
		add_btn_and_label();
		
		//jtextfield and textarea lesson
		add_text_field_and_textarea();
		
		//jcombobox and jlist lesson
		combobox_and_jlist();
		
		//JCheckBox  lesson
		chackbox();
		
		// JRadioButton lesson
		radio_button();
		
	}//end constructor
	
	//////////////JButton and jlabel lesson//////////////////
	
	public void add_btn_and_label() 
	{
		//instantiate btn
		ybtn = new JButton("my btn");
		//add btn to panel
		add(ybtn);
		
		//instantiate text label
		text_label = new JLabel("text label and img label->");
		//create img label
		img_label = new JLabel("");
		//set image source to image label
		set_img("label.png" ,img_label);
		//add labels to panel
		add(text_label);
		add(img_label);
	}//end add btn
	
	public void set_img(String ic , JLabel lbl) 
	{
		//get and set img to label
		lbl.setIcon(new ImageIcon("res/"+ic));
		//repaint panel elements etc
		repaint();
		revalidate(); 
	}//end set_img
	
	//////////////end JButton and jlabel lesson//////////////////
	
	//////////////////jtextfield and textarea lesson/////////////
	
	public void add_text_field_and_textarea() 
	{
		
		//instantiate text field
		tf = new JTextField(16);
		tf.setText("bla");//set defult text
		add(tf);//add to panel
		
		//instantiate textarea
		ta=new JTextArea(11, 20);
		//add text area to a scrollpane
	    jp= new JScrollPane(ta);
	    add(jp);//add to panel
	    
	}//end add_text_field_and_textarea
	
	//////////////////end jtextfield and textarea lesson/////////////
	
	/////////////////jcombobox and jlist lesson/////////////////////////////
	
	public void combobox_and_jlist() 
	{
		//create a pet list using a string array
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		//instantiate the combobox and put the list inside
		petList = new JComboBox(petStrings);
		
		//same with male female combobox
		String[] mfm = { "male", "female"};
		male_female = new JComboBox(mfm);
		
		//add to panel
		add(petList);
		add(male_female);
		
		//create item list with a string array
		String[] items = {"Item 1", "Item 2", "Item 3"};
		//instantiate jlist and put the list in the jlist constractor arg
		jl = new JList (items);
		//set the size of the list
		jl.setPreferredSize(new Dimension(150, 80));
		//add to panel
		add(jl);
		
	}//end combobox_and_jlist
	
	/////////////////end jcombobox and jlist/////////////////////////////
	
	///////////////////////////JCheckBox ///////////
	
	public void chackbox() 
	{
		//instantiate chackboxs
		has_insurence = new JCheckBox("do you have insurence?");
		
		do_like_shnitzel = new JCheckBox("do you like to eat shnitzel?");
		do_like_shnitzel.setSelected(true);//set to chacked by defult
		
		//add to panel
		add(has_insurence);
		add(do_like_shnitzel);
		
		
		
	}//end chackbox
	
	///////////////////////////end JCheckBox ///////////
	///////////////////////////JRadioButton///////////
	
		
	public void radio_button() 
	{
		//seprator line
		JSeparator sep1 =new JSeparator();
		sep1.setPreferredSize(new Dimension(550,1));
		add(sep1);
		//first redio btns group
		r_group = new ButtonGroup();
		rs = create_radio_btns(rs_s,r_group);
		add_radio_btns(rs) ;
		
		//seprator line
		JSeparator sep =new JSeparator();
		sep.setPreferredSize(new Dimension(550,1));
		add(sep);
		
		//second redio btns group
		m_f_s_g = new ButtonGroup();
		m_f = create_radio_btns(m_f_s,m_f_s_g);
		add_radio_btns(m_f) ;
	}//end radio_button
	
	public JRadioButton [] create_radio_btns(String[] sr , ButtonGroup btng) 
	{
		//create itreator
		int i = 0;
		//instantiate/reset JRadioButton array and set its size
		//to sr length (sr holds all the label strings)
		JRadioButton[] rs_r = new JRadioButton[sr.length];		
		
		//for each sr as r
		for(String r : sr) 
		{
			//instantiate each redio btn
			rs_r[i] = new JRadioButton(r);
			
			//add it to group
			btng.add(rs_r[i]);
			
			i++;//incrament itrator
		}//end for
		
		//set first one to checked
		rs_r[0].setSelected(true);
		
		return rs_r;
		
	}//end create_radio_btns
	
	
	
	public void add_radio_btns(JRadioButton [] r_btn_r) 
	{
		if(r_btn_r ==null) {return;}//no array? exit
		
		//loop array add each element to panel
		for(JRadioButton r_btn : r_btn_r) 
		{
			if(r_btn !=null)
			{
				add(r_btn);
			}
			
		}//end for 
		
	}//end add_radio_btns
	
	///////////////////////////end JRadioButton///////////
	
	
	
}//end ypanel
