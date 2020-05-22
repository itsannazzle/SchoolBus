package visual.route;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import visual.Dashboard;



public class BusRoute extends javax.swing.JFrame {
        
 
    public BusRoute() {
        initComponents();
        this.dispose();
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DataTable();
        BusRouteTable.getTableHeader().setFont(new Font("Sergoe UI", Font.BOLD,13));
        BusRouteTable.getTableHeader().setOpaque(false);
        BusRouteTable.getTableHeader().setBackground(new Color(255,204,255));
        BusRouteTable.getTableHeader().setForeground(Color.black);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BusRouteTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxRtime = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("BusRoute"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BusRouteTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
        BusRouteTable.setAlignmentX(2.0F);
        BusRouteTable.setAlignmentY(2.0F);
        BusRouteTable.setFocusable(false);
        BusRouteTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BusRouteTable.setRowHeight(25);
        BusRouteTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        BusRouteTable.getTableHeader().setReorderingAllowed(false);
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 180, 1090, 570));

        jLabel5.setText("Sort by : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jComboBoxRtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM1", "PM2", "PM3", "PM4" }));
        jPanel1.add(jComboBoxRtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 15, -1));

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
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Delete.png")); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Edit.png")); // NOI18N
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Search.setText("Search");
        Search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchFocusGained(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 205, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Sort.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Set todays route.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Group 173.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 860));

        pack();
    }// </editor-fold>                        

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {                                  
        int i = BusRouteTable.getSelectedRow();
        TableModel mode = BusRouteTable.getModel();
        EditRoute er = new EditRoute();
        er.setVisible(true);
        er.RID.setText(mode.getValueAt(i, 0).toString());
        er.name.setText(mode.getValueAt(i, 1).toString());
        er.cls.setText(mode.getValueAt(i, 2).toString());
        er.jTextArea1.setText(mode.getValueAt(i, 3).toString());
        er.jComboBoxActivity.setSelectedItem(mode.getValueAt(i, 4).toString());
        er.jComboBoxDep.setSelectedItem(mode.getValueAt(i, 5).toString());
        er.RouteNumber.setText(mode.getValueAt(i, 6).toString());
    }                                 

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {                                       
        Dashboard hp = new Dashboard();
        hp.setVisible(true);
        this.dispose();
    }                                      

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel mode = (DefaultTableModel) BusRouteTable.getModel();
        int index[] = BusRouteTable.getSelectedRows();
        Object[] row = new Object[13];
        TodayRoute tr = new TodayRoute();
        DefaultTableModel mode2 = (DefaultTableModel) TodayRoute.TodayRouteTable.getModel();
          for(int i = 0; i < index.length; i++)
        {
            row[0] = mode.getValueAt(index[i], 1);
            row[1] = mode.getValueAt(index[i], 2);
            row[2] = mode.getValueAt(index[i], 3);
            row[3] = mode.getValueAt(index[i], 4);
            tr.RDEP.setText((String) mode.getValueAt(index[i], 5));
            tr.ROUTENUM.setText((String) mode.getValueAt(index[i], 6));
            tr.BUSNUM.setText((String) mode.getValueAt(index[i], 7));
            tr.dRIVER.setText((String) mode.getValueAt(index[i], 8));
            tr.Chap.setText((String) mode.getValueAt(index[i], 9));
            mode2.addRow(row);
        }
        tr.setVisible(true);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel mode = (DefaultTableModel)BusRouteTable.getModel();
        String src = (String) jComboBoxRtime.getSelectedItem();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(mode);
        BusRouteTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(src));      
    }                                    

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {                                   
        DefaultTableModel mode = (DefaultTableModel)BusRouteTable.getModel();
        String src = Search.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(mode);
        BusRouteTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(src));
    }                                  

    private void SearchFocusGained(java.awt.event.FocusEvent evt) {                                   
       Search.setText("");
    }                                  

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       
    }                                    
    
    
    public static void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)BusRouteTable.getModel();
        model.addRow(dataRow);
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


 public void DataTable(){
        DefaultTableModel mode = (DefaultTableModel) BusRouteTable.getModel();
        int index[] = BusRouteTable.getSelectedRows();
        Object[] row = new Object[13];
        PreparedStatement ps;
        ResultSet rs;
        Connection c = getConnection();
            Object[] baris ={"Route id","User name","Class","Address","Activity","Bus departure","Bus route","Bus number","Bus driver","Bus chaperone"};
            DefaultTableModel model = new DefaultTableModel(null,baris);
            BusRouteTable.setModel(model);
            String sql = "SELECT coba_user_route.User_route_id,coba_user_route.Name, coba_user_route.Class, coba_user_route.Address, coba_user_route.Activity, coba_user_route.Route_departure, "
                    + "coba_user_route.Route_number, bus_driver.Bus_number, bus_driver.Bus_drivername, bus_chaperone.Name FROM coba_user_route LEFT JOIN bus_driver "
                    + "ON coba_user_route.Route_departure=bus_driver.Route_departure AND coba_user_route.Route_number=bus_driver.Route_number LEFT JOIN bus_chaperone "
                    + "ON coba_user_route.Route_departure=bus_chaperone.Route_departure AND coba_user_route.Route_number=bus_chaperone.Route_number "
                    + "ORDER BY coba_user_route.Route_number";
            try{
             ps = c.prepareStatement(sql);
             rs = ps.executeQuery();
                while(rs.next()){
                String aa = rs.getString("coba_user_route.User_route_id");
                String a = rs.getString("coba_user_route.Name");
                String b = rs.getString("coba_user_route.Class");
                String sc = rs.getString("coba_user_route.Address");
                String d = rs.getString("coba_user_route.Activity");
                String e = rs.getString("coba_user_route.Route_departure");
                String f = rs.getString("coba_user_route.Route_number");
                String g = rs.getString("bus_driver.Bus_number");
                String h = rs.getString("bus_driver.Bus_drivername");
                String i = rs.getString("bus_chaperone.Name");

            String[] data={aa,a,b,sc,d,e,f,g,h,i};
            model.addRow(data);
            }
        }
            catch (Exception e){
                System.out.println(e);
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
               DataTable(); 
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

    // Variables declaration - do not modify                     
    private static javax.swing.JTable BusRouteTable;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Edit;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> jComboBoxRtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
