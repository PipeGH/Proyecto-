
package Modelo;


public class CuentaUsuario {
 
    String id_cuenta;
    String NombreU;
    String monto;
    String descripcion;
    
 public CuentaUsuario(){
 }
 
  public CuentaUsuario( String id_cuenta, String NombreU, String monto,  String descripcion) {
  
     this.id_cuenta=id_cuenta;
     this.NombreU=NombreU;
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

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }
  
  
}
