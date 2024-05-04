<%@ page  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>


<h1  style="color:red;text-align:center"> Edit the Student Details </h1>
<body bgcolor="gold">
</body>
<frm:form  modelAttribute="student">
  <table  align="center" bgcolor="cyan" >
    <tr>
      <td> Student id :: </td>
      <td> <frm:input path="studid"  readonly="true"/> </td>  
    </tr>
   
    <tr>
      <td> Student name :: </td>
      <td> <frm:input path="sname"/> </td>  
    </tr>
   <tr>
      <td> Father's  name :: </td>
      <td> <frm:input path="fname" /> </td>  
    </tr>
  <tr>
      <td> Course  name :: </td>
      <td> <frm:input path="course"/> </td>  
    </tr>
    <tr>
      <td> Department name :: </td>
      <td> <frm:input  path="deptname"/> </td>  
    </tr>
     <tr>
      <td>   phone no :: </td>
      <td> <frm:input path="phoneno"/> </td>  
    </tr>
   
     <tr>
       <td colspan="2"><input type="submit"  value="Edit Student"> </td>
     </tr>
       
  </table>


</frm:form><br><br>

<h2  style="color:red;text-align:center">
  <a    href="./report"><img     src="images/home.jpg" width="60px" height="60px"><br>Go Back</a>
   </h2>