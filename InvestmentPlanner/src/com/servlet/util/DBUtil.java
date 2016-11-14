package com.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1158/em","hr","lava");
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return con;
	}
	public void closeConnection(Connection con){
		try{
			if(con!=null){
				con.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
