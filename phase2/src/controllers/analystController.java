package controllers;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.dbConnect;

public class analystController {
		
	@FXML
	private Button onHand;
	
	@FXML
	private Button wareHouse;
	
	@FXML
	private Button Model;
	
	dao.dbConnect conn= null;
	Statement stmt= null;
	
	public ResultSet onHandRecords() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_onhand";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
		}
	
	
	public ResultSet wareHouseRS() {
		ResultSet rs = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_wareHouse";
			rs = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
	
	
	
	
	
	
	public ResultSet wareHouse() {
		ResultSet rs1 = null;
		try {
		    stmt = conn.connect().createStatement();
			String sql = "SELECT * from b_stra_wareHouse";
			rs1 = stmt.executeQuery(sql);
			conn.connect().close();	
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs1;
		
	
	
	onHand.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ResultSet rs;
			rs = analystController.onHandsRecords();
			
		}
		
		
		onHand.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ResultSet rs;
				rs = analystController.onHandsRecords();
			
		}
	
	
	
}}}
