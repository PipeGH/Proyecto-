package Modelo;

import Config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   
   public Usuario Validar(String nombre, int id){
   Usuario us=null;
   String sql="select * from usuarios where nombre=? and id_usuario=?";
   try{
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setString(1,nombre);
       ps.setInt(2, id);
       rs=ps.executeQuery();
       
       while(rs.next()){
          us=new Usuario(); 
          us.setId(rs.getInt("id_usuario"));
          us.setNombre(rs.getString("nombre"));
          us.setApellido(rs.getString("apellido"));
          us.setTelefono(rs.getString("telefono"));
          us.setEmail(rs.getString("email"));
          us.setNivel(rs.getInt("nivel"));
       }
       
      }catch(Exception e){
       }   
          return us;
    
    }
   
  //Operaciones CRUD
   
   public List listar(){
      String sql="select * from usuarios";
      List<Usuario>lista= new ArrayList<>(); 
        try{
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                 Usuario us = new Usuario();
                 us.setId(rs.getInt(1));
                 us.setNombre(rs.getString(2));
                 us.setApellido(rs.getString(3));
                 us.setTelefono(rs.getString(4));
                 us.setEmail(rs.getString(5));
                 us.setNivel(rs.getInt(6));
                 lista.add(us);
             
               }
            }catch(Exception e){
            }
            
            return lista;
        }
        public int agregar(Usuario us){
            String sql="insert into usuarios(id_usuario,nombre,apellido,telefono,email,nivel)values(?,?,?,?,?,?)";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, us.getId());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getApellido());
            ps.setString(4, us.getTelefono());
            ps.setString(5, us.getEmail());
            ps.setInt(6, us.getNivel());
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
        }
        public Usuario listarId(int id){
        Usuario usu =new Usuario();
        String sql="select * from usuarios where id_usuario="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
            usu.setId(rs.getInt(1));
            usu.setNombre(rs.getString(2));
            usu.setApellido(rs.getString(3));
            usu.setTelefono(rs.getString(4));
            usu.setEmail(rs.getString(5));
            usu.setNivel(rs.getInt(6));
            
            }
        }catch(Exception e){
        }
        return usu;
        }
        public int actualizar(Usuario us){
        String sql="update usuarios set nombre=?,apellido=?,telefono=?,email=?,nivel=?  where id_usuario=?";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getApellido());
            ps.setString(3, us.getTelefono());
            ps.setString(4, us.getEmail());
             ps.setInt(5, us.getNivel());
            ps.setInt(6, us.getId( ));
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
      }
        public void eliminar(int id){
            String sql="delete from usuarios where id_usuario="+id;
            try{
                con=cn.Conexion();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
            }
  }

   
}