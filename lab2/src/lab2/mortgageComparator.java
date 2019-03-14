package lab2;

import java.util.Comparator;

public class mortgageComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// TODO Auto-generated method stub
		return o1.getMortgage().compareTo(o2.getMortgage());
	}

}
