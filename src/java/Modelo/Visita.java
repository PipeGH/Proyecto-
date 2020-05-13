
package Modelo;

import java.util.Date;

public class Visita {
    int id_visita,id_invitado;
    String fecha;
  
public Visita(){
}    

public Visita(int id_visita, int id_invitado, String fecha){

 this.id_visita=id_visita;
 this.id_invitado=id_invitado;
 this.fecha=fecha;
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


}


