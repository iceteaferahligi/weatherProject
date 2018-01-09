package weatherPackage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="weather")
public class DBWeather {
	
	String city,date;
	int temp,pres,humid;
	
	public DBWeather() {
		
	}
	
	public DBWeather(String city,String date,int temp,int pres,int humid) {
		
		setCity(city);
		setDate(date);
		setTemp(temp);
		setPres(pres);
		setHumid(humid);
		
		this.city=city;
		this.date=date;
		this.temp=temp;
		this.pres=pres;
		this.humid=humid;
		
	}

	public String getCity() {
		return city;
	}
	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}

	public int getTemp() {
		return temp;
	}
	@XmlElement
	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getPres() {
		return pres;
	}
	@XmlElement
	public void setPres(int pres) {
		this.pres = pres;
	}

	public int getHumid() {
		return humid;
	}
	@XmlElement
	public void setHumid(int humid) {
		this.humid = humid;
	}
	
	@Override
	
	public String toString() {

		return  "<br>" + "Date: " + getDate() + "<br>" +
				"Temperature: " + (300-getTemp()) +" °C"+ "<br>" + "Pressure: " + getPres()+ " hPa" + "<br>" +
				"Humidity: " + getHumid()+ " %" + "<br>";
	    }
	
		
}
