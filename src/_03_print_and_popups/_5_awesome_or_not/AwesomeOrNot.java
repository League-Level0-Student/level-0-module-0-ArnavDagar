package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	   int randomNum = ran.nextInt(4); //0-3
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
	   System.out.println(randomNum);
	   
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog("Enter something you think is awesome!");

		if(randomNum == 0) {
			JOptionPane.showMessageDialog(null, "That is awesome");
		
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
			
		elif(randomNum == 1); {
			JOptionPane.showMessageDialog(null, "That is ok");
		}
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
		elif(randomNum == 2); {
			JOptionPane.showMessageDialog(null, "That is boring");
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			elif(randomNum == 3); {
				JOptionPane.showMessageDialog(null, "I don't know");
			// -- invent your own message to give to the user (be nice).
}
}
}
}
	private static void elif(boolean b) {
		// TODO Auto-generated method stub
		
	}
