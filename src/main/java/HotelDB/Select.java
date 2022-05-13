/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelDB;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Zero1
 */
public class Select {
    public static ResultSet getData(String query){
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
         try
        {
            con=ConnectionProvider.getCon(); 
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
       
    }
}
