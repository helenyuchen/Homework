<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>请选择上传的文件</title>
</head>
<body >
<h1><%="请选择上传的文件"%>
</h1>
<p>yyds</p>
<br/>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="upload">
    <input type="submit" value="Submit">
</form>
</body>
</html>