package JScrollPane_JSeparator;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import jframe_jpanel.ypanel_lesson;

public class yframe_t extends JFrame {
	
	public ypanel_t ypnl;
	
	public yframe_t(String title,int w,int h) throws HeadlessException 
	{
		super(title);//send title to super constractor
		setSize( w,h);//set frame width and height 
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//instantiate ypanel and add it to frame
		ypnl = new ypanel_t();
		JScrollPane sp= new JScrollPane(ypnl);
		sp.setVerticalScrollBarPolicy(
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(sp);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}
