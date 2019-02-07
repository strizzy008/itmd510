package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;



/* Bryan Strawter
	2/05/2019
	AccountHolderTest.java
	lab1

	This Lab 1 project is a simple bank program which accepts a users balance and then modifies the balance,
		addition, deductions, and updated balances over 1 year based off of a monthly interest year.
		There are a number of methods and variables called in this program
*/

public class AccountHolderTest {

	public static void main(String[] args) {
		
		//creating variable to store the deposit amount
		double depositAmt;
				
		//creating a variable to store the withdraw amount
		double withdrawlAmt;
		
		//creating the object sc from the scanner class to take user input
		Scanner sc = new Scanner(System.in);
		
		//instantiating obj out of the Account holder class
		AccountHolder obj = new AccountHolder(1);
				
		// calling the get balance method to obtain the balance from user input
		obj.getBalance();
				
		//asking the user to put in a deposit amount
		System.out.println("Please enter the amount you would like to deposit:");
		depositAmt = sc.nextDouble();
		
		
		while (depositAmt < 0) {
			 System.out.println("You have entered a negative amount. You must enter a positive balance.");
			 depositAmt = sc.nextDouble();
			 };
						
		//calling the deposit method with the variable depositAmt
		obj.deposit(depositAmt);
				
		// asking the user to enter a withdraw amount
		System.out.println("Please enter the amount you would like to Withdraw:");		
			
		
		withdrawlAmt = sc.nextDouble();
		
		while (withdrawlAmt < 0) {
			 System.out.println("You have entered a negative amount. You must enter a positive balance.");
			 
			 withdrawlAmt = sc.nextDouble();
			 }
						
		//calling the withdraw method with the variable withdrawlAmt
		obj.withdraw(withdrawlAmt);
		
		
		//setting the interest rate to 4%
		AccountHolder.modifyMonthlyInterest(.04);
		
		//creating the formatting of the output by using the toString method while showing the base balance
		System.out.printf("%20s%n","Account Balance w. Interest");
		System.out.printf("%-10s%10s%n", "Base", obj.toString());
		
		// for loop going thru each month with the accumulated interest rate as well as formatting the output
		for (int month = 1; month <=12; month++) {
			
			String monthLabel = String.format("Month %d:", month);
			obj.monthlyModifyIntRate(obj.getAnnualIntRate());
			System.out.printf("%-10s%10s%n", monthLabel, obj.toString());
		}
						
		
		System.out.println("\n");
		
		// setting the interest rate at 5%
		AccountHolder.modifyMonthlyInterest(.05);
		
		System.out.printf("%20s%n","Account Balance w. 5% Interest");
		System.out.printf("%-10s%10s%n", "Base", obj.toString());
		
		// for loop going thru each month with the accumulated interest rate as well as formatting the output
		for (int month = 1; month <=12; month++) {
			
			String monthLabel = String.format("Month %d:", month);
			obj.monthlyModifyIntRate(obj.getAnnualIntRate());
			System.out.printf("%-10s%10s%n", monthLabel, obj.toString());

		// outputting the date with my name as author
	}
		// outputting the date with my name as author
		   String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		   System.out.println("\n"+"Cur dt=" + timeStamp + "\nProgrammed by Bryan Strawter\n");
	}
	
}
