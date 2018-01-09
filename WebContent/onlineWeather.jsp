<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="weatherPackage.WSClient,org.json.simple.parser.ParseException" %>
    <%@ page import="weatherPackage.WeatherData" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Weather Forecast</title>
</head>
<body background ="15453.jpg">
<p align="center" style="width: 1124px; height: 120px; ">
 	<%
   WSClient wc = new WSClient();
   String ct = request.getParameter("cityField");
   if(ct.equals("")) {
   throw new IllegalArgumentException("The city field cannot be empty! Please enter a city name.");
   }
   else {
   out.print("<br>"+"<br>"+"<br>"+"<br>"+"<br>"+"<br>"+"<br>");
   out.print("<strong>"+ "City :	" + wc.getWeather(ct).getCity()+"</strong>");
   out.print("<br>"+"<br>");
   out.print("<strong>"+"Description :	"+"</strong>" + wc.getWeather(ct).getDesc());
   out.print("<br>");
   out.print("<strong>"+"Temperature:	" +"</strong>" + wc.getWeather(ct).getTemp()+" °C");
   out.print("<br>");
   out.print("<strong>"+"Pressure :	" +"</strong>" +wc.getWeather(ct).getPres()+" hPa");
   out.print("<br>");
   out.print("<strong>"+"Humidity :	" +"</strong>"+ wc.getWeather(ct).getHumid() + "%");
   out.print("<br>"+"<br>"+"<br>"+"<br>"+"<br>");
   }
  %> 
 <input id="backButton" type="submit" name="back" style=" width: 118px; height: 76px; margin-right: 700px;" value="Back" onclick="javascript:window.location='enterCity.jsp';"> 
  <style>
 #backButton {
  display: inline-block;
  padding: 15px 25px;
  font-size: 18px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

#backButton:hover {background-color: #3e8e41}

#backButton:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
</style>

</body>
</html>