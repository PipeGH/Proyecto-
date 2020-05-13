
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VisitaDAO {
    Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   
   public Visita Validar(int id_visita){
   Visita vis =new Visita();
   String sql="select *from visitas where  id_visita=?";
   try{
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setInt(1, id_visita);
       rs=ps.executeQuery();
       
       while(rs.next()){
           
          vis.setId_visita(rs.getInt("id_visita"));
          vis.setId_invitado(rs.getInt("id_invitado"));
          vis.setFecha(rs.getString("fecha"));
         
          
       }             
       
      }catch(Exception e){
       }   
          return vis;
    
    }
   
  //Operaciones CRUD
   
   public List listar(){
      String sql="select * from visitas";
      List<Visita>lista= new ArrayList<>(); 
        try{
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                 Visita vis = new  Visita();
                
                vis.setId_visita(rs.getInt(1));
                vis.setId_invitado(rs.getInt(2));
                vis.setFecha(rs.getString(3));
                
                
                
                       lista.add(vis);
             
               }
            }catch(Exception e){
            }
            
            return lista;
        }
        public int agregar(Visita vis){
            String sql="insert into visitas(id_visita,id_invitado,fecha)values(?,?,?)";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, vis.getId_visita());
            ps.setInt(2, vis.getId_invitado());
            ps.setString(3, vis.getFecha());
         
            
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
        }
        public Visita listarId(int id_visita){
        Visita visi =new Visita();
        String sql="select * from visitas where id_visita="+id_visita;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
            visi.setId_visita(rs.getInt(1));
            visi.setId_visita(rs.getInt(2));
            visi.setFecha(rs.getString(3));
            
          
            
            }
        }catch(Exception e){
            System.out.println(e.toString());
            
        }
        return visi;
        }
        public int actualizar(Visita vis){
        String sql="update visitas set id_invitado=?, fecha=? where id_visita=?";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
          
            ps.setInt(1, vis.getId_invitado());
            ps.setString(2,vis.getFecha());
            ps.setInt(2, vis.getId_visita());
            
            ps.executeUpdate();
            }catch(Exception e){
            }
            return r;
      }
        public void eliminar(int id_visita){
            String sql="delete from visitas where id_visita="+id_visita;
            try{
                con=cn.Conexion();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
            }
        
  }
}
