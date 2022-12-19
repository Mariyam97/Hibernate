package com.gl.teacher.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class JdbcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","Bibi@1997");
	Statement selectStmt = dbConnection.createStatement();
	ResultSet resultSet = selectStmt.executeQuery("select * from teacher");
	
	while(resultSet.next()) {
		long id = resultSet.getLong(1);
		String name = resultSet.getString(2);
		String subject = resultSet.getString(3);
		int exp = resultSet.getInt(4);
		
		System.out.println("Id: " +id + " Name: "+ name  + " subject: "+subject + " exp: " +exp );
	}

	resultSet.close();
	
	//close the stmt
	selectStmt.close();
	
	dbConnection.close();





} catch(SQLException e) {
	e.printStackTrace();
}
	}

}


