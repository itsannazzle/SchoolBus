
package visual.route;

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



public class BusRoute extends javax.swing.JFrame {
        
 
    public BusRoute() {
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
        BusRouteTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RouteLetter = new javax.swing.JComboBox<>();
        jComboBoxRtime = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("BusRoute"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BusRouteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route id", "User id", "Route departure", "Route number", "Name", "Class", "Address", "Activity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BusRouteTable);
        if (BusRouteTable.getColumnModel().getColumnCount() > 0) {
            BusRouteTable.getColumnModel().getColumn(0).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(1).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(2).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(3).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(4).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(5).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(6).setResizable(false);
            BusRouteTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 983, 642));

        jLabel5.setText("Sort by : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel1.setText("Route number :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        RouteLetter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RouteLetter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D", "3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D", "5A", "5B", "5C", "5D", "6A", "6B", "6C", "6D", "6E", "7A", "7B", "7C", "7D", "8A", "8B", "8C", "8D", "9A", "9B", "9C", "9D" }));
        jPanel1.add(RouteLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 42, -1));

        jComboBoxRtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM 1:45", "PM 2:45", "PM 3:45", "PM 4:45" }));
        jPanel1.add(jComboBoxRtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 117, -1, -1));

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\bus route.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 100));

        Dashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\dashboard.png")); // NOI18N
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Delete.png")); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Edit.png")); // NOI18N
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int i = BusRouteTable.getSelectedRow();
            TableModel mode = BusRouteTable.getModel();
            Connection connection = getConnection();
            String sql = "DELETE FROM coba_user_route WHERE User_route_id='"+mode.getValueAt(i,0).toString()+"'";
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

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        int i = BusRouteTable.getSelectedRow();
        TableModel mode = BusRouteTable.getModel();
        EditRoute er = new EditRoute();
        er.setVisible(true);
        er.UserId.setText(mode.getValueAt(i, 1).toString());
        er.jComboBoxDep.setSelectedItem(mode.getValueAt(i, 2).toString());
        er.RouteNumber.setText(mode.getValueAt(i, 3).toString());
        er.RouteId.setText(mode.getValueAt(i, 0).toString());
        er.jComboBoxActivity.setSelectedItem(mode.getValueAt(i, 7).toString());
    }//GEN-LAST:event_EditMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
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
     public ArrayList<busrouteclass> getuserList() {
          ArrayList<busrouteclass> BR = new ArrayList<busrouteclass>();
              Connection connection = getConnection();
              String sql = "SELECT * FROM `coba_user_route`";
              PreparedStatement ps;
              
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            busrouteclass brc;
            while(rs.next()){
                brc = new busrouteclass (rs.getString("User_route_id"),rs.getString("User_id"),rs.getString("Route_departure"),rs.getString("Route_number"),rs.getString("Name"),rs.getString("Class"),rs.getString("Address"),rs.getString("Activity"));
                BR.add(brc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BR;
        }
        
public void showtable1(){
    ArrayList<busrouteclass> BR = getuserList();
    DefaultTableModel model = (DefaultTableModel) BusRouteTable.getModel();
    Object [] row = new Object[12];
    for(int i = 0; i < BR.size(); i++)
       {
           row[0] = BR.get(i).getRouteId();
           row[1] = BR.get(i).getUserId();
           row[2] = BR.get(i).getRouteDep();
           row[3] = BR.get(i).getRouteNumber();
           row[4] = BR.get(i).getName();
           row[5] = BR.get(i).getCls();
           row[6] = BR.get(i).getAddress();
           row[7] = BR.get(i).getAct();
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
               DefaultTableModel model = (DefaultTableModel) BusRouteTable.getModel();
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
                new BusRoute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BusRouteTable;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Edit;
    private javax.swing.JComboBox<String> RouteLetter;
    private javax.swing.JComboBox<String> jComboBoxRtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
