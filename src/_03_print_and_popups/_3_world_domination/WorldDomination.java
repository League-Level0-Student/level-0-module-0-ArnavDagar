package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Do you knonw how to code?");
		
		if(input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world");

		} else {
			JOptionPane.showMessageDialog(null, "Sign up for classes at The League");
		}

		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

