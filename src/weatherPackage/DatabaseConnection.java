package weatherPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.json.simple.parser.ParseException;
import com.mysql.jdbc.Statement;

public class DatabaseConnection {
 
    
    public static void dbCon(){
    	
    	try {
    		
    		Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather","root","19941994");
    		Statement myStmt = (Statement) myCon.createStatement();
    		
    		
    	    String query = "CREATE TABLE forecast" + "(cityName VARCHAR(50) not NULL,"+
    	    "date VARCHAR(50) not NULL," +
    	    "temperature DOUBLE not NULL," +
    	    "pressure DOUBLE not NULL," +
    	    "humidity DOUBLE not NULL)";
    	  
    	 
    	    myStmt.executeUpdate(query);
    	
    	    
    		for(int k=0;k<ParseJson.wdList.size();k++) {
    		
    		String cityName,newDate;
    		double temperature,pressure;
    		long humidity,dt;
    		
    		
    		cityName = ParseJson.wdList.get(k).getName();
    		dt = ParseJson.wdList.get(k).getDate();
    		
    		java.util.Date date=new java.util.Date((long)dt*1000);
    		newDate = String.valueOf(date);
    		
    		temperature = ParseJson.wdList.get(k).getTemp();
    		pressure = ParseJson.wdList.get(k).getPressure();
    		humidity = ParseJson.wdList.get(k).getHumidity();
    		
    		 String queryInsert = "INSERT INTO forecast(cityName,date,temperature,pressure,humidity)" +
    		"VALUES(?,?,?,?,?)";
    		
    		PreparedStatement ps = myCon.prepareStatement(queryInsert);
    		ps.setString(1,cityName);
    		ps.setString(2,newDate);
    	    ps.setDouble(3,temperature);
    		ps.setDouble(4, pressure);
    		ps.setLong(5, humidity);
    		
    		ps.execute();
    		}
    		
    		
    	}
    	catch(Exception exp) {
    		exp.printStackTrace();
    	}
    
      

    }
     public static void main(String args[]) throws IOException, ParseException {
    	 
    	 ParseJson.readFile();
    	 dbCon();
    	
    	 
     }


}
	

