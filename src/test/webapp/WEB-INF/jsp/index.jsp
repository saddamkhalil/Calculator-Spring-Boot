<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html lang="en">
<head>
<title>Calculator</title>
</head>
<body>

<h1>Calculator</h1>

<form action="/result" method="Get">
Number 1:
<input type="number" id="num1" name="num1"><br><br>
Number 2:
<input type="number" id="num2" name="num2"><br>

<br>


Slect operation:
 <select id="op" name="op">
  <option value="+">+</option>
  <option value="-">-</option>
  <option value="/">/</option>
  <option value="*">*</option>
</select> 
<br><br>
<input type="submit" value="Calculate">
</form>

</body>
</html>


