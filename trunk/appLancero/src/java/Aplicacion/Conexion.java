/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;
import java.sql.*;
/**
 *
 * @author Reyes
 */
public class Conexion {
    Connection conn = null;

    public Conexion(){
        cargarDriver();
}
    public void cargarDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drver cargado exitosamente");
        }catch(Exception e){
            System.out.println("Drver no pudo ser cargado");
        }
    }
    public void conectarBaseDatos(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/el_lancero", "root", "Hola2013");
            System.out.println("Conexion satisfactoria a la base de datos");
        }catch(Exception e){
            System.out.println("Conexion a la base de datos no se pudo establecer");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.conectarBaseDatos();
    }
    
}
