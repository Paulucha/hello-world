package jtable;



import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ypanel_table extends JPanel {

	JTable table_arr;
	
	public ypanel_table() {
		super();
		
		table_from_array();
		

		
	}
	
	public void table_from_array() 
	{
		Object column_names[] = 
			{ "first name", "last name", "age" };
		
		Object data[][] = { 
	    		  { "jon", "smith", "30" },
	    		  { "jon", "snow", "22" } 
	    		};
		
		DefaultTableModel model = new DefaultTableModel(data,column_names);
		
		table_arr = new JTable(model);
		
		add(new JScrollPane(table_arr));
		
	}//end table_from_array
	


}
