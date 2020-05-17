package Modelo;

public class CuentaUsuario {
    int id_cuenta=0; 
    String descripcion, monto;
    String nombre, fecha;
    
 public CuentaUsuario(){
 }
 
  public CuentaUsuario( int id_cuenta, String monto,  String descripcion, String nombre, String fecha ) {
  
     this.id_cuenta=id_cuenta;
     this.monto=monto;
     this.descripcion=descripcion;
     this.nombre=nombre;
     this.fecha=fecha;
  }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
  
}

