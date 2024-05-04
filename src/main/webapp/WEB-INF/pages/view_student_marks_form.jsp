<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: green; text-align: center">IGNTU-RCM</h1>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body bgcolor="cyan">

</body>
<h1 style="color: blue; text-align: center">Result Page</h1>

<c:choose>
	<c:when test="${!empty  studList}">
		<table border="1" align="center" bgcolor="yellow">
			<tr>
				<th>Roll No</th>
				<th>STUDENT NAME</th>
				<th>JAVA</th>
				<th>PYTHON</th>
				<th>C</th>
				<th>OS</th>
				<th>Obtained Marks</th>
				<th>Total marks</th>
			</tr>
			<c:forEach var="student" items="${studList}">
			
				<tr>
					<td>${student.marks.rollno}</td>
					<td>${student.sname}</td>
					<td>${ student.marks.java}</td>
					<td>${student.marks.python}</td>
					<td>${student.marks.c_language}</td>
					<td>${student.marks.os}</td>
					<td>${ student.marks.java+student.marks.python+student.marks.c_language+student.marks.os}</td>
					<td>${student.marks.fullMark=400} </td>
				</tr>
				
			</c:forEach>
		</table>
	</c:when>

</c:choose>

<h2  style="color:red;text-align:center">
  <a   style="color:red;text-align:center"  href="./report"><img     src="images/home.jpg" width="60px" height="60px"><br> Go Back</a>
   </h2>



