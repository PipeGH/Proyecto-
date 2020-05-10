package Modelo;


public class Cuenta {
 
    int id_cuenta=0; 
    String descripcion, monto;
    String nombre;
    
 public Cuenta(){
 }
 
  public Cuenta( int id_cuenta, String monto,  String descripcion, String nombre) {
  
     this.id_cuenta=id_cuenta;
     this.monto=monto;
     this.descripcion=descripcion;
     this.nombre=nombre;
  } 

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
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