
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600|Open+Sans" rel="stylesheet"> 
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
	<link rel="stylesheet" href="css/estilos_1.css"><title>Lista de Visitas</title>
    </head>
    <body>
          <div class="d-flex">
         <div style="margin-left: 40px; box-shadow: 1px 1px 10px 0px black;" class="card" col-sm-8>
            <div class="card-body">
                <form action="Controlador?menu=Visitas" method="POST">
                     <div class="form-group text-center">
                            <h3>Registro de Visitas</h3>
                            <img src="img/Invitado.png" alt="64" width="64"/>
                        </div> 
                    <div class="form-group">
                        <label>Id_visita</label>
                        <input type="text"  value="${visita.getId_visita()}" name="txtId_visita" class="form-control"required autofocus="autofocus">
                    </div>
                    <div class="form-group">
                        <label>Id_invitado</label>
                        <input type="text"value="${visita.getId_invitado()}" name="txtId_invitado" class="form-control"required>
                    </div>
                    <div class="form-group">
                        <label>Fecha</label>
                        <input type="date" value="${visita.getFecha()}"name="txtFecha" class="form-control"required>
                    </div>
                    <div class="form-group">
                        <label>Id_inmueble</label>
                        <input type="text" value="${visita.getId_inmueble()}"name="txtId_inmueble" class="form-control"required>
                    </div>
                    
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    <input type="reset" name="accion" value="Cancelar" class="btn btn-info">
                    
                 </form>
            </div> 
        </div>           
        
        <div class="col-sm-7">
            <table  style="margin-left: 100px;  border: #3ce477 5px solid;" class="table table-hover ">
                <thead>
                    <tr>
                        <th>Id_visita</th>
                        <th>Id_invitado</th>
                        <th>Fecha</th>
                        <th>Id_inmueble</th>
                        <th>Accion</th> 
                    </tr>
                </thead>
           <tbody>
               <c:forEach var="vis" items="${visitas}">       
                <tr>
                         <td>${vis.getId_visita()}</td>
                         <td>${vis.getId_invitado()}</td>
                         <td>${vis.getFecha()}</td>
                         <td>${vis.getId_inmueble()}</td>

                         
                         <td>
                             <a class="btn btn-warning"href="Controlador?menu=Visitas&accion=Editar&id_visita=${vis.getId_visita()}">Editar Datos</a>
                             <a class="btn btn-danger" style="margin-left: 10px"href="Controlador?menu=Visitas&accion=Eliminar&id_visita=${vis.getId_visita()}">Eliminar Datos</a>
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
