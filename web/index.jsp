<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- JQUERY -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!--FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<!-- Nuestro css-->
<link rel="stylesheet"type="text/css"href="css/index.css">
        <title>Sistema de Login</title>
        
    </head>
    <body>
        
    
        <div class="modal-dialog text-center">
              <div class="col-sm-8 main-section">
                <div class=" card-body modal-content">
                    <div class="col-12 user-img">
                       <img src="img/Login.jpg"/> 
                    </div>
                    <div class="form-group text-center">
                            <h3>Iniciar Sesion</h3>
                        </div>
                    <form class="form-sign col-12" action="Validar" method="POST">
                       
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input  type="text" name="txtuser" class="form-control"  placeholder="Nombre de Usuario"required autofocus="autofocus"/>
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" minlength="8" name="txtpass" class="form-control"required/>
                            
                        </div>
                        <div>
                            
                        </div>
                        
                            <div>
                                  <input style="margin-left:10px" type="submit" name="accion" value="Ingresar" class="btn btn-primary">
                                  <input style="margin-left:10px" type="reset" name="accion" value="Cancelar" class="btn btn-success">
                            </div> 
                          </form>
                        </div>
 
 
                     <script>
                           document.addEventListener('DOMContentLoaded', () => {
                           document.querySelectorAll('input[type=text]').forEach( node => node.addEventListener('keypress', e => {
                        if(e.keyCode == 13) {
                            e.preventDefault();
                            }
                          }))
                        });
                    </script>
                </div>
            </div>
         </div>
        </div>
   
    </body>
</html>