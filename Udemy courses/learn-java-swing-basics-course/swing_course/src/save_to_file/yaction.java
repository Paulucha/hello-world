package save_to_file;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class yaction {
	
	public static void save(Component parent,String txt) 
	{
		JFileChooser save = new JFileChooser();
		int option = save.showSaveDialog(parent);
		if (option == JFileChooser.APPROVE_OPTION) //if use clicked save
		{
			try {
				//selected file path
				String file_path = save.getSelectedFile().getPath();
				
				//if no txt extantion add it
				if(!file_path.contains(".txt")) {file_path +=".txt";}
	            
				//use BufferedWriter to write all the text to file
				BufferedWriter out = new BufferedWriter(new FileWriter(file_path));
				//write all textarea text to file
				out.write(txt); 
				// close file stream
				out.close(); 
			} catch (Exception ex) { 
				
				System.out.println(ex.getMessage());
			}
			
		}

	}//end save
}
