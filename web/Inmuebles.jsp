<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Gestionar Inmuebles</title>
    </head>
    <body>
        
        
        <div class="d-flex">
              <div class="card" col-sm-8>
            <div class="card-body">
                <form action="Controlador?menu=Inmuebles" method="POST">
                    <div class="form-group text-center"> 
                    <h3>Registrar Nuevo inmueble</h3>
                            <img src="img/home3.png" alt="64" width="64"/>
                    </div>        
                    <div class="form-group">
                        <label>Id</label>
                        <input type="text"  value="${inmueble.getId()}" name="txtId" class="form-control"required autofocus="autofocus">
                    </div>
                    
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text"  value="${inmueble.getEstado()}"name="txtEstado" class="form-control"required>
                    </div>
                    <div class="form-group">
                        <label>Tipo</label>
                        <input type="text"value="${inmueble.getTipo()}" name="txtTipo" class="form-control"required>
                    </div>
                    <div class="form-group">
                        <label>Id_usuario</label>
                        <input type="text" value="${inmueble.getId_usuario()}"name="txtId_usuario" class="form-control"required>
                    </div>
                    <div class="form-group">
                        <label>Id_cuenta</label>
                        <input type="text" value="${inmueble.getId_cuenta()}"name="txtId_cuenta" class="form-control" required>
                    
                </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    <input type="reset" name="accion" value="Cancelar" class="btn btn-info">
               
             </form>
             
            </div>
          </div>
        <div class="col-sm-8">
            <table class="table table">
                <thead>
                    <tr>
                        <th>Id_inmueble</th>
                        <th>Estado</th>
                        <th>Tipo</th>
                        <th>Id_usuario</th>
                        <th>Id_cuenta</th> 
                        <th>Accion</th> 
                    </tr>
                </thead>
           <tbody>
               <c:forEach var="inmueb" items="${inmuebles}">       
                <tr>
                    
                         <td>${inmueb.getId()}</td>
                         <td>${inmueb.getEstado()}</td>
                         <td>${inmueb.getTipo()}</td>
                         <td>${inmueb.getId_usuario()}</td>
                         <td>${inmueb.getId_cuenta()}</td>
                    <td>
                             <a class="btn btn-warning"href="Controlador?menu=Inmuebles&accion=Editar&id_inm=${inmueb.getId()}">Editar</a>
                             <a class="btn btn-danger"href="Controlador?menu=Inmuebles&accion=Eliminar&id=${inmueb.getId()}">Eliminar</a> 
                         
                </td>     
                    
               
                </tr>
                
                              
            </c:forEach>
                       
           </tbody>
        </table>
            
          </div>      
        </div>
   
          <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>


