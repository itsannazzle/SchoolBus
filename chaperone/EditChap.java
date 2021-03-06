package visual.chaperone;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna Karenina
 */
public class EditChap extends javax.swing.JFrame {

    public EditChap() {
        initComponents();
        this.dispose();
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ChapEN = new javax.swing.JTextField();
        jComboBoxDepEC = new javax.swing.JComboBox<>();
        RouteNumber = new javax.swing.JTextField();
        RouteId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ChapName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ChapStandby = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ChapPhoneNum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChapAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Save = new javax.swing.JLabel();

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Route departure :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(251, 236, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChapEN.setBorder(null);
        ChapEN.setOpaque(false);
        ChapEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ChapENKeyTyped(evt);
            }
        });
        jPanel4.add(ChapEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        jComboBoxDepEC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM1", "PM2", "PM3", "PM4" }));
        jPanel4.add(jComboBoxDepEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        RouteNumber.setBorder(null);
        RouteNumber.setOpaque(false);
        jPanel4.add(RouteNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 70, 30));

        RouteId.setBorder(null);
        RouteId.setOpaque(false);
        jPanel4.add(RouteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 110, 30));

        jLabel1.setText("Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        ChapName.setBorder(null);
        ChapName.setOpaque(false);
        jPanel4.add(ChapName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 205, 30));

        jLabel5.setText("Stand by");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ChapStandby.setBorder(null);
        ChapStandby.setOpaque(false);
        jPanel4.add(ChapStandby, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 205, 30));

        jLabel10.setText("Phone number");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        ChapPhoneNum.setBorder(null);
        ChapPhoneNum.setOpaque(false);
        ChapPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ChapPhoneNumKeyTyped(evt);
            }
        });
        jPanel4.add(ChapPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 30));

        jLabel16.setText("Address ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        ChapAddress.setColumns(20);
        ChapAddress.setRows(5);
        jScrollPane1.setViewportView(ChapAddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 182, -1));

        jLabel3.setText("Employee number ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel11.setText("Route departure");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 10));

        jLabel12.setText("Route number");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jLabel13.setText("Route id");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 15, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\edit chap.png")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 110, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 70, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 205, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 205, 10));

        Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Save.png")); // NOI18N
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        jPanel4.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        pack();
    }// </editor-fold>                        

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
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
    private void ChapENKeyTyped(java.awt.event.KeyEvent evt) {                                
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }                               

    private void ChapPhoneNumKeyTyped(java.awt.event.KeyEvent evt) {                                      
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }                                     

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {                                  
        if(ChapEN.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Insert employee number"); 
        } else if(ChapName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert name");
        } else if(ChapStandby.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert standby");
        } else if(ChapPhoneNum.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert phone number");
        } else if(ChapAddress.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert address");
        } else if(RouteNumber.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert route number");
        } else if(RouteId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert route id");
        } else { 
            PreparedStatement ps;
        
        Connection c = getConnection();
        String sql = "UPDATE bus_chaperone SET Route_departure=?,Route_number=?,Employee_number=?,Name=?,Standby=?,Address=?,Phone_number=? WHERE Route_id_chap=?";
        try{
            ps = c.prepareStatement(sql);
            
            ps.setString(1, (String) jComboBoxDepEC.getSelectedItem());
            ps.setString(2, RouteNumber.getText());
            ps.setString(3, ChapEN.getText());
            ps.setString(4, ChapName.getText());
            ps.setString(5, ChapStandby.getText());
            ps.setString(6, ChapAddress.getText());
            ps.setString(7, ChapPhoneNum.getText());
            ps.setString(8, RouteId.getText());
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data edited");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "something went wrong");
        }
        this.dispose();
      }
    }                                 

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditChap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JTextArea ChapAddress;
    public javax.swing.JTextField ChapEN;
    public javax.swing.JTextField ChapName;
    public javax.swing.JTextField ChapPhoneNum;
    public javax.swing.JTextField ChapStandby;
    public javax.swing.JTextField RouteId;
    public javax.swing.JTextField RouteNumber;
    private javax.swing.JLabel Save;
    public javax.swing.JComboBox<String> jComboBoxDepEC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration                   
}
