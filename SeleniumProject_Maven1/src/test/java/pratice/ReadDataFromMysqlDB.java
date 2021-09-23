package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromMysqlDB {
	
	public static void main(String [] args) throws Throwable  {
		 
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students4","root","root");
		
		Statement stat = con.createStatement();
		String query = "Select * from students4_info";
		
		ResultSet result = stat.executeQuery(query);
		
		
		while(result.next()){
			
		System.out.println(result.getInt(1) +"\t" + result.getString(2) + "\t" + result.getString(3));
		
		}
		
		con.close();
		
		
	}

	
}	

