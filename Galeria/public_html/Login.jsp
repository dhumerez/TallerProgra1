<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">

<title>
GALERIA
</title>
</head>
<body>

<html:form action="/inicio">
<table  width="350" align="center" >
<tr>
    <td colspan="2" class="boxhead" >GALERIA DE ARTE</td>
    
</tr>
<tr>
    <td>Usuario:</td>
    <td><html:text property="usuario" /></td>
</tr>
<tr>
    <td>Contraseña</td>
    <td><html:password property="clave" />
</td>
</tr>
<tr>
    <td colspan="2" class="boton2"><html:submit value="ingresar" /></td>
   
    
    
</tr>
</table>


</html:form>







</body>
</html>
