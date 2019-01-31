package lab1;

import java.util.Scanner;

public class AccountHolder {
	
		static double annualIntRate;
		double balance;
		Scanner sc = null;
		
		
		public AccountHolder(double bal) {
			
			this.balance = (bal >= 0) ? bal : 0;
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
		
		
		public void withdraw(double bal) {
			
			if(this.balance -bal<0);
			//penalize
			this.balance -= bal;
			
		}
		
		public void modifyIntRate() {
			balance = balance * annualIntRate/12;
		}
		
		
		public void modifyIntRate(double nRate) {
			annualIntRate = nRate;
			
		}

}
