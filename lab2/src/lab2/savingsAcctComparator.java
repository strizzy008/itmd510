package lab2;

import java.util.Comparator;

public class savingsAcctComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// TODO Auto-generated method stub
		return o1.getSave_act().compareTo(o2.getSave_act());
	}

}
