package form_events;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class yframe_fe extends JFrame {
	
	public ypanel_fe ypnl;
	
	public yframe_fe(String title,int w,int h) throws HeadlessException 
	{
		super(title);//send title to super constractor
		setSize( w,h);//set frame width and height 
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//instantiate ypanel and add it to frame
		ypnl = new ypanel_fe();
		add(ypnl);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}//end yframe
