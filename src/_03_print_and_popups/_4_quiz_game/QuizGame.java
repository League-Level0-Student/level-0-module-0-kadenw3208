package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String correct = ("Correct! One point has been added to your score.");
				// 2.  Ask the user a question 
				// 3.  Use an if statement to check if their answer is correct
		String input=JOptionPane.showInputDialog("What is 1+1?");
				if (input.equals("2")) {
					score+=1;
					JOptionPane.showMessageDialog(null, correct);
				}
				else {
					score-=1;
					JOptionPane.showMessageDialog(null, "Incorrect! One point has been taken away from your score.");
				// 4.  if the user's answer was correct, add one to their score 
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
				 input = JOptionPane.showInputDialog("What is 66x7?");
				if (input.equals("462")) {
					score+=1;
					JOptionPane.showMessageDialog(null, correct);
				}
				else
					{score-=1;
					JOptionPane.showMessageDialog(null, "Incorrect! One point has been taken away from your score.");
					}
					JOptionPane.showInputDialog("What are the smallest items in the universe?");
					if (input.equals("string particles")) {
						score+=1;
						JOptionPane.showMessageDialog(null, correct);
					}
					else
						{score-=1;
						JOptionPane.showMessageDialog(null, "Incorrect! One point has been taken away from your score.");// After all the questions have been asked, tell the user their final score 
						}
						input = JOptionPane.showInputDialog("What is the capital of England?");
					if (input.equals("London")) {
						score+=1;
						JOptionPane.showMessageDialog(null, correct);
					}
					else
						{score-=1;
						JOptionPane.showMessageDialog(null, "Incorrect! One point has been taken away from your score.");
						} 
						input = JOptionPane.showInputDialog("In The Land of Stories, who was the long lost Charming prince?");
						if (input.equals("Charlie Charming")) {
							score+=1;
							JOptionPane.showMessageDialog(null, correct);
						}
						else
							{score-=1;
							JOptionPane.showMessageDialog(null, "Incorrect! One point has been taken away from your score.");
							}
						
							JOptionPane.showMessageDialog(null, "Your final score is: "+score);
	}
}
