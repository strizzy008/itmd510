package controllers;

import java.sql.ResultSet;

import lab2.BankRecords;
import models.daoModel;
import models.dbConnect;
import views.loanViews;

public class loanProcessing extends lab2.BankRecords {
	
	public static void main(String[] args) {
		
		dbConnect conn = new dbConnect();
		BankRecords br = new BankRecords();
		br.readData();
		daoModel dao = new daoModel();
		//dao.createTable();
		dao.insertRecords(robjs2); // perform inserts
		ResultSet rs;
		rs = dao.retrieveRecords();
	//	new loanViews().runView(rs);
			
		
	}

	
}
