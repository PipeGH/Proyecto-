
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
           <div class="contenedor">
		
			<button id="btn-abrir-popup" class="btn-abrir-popup">Registrar Visita</button>
			
		<div class="overlay" id="overlay">
			<div class="popup" id="popup">
				<a href="#" id="btn-cerrar-popup" class="btn-cerrar-popup"><i class="fas fa-times"></i></a>
				<h3>Registrar visita </h3>
				<form action="Controlador?menu=Visitas" method="POST">
					<div class="contenedor-inputs">
						<input type="text" name="txtId_visita" placeholder="Id_visita">
						<input type="text" name="txtId_invitado" placeholder="Id_invitado">
						<input type="date" name="txtFecha" id="start" class="fecha" placeholder=" fecha"  min="2020-01-01" max="2020-12-31">
					</div>
					<input type="submit" name="accion" class="btn-submit" value="Agregar">
					<input type="reset" class="btn-reset" value="Limpiar">
					
				</form>
			</div>
		</div>
            </div>
	  </div> 
        <div class="d-flex">
         <div class="col-sm-6">    
            <table  style="margin-left: 600px;  border: #3ce477 5px solid;" class="table table-hover "><thead>
                      
                    <tr>
                        <th>Id_Visita</th>
                        <th>Id_invitado</th>
                        <th>Fecha</th>
                        <th>Accion</th>
                </thead>
           <tbody>
               <c:forEach var="vis" items="${visitas}">       
                <tr>
                         <td>${vis.getId_visita()}</td>
                         <td>${vis.getId_invitado()}</td>
                         <td>${vis.getFecha()}</td>
                         
                         
                         
                <td>
                    
                             <a class="btn btn-warning"href="Controlador?menu=Visitas&accion=Editar&id_visita=${vis.getId_visita()}">Editar</a>
                             <a class="btn btn-danger"href="Controlador?menu=Visitas&accion=Eliminar&id_visita=${vis.getId_visita()}">Eliminar</a> 
                         
                </td>         

                </tr>
                       
            </c:forEach>        
                    
           </tbody>
        </table>
        </div> 
 
       </div>
      <script src="js/popup.js"></script>  
      
         <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        
    </body>
</html>
