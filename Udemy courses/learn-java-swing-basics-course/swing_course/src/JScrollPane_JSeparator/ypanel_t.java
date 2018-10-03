package JScrollPane_JSeparator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class ypanel_t extends JPanel {

	public ypanel_t() {
		super();
		setSize( 500, 2500 );//set banel size
		
		//instantiate btn
		JButton ybtn = new JButton("random btn");
		//add btn to panel
		add(ybtn);
		
		JSeparator sep =new JSeparator();
		sep.setPreferredSize(new Dimension(250,1));
		add(sep);
	}

}
