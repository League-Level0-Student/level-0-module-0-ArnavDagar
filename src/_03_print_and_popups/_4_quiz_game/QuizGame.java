package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		int count = 0;		
		// ASK A QUESTION AND CHECK THE ANSWER
		
String input = JOptionPane.showInputDialog("What year was Microsoft established?");
		
		if(input.equals("1975")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			count = count + 1;

		} else {
			JOptionPane.showMessageDialog(null, "WRONG!");
			count = count - 1;
		}

String input1 = JOptionPane.showInputDialog("How many sides does a hexagon have?");
		
		if(input1.equals("6")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			count = count + 1;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!");
			count = count -1;
		}

String input11 = JOptionPane.showInputDialog("How many meters are there in a kilometer");
		
		if(input11.equals("100")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			count = count + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Sign up for classes at The League");
			count = count - 1:
		}

		
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
