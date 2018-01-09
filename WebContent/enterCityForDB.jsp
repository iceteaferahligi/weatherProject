<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert city</title>
</head>
<body background ="15453.jpg">

 			 <form method="GET" action="databaseData.jsp" >
		     <p align="center"><h1><i><h3><p align="center">Enter the city here..</p></h3></i></h1>
			 <p align="center"><input type="text" name="dbCity" style="width: 231px; height: 53px;">
			 <p align="center"><input id="inputButton" type="submit" name="submit2" style=" width: 153px; height: 65px;" value="Enter">
		     </form>
		     
<style>
#inputButton {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
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

#inputButton:hover {background-color: #3e8e41}

#inputButton:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<style>
h1 {
color:#4CAF50;
}
</style>
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
<input id="backButton" type="submit" name="back" style=" width: 109px; height: 65px; margin-right: 500px;" value="Back" onclick="javascript:window.location='index.jsp';">

</body>
</html>