package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.CuentaUsuario;
public class CuentaUsuarioDAO {
    
     
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   
   public CuentaUsuario Validar(int id){
   CuentaUsuario cuent =new CuentaUsuario();
   String sql="select * from cuentas where  id_cuenta=?";
   try{
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setInt(1, id);
       rs=ps.executeQuery();
       
       while(rs.next()){
           
          cuent.setId_cuenta(rs.getInt("id_cuenta"));
          cuent.setMonto(rs.getString("monto"));
           cuent.setDescripcion(rs.getString("descripcion"));
           cuent.setNombre(rs.getString("nombre"));
        
       }             
       
      }catch(Exception e){
       }   
          return cuent;
    
    }
      public List ListarCuentasU(String nombre){
      
      String sql="select * from cuentas where nombre=?";
      List<CuentaUsuario>lista= new ArrayList<>(); 
        try{
            
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             ps.setString(1, nombre);
             rs=ps.executeQuery();
             while (rs.next()){
 
                CuentaUsuario cuent = new CuentaUsuario();
                
                cuent.setId_cuenta(rs.getInt(1));
                cuent.setMonto(rs.getString(2));
                cuent.setDescripcion(rs.getString(3));
                cuent.setNombre(rs.getString(4));
              
                       lista.add(cuent);
                       
               }
            }catch(Exception e){
            
            }
            
            return lista;
  
 }  
}
