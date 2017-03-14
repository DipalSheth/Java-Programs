package com.sheth.generalprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMySql {

	public static void main(String[] args) throws Exception {
		//createTable();
		Connection con = getConnection();
		
		//insert person table: firstname and lastname
		insertPerson(con, "John", "Maf");
		
		//read(select)
		ResultSet rs = getPeople(con);
		while(rs.next()){
			System.out.println(rs.getString(2) + " " + rs.getString(3));
		}
		
		//update
		updatePerson(con, "Bill", "Gates");
		
		
	}
	
	/*public static void createTable() throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS employees(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		finally{System.out.println("Function complete.");}
	}*/
	public static ResultSet getPeople(Connection con) throws Exception{
		return getResultSet(con, "Select * from person");
	}
	
	
	
	private static ResultSet updateResultSet(Connection con, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultSet getResultSet(Connection con, String sql) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Statement stm = con.createStatement(java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.TYPE_FORWARD_ONLY);
		return stm.executeQuery(sql);
		
	}
	
	public static void insertPerson(Connection con, String firstname, String lastname) throws Exception{
		PreparedStatement pst = con.prepareStatement("insert into person(firstname, lastname) values(?,?)");
		pst.setString(1, firstname);
		pst.setString(2, lastname);
		pst.execute();
		pst.close();
	}
	
	public static void updatePerson(Connection con, String firstname, String lastname) throws Exception{
		PreparedStatement pst = con.prepareStatement("insert into person(firstname, lastname) values(?,?)");
		pst.setString(1, firstname);
		pst.setString(2, lastname);
		
		int rowsUpdated = pst.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		}
		pst.execute();
		pst.close();
	}
	
	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/loginuser";
			String username = "Dipal";
			String password = "java123";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return null;
		
	}

}
