<%@page import="java.util.Iterator"%>
<%@page import="model.DoList"%>
<%@page import="java.util.List"%>
<%@page import="control.Read"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="css/style.css">

<title>I do list</title>
</head>
<style>
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
<body>


	<center>

		<h4>MY TASKS</h4>

	</center>


	<form action="controller/insert_controller.jsp">
		<label for="tnum">task num</label> <input type="text" id="tnum"
			name="do_no" placeholder="task number.."> <label for="auth">task
			owner</label> <input type="text" id="auth" name="auth_name"
			placeholder="your name.."> <label for="tas">task</label> <input
			type="text" id="tas" name="task" placeholder="inter your task..">


		<label for="fname">priority</label> <input type="text" id="prio"
			name="priority" placeholder="task priority.."> <input
			type="submit" value="Insert">

	</form>

	<hr>


	<%
		Read Read_Values = new Read();

		List<DoList> list = Read_Values.get_values();

		Iterator<DoList> it_list = list.iterator();
	%>
	<table class="responstable">

		<tr>
			<th>task-ID</th>
			<th>OWNER</th>
			<th>TASK details</th>
			<th>PRIORITY</th>
			<th>edit task</th>
			<th>delete task</th>
		</tr>



		<%
			while (it_list.hasNext()) {
				DoList dolist = new DoList();
				dolist = it_list.next();
		%>

		<tr>
			<td><%=dolist.getDo_no()%></td>
			<td><%=dolist.getAuth_name()%></td>
			<td><%=dolist.getTask()%></td>
			<td><font color="red"> <%=dolist.getPrio()%>
			</font></td>

			<td><a
				href="controller/edit_controller.jsp?do_no=<%=dolist.getDo_no()%>">Edit</a>

			</td>
			<td><a
				href="controller/delete_controller.jsp?do_no=<%=dolist.getDo_no()%>">Delete</a>

			</td>
		</tr>
		<%
			}
		%>
	</table>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js'></script>




</body>
</html>