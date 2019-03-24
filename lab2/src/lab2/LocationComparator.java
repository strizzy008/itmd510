package lab2;

import java.util.Comparator;

public class LocationComparator implements Comparator<BankRecords>{
	 
	@Override
	public int compare(BankRecords o1, BankRecords o2) {
	// use compareTo to compare strings
		return o1.getRegion().compareTo(o2.getRegion());
	
	
	//String s1 = (String) o1.getRegion();
	//String s2 = (String) o2.getRegion();
	//double d1 = (double) o1.getIncome();
	//double d2 = (double) o2.getIncome();
	//int result = s1.compareTo(s2);
	//if (result != 0) {
		//return result;
			//}
	//return Double.compare(d1, d2);
		
		
		
		
		
	
	}


}