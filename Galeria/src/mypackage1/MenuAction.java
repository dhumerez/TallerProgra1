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

public class MenuAction extends Action 
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


 MenuForm men = (MenuForm) form;
    String op = men.getOpcion();

     if(op.equals("Salon 1"))
     {

          try
           {
             cn = conn3.conexion;
             String cadena = "Select * from g_salon  where id=1";

             itConsulta = conn3.getData(cadena);
             System.out.println(cadena);
             System.out.println(itConsulta);
             while(itConsulta.next())
             {
                   id=itConsulta.getString("id");
                   name =itConsulta.getString("name");
                    estado =itConsulta.getString("estado_disponible");

             }
           
                        
              request.getSession().setAttribute("xid",id);
               request.getSession().setAttribute("xname",name);
                request.getSession().setAttribute("xestado",estado);
             return mapping.findForward("");
             
              }
	
            catch(Exception e)
           {
              e.printStackTrace();
              return (mapping.findForward("malo"));
           }
       
        finally
        {
          conn.closeConnection();	
        }


     }

      if(op.equals("Salon 2"))
     {
       try
           {
             cn = conn3.conexion;
             String cadena = "Select * from g_salon  where id=2";

             itConsulta = conn3.getData(cadena);
             System.out.println(cadena);
             System.out.println(itConsulta);
             while(itConsulta.next())
             {
                   id=itConsulta.getString("id");
                   name =itConsulta.getString("name");
                    estado =itConsulta.getString("estado_disponible");

             }
           
                        
              request.getSession().setAttribute("xid",id);
               request.getSession().setAttribute("xname",name);
                request.getSession().setAttribute("xestado",estado);
             return mapping.findForward("");
             
              }
	
            catch(Exception e)
           {
              e.printStackTrace();
              return (mapping.findForward("malo"));
           }
       
        finally
        {
          conn.closeConnection();	
        }


     }



      if(op.equals("Salon 3"))
     {

       try
           {
             cn = conn3.conexion;
             String cadena = "Select * from g_salon  where id=3";

             itConsulta = conn3.getData(cadena);
             System.out.println(cadena);
             System.out.println(itConsulta);
             while(itConsulta.next())
             {
                   id=itConsulta.getString("id");
                   name =itConsulta.getString("name");
                    estado =itConsulta.getString("estado_disponible");

             }
           
                        
              request.getSession().setAttribute("xid",id);
               request.getSession().setAttribute("xname",name);
                request.getSession().setAttribute("xestado",estado);
             return mapping.findForward("");
             
              }
	
            catch(Exception e)
           {
              e.printStackTrace();
              return (mapping.findForward("malo"));
           }
       
        finally
        {
          conn.closeConnection();	
        }

     }




    return mapping.findForward("success");
  }
}