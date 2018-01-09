<%@page import="weatherPackage.DBClient, weatherPackage.DBClient.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="weatherPackage.DBServer, weatherPackage.DBServer.*,java.sql.SQLException,java.util.ArrayList,java.util.List,
  weatherPackage.DBWeather" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weather Forecast from Database</title>
</head>
<body background ="15453.jpg">
  <p align="center">
  <%
     String ct = request.getParameter("dbCity");
     
     if(ct.equals("")) {
     throw new IllegalArgumentException("Please enter a valid city name..");
     }
     else {
  	 DBServer db = new DBServer();
  	 List<DBWeather> dblist = new ArrayList<DBWeather>();
  	 DBClient dbc = new DBClient();
  	 out.print("<br>"+"<br>"+"<br>"+"<br>"+"<br>"+"<br>"+"<br>");
  	 out.print("<strong>"+"City name: " + ct + "</strong>");
  	 out.print("<br>");
  	 out.print("<strong>"+(dbc.clientFunc(ct)).replaceAll("[\\[,\\],]","")+"</strong>");
  	 }
  	 
  %>
<input id="backButton" type="submit" name="back" style=" width: 179px; height: 80px; margin-right: 700px;" value="Back" onclick="javascript:window.location='enterCityForDB.jsp';">       
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