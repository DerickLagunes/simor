<%--
  Created by IntelliJ IDEA.
  User: Derick
  Date: 02/07/2024
  Time: 10:30 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upload Excel File</title>
</head>
<body>
<form action="uploadexcel" method="post" enctype="multipart/form-data">
    <input type="file" name="file" accept=".csv, .xls, .xlsx" required />
    <input type="submit" value="Upload" />
</form>
</body>
</html>
