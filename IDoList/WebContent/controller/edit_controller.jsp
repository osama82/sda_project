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
		int do_no = Integer.parseInt(request.getParameter("do_no"));
		String task = request.getParameter("task");
		String priority = request.getParameter("priority");
		String auth_name = request.getParameter("auth_name");

		DoList dolist = new DoList();
		dolist.setDo_no(do_no);
		dolist.setAuth_name(auth_name);
		dolist.setPrio(priority);
		dolist.setTask(task);

		Edit edit_values = new Edit();

		edit_values.edit_task(dolist);
	%>

	<script type="text/javascript">
		window.location.href = "http://localhost:8080/IDoList/insert_values.jsp"
	</script>


</body>
</html>