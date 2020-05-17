package Controlador;
import Modelo.Cuenta;
import Modelo.CuentaDAO;
import Modelo.CuentaUsuarioDAO;
import Modelo.Inmueble;
import Modelo.InmuebleDAO;
import Modelo.Invitado;
import Modelo.InvitadoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Modelo.Visita;
import Modelo.VisitaDAO;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {
    Usuario us=new Usuario();
    UsuarioDAO usao=new UsuarioDAO();
    Invitado in=new Invitado();
    InvitadoDAO indao=new InvitadoDAO();
    Inmueble inmueb= new Inmueble();
    InmuebleDAO inmdao=new InmuebleDAO();
    Cuenta cu= new Cuenta();
    CuentaDAO cuentdao= new CuentaDAO();
    CuentaUsuarioDAO cuendao= new CuentaUsuarioDAO();
    Visita vis=new Visita();
    VisitaDAO visidao=new VisitaDAO();
    
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
                    ide2=request.getParameter("id");
                    Inmueble inm=inmdao.listarId(ide2);
                    request.setAttribute("inmueble", inm);
                    request.getRequestDispatcher("Controlador?menu=Inmuebles&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   String id2=request.getParameter("txtId");
                   String estado2=request.getParameter("txtEstado");
                   String tipo2=request.getParameter("txtTipo");
                    int  id_usuario2=Integer.parseInt(request.getParameter("txtId_usuario"));
                    int  id_cuenta2=Integer.parseInt(request.getParameter("txtId_cuenta"));
                    
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
     if(menu.equals("ListarCuentas")){
            
         switch (accion){
               case "Listar":
                   
                    List listar=cuentdao.listar();
                    request.setAttribute("cuentas", listar);
                   break;
                   
          default:
                   throw new AssertionError();
           }
        
         request.getRequestDispatcher("ListarCuentas.jsp").forward(request, response);
        }
       
          if(menu.equals("ListarCuentasU")){
            
         switch (accion){
               case "Listar":
                   String nombre=request.getParameter("nombre");
                    List listarU=cuendao.ListarCuentasU(nombre);
                    request.setAttribute("ListarCuentasU", listarU);
                   break;
                   
          default:
                   throw new AssertionError();
           }
        
         request.getRequestDispatcher("ListarCuentasU.jsp").forward(request, response);
        }
     if(menu.equals("Cuentas")){
           switch (accion){
               case "Listar":
                    List lista=cuentdao.listar();
                    request.setAttribute("cuentas", lista);
                   break;
               case "Agregar":
                    int id_cuenta=Integer.parseInt(request.getParameter("txtId_cuenta"));
                    String monto=request.getParameter("txtMonto");
                    String descripcion=request.getParameter("txtDescripcion");
                    String nombre=request.getParameter("txtNombre");
                    String fecha = request.getParameter("txtFecha");

                    cu.setId_cuenta(id_cuenta);
                    cu.setMonto(monto);
                    cu.setDescripcion(descripcion);
                    cu.setNombre(nombre);
                    cu.setFecha(fecha);
                    
                    
                    cuentdao.agregar(cu);
                    request.getRequestDispatcher("Controlador?menu=Cuentas&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                    ide=Integer.parseInt(request.getParameter("id_cuenta"));
                    Cuenta cuen=cuentdao.listarId(ide);
                    request.setAttribute("cuenta", cuen);
                    request.getRequestDispatcher("Controlador?menu=Cuentas&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   int id_cuenta2=Integer.parseInt(request.getParameter("txtId_cuenta"));
                   String monto2= request.getParameter("txtMonto");
                   String descripcion2=request.getParameter("txtDescripcion");
                   String nombre2=request.getParameter("txtNombre");
                   String fecha2=request.getParameter("txtFecha");
                    
                    cu.setId_cuenta(id_cuenta2);
                    cu.setMonto(monto2);
                    cu.setDescripcion(descripcion2);
                    cu.setNombre(nombre2);
                    cu.setFecha(fecha2);
                    cu.setId_cuenta(ide);
                    cuentdao.agregar(cu);
                    cuentdao.actualizar(cu);
                    request.getRequestDispatcher("Controlador?menu=Cuentas&accion=Listar").forward(request, response);
                   
                   break;
               case "Eliminar":
                   ide=Integer.parseInt(request.getParameter("id_cuenta"));
                   cuentdao.eliminar(ide);
                   request.getRequestDispatcher("Controlador?menu=Cuentas&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           } 
            request.getRequestDispatcher("Cuentas.jsp").forward(request, response);
        }
      if(menu.equals("ListarVisitas")){
            
         switch (accion){
               case "Listar":
                    List lista=visidao.listar();
                    request.setAttribute("visitas", lista);
                   break;
                   
          default:
                   throw new AssertionError();
           }
        
         request.getRequestDispatcher("ListarVisitas.jsp").forward(request, response);
        }
        
    
    
    if(menu.equals("Visitas")){
           switch (accion){
               case "Listar":
                    List lista=visidao.listar();
                    request.setAttribute("visitas", lista);
                   break;
               case "Agregar":
                    int id_visita=Integer.parseInt(request.getParameter("txtId_visita"));
                    int id_invitado=Integer.parseInt(request.getParameter("txtId_invitado"));
                    String fecha = request.getParameter("txtFecha");
                    String id_inmueble = request.getParameter("txtId_inmueble");
                    vis.setId_visita(id_visita);
                    vis.setId_invitado(id_invitado);
                    vis.setFecha(fecha);
                    vis.setId_inmueble(id_inmueble);

                    visidao.agregar(vis);
                    request.getRequestDispatcher("Controlador?menu=Visitas&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                    ide=Integer.parseInt(request.getParameter("id_visita"));
                    Visita vi=visidao.listarId(ide);
                    request.setAttribute("visita", vi);
                    request.getRequestDispatcher("Controlador?menu=Visitas&accion=Listar").forward(request, response);
                    break;
                    
               case "Actualizar":
                   int id_visita2=Integer.parseInt(request.getParameter("txtId_visita"));
                    int id_invitado2=Integer.parseInt(request.getParameter("txtId_invitado"));
                    String fecha2 = request.getParameter("txtFecha");
                    String id_inmueble2 = request.getParameter("txtId_inmueble");
                    
                    vis.setId_visita(id_visita2);
                    vis.setId_invitado(id_invitado2);
                    vis.setFecha(fecha2);
                    vis.setId_inmueble(id_inmueble2);
                    vis.setId_visita(ide);
                    visidao.agregar(vis);
                    visidao.actualizar(vis);
                    request.getRequestDispatcher("Controlador?menu=Visitas&accion=Listar").forward(request, response);
                   
                   break;
               case "Eliminar":
                   ide=Integer.parseInt(request.getParameter("id_visita"));
                   visidao.eliminar(ide);
                   request.getRequestDispatcher("Controlador?menu=Visitas&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           } 
            request.getRequestDispatcher("ListarVisitas.jsp").forward(request, response);
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