/* 
 * This class handles CRUD operations of the MYSQL DB 
 * 
 * */


package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lab2.BankRecords;

public class daoModel extends BankRecords{

	//Declare DB objects
	dbConnect conn= null;
	Statement stmt= null;
	
	// constructor
	public daoModel() { 
		//create db object instance
		conn= new dbConnect();
	}
		
	// CREATE TABLE METHOD
	public void createTable(){
		
		try{
		// Open a connection
			System.out.println("Connecting to database to create Table...");
			System.out.println("Connected database successfully...");
			
			
			// Execute create query
			System.out.println("Creating table in given database...");
			stmt= conn.connect().createStatement();
			
			String sql= "CREATE TABLE b_stra_final3 "+ "(pid INTEGER not NULL AUTO_INCREMENT,"+ " make VARCHAR(15), "+" model VARCHAR(20), "+ " fuel VARCHAR(15), "+ " PRIMARY KEY ( pid ))";
			
			stmt.executeUpdate(sql);
			System.out.println("Created table on the Papa 24h / 364 days server");
	
			conn.connect().close();
		}
		//close db connection 
		
		catch (SQLException se){
		// Handle errors for JDBC
			se.printStackTrace();
			
		}
	
	}
		
	// Insert method to enter in the array elements from robjs2
	public void insertRecords(BankRecords[] robjs2) {
	 try {
	 // Execute a query
	 System.out.println("Inserting records into the table...");
		 
	 String closeInsertBrac = ");";
	 String startInsertBrac = "(";
	 String insertTabCmd = "INSERT INTO b_stra_final3 (make,model,fuel) VALUES" + startInsertBrac;
		 // Include all object data to the database table
	 
	 stmt= conn.connect().createStatement();
	 for (int i = 0; i < 19; i++) {
		  
			String insertCmd = (insertTabCmd + "'" + robjs2[i].getMake() + "'"+"'"+ robjs2[i].getModel() +"'"+"'" + robjs2[i].getFuel()+ "'"+ closeInsertBrac);
			
			stmt.executeUpdate(insertCmd);
			//System.out.println(insertCmd);
					
		}
	 
	 System.out.println("Records added!");
	 conn.connect().close();
	 } catch (SQLException se) { se.printStackTrace(); }
	}// INSERT INTO METHOD
	
	
	

	
	// this class is designed to retrieve the recrods from the db and store it in the variable for result set, rs
	public ResultSet retrieveRecords() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_final3";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
	
}