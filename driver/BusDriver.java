package visual.driver;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import visual.Dashboard;


public class BusDriver extends javax.swing.JFrame {

    public BusDriver() {
        initComponents();
        this.dispose();
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserTable();
        BusDriverTable.getTableHeader().setFont(new Font("Sergoe UI", Font.BOLD,13));
        BusDriverTable.getTableHeader().setOpaque(false);
        BusDriverTable.getTableHeader().setBackground(new Color(255,204,255));
        BusDriverTable.getTableHeader().setForeground(Color.black);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxRtime = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BusDriverTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxRtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM1", "PM2", "PM3", "PM4" }));
        jPanel1.add(jComboBoxRtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel5.setText("Sort by : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Sort.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        BusDriverTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BusDriverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route id", "Employee number", "Route departure", "Route number", "Bus number", "Bus driver", "Phone number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        BusDriverTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BusDriverTable.setRowHeight(25);
        BusDriverTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        BusDriverTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(BusDriverTable);
        if (BusDriverTable.getColumnModel().getColumnCount() > 0) {
            BusDriverTable.getColumnModel().getColumn(0).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(1).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(2).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(3).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(4).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(5).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(6).setResizable(false);
            BusDriverTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 1090, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 15, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\bus driver.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        Dashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\dashboard.png")); // NOI18N
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Add.png")); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Edit.png")); // NOI18N
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Delete.png")); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 205, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\search.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("<html> <u><i>Clear</u></i><html>");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 160, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 860));

        pack();
    }// </editor-fold>                        

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
    }                                    

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {                                 
        AddDriver ad = new AddDriver();
        ad.setVisible(true);
    }                                
 public static void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)BusDriverTable.getModel();
        model.addRow(dataRow);
        
    } 
    private void EditMouseClicked(java.awt.event.MouseEvent evt) {                                  
        int i = BusDriverTable.getSelectedRow();
        TableModel mode = BusDriverTable.getModel();
        EditDriver ED = new EditDriver();
        ED.setVisible(true);
        ED.RouteId.setText(mode.getValueAt(i, 0).toString());
        ED.EmpNumEdit.setText(mode.getValueAt(i, 1).toString());
        ED.jComboBoxDepED.setSelectedItem(mode.getValueAt(i, 2).toString());
        ED.RouteNUMBER.setText(mode.getValueAt(i, 3).toString());
        ED.Busnumber.setText(mode.getValueAt(i, 4).toString());
        ED.BusDriverEdit.setText(mode.getValueAt(i, 5).toString());
        ED.DriverPhoneNumEdit.setText(mode.getValueAt(i, 6).toString());
        ED.DriverAddressEdit.setText(mode.getValueAt(i, 7).toString());
    }                                 

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {                                    
        int i = BusDriverTable.getSelectedRow();
            TableModel mode = BusDriverTable.getModel();
            Connection connection = getConnection();
            String sql = "DELETE FROM bus_driver WHERE Route_id_driver='"+mode.getValueAt(i,0).toString()+"'";
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
    }                                   

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {                                       
        Dashboard hp = new Dashboard();
        hp.setVisible(true);
        this.dispose();
    }                                      

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
       UserTable();
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Search.setText("");
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     

        ArrayList<BusDriverClass> BR = Sort((String) jComboBoxRtime.getSelectedItem());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Route id","Employee number","Route departure","Route number","Bus number","Name","Phone_number","Address"});
        Object[] row = new Object[10];

        for(int i = 0; i < BR.size(); i++)
        {
            row[0] = BR.get(i).getRouteId();
            row[1] = BR.get(i).getempnum();
            row[2] = BR.get(i).getRouteDep();
            row[3] = BR.get(i).getRouteNumber();
            row[4] = BR.get(i).getBusNumber();
            row[5] = BR.get(i).getBusDriver();
            row[6] = BR.get(i).getPhoneNum();
            row[7] = BR.get(i).getAddress();
            model.addRow(row);
        }
        BusDriverTable.setModel(model);
    }                                    
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
public ArrayList<BusDriverClass> Sort(String ValToSearch) {
          ArrayList<BusDriverClass> BusD = new ArrayList<BusDriverClass>();
              Connection connection = getConnection();
              String sql = "select * from bus_driver where concat(Route_departure) like '%"+ValToSearch+"%' ORDER BY Route_number";
              PreparedStatement ps;
              
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            BusDriverClass BD;
            while(rs.next()){
                BD = new BusDriverClass (rs.getString("Route_id_driver"),rs.getString("Route_departure"),rs.getString("Route_number"),rs.getString("Employee_number"),rs.getString("Bus_number"),rs.getString("Bus_drivername"),rs.getString("Phone_number"),rs.getString("Address"));
                BusD.add(BD);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BusD;
        }
    public ArrayList<BusDriverClass> Search(String ValToSearch) {
          ArrayList<BusDriverClass> BusD = new ArrayList<BusDriverClass>();
              Connection connection = getConnection();
              String sql = "select * from bus_driver where concat(Route_id_driver,Route_departure,Route_number,Employee_number,Bus_number,Bus_drivername,Phone_number,Address) like '%"+ValToSearch+"%' ORDER BY Employee_number";
              PreparedStatement ps;
              
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            BusDriverClass BD;
            while(rs.next()){
                BD = new BusDriverClass (rs.getString("Route_id_driver"),rs.getString("Route_departure"),rs.getString("Route_number"),rs.getString("Employee_number"),rs.getString("Bus_number"),rs.getString("Bus_drivername"),rs.getString("Phone_number"),rs.getString("Address"));
                BusD.add(BD);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BusD;
        }
public void UserTable()
    {
        ArrayList<BusDriverClass> BR = Search(Search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Route id","Employee number","Route departure","Route number","Bus number","Name","Phone_number","Address"});
        Object[] row = new Object[10];
        
        for(int i = 0; i < BR.size(); i++)
        {
           row[0] = BR.get(i).getRouteId();
           row[1] = BR.get(i).getempnum();
           row[2] = BR.get(i).getRouteDep();
           row[3] = BR.get(i).getRouteNumber();
           row[4] = BR.get(i).getBusNumber();
           row[5] = BR.get(i).getBusDriver();
           row[6] = BR.get(i).getPhoneNum();
           row[7] = BR.get(i).getAddress();
           model.addRow(row);
        }
       BusDriverTable.setModel(model);
       
    }       
   
public void updt (String sql, String message) {
        Connection con = getConnection();
         Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(sql)) == 1)
           {
               DefaultTableModel model = (DefaultTableModel) BusDriverTable.getModel();
               model.setRowCount(0);
               UserTable(); 
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
                new BusDriver().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Add;
    private static javax.swing.JTable BusDriverTable;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Edit;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> jComboBoxRtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
