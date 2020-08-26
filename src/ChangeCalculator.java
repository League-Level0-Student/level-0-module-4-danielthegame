package _01_double._1_change_calculator;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {
	
	

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String i = JOptionPane.showInputDialog("How much nickles do you have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
		Integer numNickles = Integer.parseInt(i);
		
		// Ask the user how many dimes they have, and convert their answer
		String ii = JOptionPane.showInputDialog("How many dimes do you have?");
		
		Integer numDimes = Integer.parseInt(ii);
		
		// Ask the user how many quarters they have, and convert their answer
		String iii = JOptionPane.showInputDialog("How many quater do you have?");
		
		Integer numQuaters = Integer.parseInt(iii);
		
		// Calculate how much money the user has.  Hint: Use a double variable 
		Integer nickleTotal = numNickles * 5;
		Integer dimeTotal = numDimes * 10;
		Integer quaterTotal = numQuaters * 25;
		Integer totalCents = nickleTotal + dimeTotal + quaterTotal;
		
		System.out.println(totalCents);
		
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		//100/? == 1
		//1$ = 100 pennies
		//If we have 200 pennies -> How many dollars do we have. 2! 
		//What did you divide 200 by to get 2?
		//200/100 = 2
		//200/1000 = 0.2
		//200/10000 = 0.02
		
		Double dollarsAndCents = Double.valueOf(totalCents / 100);
	
		DecimalFormat df = new DecimalFormat("#.##"); 
		String formatted = df.format(dollarsAndCents);

		//This isn't done just yet.. formatting is off.
		
		System.out.println("$" + formatted);
		
	}
}

