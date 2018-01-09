package weatherPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJson {
	
	static List<BulkWeather> wdList = new ArrayList<>();

	public static String readFile() throws IOException, ParseException{
		
		String line ="";
		String output;
		String path = "daily_edit.json";
		
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		
		while ((output = reader.readLine()) != null) {
			line += output;
		}
				
		reader.close();
		
		parseFunc(line);
		return line;
	}
	
	public static void parseFunc(String line) throws ParseException {
		
		String name;
		double temperature,pressure;
		long humidity,dt;
		
			
		
		JSONParser parse = new JSONParser();
		JSONArray jobj = (JSONArray)parse.parse(line);
		//Cekilen il sayisi i
		for(int i=0;i<jobj.size();i++) {
		
			
		JSONObject arrIn = (JSONObject) jobj.get(i);
		
		//Cekilen gun sayisi j
		for(int j=0;j<3;j++) {
		JSONObject cityPart = (JSONObject) arrIn.get("city");
		JSONArray dataPart = (JSONArray)arrIn.get("data");
		 
	    JSONObject lsp = (JSONObject)dataPart.get(j);
	    
			
			name = (String) cityPart.get("name");
			dt = (long)lsp.get("dt");
			JSONObject tmp = (JSONObject) lsp.get("temp");
			temperature = (double)tmp.get("day");			
			pressure = (long)lsp.get("pressure");
			humidity =(long)lsp.get("humidity");
			
			
			
			BulkWeather bw = new BulkWeather(name, dt, temperature, pressure, humidity);
		    
		    wdList.add(bw);
		}
		   
		}   
		
	
	}
	
	
	public static void main(String args[]) throws IOException, ParseException {
		
		readFile();
			
		
	}

}
