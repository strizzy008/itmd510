package lab1;

import java.util.Scanner;

public class AccountHolderTest {

	public static void main(String[] args) {
		
		//creating the object sc from the scanner class to take user input
		Scanner sc = new Scanner(System.in);
		
		//instantiating obj out of the Account holder class
		AccountHolder obj = new AccountHolder(100);
		
		
		//AccountHolder obj2 = new AccountHolder(40);
		//AccountHolder dummy = new AccountHolder();
	
		//using the setAnnualIntRate method to set the rate to .04
		obj.setAnnualIntRate(.04);
				
		//creating variable to store the deposit amount
		double depositAmt;
		
		//creating a variable to store the withdraw amount
		double withdrawlAmt;
		
		// asking the user to enter a withdraw amount
		//System.out.println("Please enter the amount you would like to Withdraw:");		
		//withdrawlAmt = sc.nextDouble();
		
		//calling the withdraw method with the variable withdrawlAmt
		//obj.withdraw(withdrawlAmt);
		
		
		//asking the user to put in a deposit amount
		System.out.println("Please enter the amount you would like to deposit:");
		depositAmt = sc.nextDouble();
				
		//calling the deposit method with the variable depositAmt
		obj.deposit(depositAmt);
						
		//printing the new balance
		System.out.println("Your balance is:" + obj.getBalance() + "\n");
			
		//System.out.println(" Your Monthly balances for one year at .04" + "\n" + "Balances:" +"\n" + "Account Balances with interest");
		//System.out.println("Base:" + obj.getBalance());
		
		//for (int i = 0 ; i < 12; i++)
		//{
			//update the current balance by monthly interest
			//display response;
			//System.out.println("Month " + (i+1) + "     " +"testing");
			
			//	System.out.printf("%n%5d$%.2f",(i+1),obj.getBalance());
		//}
			
		//System.out.println("Object value"+acctObj);
				
	}

}
