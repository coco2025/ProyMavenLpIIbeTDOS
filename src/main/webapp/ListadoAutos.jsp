<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*" %> 
 <%@page import="model.TblAuto" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Autos</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Autos</h1>
<table align="center" border="2">
<tr>
<th>codigo</th>
<th>marca</th>
<th>modelo</th>
<th>color</th>
<th>motor</th>
<th>nrotarjeta</th>
</tr>
<%
List<TblAuto> listar=(List<TblAuto>)request.getAttribute("listado");
//aplicamos un bucle
for(TblAuto lis:listar){
	//aplicamos una condicion...
	if(lis!=null){
		%>
		<tr>
		<td><%=lis.getIdauto()%></td>
		<td><%=lis.getMarca()   %></td>
		<td><%=lis.getModelo() %></td>
		<td><%=lis.getColor() %></td>
		<td><%=lis.getMotor() %></td>
		<td><%=lis.getNroTarje() %></td>
		</tr>
		<%
	}//fin del if...
} //fin del bucle...
%>
</table>

</body>
</html>