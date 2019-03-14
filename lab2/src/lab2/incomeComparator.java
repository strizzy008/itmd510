package lab2;

import java.util.Comparator;

public class incomeComparator implements Comparator<BankRecords>{

	@Override
	public double compare(BankRecords o1, BankRecords o2) {
		// TODO Auto-generated method stub
		return o1.getIncome().compareTo(o2.getIncome());
	}

}
