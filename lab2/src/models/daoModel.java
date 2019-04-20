package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lab2.BankRecords;

public class daoModel {

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
			//conn.connect();	
			System.out.println("Connected database successfully...");
			
			
			// Execute create query
			System.out.println("Creating table in given database...");
			stmt= conn.connect().createStatement();
			
			String sql= "CREATE TABLE b_stra_tab "+ "(pid INTEGER not NULL AUTO_INCREMENT,"+ " id VARCHAR(10), "+" income numeric(8,2), "+ " pep VARCHAR(3), "+ " PRIMARY KEY ( pid ))";
			
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
	
			conn.connect().close();
		}
		//close db connection 
		
		catch (SQLException se){
		// Handle errors for JDBC
			se.printStackTrace();
			
		}
	
	}
		
	// INSERT INTO METHOD
	public void insertRecords(BankRecords[] robjs2) {
	 try {
	 // Execute a query
	 System.out.println("Inserting records into the table...");
	 stmt = conn.connect().createStatement();
	 String sql = null;

	 // Include all object data to the database table
	 for (int i = 0; i < robjs2.length; ++i) {

	 // finish string assignment below to insert all object data
	 // (id, income, pep) into your database table

	 sql = "INSERT INTO b_stra_tab values" + robjs2[i].getId() + robjs2[i].getIncome() + robjs2[i].getPep();
	 
	 stmt.executeUpdate(sql);
	 }
	 conn.connect().close();
	 } catch (SQLException se) { se.printStackTrace(); }
	}// INSERT INTO METHOD
	
	
	public ResultSet retrieveRecords() {
		ResultSet rs = null;
		try {
			stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_tab";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
		}
			
}
