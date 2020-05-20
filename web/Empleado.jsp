<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
  

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilosm.css">
        <link rel="stylesheet" href="css/estilos.css">
        
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" ="crossoriginanonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" type="text/javascript"></script>
	<script src="js/jquery.nivo.slider.js"></script>
        <script src="js/arriba.js"></script>
    </head>
    <body>
        <header>
            <nav class="menu">
                <ul>         
                    <li>
                        <a  style="margin-top:-4px;"class="dropdown-item"href="Controlador?menu=Inicio" target="myFrame">Inicio
                            <img style="width: 20px; height: 20px; margin-left: 2px;" src="img/home3.png">
                        </a> 
                    </li>
                    <li>Invitados
                            <img src="img/avatar.png" style="width: 20px; height: 20px; margin-left: 2px;">
                        <ul>
                            <li>
                            <a class="dropdown-item" href="Controlador?menu=ListarInvitados&accion=Listar"target="myFrame">Listar Invitados</a>
                            </li>
                            <li>
                            <a class="dropdown-item" href="Controlador?menu=Invitados&accion=Listar"target="myFrame">Gestionar Invitados</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a style="margin-top:-4px" class="dropdown-item"href="Acerca de.jsp" target="myFrame">Acerca de
                            <img style="width: 20px; height: 20px; margin-left: 2px;"src="img/info.png"> 
                        </a>
                    </li>
                    <div style="margin-left: 500px;">
                        
                    </div>
                    <li>Sesion de 
                         <%
                    out.print(session.getAttribute("user"));
                                              
                         %>
                             <img style="width: 20px; height: 20px; margin-left: 1px;"src="img/usersesion.png"> 
                        <ul>
                          <li>
                              <img  src="img/usersesion.png" alt="60" width="60">
                          </li>
                          <li>${usuario.getEmail()}</li>
                          <form action="Validar" method="POST">  
                          
                           <li>
                            <Button name="accion" value="Salir" class="dropdown-item" href="">
                                <img src="img/salir.png" alt="20" width="20"/>Salir
                             </Button>
                          </li>
                         </form>
                      </ul>
                </li>
               
             </ul>
                          
            </nav>    
        </header>
            <div class="mt-4" style="height: 570px;">
                    <iframe name="myFrame" style="height: 100%; width: 100%; border:none" src="nuevo.jsp"></iframe> 
            </div>
        <footer>
       
       <div class="container-footer-all">
        
            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion del equipo de Desarrollo</h1>

                    <p>Somos un grupo de estudiantes de la Universidad de Cundinamarca 
                        de sexto semestre,que se encargo del desarrollo de esta pagina 
                        dirigida a el conjunto Villa Mayorga.El grupo esta integrado 
                        por William Celis, Felipe Granica y Marlon Gualteros. 
                    </p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                     <div class="information">
                        <div class="row">
                            <img  src="img/facebook.png">
                            <a href="https://www.facebook.com/FelipeGarnicaH/">Siguenos en Facebook</a>
                        </div>
                    </div>
                    
                    <div class="information">
                        <div class="row">
                            <img src="img/instagram.png ">
                            <a href="https://www.instagram.com/felipegarnicah/">Siguenos en Instagram</a>
                        </div>
                    </div>     
                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="img/house.png">
                        <label>Fusagasuga,Cundinamarca</label>
                    </div>

                    <div class="row2">
                        <img src="img/smartphone.png">
                        <label>+57-3197228732</label>
                    </div>

                    <div class="row2">
                        <img src="img/contact.png">
                         <label>jhoanfelipe1616@hotmail.com</label>
                    </div>

                </div>

            </div>
        
        </div>
        
        <div class="container-footer">
               <div class="footer">
                    <div class="copyright">
                        © 2020 Todos los Derechos Reservados | WFG.DEVELOPER</a>
                    </div>

                    <div class="information">
                       <a href="Politica de Privacidad.jsp" target="myFrame">Politica de Privacidad</a>
                    </div>
                </div>

            </div>
        
    </footer>                                
                
     </body>
    
</html>

