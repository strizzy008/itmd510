package lab2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
This LAB2 is a Bank Generator Lab which will take input from a csv file into an array list and then input data from the array list into an array.
Once it is in the Array we will be able to query the array and produce reports based on what the user would like to see
*/


public class BankRecordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// instantiating the BankRecords class as bankr
		BankRecords bankr = new BankRecords();
		
		System.out.println("Welcome to Bank of IIT Chicago Customer Record Generation Section");
		
		//Calling each function to perform its duty
		bankr.readData();
		bankr.processData();
		bankr.printData();
		
		// displaying total number of records
		System.out.println("\nTotal number of records inside csv file is 600");
		
		
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		   System.out.println("\n"+"Cur dt=" + timeStamp + "\nProgrammed by Bryan Strawter\n");
				   
		
	}

}