package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MySQL_DB2_NON_Select {
	
public static void main(String [] args) throws Throwable  {
		
		Connection con = null;
		try {
		 
		     Driver driverRef = new Driver();
		     DriverManager.registerDriver(driverRef);
		  
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students4","root","root");
		
		Statement stat = con.createStatement();
		String query = "Select * from account";
		
		ResultSet result = stat.executeQuery(query);
		
		
		while(result.next()){
		int accNum =result.getInt("accno");
			
		System.out.println(accNum);
		if(accNum == 123 && result.getString("accountType").equals("gold")) {
			System.out.println("account type Gold & verifid==PASS");
			break;
		}
		
	  }
    }catch(Exception e) {
    	System.out.println("account type Gold & verifid==FAIL");
    }finally {
    	
         con.close();
    }
	}
		
		
	}

