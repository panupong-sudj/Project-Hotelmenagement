/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelDB;

import java.sql.*;
import javax.swing.JOptionPane;
public class Tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table user(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),Status varchar(20))");
            st.executeUpdate("create table room (roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,Status varchar(20))");
            st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),adress varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerday int(10),numberofDaysStay int(10),totalAmount varchar(200),checkOut varchar(50))");
            JOptionPane.showMessageDialog(null, "table created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
           try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {}
        }
    }
    
}
