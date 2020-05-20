    function Actualizar(){                            
       //Ingresamos un mensaje a mostrar
        var mensaje = confirm("¿Desea Actualizar el siguiente registro?");
     //Detectamos si el usuario acepto el mensaje
      if (mensaje == true) {
       alert("¡Gracias por aceptar!");
        return true;
         }
      //Detectamos si el usuario denegó el mensaje
             else {
       alert("¡Haz denegado el mensaje!");
        return false;
        }
   }

