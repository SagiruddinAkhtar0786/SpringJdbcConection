package demoJdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sagir"; //database name is sagir
		String uname = "root";
		String pass = "Sagir@2580";
		String Query = "select * from Student";
		Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver using forName() method
		Connection con  = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(Query);
		while(rs.next())
		{
			
			String name = rs.getString("sname");
			int roll = rs.getInt("roll_no");
			System.out.println(roll+" : "+name);
		}
		
		st.close();
		con.close();
	}
}
