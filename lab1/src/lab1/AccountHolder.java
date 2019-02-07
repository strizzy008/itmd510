package lab1;

import java.util.Scanner;


/* Bryan Strawter
2/05/2019
AccountHolder.java
lab1
*/

public class AccountHolder {
	
		// creating the annual interest rate variable with type of double and making it static as it will not change
		private static double annualIntRate;
		
		// creating the variable balance to store the the users balance
		private double balance;
						
		Scanner sc = new Scanner(System.in);
		
		// creating the Account holder method that takes in the double type variable balance
		// and then checks to see if it is an appropriate number by being over than 0
		// also asks the user to enter in their initial balance
		public AccountHolder(double balance) {
			
			if (balance < 0.0)
				throw new IllegalArgumentException("balance must be non-negative");
				this.balance = balance;
		}

		/**
		 * @return the annualIntRate
		 */
		public static double getAnnualIntRate() {
			return annualIntRate;
		}

		/**
		 * @param annualIntRate the annualIntRate to set
		 */
		public void setAnnualIntRate(double annualIntRate) {
			this.annualIntRate = annualIntRate;
		}

		/**
		 * @return the balance
		 */
		public double getBalance() {
			
			System.out.println("Please Enter your balance:");
			
			balance = sc.nextDouble();
			while (balance < 0) {
				 System.out.println("You have entered a negative amount. You must enter a positive balance.");
				 getBalance();}
			
			double bal = balance;
			
			return balance;
			
		}

		/**
		 * @param balance the balance to set
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		    // the withdraw method is to hold a variable of double type and will check if the balance - the withdraw amount is less than 0 
			// then perform the transaction with a $50 penalty
				
		public void withdraw(double withdrawlAmt) {
			

				
				if(balance - withdrawlAmt < 0)
				{
				//penalize
				System.out.println("\n" + "You have been penalized $50 for overdraft");
				balance = balance - withdrawlAmt - 50;
				System.out.println("\n" + "Your new balance is: " + balance);
				
				}
				
				else {
				balance = balance - withdrawlAmt;
				System.out.println("\n" + "Your new balance is: " + balance + "\n");
				}
					
		}

		//the deposit method here takes in a variable of type double called depositAmt and then it increases the balance 
			//with the depositAmt it takes in and then ultimately sets the balance by using this.balanace
		
		public void deposit(double depositAmt) {
			
			balance = balance + depositAmt;
			
			System.out.println("Your new balance is: " + balance);
				
		}		
			
		// the modifyIntRate method is here to set the balance equal to the balance multiplied by the set annual rate 
			//and then divided by 12 for each month in the year.
		
		public void monthlyModifyIntRate(double bal) {
			balance += (this.balance * annualIntRate / 12.0);				
		}
		
		public static void modifyMonthlyInterest(double annualIntRate){
			
			AccountHolder.annualIntRate = annualIntRate;
			
		}
		
		public String toString() {
		
			return String.format("$%.2f", balance);
			
		}
		
}
