<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello User" %></h1>

<form action="newservelet" method="POST">
<h1>User name</h1>
<input type="text" name="uname">
<br/>
<h1>Password</h1>
<input type="password" name="password">
<br/>

<input type="submit" value="Submit">
<br/>
</form>
</body>
</html>