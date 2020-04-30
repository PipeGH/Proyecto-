package Modelo;

import Config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InmuebleDAO {
    
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   
   public Inmueble Validar(String id){
   Inmueble inmueb =new Inmueble();
   String sql="select *from inmuebles where  id_inmueble=?";
   try{
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setString(1, id);
       rs=ps.executeQuery();
       
       while(rs.next()){
           
          inmueb.setId(rs.getString("id"));
          inmueb.setEstado(rs.getString("estado"));
           inmueb.setTipo(rs.getString("tipo"));
          inmueb.setId_usuario(rs.getInt("id_usuario"));
          inmueb.setId_cuenta(rs.getInt("id_cuenta"));
          
       }             
       
      }catch(Exception e){
       }   
          return inmueb;
    
    }
   
  //Operaciones CRUD
   
   public List listar(){
      String sql="select * from inmuebles";
      List<Inmueble>lista= new ArrayList<>(); 
        try{
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                 Inmueble inmueb = new Inmueble();
                
                 inmueb.setId(rs.getString(1));
                inmueb.setEstado(rs.getString(2));
                inmueb.setTipo(rs.getString(3));
                inmueb.setId_usuario(rs.getInt(4));
                inmueb.setId_cuenta(rs.getInt(5));
                
                       lista.add(inmueb);
             
               }
            }catch(Exception e){
            }
            
            return lista;
        }
        public int agregar(Inmueble inmueb){
            String sql="insert into inmuebles(id_inmueble,estado,tipo,id_usuario,id_cuenta)values(?,?,?,?,?)";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, inmueb.getId());
            ps.setString(2, inmueb.getEstado());
            ps.setString(3, inmueb.getTipo());
            ps.setInt(4, inmueb.getId_usuario());
            ps.setInt(5, inmueb.getId_cuenta());
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
        }
        public Inmueble listarId(String id){
        Inmueble inm =new Inmueble();
        String sql="select * from inmuebles where id_inmueble='"+id+"'";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
            inm.setId(rs.getString(1));
            inm.setEstado(rs.getString(2));
            inm.setTipo(rs.getString(3));
            inm.setId_usuario(rs.getInt(4));
            inm.setId_cuenta(rs.getInt(5));
            
            }
        }catch(Exception e){
            System.out.println(e.toString());
            
        }
        return inm;
        }
        public int actualizar(Inmueble inmueb){
        String sql="update inmuebles set estado=?, tipo=?, id_usuario=?,id_cuenta=?  where id_inmueble=?";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, inmueb.getEstado());
            ps.setString(2, inmueb.getTipo());
            ps.setInt(3, inmueb.getId_usuario());
            ps.setInt(4, inmueb.getId_cuenta());
            ps.setString(5, inmueb.getId());
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
      }
        public void eliminar(String id){
            String sql="delete from inmuebles where id_inmueble='"+id+"'";
            try{
                con=cn.Conexion();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
            }
        
  }
}

