package jmenu;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import jframe_jpanel.ypanel_lesson;

public class yframe_m extends JFrame {
	
	private JMenuBar mbar;
	private JMenu file;
	private JMenuItem open_file,save_file,close;
	
	
	public yframe_m(String title,int w,int h) throws HeadlessException 
	{
		super(title);//send title to super constractor
		setSize( w,h);//set frame width and height 
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//jmenu lesson
		make_menu();
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
	
	
	public void make_menu() 
	{
		//instantiate everything
		mbar = new JMenuBar();
		file = new JMenu("file");
		open_file = new JMenuItem("open");
		save_file = new JMenuItem("save");
		close = new JMenuItem("exit");
		
		//add file menu to menu bar
		mbar.add(file);
		
		//add file items to file
		file.add(open_file);
		file.add(save_file);
		file.add(close);
		
		//add menu bar to frame
		setJMenuBar(mbar);
		
		
	}//end make_menu
	
}
