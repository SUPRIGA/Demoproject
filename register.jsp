<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <body bgcolor="white">
        <form method="post" action="userRegistration.jsp">
            <center>
            <table border="1" width="30%" cellpadding="5">

<tbody>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName" value="" /></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" value="" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" value="" /></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" name="userName" value="" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" value="" /></td>
</tr>
<tr>
<td><input type="submit" value="Submit" /></td>
<td><input type="reset" value="Reset" /></td>
</tr>
<tr>
<td colspan="2"><a href="index.jsp">Login Here</a></td>
</tr>
</tbody>
</table>
            </center>
        </form>
    </body>
</html>