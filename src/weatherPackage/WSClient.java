package weatherPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class WSClient{
    
public  WSClient() {

}

public WeatherData getWeather(String city) throws ParseException,IOException{
	
	 long humidity;
	 long pressure,temperature;
	 String desc;

	
	String s ="";
	URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+ city +"&units=metric"+
        "&APPID=6de15e15881e439d83188d43703f5ea9");
	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	connection.setRequestMethod("GET");
    connection.connect();
    
       
    Scanner sc = new Scanner(url.openStream());
	while(sc.hasNext())
	{
		s+=sc.nextLine();
	}
	 sc.close();

	 
	    JSONParser parse = new JSONParser();
		JSONObject jobj = (JSONObject)parse.parse(s);	
		JSONObject mainPart = (JSONObject) jobj.get("main");
		
		
		 temperature =  (long) mainPart.get("temp");
		 humidity =  (long) mainPart.get("humidity");
		 pressure = (long) mainPart.get("pressure");
		 
		 JSONArray wthr = (JSONArray) jobj.get("weather");
		 JSONObject pobj = (JSONObject) wthr.get(0);
		 desc =(String)pobj.get("description");
	      
			
		WeatherData wd = new WeatherData(city,desc,temperature,humidity,pressure);

		connection.disconnect();
		return wd;
		
}

}

