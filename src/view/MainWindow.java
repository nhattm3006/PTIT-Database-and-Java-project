package view;

import controller.MySQLConnUtils;
import model.Account;
import model.Computer;
import model.Goods;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends javax.swing.JFrame {
    private DefaultTableModel model;
    
    public MainWindow() throws ClassNotFoundException {
        initComponents();   // Drag & Drop
        
        // Load data to tables
        loadDataIntoJTable1();
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
        jTable1.setRowHeight(50);
        loadDataIntoJTable2();
        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
        jTable2.setRowHeight(50);
        loadDataIntoJTable3();
        jTable3.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
        jTable3.setRowHeight(50);
//        loadDataIntoJTable4();
//        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
//        jTable2.setRowHeight(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gaming Center Management");
        setResizable(false);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Computer", jPanel1);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Account", jPanel2);

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Goods", jPanel3);

        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Order", jPanel4);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText(" Add ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem1.setText("Add account");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem4.setText("Add computer");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem10.setText("Add goods");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem11.setText("Add order");
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu5.setText(" Search ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem6.setText("Seach account");
        jMenu5.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem5.setText("Search computer");
        jMenu5.add(jMenuItem5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem8.setText("Search goods");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem9.setText("Search order");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    // Click: Add -> Add goods (Press: Alt + T)
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        AddGoodsDialog agd = new AddGoodsDialog(this, true);
        agd.setVisible(true);
        try {
            loadDataIntoJTable3();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AddAccDialog aad = new AddAccDialog(this, true);
        aad.setVisible(true);
        try {
            loadDataIntoJTable1();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main() {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    private void loadDataIntoJTable1() throws ClassNotFoundException {
        model = new DefaultTableModel();
        
        // Set Column Title
        Vector column = new Vector();
        column.add("Account ID");
        column.add("Account Name");
        column.add("Password");
        column.add("Date created");
        column.add("Money");
        model.setColumnIdentifiers(column);
        
        // Set row value
        Vector<Account> list = getAccountsFromDB();
        for (int i = 0; i < list.size(); i++) {
            Account account = (Account)list.get(i);
            Vector row = new Vector();
            row.add(account.getId());
            row.add(account.getName());
            row.add(account.getPasswd());
            row.add(account.getDateCreated());
            row.add(account.getMoney());
            model.addRow(row);
        }

        jTable1.setModel(model);
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
    
    private void loadDataIntoJTable2() throws ClassNotFoundException {
        model = new DefaultTableModel();
        
        // Set column title
        Vector column = new Vector();
        column.add("Computer ID");
        column.add("Area");
        column.add("Status");
        column.add("Account ID");
        model.setColumnIdentifiers(column);
        
        // Set row value
        Vector<Computer> list = getComputersFromDB();
        for (int i = 0; i < list.size(); i++) {
            Computer computer = (Computer)list.get(i);
            
            Vector row = new Vector();
            row.add(computer.getId());
            row.add(computer.getArea());
            row.add(computer.getStt());
            row.add(computer.getAcc());
            
            model.addRow(row);
        }
        
        jTable2.setModel(model);
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
    
    private void loadDataIntoJTable3() throws ClassNotFoundException {
        model = new DefaultTableModel();
        
        // Set column title
        Vector column = new Vector();
        column.add("Goods ID");
        column.add("Goods name");
        column.add("Type");
        column.add("Unit");
        column.add("Price");
        column.add("Stock");
        model.setColumnIdentifiers(column);
        
        // Set row value
        Vector<Goods> list = getGoodsFromDB();
        for (int i = 0; i < list.size(); i++) {
            Goods goods = (Goods)list.get(i);
            Vector row = new Vector();
            row.add(goods.getId());
            row.add(goods.getName());
            row.add(goods.getType());
            row.add(goods.getUnit());
            row.add(goods.getPrice());
            row.add(goods.getStock());
            model.addRow(row);
        }

        jTable3.setModel(model);
    }
    
    private Vector<Goods> getGoodsFromDB() throws ClassNotFoundException{
        try {
            // Connect to database
            Connection conn = MySQLConnUtils.getMySQLConnection();
        
            // MySQL statement & result
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id, goods_name, (select type_name from type_of_goods where type_of_goods.id = goods.type_id) as 'type', unit, price, stock from goods");
            ResultSetMetaData rsmd = rs.getMetaData();
            
            Vector<Goods> goodsList = new Vector<Goods>();
            while (rs.next()) {
                Goods goods = new Goods(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6));
                goodsList.add(goods);
            }
            conn.close();
            
            return goodsList;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
