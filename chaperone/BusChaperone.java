
package visual.chaperone;

import visual.chaperone.AddChap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import visual.HomePage;


public class BusChaperone extends javax.swing.JFrame {

   
    public BusChaperone() {
        initComponents();
        this.dispose();
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showtable1();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BusChaperoneTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BusChaperoneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route id", "Route departure", "Route number", "Employee number", "Name", "Stand by", "Phone number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BusChaperoneTable);
        if (BusChaperoneTable.getColumnModel().getColumnCount() > 0) {
            BusChaperoneTable.getColumnModel().getColumn(0).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(1).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(2).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(3).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(4).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(5).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(6).setResizable(false);
            BusChaperoneTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 987, 563));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 15, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\bus chaperone.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 100));

        Dashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\dashboard.png")); // NOI18N
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Add.png")); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Edit.png")); // NOI18N
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Delete.png")); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        AddChap chap = new AddChap();
        chap.setVisible(true);
    }//GEN-LAST:event_AddMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        int i = BusChaperoneTable.getSelectedRow();
        TableModel mode = BusChaperoneTable.getModel();
        EditChap EC = new EditChap();
        EC.setVisible(true);
        EC.RouteId.setText(mode.getValueAt(i, 0).toString());
        EC.jComboBoxDepEC.setSelectedItem(mode.getValueAt(i, 1).toString());
        EC.RouteNumber.setText(mode.getValueAt(i, 2).toString());
        EC.ChapEN.setText(mode.getValueAt(i, 3).toString());
        EC.ChapName.setText(mode.getValueAt(i, 4).toString());
        EC.ChapStandby.setText(mode.getValueAt(i, 5).toString());
        EC.ChapPhoneNum.setText(mode.getValueAt(i, 6).toString());
        EC.ChapAddress.setText(mode.getValueAt(i, 7).toString());
    }//GEN-LAST:event_EditMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int i = BusChaperoneTable.getSelectedRow();
            TableModel mode = BusChaperoneTable.getModel();
            Connection connection = getConnection();
            String sql = "DELETE FROM bus_chaperone WHERE Route_id_chap='"+mode.getValueAt(i, 0).toString()+"'";
            PreparedStatement ps;
        try {
            int yn = JOptionPane.showConfirmDialog(null, "Delete user ?", "Delete user", JOptionPane.YES_NO_OPTION);
            if (yn == 0){
                ps = connection.prepareStatement(sql);
            updt(sql, "deleted");
            } else {
                
            }
            
        } catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);;
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked
    public Connection getConnection(){
        Connection con;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coba", "root", "");
            return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }   
    public ArrayList<BusChaperoneClass> getuserList() {
          ArrayList<BusChaperoneClass> BusChap = new ArrayList<BusChaperoneClass>();
              Connection connection = getConnection();
              String sql = "select * from bus_chaperone";
              PreparedStatement ps;
              
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            BusChaperoneClass BC;
            while(rs.next()){
                BC = new BusChaperoneClass (rs.getString("Route_id_chap"),rs.getString("Route_departure"),rs.getString("Route_number"),rs.getString("Employee_number"),rs.getString("Name"),rs.getString("Standby"),rs.getString("Phone_number"),rs.getString("Address"));
                BusChap.add(BC);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BusChap;
        }
        
public void showtable1(){
    ArrayList<BusChaperoneClass> BC = getuserList();
    DefaultTableModel model = (DefaultTableModel) BusChaperoneTable.getModel();
    Object [] row = new Object[10];
    for(int i = 0; i < BC.size(); i++)
       {
           row[0] = BC.get(i).getRouteId();
           row[1] = BC.get(i).getRouteDep();
           row[2] = BC.get(i).getRouteNumber();
           row[3] = BC.get(i).getEmpNum();
           row[4] = BC.get(i).getName();
           row[5] = BC.get(i).getChapStandby();
           row[6] = BC.get(i).getChapPhoneNum();
           row[7] = BC.get(i).getChapAddress();
           model.addRow(row);
           
       }
} 
public void updt (String sql, String message) {
        Connection con = getConnection();
         Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(sql)) == 1)
           {
               DefaultTableModel model = (DefaultTableModel) BusChaperoneTable.getModel();
               model.setRowCount(0);
               showtable1(); 
               JOptionPane.showMessageDialog(null, "Data "+message+" succefully");
           } else{
               JOptionPane.showMessageDialog(null, "Data not "+message);
           }
       } catch(Exception ex){
           ex.printStackTrace();
       }
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusChaperone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JTable BusChaperoneTable;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
