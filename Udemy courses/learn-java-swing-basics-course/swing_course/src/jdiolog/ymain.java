package jdiolog;

import javax.swing.JOptionPane;

public class ymain {

	public static void main(String[] args) {
		
		 
		 String text = JOptionPane.showInputDialog(null, "write somthing", "title", JOptionPane.QUESTION_MESSAGE);
		 JOptionPane.showMessageDialog(null, text, "you wrote", JOptionPane.INFORMATION_MESSAGE);
		 
		 System.out.println("you wrote"+text);
		 
	}

}
