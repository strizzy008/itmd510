package lab2;

import java.util.Comparator;

public class childComparator implements Comparator<BankRecords>{

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// TODO Auto-generated method stub
		return o1.getChildren().compareTo(o1.getChildren());
	}
}
