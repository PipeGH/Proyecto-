package Modelo;


public class Inmueble {
    
    int id_usuario,id_cuenta;
    String id,estado,tipo;
   
public Inmueble(){
}

public Inmueble(String id,String estado,String tipo, int id_usuario, int id_cuenta ){

    this.id=id;
    this.estado=estado;
       this.tipo=tipo;
    this.id_usuario=id_usuario;
    this.id_cuenta=id_cuenta;

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

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
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


}

