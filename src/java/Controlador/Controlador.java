package Controlador;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controlador extends HttpServlet {
    Usuario us=new Usuario();
    UsuarioDAO usao=new UsuarioDAO();
    Invitado in=new Invitado();
    InvitadoDAO indao=new InvitadoDAO();
    Inmueble inmueb= new Inmueble();
    InmuebleDAO inmdao=new InmuebleDAO();
    int ide;
    String ide2;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu=request.getParameter("menu");
        String accion=request.getParameter("accion");

        if(menu.equals("Principal")){
            
         request.getRequestDispatcher("Principal.jsp").forward(request, response);
         
        }
        if(menu.equals("Empleado")){
            
         request.getRequestDispatcher("Empleado.jsp").forward(request, response);
         
        }
        
        if(menu.equals("Inicio")){
            
         request.getRequestDispatcher("nuevo.jsp").forward(request, response);
         
        }
        if(menu.equals("ListarUsuarios")){
            
         switch (accion){
               case "Listar":
                    List lista=usao.listar();
                    request.setAttribute("usuarios", lista);
                   break;
                   
          default:
                   throw new AssertionError();
           }
        
         request.getRequestDispatcher("ListaUsuarios.jsp").forward(request, response);
        }
       
         
        if(menu.equals("Usuarios")){
         
           switch (accion){
               case "Listar":
                    List lista=usao.listar();
                    request.setAttribute("usuarios", lista);
                   break;
               case "Agregar":
                    int id=Integer.parseInt(request.getParameter("txtId"));
                    String nombre=request.getParameter("txtNombre");
                    String apellido=request.getParameter("txtApellido");
                    String telefono=request.getParameter("txtTelefono");
                    String email=request.getParameter("txtEmail");
                    int nivel=Integer.parseInt(request.getParameter("txtNivel"));
                    us.setId(id);
                    us.setNombre(nombre);
                    us.setApellido(apellido);
                    us.setTelefono(telefono);
                    us.setEmail(email);
                    us.setNivel(nivel);
                    usao.agregar(us);
                    request.getRequestDispatcher("Controlador?menu=Usuarios&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Usuario u=usao.listarId(ide);
                    request.setAttribute("usuario", u);
                        request.getRequestDispatcher("Controlador?menu=Usuarios&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   int id1=Integer.parseInt(request.getParameter("txtId"));
                    String nombre1=request.getParameter("txtNombre");
                    String apellido1=request.getParameter("txtApellido");
                    String telefono1=request.getParameter("txtTelefono");
                    String email1=request.getParameter("txtEmail");
                    int nivel1=Integer.parseInt(request.getParameter("txtNivel"));
                    us.setId(id1);
                    us.setNombre(nombre1);
                    us.setApellido(apellido1);
                    us.setTelefono(telefono1);
                    us.setEmail(email1);
                    us.setNivel(nivel1);
                    us.setId(ide);
                    usao.agregar(us);
                    usao.actualizar(us);
                    request.getRequestDispatcher("Controlador?menu=Usuarios&accion=Listar").forward(request, response);
                   
                   break;
               case "Eliminar":
                   ide=Integer.parseInt(request.getParameter("id"));
                   usao.eliminar(ide);
                   request.getRequestDispatcher("Controlador?menu=Usuarios&accion=Listar").forward(request, response);
                   break;
               
               default:
                   throw new AssertionError();
           }
            request.getRequestDispatcher("Usuarios.jsp").forward(request, response);
        }
        if(menu.equals("ListarInvitados")){
            
         switch (accion){
               case "Listar":
                    List lista=indao.listar();
                    request.setAttribute("invitados", lista);
                   break;
                   
          default:
                   throw new AssertionError();
           }
        
         request.getRequestDispatcher("ListaInvitados.jsp").forward(request, response);
        }
    
        if(menu.equals("Invitados")){
           switch (accion){
               case "Listar":
                    List lista=indao.listar();
                    request.setAttribute("invitados", lista);
                   break;
               case "Agregar":
                    int id=Integer.parseInt(request.getParameter("txtId"));
                    String nombre=request.getParameter("txtNombre");
                    String apellido=request.getParameter("txtApellido");

                    
                    in.setId(id);
                    in.setNombre(nombre);
                    in.setApellido(apellido);

                    
                    indao.agregar(in);
                    request.getRequestDispatcher("Controlador?menu=Invitados&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Invitado i=indao.listarId(ide);
                    request.setAttribute("invitado", i);
                    request.getRequestDispatcher("Controlador?menu=Invitados&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   int id2=Integer.parseInt(request.getParameter("txtId"));
                    String nombre2=request.getParameter("txtNombre");
                    String apellido2=request.getParameter("txtApellido");

                    
                    in.setId(id2);
                    in.setNombre(nombre2);
                    in.setApellido(apellido2);
                    in.setId(ide);
                    indao.agregar(in);
                    indao.actualizar(in);
                    request.getRequestDispatcher("Controlador?menu=Invitados&accion=Listar").forward(request, response);
                   
                   break;
               case "Eliminar":
                   ide=Integer.parseInt(request.getParameter("id"));
                   indao.eliminar(ide);
                   request.getRequestDispatcher("Controlador?menu=Invitados&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           } 
            request.getRequestDispatcher("Invitados.jsp").forward(request, response);
        }
        
    if(menu.equals("Inmuebles")){
      
           switch (accion){
               case "Listar":
                    List lista=inmdao.listar();
                    request.setAttribute("inmuebles", lista);
                   break;
               case "Agregar":
                    String id=request.getParameter("txtId");
                    String estado=request.getParameter("txtEstado");
                    String tipo=request.getParameter("txtTipo");
                   int id_usuario=Integer.parseInt(request.getParameter("txtId_usuario"));
                    int id_cuenta=Integer.parseInt(request.getParameter("txtId_cuenta"));

                    
                    inmueb.setId(id);
                    inmueb.setEstado(estado);
                    inmueb.setTipo(tipo);
                    inmueb.setId_usuario(id_usuario);
                    inmueb.setId_cuenta(id_cuenta);
                    

                    
                    inmdao.agregar(inmueb);
                    request.getRequestDispatcher("Controlador?menu=Inmuebles&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                    ide2=request.getParameter("id_inm");
                    Inmueble inm=inmdao.listarId(ide2);
                    request.setAttribute("inmueble", inm);
                    request.getRequestDispatcher("Controlador?menu=Inmuebles&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   String id2=request.getParameter("txtId");
                    String estado2=request.getParameter("txtEstado");
                      String tipo2=request.getParameter("txtTipo");
                    int id_usuario2=Integer.parseInt(request.getParameter("txtId_usuario"));
                    int id_cuenta2=Integer.parseInt(request.getParameter("txtId_cuenta"));
                    
                    inmueb.setId(id2);
                    inmueb.setEstado(estado2);
                    inmueb.setTipo(tipo2);
                    inmueb.setId_usuario(id_usuario2);
                    inmueb.setId_cuenta(id_cuenta2);
                    inmueb.setId(ide2);
                    
                    inmdao.agregar(inmueb);
                    inmdao.actualizar(inmueb);
                    request.getRequestDispatcher("Controlador?menu=Inmuebles&accion=Listar").forward(request, response);
                   
                   break;
               case "Eliminar":
                   ide2=request.getParameter("id");
                   inmdao.eliminar(ide2);
                   request.getRequestDispatcher("Controlador?menu=Inmuebles&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           } 
            request.getRequestDispatcher("Inmuebles.jsp").forward(request, response);
        }
       
    
    }
    

    
    

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 
}
