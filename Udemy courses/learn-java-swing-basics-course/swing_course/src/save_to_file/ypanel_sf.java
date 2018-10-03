package save_to_file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ypanel_sf extends JPanel implements ActionListener {

	public JButton save_btn;
	public JTextArea ta;
	public ypanel_sf() {
		super();
		
		//save button
		save_btn = new JButton("save");
		save_btn.addActionListener(this);
		add(save_btn);
		
		//textarea
		ta=new JTextArea(11, 40);
		//add text area to a scrollpane
	    add( new JScrollPane(ta));//add to panel
		
	}//end constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton click = (JButton) e.getSource();
		
		if(click == save_btn) 
		{
			yaction.save(save_btn, ta.getText());
		}
		
	}//end actionPerformed

}
