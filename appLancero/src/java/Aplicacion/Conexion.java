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
            System.out.println("Driver cargado exitosamente");
        }catch(Exception e){
            System.out.println("Driver no pudo ser cargado");
        }
    }
    public void conectarBaseDatos(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/el_lancero", "root", "DBD2");
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
    
    public admin consultarAdmin(String Usuario, String Contrasena){
        Statement stmt=null; 
        ResultSet rs=null; 
        admin Admin=null; 
        conectarBaseDatos(); 
        try{
            String sql="SELECT * FROM persona WHERE usuario='"+Usuario+"' AND contrasena='"+Contrasena+"'";
            stmt=(Statement) conn.createStatement(); 
            rs=stmt.executeQuery(sql); 
            
            while (rs.next()){
               Admin.setUsuario(rs.getString("Usuario"));
               Admin.setcontrasena(rs.getString("Contrasena"));
            }
        } catch(SQLException ex){
            ex.getMessage();
        } finally{
           try{ 
                if (rs != null) rs.close(); 
                if (stmt != null) stmt.close(); 
                if (conn != null) conn.close(); 
            }catch (SQLException ex){ 
            }  
        }
        return Admin;
    }
    
}
