<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<style type="text/css">
.error{
color:red;
}
</style>
</head>
<center><h1>Add food</h1></center>

<form:form method="POST" action="save" modelAttribute="food">
<div  style=" text-align: center; padding-left: 33%" >
	<table border="4">
		<tr>
			<td>Food Name :</td>
			<td><form:input path="foodName" /></td>
			<form:errors path="foodName" cssClass="error"/><br>
		</tr>
		<tr>
			<td>Type :</td>
			<td><input type="radio" name="type" value="veg" checked="checked"> veg</input></td>
			<td><input type="radio" name="type" value="non veg" > Non veg</input></td>
				
		</tr>
		<tr>
			<td>Price :</td>
			<td><form:input path="price" /></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit" value="save">save</button></td>
		</tr>
	</table>
	</div>
</form:form>
</html>
