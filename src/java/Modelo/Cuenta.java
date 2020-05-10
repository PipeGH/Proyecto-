
package Modelo;


public class Cuenta {
 
    String id_cuenta;
    String nombre;
    String monto;
    String descripcion;
    
 public Cuenta(){
 }
 
  public Cuenta( String id_cuenta, String nombre, String monto,  String descripcion) {
  
     this.id_cuenta=id_cuenta;
     this.nombre=nombre;
     this.monto=monto;
     this.descripcion=descripcion;
  } 

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
  
  
}
