
package Modelo;


public class Visita {
    int id_visita,id_invitado;
    String fecha,id_inmueble;
    
  
public Visita(){
}    

public Visita(int id_visita, int id_invitado, String fecha, String id_inmueble){

 this.id_visita=id_visita;
 this.id_invitado=id_invitado;
 this.fecha=fecha;
 this.id_inmueble=id_inmueble;
  }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public int getId_invitado() {
        return id_invitado;
    }

    public void setId_invitado(int id_invitado) {
        this.id_invitado = id_invitado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(String id_inmueble) {
        this.id_inmueble = id_inmueble;
    }


}


