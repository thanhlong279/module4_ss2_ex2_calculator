<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator
</h1>
<br/>
<form method="post" action="calculator">
<input type="number" name="x">
<input type="number" name="y"><br>
<input type="radio" name="operator" value="+">+<br>
<input type="radio" name="operator" value="-">-<br>
<input type="radio" name="operator" value="*">*<br>
<input type="radio" name="operator" value="/">:<br>
    <input type="submit" value="Calculator">
</form>
<h2>Result: ${result}</h2>
</body>
</html>