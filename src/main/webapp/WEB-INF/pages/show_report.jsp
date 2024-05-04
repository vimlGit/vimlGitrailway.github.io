<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: green; text-align: center">IGNTU-RCM</h1>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body bgcolor="cyan">

</body>
<h1 style="color: blue; text-align: center">Report Page</h1>

<c:choose>
	<c:when test="${!empty  studList}">
		<table border="1" align="center" bgcolor="yellow">
			<tr>
				<th>STUD_ID</th>
				<th>STUDENT NAME</th>
				<th>FATHER'S NAME</th>
				<th>COURSE</th>
				<th>DEPT_NAME</th>
				<th>PHONE NO</th>
				<th>View Result </th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
			<c:forEach var="student" items="${studList}">
				<tr>
					<td>${student.studid}</td>
					<td>${student.sname}</td>
					<td>${ student.marks.java}</td>
					<td>${student.course}</td>
					<td>${student.deptname}</td>
					<td>${student.phoneno}</td>


                <td>	<a href="result?no=${student.studid}">
							 <img src="images/view.jpeg"
								width="30px" height="20px"></a>
				</td>

					<td>
							 <a href="edit?no=${student.studid}" > <img
								src="images/edit.png" width="30px" height="20px"></a>
					</td>
						    <td>		
							 <a href="delete?no=${student.studid}"
								onclick="return confirm('Do you Really Want to Delete the Student?')"
							> <img src="images/delete.jpg"  	width="30px" height="20px"> </a>
					      </td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records found</h1>
	</c:otherwise>
</c:choose>

<h2 style="color: red; text-align: center">
	<a      href="register"><img src="images/add.jpg" width="100"
		height="100px">Register</a> &nbsp;&nbsp;&nbsp; <a     href="./"><img
		src="images/home.jpg" width="100px" height="100px">Home</a>
</h2>

<br>
<br>
<h1 style="text-align: center; color: green">${resultMsg}</h1>

