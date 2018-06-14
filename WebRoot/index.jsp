<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String cxt = request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
-- ${cxt} <%=cxt %>
<form action="<%=cxt%>/upload" method="POST" enctype="multipart/form-data">
<input type="file" name="img"/> <br/>
<input type="file" name="img1"/><br/>
<input type="submit" value="提交"/> <br/>
</form>


<form action="<%=cxt%>/upload/name" method="POST">
<input type="text" name="names" value=""/> <br/>
<input type="submit" value="提交"/> <br/>
</form>

nn
<form action="<%=cxt%>/upload/nn" method="GET">
<input type="text" name="nn" value=""/> <br/>
<input type="submit" value="提交"/> <br/>
</form>
</body>
</html>