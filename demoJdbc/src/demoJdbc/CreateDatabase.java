package demoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;

public class CreateDatabase {
	static final String url = "jdbc:mysql://localhost:3306/";
	static final String user  = "root";
	static final String pass = "Sagir@2580";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open a connection
		try {
			Connection con = DriverManager.getConnection(url,user,pass);
			java.sql.Statement st =con.createStatement(); //to run
			String sql = "CREATE DATABASE EMPLOYEE";
			System.out.println(sql);
			st.executeUpdate(sql);
			
			System.out.println("Database create successfully : ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		if(sql =)
		

	}

}
