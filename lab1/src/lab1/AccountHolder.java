package lab1;

import java.util.Scanner;

public class AccountHolder {
	
		static double annualIntRate;
		double balance;
		Scanner sc = null;
		
		
		public AccountHolder(double balance) {
			
			this.balance = (balance >= 0) ? balance : 0;
			sc = new Scanner(System.in);
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
		
		
		public void withdraw(double withdrawlAmt) {
			
			if(this.balance - withdrawlAmt < 0);
			//penalize
				this.balance = balance - withdrawlAmt - 50;
				//this.balance -= bal;
			
		}
				
	public void deposit(double depositAmt) {
			
			this.balance = balance + depositAmt;
			
		}		
			
		public void modifyIntRate() {
			balance = balance * annualIntRate/12;
				
		}
				
		public void monthlyIntRate(double nRate) {
			annualIntRate = nRate;
			
		}


}
