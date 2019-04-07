package models;

import java.sql.Statement;

public class daoModel {

	//Declare DB objects
	dbConnect conn= null;
	Statement stmt= null;
	
	// constructor
	public daoModel() { //create db object instance
	conn= new dbConnect();}
		
	// CREATE TABLE METHOD
	public void createTable(){
		
		try{
		// Open a connection
		System.out.println("Connecting todatabase to create Table...");
		
		System.out.println("Connected database successfully...");
		
		// Execute create querySystem.out.println("Creating table in given database...");
		stmt= conn.connect().createStatement();
		
		String sql= "CREATE TABLE yourTableName_tab "+ "(pid INTEGER not NULL AUTO_INCREMENT,"+ " id VARCHAR(10), "+" income 	numeric(8,2), "+ " pep VARCHAR(3), "+ " PRIMARY KEY ( pid ))";
		
		stmt.executeUpdate(sql);System.out.println("Created table in given database...");

		conn.connect().close();

		//close db connection }

		catch (SQLException se){
		// Handle errors for JDBC
			se.printStackTrace();
	}
	
	
	
}
