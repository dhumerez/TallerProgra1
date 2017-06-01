package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class LoginAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    LoginForm xxx =(LoginForm)form;
    String usu = xxx.getUsuario();
    request.getSession().setAttribute("varusu",usu);
    String cla = xxx.getClave();

        ConnectDB conn =new ConnectDB ();
          ConnectDB conn2 =new ConnectDB();
          ConnectDB conn3 =new ConnectDB();
          
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2=null;


    try
    {
    String cadena="select * from g_usuario where nombre_usuario='"+usu+"'AND password='"+cla+"'";
    String cadena2="select nombre,direccion,telefono from g_galeria";
    System.out.println(cadena);
    System.out.println(cadena2);
    
    rsConsulta = conn.getData(cadena);
    rsConsulta2= conn2.getData(cadena2);
    ArrayList items = new ArrayList();
    
 
    
    if (rsConsulta.next())

    {            
           
        while (rsConsulta2.next())
                {
                  ClaseGal item = new ClaseGal();
                  item.setNombre(rsConsulta2.getString("nombre"));
                  item.setDireccion(rsConsulta2.getString("direccion"));
                  item.setTelefono(rsConsulta2.getString("telefono"));
                  items.add(item);
                  System.out.println("Paso .."+item);
              }

              MenuForm f = new MenuForm ();	   
              f.setTabla(items);
              System.out.println(f);
              request.getSession().setAttribute("nn",f);

       return mapping.findForward("ok");
    }
    else
       return mapping.findForward("nook");
	}
	
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("mala"));
    }
    finally
    {
    conn.closeConnection();	
    }










     

  }
}