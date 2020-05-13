package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.CuentaUsuario;

public class CuentaDAO {
   
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   
   public Cuenta Validar(int id_cuenta){
   Cuenta cu =new Cuenta();
   String sql="select *from cuentas where  id_cuenta=?";
   try{
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setInt(1, id_cuenta);
       rs=ps.executeQuery();
       
       while(rs.next()){
           
          cu.setId_cuenta(rs.getInt("id_cuenta"));
          cu.setMonto(rs.getString("monto"));
           cu.setDescripcion(rs.getString("descripcion"));
         
          
       }             
       
      }catch(Exception e){
       }   
          return cu;
    
    }
   
  //Operaciones CRUD
   
   public List listar(){
      String sql="select * from cuentas";
      List<Cuenta>lista= new ArrayList<>(); 
        try{
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                 Cuenta cu = new Cuenta();
                
                cu.setId_cuenta(rs.getInt(1));
                cu.setMonto(rs.getString(2));
                cu.setDescripcion(rs.getString(3));
                cu.setNombre(rs.getString(4));
                
                
                       lista.add(cu);
             
               }
            }catch(Exception e){
            }
            
            return lista;
        }
        public int agregar(Cuenta cu){
            String sql="insert into cuentas(id_cuenta,monto,descripcion,nombre)values(?,?,?,?)";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cu.getId_cuenta());
            ps.setString(2, cu.getMonto());
            ps.setString(3, cu.getDescripcion());
            ps.setString(4, cu.getNombre());
            
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
        }
        public Cuenta listarId(int id_cuenta){
        Cuenta cuen =new Cuenta();
        String sql="select * from cuentas where id_cuenta="+id_cuenta;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
            cuen.setId_cuenta(rs.getInt(1));
            cuen.setMonto(rs.getString(2));
            cuen.setDescripcion(rs.getString(3));
            cuen.setNombre(rs.getString(4));
          
            
            }
        }catch(Exception e){
            System.out.println(e.toString());
            
        }
        return cuen;
        }
        public int actualizar(Cuenta cu){
        String sql="update cuentas set monto=?, descripcion=?, nombre=? where id_cuenta=?";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, cu.getMonto());
            ps.setString(2, cu.getDescripcion());
            ps.setString(3, cu.getNombre());
            ps.setInt(4, cu.getId_cuenta());
            
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
      }
        public void eliminar(int id_cuenta){
            String sql="delete from cuentas where id_cuenta="+id_cuenta;
            try{
                con=cn.Conexion();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
            }
        
        }
     
}

 


        
  

  
	