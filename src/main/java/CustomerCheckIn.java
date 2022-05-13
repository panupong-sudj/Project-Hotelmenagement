import HotelDB.InsertUpdateDelete;
import HotelDB.Select;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Windows-10
 */
public class CustomerCheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckIN
     */
    public CustomerCheckIn() {
        initComponents();
        jTextField5.setEditable(false);
        jTextField8.setEditable(false);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        jTextField5.setText(myFormat.format(cal.getTime()));
    }
    String bed;
    String roomType;
    String roomNo;
    String price;
    
    public void roomDetails() {
        jComboBox4.removeAllItems();
        jTextField8.setText("");
        bed = (String)jComboBox2.getSelectedItem();
        roomType = (String)jComboBox3.getSelectedItem();
        try {
            ResultSet rs = Select.getData("select *from room where bed='"+bed+"'and roomType='" +roomType+"' and Status='Not Booked'");
            while (rs.next()){
                jComboBox4.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(65, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Customer Check IN");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 100));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\hotelmanagement\\src\\images\\exit.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Name");
        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 135, 350, -1));

        jTextField1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 246, 350, -1));

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Mobile Number");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 211, 350, -1));

        jTextField2.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 170, 350, -1));

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Gender");
        jLabel4.setAutoscrolls(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 365, -1, -1));

        jTextField3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 484, 350, -1));

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Nationlity");
        jLabel5.setAutoscrolls(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 287, 350, -1));

        jComboBox1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jComboBox1.setAutoscrolls(true);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 400, 350, -1));

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Email");
        jLabel6.setAutoscrolls(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 441, -1, -1));

        jTextField4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 322, 350, -1));

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Check IN Date (Today)");
        jLabel7.setAutoscrolls(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 287, 350, -1));

        jTextField5.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 322, 350, -1));

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("ID Proof");
        jLabel8.setAutoscrolls(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 135, 350, -1));

        jTextField6.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 246, 350, -1));

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("Address");
        jLabel9.setAutoscrolls(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 211, 350, -1));

        jTextField7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 255, 255));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 170, 350, -1));

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Bed");
        jLabel10.setAutoscrolls(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 135, -1, -1));

        jComboBox2.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        jComboBox2.setAutoscrolls(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 170, 350, -1));

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Room Type");
        jLabel11.setAutoscrolls(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 211, -1, -1));

        jComboBox3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 204, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-Ac" }));
        jComboBox3.setAutoscrolls(true);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 246, 350, -1));

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Room Number");
        jLabel12.setAutoscrolls(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 287, -1, -1));

        jComboBox4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 255, 255));
        jComboBox4.setAutoscrolls(true);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 322, 350, -1));

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Price");
        jLabel13.setAutoscrolls(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 365, 350, -1));

        jTextField8.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 255, 255));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 400, 350, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Clear");
        jButton3.setAutoscrolls(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 130, -1));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Allote Room");
        jButton4.setAutoscrolls(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);        
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int id = 1;
        String name = jTextField2.getText();
        String moblieNumber = jTextField1.getText();
        String nationality = jTextField4.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        String email = jTextField3.getText();
        String idProof = jTextField7.getText();
        String adress = jTextField6.getText();
        String checkIN  = jTextField5.getText();
        String bed = (String)jComboBox2.getSelectedItem();
        String roomType = (String)jComboBox3.getSelectedItem(); 
        String roomNo = (String)jComboBox4.getSelectedItem();
        String price = jTextField8.getText();
        String Query = "select max(id) from customer";
        try{
            ResultSet rs = Select.getData(Query);
            while(rs.next()){
               id = rs.getInt(1);
               id += 1;
               if(!price.equals("")){
                   Query = "update room set status='Booked' where roomNo='"+roomNo+"'";
                   InsertUpdateDelete.setData(Query,"");
                   Query = "insert into customer(id,name,mobileNumber,nationality,gender,email,idProof,adress,checkIn,roomNo,bed,roomType,pricePerday)values("+id+",'"+name+"','"+moblieNumber+"','"+nationality+"','"+gender+"','"+email+"','"+idProof+"','"+adress+"','"+checkIN+"','"+roomNo+"','"+bed+"','"+roomType+"','"+price+"')";
                   InsertUpdateDelete.setData(Query,"Customer Check IN Successfully");
                   setVisible(false);
                   new CustomerCheckIn().setVisible(true);
            }
               
                   
               }
                   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        roomDetails();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        roomDetails();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        roomNo = (String) jComboBox4.getSelectedItem();
        try {
            ResultSet rs = Select.getData("select *from room where roomNo='"+roomNo+"'");
            while (rs.next()) {    
                jTextField8.setText(rs.getString(4));  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
