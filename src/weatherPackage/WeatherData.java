package weatherPackage;

import java.io.IOException;

import org.json.simple.parser.ParseException;


public class WeatherData {
  
	String city,desc;
	double temp;
	long humid,pres;
 
	
	public WeatherData(String cityName,String description,double temperature,long humidity,long pressure){
		
		setCity(cityName);
		setDesc(description);
		setHumid(humidity);
		setPres(pressure);
		setTemp(temperature);
	
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public long getHumid() {
		return humid;
	}
	public void setHumid(long humid) {
		this.humid = humid;
	}
	public long getPres() {
		return pres;
	}
	public void setPres(long pres) {
		this.pres = pres;
	}

	public static void main(String[] args) throws ParseException, IOException {

		
	}
	
}
