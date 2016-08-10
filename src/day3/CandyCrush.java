package day3;

import javax.swing.JOptionPane;
import javax.swing.Popup;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
   String s=JOptionPane.showInputDialog("who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+s+"!");
		// 3. Ask the user for the name of their best friend
  String d=JOptionPane.showInputDialog("who is your best friend");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, ""+d+" rocks your socks off or he fall in a black hole ");
	} 
}



