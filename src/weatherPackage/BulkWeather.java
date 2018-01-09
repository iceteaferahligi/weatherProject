package weatherPackage;



public class BulkWeather {
	
	String name;
	double temp,pressure;
	long humidity,date;
	
	public BulkWeather(String name,long date,double temp,double pressure,long humidity){
		
		setName(name);
		setDate(date);
		setHumidity(humidity);
		setPressure(pressure);
		setTemp(temp);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public long getHumidity() {
		return humidity;
	}

	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}


}
