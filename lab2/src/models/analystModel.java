package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.Statement;
import lab2.BankRecords;

public class analystModel extends BankRecords {
	
		//Declare DB objects
		dbConnect conn= null;
		Statement stmt= null;
		
		
	public ResultSet retrieveAllRecords() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_final2";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
	
	
	public ResultSet retrieveGasolineRecords() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_final2 WHERE fuel=gasoline";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
	
	
	public ResultSet retrieveDieselRecords() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_final2 WHERE fuel=diesel";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
	
	
	

}
