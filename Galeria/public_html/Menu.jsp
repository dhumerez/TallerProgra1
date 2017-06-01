<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
MENU
</title>
</head>
<body>
<h2>
Buena :v
Holis: <%= session.getAttribute("varusu") %>
</h2>

<table  cellspacing="2" cellpadding="1" class="lista">



        <tr>
        <td><b>Nombre:   </b></td> <td><b>Direccion:</b></td> <td><b>Telefono</b></td>
        </tr>
        
        <logic:iterate id="tabla" indexId="index" name="nn" property="tabla">

          <tr>
            <td>
            
                
                
                <bean:write name="tabla" property="nombre" />
              </html:submit>


            </td>
            <td><bean:write name="tabla" property="direccion" /></td>
            <td><bean:write name="tabla" property="telefono" /></td>
          </tr>
        </logic:iterate>




</table>


<br>
<br>
<br>
<br>


<html:form action="/menu">

          <html:submit property="opcion" value="Salon 1" />
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          

          <html:submit property="opcion" value="Salon 2" />

          <br>
          <html:submit property="opcion" value="Salon 3" />

</html:form>


</body>
</html>
