package notepad;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import main.ypanel;

public class yframe_np extends JFrame {
	
	public ypanel_np_absolute ypnl_absolute;
	public ypanel_np_gridbag ypnl_gb;
	
	public yframe_np(String title,int w,int h) throws HeadlessException 
	{
		super(title);//send title to super constractor
		setSize( w,h);//set frame width and height 
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//instantiate ypanel and add it to frame
		//ypnl_absolute = new ypanel_np_absolute(this);
		//add(ypnl_absolute);
		
		ypnl_gb = new ypanel_np_gridbag(this);
		add(ypnl_gb);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}
