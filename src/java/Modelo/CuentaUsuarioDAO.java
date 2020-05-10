
package Modelo;

import Config.Conexion;
import Modelo.CuentaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CuentaUsuarioDAO {
   
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;

 public List ListarCuentas(String nombre){
      List<CuentaUsuario>listausuario = new ArrayList<>();
       CuentaUsuario cuen = new CuentaUsuario();
        try{
             con=cn.Conexion();
             String sql= "select * from cuentas where nombre=?";
             ps=con.prepareStatement(sql);   
             ps.setString(1, nombre);
             rs=ps.executeQuery();
             while (rs.next()){
                
                
                 cuen.setId_cuenta(rs.getString(1));
                 cuen.setNombreU(rs.getString(2));
                 cuen.setMonto(rs.getString(3));
                 cuen.setDescripcion(rs.getString(4));
                
                
                       listausuario.add(cuen);
             
               }
            }catch(Exception e){
            }
            
            return listausuario;
        }
}
        