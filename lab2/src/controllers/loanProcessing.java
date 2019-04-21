/* 
 * This Lab 4 project is to take in the array from Lab 2 and insert the records into a db table which
 * is also created in this lab 4. * 
 * This Class contains the main method which does the data processing and data base creation/insertions
 * It also produces a table view of the selected data
 * */



package controllers;


// importing all the necessary libs
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import lab2.BankRecords;
import models.daoModel;
import models.dbConnect;
import views.loanViews;

public class loanProcessing extends lab2.BankRecords {
	
	public static void main(String[] args) {
		
		
		// creating new connection object 
		dbConnect conn = new dbConnect();
		
		//creating a bank records object
		BankRecords br = new BankRecords();
		
		//calling bank records 
		br.readData();
		
		// calling bank records method process data to put the data into an array
		br.processData();
		
		//creating new modling object for database CRUD
		daoModel dao = new daoModel();
		
		// inserting the array elements of the robjs2 array from bank records class
		dao.insertRecords(robjs2); // perform inserts
		
		// creating new result set object to query the db from
		ResultSet rs;
		
		// setting rs = to the outcome of the retrieveRecords method
		rs = dao.retrieveRecords();
		
		// creating a view with the result set being the data source
		new loanViews().runView(rs);
		
		//documenting the time
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("\nCur dt=" + timeStamp + "\nProgrammed by Bryan Strawter\n");
			
		
	}

	
}
