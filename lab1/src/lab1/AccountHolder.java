package lab1;

import java.util.Scanner;

public class AccountHolder {
	
		// creating the annual interest rate variable with type of double and making it static as it will not change
		static double annualIntRate;
		
		// creating the variable balance to store the the users balance
		double balance;
						
		Scanner sc = new Scanner(System.in);
		
		
		// creating the Account holder method that takes in the double type variable balance
		// and then checks to see if it is an appropriate number by being over than 0
		// also asks the user to enter in their initial balance
		public AccountHolder(double balance) {
			
			
			this.balance = (balance >= 0) ? balance : 0;
		}

		/**
		 * @return the annualIntRate
		 */
		public double getAnnualIntRate() {
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
				if(this.balance - withdrawlAmt < 0);{
				//penalize
				System.out.println("You have been penalized $50 for overdraft");
				this.balance = balance - withdrawlAmt - 50;}
		
		}
		
		
		//the deposit method here takes in a variable of type double called depositAmt and then it increases the balance 
			//with the depositAmt it takes in and then ultimately sets the balance by using this.balanace
		
		public void deposit(double depositAmt) {
			
			this.balance = balance + depositAmt;
					
		}		
			
		// the modifyIntRate method is here to set the balance equal to the balance multiplied by the set annual rate 
			//and then divided by 12 for each month in the year.
		
		public void modifyIntRate(double balance) {
			this.balance = balance * annualIntRate/12;				
		}
				
		
}
