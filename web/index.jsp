<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
      
        <!-- JQUERY -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!--FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
      


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
                    <form form class="form-sign col-12" action="Validar" method="POST">
                       <img class="mb-4" src="{{ site.baseurl }}/docs/{{ site.docs_version }}/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" class="form-control"  placeholder="Nombre de Usuario"required autofocus="autofocus"/>
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" name="txtpass" class="form-control"/>
                            
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
              
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   
        <script>
         $(document).ready(function() {        
             $("#alertSI").hide();
             $("#alertNO").hide();
            $("#form1").submit(function(e){
                e.preventDefault();    
                user = $.trim($("#user").val());
                pass = $.trim($("#pass").val());
                if(user.length>0 && pass.length>0){           
                    $("#alertSI").fadeTo(2000, 500).slideUp(500, function() {
                      $("#alertSI").slideUp(500);
                    });        
                }else{
                    $("#alertNO").fadeTo(2000, 500).slideUp(500, function() {
                      $("#alertNO").slideUp(500);
                    });
                }
                });   
        });
        </script>
                       
    </body>
</html>