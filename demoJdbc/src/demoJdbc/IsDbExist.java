package demoJdbc;
import java.sql.*;

public class IsDbExist {
	public static void main(String [] args) {
		Connection con = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/";
		String uname = "root";
		String pass= "Sagir@2580";
		
		try {
//			registraing the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Getting the connection
			con = DriverManager.getConnection(url,uname,pass);
			String dbName = "employee2";
			
			if(con != null) 
			{
				System.out.println("check for databse exist");
				//Retrieving the meta data object and  Returns the name of the database
				rs = con.getMetaData().getCatalogs();
				while(rs.next()) 
				{
					String catalogs = rs.getString(1);
//					System.out.println(catalogs);
					
					if(dbName.equals(catalogs)) 
					{
						System.out.println("databse "+dbName+" exist");
						break;
					}
					else {
						Statement st = con.createStatement();
						String sql = "CREATE DATABASE EMPLOYEE3";
						st.executeUpdate(sql);
						System.out.println("database created");
						break;
					}
//					break;
				}
			}
			else
			{
				System.out.println("unable to create database connection");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
