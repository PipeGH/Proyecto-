package Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
   Connection con;
   String url="jdbc:postgresql://bw8rm3t2nhq01rclahkg-postgresql.services.clever-cloud.com:5432/bw8rm3t2nhq01rclahkg";
   String user="u4jolviris50x2h2a9gs";
   String pass="roycnj8spAFpr6wQegjB";
   
 public Connection Conexion(){
     try{
         Class.forName("org.postgresql.Driver");
         con=DriverManager.getConnection(url,user,pass);
     }catch(Exception e){
     }
     return con;
 }
}
