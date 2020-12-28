<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center><h1>Edit Food</h1></center>

<form:form method="POST" action="save">
<div style=" text-align: center; padding-left: 40%">
	<table border="4">
		<tr>
			<td>Id :</td>
			<td><form:input readonly="true" path="foodId" /></td>
		</tr>
		<tr>
			<td>Food Name :</td>
			<td><form:input path="foodName" /></td>
		</tr>
		<tr>
			<td>Type :</td>
			<td><form:input path="type"/></td>
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

