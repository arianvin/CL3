<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="model.TblProductocl3" %>
<%@ page import="Dao.ClassProductoCl3Imp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Menu - Principal</h1>
<form action="ControladorProductoCl3" method="post">
<table align="center"  border="2" >

<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>

<tr>
<td>Precio Venta</td>
<td><input type="number" name="precioven"></td>
</tr>

<tr>
<td>Precio Compra</td>
<td><input type="number" name="preciocom"></td>
</tr>

<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>

<tr>
<td>Descripción</td>
<td><input type="text" name="descrip"></td>
</tr>


<td colspan="2" align="center">
<input type="submit" value="Registrar Producto">
</td>
</table>


<% ClassProductoCl3Imp crud = new  ClassProductoCl3Imp();%>

<h2>Listado de Productos</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Código</th>
                <th>Nombre</th>
                <th>Precio de Venta</th>
                <th>Precio de Compra</th>
                <th>Estado</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <%
	List<TblProductocl3> listadoproducto=(List<TblProductocl3>)request.getAttribute("listadodeproductos");
	//Condición si el listado no es vacio
	if(listadoproducto!=null){
		//aplicammos un bucle for
		for(TblProductocl3 list:listadoproducto){
			%>
				<tr>
					<td><%=list.getIdproductocl3()%></td>
					<td><%=list.getNombrecl3()%></td>		
					<td><%=list.getPrecioventacl3()%></td>
					<td><%=list.getPreciocompcl3()%></td>
					<td><%=list.getEstadocl3()%></td>
					<td><%=list.getDescripcl3()%></td>
				
				</tr>
		<% 		
		}//fin del bucle for
		%>
		<%
	}//fin de la condición
	
%>
        </tbody>
    </table>

</form>

<a align="center" href="IngresarAlSistema.jsp">Atrás</a>
</body>
</body>
</html>