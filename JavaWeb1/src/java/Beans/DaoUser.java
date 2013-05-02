/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import beans.Dao;
import java.sql.*;

/**
 *
 * @author Mario
 */
public class DaoUser extends Dao {
   
   
    public String getNameByEmail(String email) throws SQLException{
        String sql = "SELECT * FROM usuarios WHERE email='"+email+"'";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
       
        if(rs.next()){
            return rs.getString("name");
        }
       
        return null;
    }
}
