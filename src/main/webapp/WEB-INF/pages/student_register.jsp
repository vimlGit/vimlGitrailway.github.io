<%@ page  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>



<h1 background="yellow" style="color:red;text-align:center"> Register the Student </h1>
<body bgcolor="navy"></body>

<frm:form  modelAttribute="student">
  <table  align="center" bgcolor="cyan" >
    <tr>
      <td> Student name :: </td>
      <td> <frm:input path="sname"/> </td>  
    </tr>
   <tr>
      <td> Father  name :: </td>
      <td> <frm:input path="fname"/> </td>  
    </tr>
  <tr>
      <td> Course  Name :: </td>
      <td> <frm:input path="course"/> </td>  
    </tr>
    <tr>
      <td> Department name :: </td>
      <td> <frm:input path="deptname"/> </td>  
    </tr>
     <tr>
      <td>   Phone no :: </td>
      <td> <frm:input path="phoneno"/> </td>  
    </tr>
    
    <tr>
      <td>   Java Marks :: </td>
      <td> <frm:input path="marks.java"/> </td>  
    </tr>
    
    <tr>
      <td>   Python Marks :: </td>
      <td> <frm:input path="marks.python"/> </td>  
    </tr>
    <tr>
      <td>   C Marks :: </td>
      <td> <frm:input path="marks.c_language"/> </td>  
    </tr>
    <tr>
      <td>   OS Marks :: </td>
      <td> <frm:input path="marks.os"/> </td>  
    </tr>
    
    <tr>
      <td>   Total Marks :: </td>
      <td> <frm:input path="marks.total_marks"/> </td>  
    </tr>
    
     <tr>
       <td colspan="2"><input type="submit"  value="register"> </td>
     </tr>
  </table>
</frm:form>  <br><br>
<h2  style="color:red;text-align:center">
  <a   style="color:yellow;text-align:center"  href="./report"><img     src="images/home.jpg" width="60px" height="60px"><br> Go Back</a>
   </h2>