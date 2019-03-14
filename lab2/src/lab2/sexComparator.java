package lab2;

import java.util.Comparator;

public class sexComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// TODO Auto-generated method stub
		return o1.getSex().compareTo(o2.getSex());

	}

	
	
	
	
	
	

}
