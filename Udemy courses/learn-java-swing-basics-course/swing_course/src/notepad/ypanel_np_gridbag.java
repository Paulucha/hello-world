package notepad;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ypanel_np_gridbag extends JPanel implements ActionListener{

	yframe_np win;//the window (jframe) containing thhe panel
	
	private JMenuBar mbar;
	private JMenu file;
	private JMenuItem open_file,save_file,close;
	
	private JTextArea main_txt;
	private JScrollPane main_txt_scroll;
	
	private GridBagConstraints gc;
	
	public ypanel_np_gridbag(yframe_np win2) {
		super();
		win = win2;//set window
		
		setLayout(new GridBagLayout());
		//grid
		gc = new GridBagConstraints();
		
		make_menu();
		make_work_area();
	}//end constructor
	
	public void make_menu() 
	{
		//instantiate everything
		mbar = new JMenuBar();
		file = new JMenu("file");
		open_file = new JMenuItem("open");
		save_file = new JMenuItem("save");
		close = new JMenuItem("exit");
		
		//set action listener to this 
		//(we will handle mouce clicks on items in: actionPerformed)
		open_file.addActionListener(this);
		save_file.addActionListener(this);
		close.addActionListener(this);
		
		//add file menu to menu bar
		mbar.add(file);
		
		//add file items to file
		file.add(open_file);
		file.add(save_file);
		file.add(close);
		
		//set as window menubar
		win.setJMenuBar(mbar);
	
		
		
	}//end make_menu
	
	public void make_work_area() 
	{
		//instantiate main text and put it in a scroll pane
		main_txt = new JTextArea("", 5,5);
		main_txt_scroll = new JScrollPane(main_txt);
		
		//set font and font size
		main_txt.setFont(new Font("Century Gothic", Font.BOLD, 12));
		
		gc.gridx = 0;
	    gc.gridy = 0;
	    gc.weightx = 1.0;
	    gc.weighty = 1.0;
		gc.fill = gc.BOTH;
		//add scrolpane with main text inside of it to frame
		add(main_txt_scroll,gc);
		
	
	}//end make_work_area
	@Override
	public void actionPerformed(ActionEvent e) {

	JMenuItem click = (JMenuItem) e.getSource();//get btn clicked var name
		
		if(click == close) 
		{
			win.dispose();
		}//end close
		
		if(click == open_file) 
		{
			np_action.open(open_file, main_txt);
		}
		
		if(click == save_file)
		{
			np_action.save(save_file, main_txt);
		}
		
	}

}
