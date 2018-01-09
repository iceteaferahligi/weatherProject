<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Choose the service</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
.button {
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

.button:hover {background-color: #3e8e41}

.button:active {
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

</head>
<body background ="15453.jpg" style="width: 1140px; height: 175px; "> 

        <p align="center"><h1><br><br><p align="center">Please select the service...</h1>
      <!--<a href="enterCity.jsp">Online service..</a> -->
       <p align="center"><button class="button" type="submit" onClick="javascript:window.location='enterCity.jsp';" style="width: 273px; height: 65px; ">Current Weather</button>
       <button class="button" type="submit" onClick="javascript:window.location='enterCityForDB.jsp';" style="width: 398px; height: 65px">Past Daily Weather</button>

</body>
</html>