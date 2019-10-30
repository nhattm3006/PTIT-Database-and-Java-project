/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MySQLConnUtils;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Computer;

/**
 *
 * @author minhn
 */
public class AddComDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddComDialog
     */
    public AddComDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add computer");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel1.setText("Area");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel3.setText("Using by");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thuong", "VIP", "Hut thuoc", "Thi dau", "Streaming" }));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mainten", "in use", "not in use" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int area;
        String stt, acc_name;
        
        area = jComboBox1.getSelectedIndex() + 1;
        stt = (String)jComboBox2.getSelectedItem();
        acc_name = jTextField1.getText().trim();
        
        try {
            Vector<Computer> list = getComputersFromDB();
            if (stt.equals("in use") && !acc_name.equals(null) && checkComExist(acc_name, list) == true) {
                jLabel4.setText("account now using another computer");
                jLabel4.setForeground(Color.red);
            }
            else if (stt.equals("in use") && acc_name.equals(null)) {
                jLabel4.setText("in use computer must has an account");
                jLabel4.setForeground(Color.red);
            }
            else if (!stt.equals("in use") && !acc_name.equals(null)) {
                jLabel4.setText("mainten/not in use require null account");
                jLabel4.setForeground(Color.red);
            }
            else {
                try {
                    addCom(area, stt, acc_name);
                } catch (SQLException ex) {
                    Logger.getLogger(AddAccDialog.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddAccDialog.class.getName()).log(Level.SEVERE, null, ex);
                }

                dispose();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddAccDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addCom(int area, String stt, String acc_name) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String query1 = "insert into computer(area_id, stt) values(?, ?)";
        String query2 = "insert into computer(area_id, stt, acc_id) values(?, ?, ?)";
        
        if (acc_name.equals(null)) {
            PreparedStatement pstm = conn.prepareStatement(query1);
            pstm.setInt(1, area);
            pstm.setString(2, stt);
            pstm.execute();
        }
        else {
            PreparedStatement pstm = conn.prepareStatement(query2);
            pstm.setInt(1, area);
            pstm.setString(2, stt);
            pstm.setInt(3, getAccId(acc_name));
            pstm.execute();
        }
        
        conn.close();
    }
    
    private int getAccId(String acc_name) throws ClassNotFoundException {
        int id = 0;
        Vector<Account> list = getAccountsFromDB();
        
        for (int i = 0; i < list.size(); i++) {
            Account account = (Account)list.get(i);
            if (acc_name.equals(account.getName()))
                return account.getId();
        }
        return id;
    }
    
    private Vector<Account> getAccountsFromDB() throws ClassNotFoundException{
        try {
            // Connect to database
            Connection conn = MySQLConnUtils.getMySQLConnection();
            
            // MySQL statement & result
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM acc");
            ResultSetMetaData rsmd = rs.getMetaData();
            
            Vector<Account> accList = new Vector<Account>();
            while (rs.next()) {
                Account acc = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
                accList.add(acc);
            }
            conn.close();
            
            return accList;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    private Vector<Computer> getComputersFromDB() throws ClassNotFoundException{
        try {
            // Connect to database
            Connection conn = MySQLConnUtils.getMySQLConnection();
            
            // MySQL statement & result
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id, (select area_name from com_area where com_area.id = computer.area_id), stt, (select acc_name from acc where acc.id = computer.acc_id) from computer");
            ResultSetMetaData rsmd = rs.getMetaData();
            
            Vector<Computer> comList = new Vector<Computer>();
            while (rs.next()) {
                Computer com = new Computer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                comList.add(com);
            }
            conn.close();
            
            return comList;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    private boolean checkComExist(String acc_name, Vector<Computer> list) {
        for (int i = 0; i < list.size(); i++) {
            Computer computer = (Computer)list.get(i);
            if (acc_name.equals(computer.getAcc()))
                return true;
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(AddComDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddComDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddComDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddComDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddComDialog dialog = new AddComDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
