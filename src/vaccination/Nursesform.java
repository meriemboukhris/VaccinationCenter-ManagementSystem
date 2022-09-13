/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vaccination;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Nursesform extends javax.swing.JInternalFrame {

    /**
     * Creates new form Nursesform
     */
    public Nursesform() {
        initComponents();
        table_update();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        Connection con1;
        PreparedStatement insert;
        DefaultTableModel d;
        
        private void table_update(){
            int c;
            try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/vaccination", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
            }
            insert = con1.prepareStatement("SELECT * FROM nurses");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c= Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
            Df.setRowCount(0);
            
            while(rs.next()){
                Vector v2= new Vector();
                
                for (int i=1; i<=c; i++){
                    v2.add(rs.getString("indexx"));
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Fname"));
                    v2.add(rs.getString("room"));
                    v2.add(rs.getString("wdays"));
                }
                Df.addRow(v2);
                
            }
            
            
            
            
            
            idtxt.setText("");
            nametxt.setText("");
            roomtxt.setText("");
            worktxt.setText("");
            idtxt.requestFocus();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
        }
           catch (SQLException ex){
               Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        roomtxt = new javax.swing.JTextField();
        worktxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 253, 252));

        jPanel1.setBackground(new java.awt.Color(252, 253, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(982, 491));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 27, 27));
        jLabel1.setText("Nurses Management ");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 27, 27));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 27, 27));
        jLabel3.setText("FULL NAME");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 27, 27));
        jLabel4.setText("ROOM");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel5.setText("WORKING DAYS");

        jButton1.setBackground(new java.awt.Color(233, 249, 219));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(29, 27, 27));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(183, 201, 169));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(29, 27, 27));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(183, 201, 169));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(29, 27, 27));
        jButton3.setText("EDIT");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(252, 253, 252));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(45, 44, 44));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "indexx", "NURSE ID", "FULL NAME", "ROOM", "WORKING DAYS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionBackground(new java.awt.Color(183, 201, 169));
        jTable2.setSelectionForeground(new java.awt.Color(252, 253, 252));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\TBS2022\\JAVA\\Projet\\kyc.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(worktxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(roomtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nametxt, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(worktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id= idtxt.getText();
        String Fname= nametxt.getText();
        String room=roomtxt.getText();
        String wdays= worktxt.getText();
        
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/vaccination", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
            }
            insert = con1.prepareStatement("INSERT INTO nurses(ID, Fname, room, wdays) values (?, ?, ?, ?)");
            insert.setString(1,id);
            insert.setString(2,Fname);
            insert.setString(3, room);
            insert.setString(4, wdays);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Nurse timetable successfully added");
            table_update();
            idtxt.setText("");
            nametxt.setText("");
            roomtxt.setText("");
            worktxt.setText("");
            idtxt.requestFocus();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
        }
           catch (SQLException ex){
               Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
           }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    int selectedIndex = jTable2.getSelectedRow();
        
    idtxt.setText(model.getValueAt(selectedIndex, 1).toString());
    nametxt.setText(model.getValueAt(selectedIndex, 2).toString());
    roomtxt.setText(model.getValueAt(selectedIndex, 3).toString());
    worktxt.setText(model.getValueAt(selectedIndex, 4).toString());
       
       
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
        int selectedIndex= jTable2.getSelectedRow();
       
         try {
             int indexx= Integer.parseInt((Df.getValueAt(selectedIndex, 0).toString()));
            String id = idtxt.getText();
            String Fname=nametxt.getText();
            String room=roomtxt.getText();
            String wdays= worktxt.getText();
             
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/vaccination", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
            }
            insert = con1.prepareStatement("UPDATE nurses set id= ?, Fname= ?, room=?, wdays=? where indexx=?");
            insert.setString(1,id);
            insert.setString(2,Fname);
            insert.setString(3, room);
            insert.setString(4, wdays);
            insert.setInt(5, indexx);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Updated");
            
            idtxt.setText("");
            nametxt.setText("");
            roomtxt.setText("");
            worktxt.setText("");
            table_update();
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
        }
           catch (SQLException ex){
               Logger.getLogger(Nursesform.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
          int selectedIndex = jTable2.getSelectedRow();
            try {  
                
            int indexx = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to delete this record","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/vaccination","root","");
            insert = con1.prepareStatement("delete from nurses where indexx = ?");
        
            insert.setInt(1,indexx);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully deleted record");
            idtxt.setText("");
            nametxt.setText("");
            roomtxt.setText("");
            worktxt.setText("");
 
            table_update();
          
           }
 
        } catch (ClassNotFoundException ex) {
        
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField roomtxt;
    private javax.swing.JTextField worktxt;
    // End of variables declaration//GEN-END:variables
}
