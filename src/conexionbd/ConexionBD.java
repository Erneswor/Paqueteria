/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ERNESTO GARCIA
 */
public class ConexionBD {

    private Connection con;

    public ConexionBD() {
        this("paqueteria");
    }
    
     public ConexionBD(String dbName){
         try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("Driver Cargando Correctamente");
             con= DriverManager.getConnection("jdbc:mysql://Localhost:3306/"+dbName, "root", "");
             System.out.println("Coneccion establecidad con exito");
             
         } catch(ClassNotFoundException | SQLException e){
             System.out.println("Error al cargar los diriver");
             e.printStackTrace();
         }
         
     }
     
     public Connection conexion(){
         return con;
     }
    
    
}
