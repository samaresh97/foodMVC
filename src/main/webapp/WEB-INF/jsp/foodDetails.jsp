 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<center><h1>Food Details</h1></center>
  <div style="text-align: center; padding-left:20%;">
<table border="2" width="70%" cellpadding="2" >  
<tr>
<th>Food Id</th>
<th>Food Name</th>
<th>Food type</th>
<th>Price</th>
<th>Update</th>
   <c:forEach var="food" items="${flist}">   
   <tr>  
   <td>${food.foodId}</td>  
   <td>${food.foodName}</td>  
   <td>${food.type}</td>  
   <td>${food.price}</td>
     
   <td><a value="edit" href="edit?id=${food.foodId}"><button id="edit">Update</button></a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   </div>
   <br/>  
 