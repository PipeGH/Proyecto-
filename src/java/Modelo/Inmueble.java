package Modelo;


public class Inmueble {
    
    int id_usuario,id_visita;
    String id,estado,tipo,id_cuenta;
   
public Inmueble(){
}

public Inmueble(String id,String estado,String tipo, int id_usuario, String id_cuenta, int id_visita ){

    this.id=id;
    this.estado=estado;
    this.tipo=tipo;
    this.id_usuario=id_usuario;
    this.id_cuenta=id_cuenta;
    this.id_visita=id_visita;
    

}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }


}

