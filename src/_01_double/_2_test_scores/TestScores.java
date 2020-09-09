package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
 
	String testScore = JOptionPane.showInputDialog("What kind of score you got on your test");
	double parseScore = Double.parseDouble(testScore);
	if(80<parseScore)	
	{
		JOptionPane.showMessageDialog(null,"Good job");
		
	}
	else if(60<parseScore) {
		JOptionPane.showMessageDialog(null,"Study harder");
	}
	else if(40<parseScore) {
		JOptionPane.showMessageDialog(null,"chill you have to take touter lessons");
		
	}
	else if(20<parseScore) {
		JOptionPane.showMessageDialog(null,"YOU SUCK ");
	}
		}

}
