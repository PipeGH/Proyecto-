package Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
   Connection con;
   String url="jdbc:postgresql://node48061-setware1.jelastic.saveincloud.net:5432/Conjunto";
   String user="webadmin";
   String pass="ETZxdg55386";
 public Connection Conexion(){
     try{
         Class.forName("org.postgresql.Driver");
         con=DriverManager.getConnection(url,user,pass);
     }catch(Exception e){
     }
     return con;
 }
}
