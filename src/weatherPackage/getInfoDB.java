package weatherPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class getInfoDB {

String city;

List<DBWeather> dblist;


public List<DBWeather> getInfo(String cityName) throws SQLException, ClassNotFoundException {
		
	    dblist = new ArrayList<DBWeather>();
		Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather","root","19941994");
		Statement myStmt = (Statement) myCon.createStatement();
		Class.forName("com.mysql.jdbc.Driver");
		
	    String query = "SELECT*FROM forecast WHERE cityName="+ "\"" + cityName + "\"";
	  
	    ResultSet rs = myStmt.executeQuery(query);
	   
	      while (rs.next())
	      {
	    	
	        String city = rs.getString("cityName");
	        String date = rs.getString("date");
	        int temperature = (int) rs.getDouble("temperature");
	        int pressure = (int) rs.getDouble("pressure");
	        int humidity = (int) rs.getDouble("humidity");
	        
	       
	       DBWeather dbw = new DBWeather(city, date, temperature, pressure, humidity);	       
	       
	       dblist.add(dbw);
	           
	      }
	      return dblist;
	    
}

	
}
