<%@page import="control.Delete"%>
<%@page import="control.Edit"%>
<%@page import="model.DoList"%>
<%@page import="control.Insert"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
int do_no=Integer.parseInt(request.getParameter("do_no"));
 

Delete delete_values=new Delete();

delete_values.delete_task(do_no);
 

%>

<script type="text/javascript">

 window.location.href="http://localhost:8080/IDoList/insert_values.jsp"
</script>


</body>
</html>