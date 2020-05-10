package Modelo;


public class Cuenta {
 
    int id_cuenta=0;
    float monto;
    String descripcion;
    
 public Cuenta(){
 }
 
  public Cuenta( int id_cuenta, float monto,  String descripcion) {
  
     this.id_cuenta=id_cuenta;
     this.monto=monto;
     this.descripcion=descripcion;
  } 

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
  
}