<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
<form action="ControladorUsuarioCl3" method="post">
</head>
<body bgcolor="#c5dec9">
    <table align="center">
        <tr>
            <td align="center">
                <h2>INGRESAR AL SISTEMA</h2>
            </td>
        </tr>
        
        <tr>
            <td align="center">
                <form action="ruta/para/login" method="post">
                    <table border="1" cellpadding="10" cellspacing="0">
                        <tr>
                            <td>Usuario:</td>
                            <td><input type="text" name="usuariocl3" required></td>
                        </tr>
                        <tr>
                            <td>Contraseņa:</td>
                            <td><input type="password" name="passwordcl3" required></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Registrar">
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
        
        <tr>
            <td>
                <h2>
     <a href="FormRegistrarProductoCl3.jsp" style="text-decoration:underline;color: blue; font-style: italic;">REGISTRAR PRODUCTO</a>
                </h2>
            </td>
        </tr>
    </table>
    </form>
</body>
</html>