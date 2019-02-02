package lab1;

import java.util.Scanner;

public class AccountHolderTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AccountHolder obj = new AccountHolder(100);
		//AccountHolder obj2 = new AccountHolder(40);
		//AccountHolder dummy = new AccountHolder();
		obj.setAnnualIntRate(.04);
		
		//header		
		System.out.println("Monthly balances for one year at .04" + "\n" + "Balances:" +"\n" + "Account Balances with interest");
		System.out.println("Base:" + obj.getBalance());
		
		for (int i = 0 ; i < 12; i++)
		{
			//update the current balance by monthly interest
			//display response;
			System.out.println("Month " + (i+1) + "     " +"testing");
			
			//	System.out.printf("%n%5d$%.2f",(i+1),obj.getBalance());
		}
		
		
		
		
		
		
		//System.out.println("Object value"+acctObj);
		
		
	}

}
