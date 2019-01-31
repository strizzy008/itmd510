package lab1;

public class AccountHolderTest {

	public static void main(String[] args) {
		
		
		double balance;
		Scanner sc = new Scanner(System.in);
		
		AccountHolder obj = new AccountHolder(100);
		AccountHolder dummy = new AccountHolder();
		dummy.setAnnualIntRate(.04);
		
		//header
		System.out.println("Month\t\tBal");
		for (int i = 0 ; i < 12; i++)
		{
			//update the current balance by monthly interest
			//display response;
			System.out.printf("%5d$%.2f",(i+1),obj.getBalance());
		}
		
		
		
		
		
		
		System.out.println("Object value"+acctObj);
		
		
	}

}
