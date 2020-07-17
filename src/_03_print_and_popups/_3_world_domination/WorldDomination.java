package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String ye = ("You will rule the world!");
		String no = ("Sign up for classes at The League. It's a shame you don't write code.");
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(input.equals("yes")) {
	JOptionPane.showMessageDialog(null, ye);
}
else
	JOptionPane.showMessageDialog(null, no);	
	
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

