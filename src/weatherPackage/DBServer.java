package weatherPackage;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("server")
public class DBServer{


	public DBServer() {
		
	}
	
	
	List<DBWeather> list;
	String cityName;	
	 
	 
	 public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	public List<DBWeather> getList() {
		return list;
	}
	
  
	public void setList(List<DBWeather> list) {
		this.list = list;
	}

	@Path("/service")
	@GET
	@Produces(MediaType.TEXT_PLAIN)	
	@Consumes(MediaType.TEXT_PLAIN)
	public String getService(@QueryParam("city") String cityName) throws ClassNotFoundException, SQLException{
	
		List<DBWeather> lst = new ArrayList<DBWeather>();
		Class.forName("com.mysql.jdbc.Driver");
		getInfoDB gidb = new getInfoDB();
		
		lst = gidb.getInfo(cityName);
	
		 return lst.toString();
		 
	 }
	
}
