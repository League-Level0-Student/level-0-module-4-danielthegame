
package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String awnser = JOptionPane.showInputDialog("What day is it");
        
		// Set the boolean isWeekend based on the value they enter
		if(awnser.equals("Sunday")|| awnser.equals("Saturday") ) {
			isWeekend = true ;
		}
		else {
			isWeekend = false ;
		}
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend) {
			JOptionPane.showMessageDialog(null,"Sleep in");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
			JOptionPane.showMessageDialog(null,"Get out of bed and go to school");
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam=false;
		// Write code to ask the user what percentage they scored in their last exam
		String exam =JOptionPane.showInputDialog("what percentage did oyu get on your last exam");                                                       
		double parseScore = Double.parseDouble(exam);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(parseScore>70) {
			passedExam=true;
				}
		// If the user passed the exam, congratulate them
		if(passedExam==true) {
			JOptionPane.showMessageDialog(null,"Nice job");
		}
		// otherwise, wish them better luck next time.
		else
			JOptionPane.showMessageDialog(null,"Good luck next time");
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes")) {
				
			
				gameIsOver = true;
			}
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null,"Game is over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String i =JOptionPane.showInputDialog("What color do you want to draw with");
		
		if(i.equals ("red")) {
			isRed=true;
			
		}
		
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
String shape =JOptionPane.showInputDialog("What shape do you want to draw");
		
		if(shape.equals ("blue")) {
			isSquare=true;
			
		}
		
			
		// Now you MUST use the && operator to join the booleans for this code.
		if(isSquare==true && isRed==true ) {
			drawRedSquare();
			
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.move(40);
		rob.turn(90);
		rob.move(40);	
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.turn(90);
	}	
}
