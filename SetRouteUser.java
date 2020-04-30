
package visual.bususer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SetRouteUser extends javax.swing.JFrame {

    public SetRouteUser() {
        initComponents();
        this.dispose();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jclass = new javax.swing.JLabel();
        RouteNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        RouteId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jclass1 = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        jclass2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        jclass3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDep = new javax.swing.JComboBox<>();
        jComboBoxActivity = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Reset = new javax.swing.JLabel();
        SetRoute = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(251, 236, 243));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jclass.setText("Route number ");
        jPanel2.add(jclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        RouteNumber.setBorder(null);
        RouteNumber.setOpaque(false);
        RouteNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RouteNumberKeyTyped(evt);
            }
        });
        jPanel2.add(RouteNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));

        jLabel4.setText("Address ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 204, -1));

        jLabel11.setText("Activity ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        RouteId.setBorder(null);
        RouteId.setOpaque(false);
        RouteId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RouteIdKeyTyped(evt);
            }
        });
        jPanel2.add(RouteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 30));

        jLabel6.setText("Route id ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jclass1.setText("User number ");
        jPanel2.add(jclass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        UserId.setEditable(false);
        UserId.setBorder(null);
        UserId.setFocusable(false);
        UserId.setOpaque(false);
        UserId.setRequestFocusEnabled(false);
        jPanel2.add(UserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        jclass2.setText("Name ");
        jPanel2.add(jclass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Name.setBorder(null);
        Name.setOpaque(false);
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 205, 30));

        Class.setBorder(null);
        Class.setOpaque(false);
        jPanel2.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 30));

        jclass3.setText("Class ");
        jPanel2.add(jclass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setText("Route dep ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBoxDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM1", "PM2", "PM3", "PM4" }));
        jComboBoxDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jComboBoxActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- No Activity --", "Swimming", "Football", "Beavers", "Rainbows", "Cooking ", "Junk modeling", "Taekwondo", "Gymnastic", "Bricks for kids", "Engineering" }));
        jPanel2.add(jComboBoxActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 202, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 15, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\Set route.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 70, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 205, 10));

        Reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Reset.png")); // NOI18N
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        jPanel2.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, 30));

        SetRoute.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Set route.png")); // NOI18N
        SetRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetRouteMouseClicked(evt);
            }
        });
        jPanel2.add(SetRoute, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void RouteIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RouteIdKeyTyped
        if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_RouteIdKeyTyped

    private void RouteNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RouteNumberKeyTyped
        if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_RouteNumberKeyTyped

    private void jComboBoxDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepActionPerformed

    private void SetRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetRouteMouseClicked
         UserId.setEditable(false);
        JComboBox jco = new JComboBox();
        jco.addItem("AM");

        PreparedStatement ps;
        ResultSet rs;
        Connection c = getConnection();
        String sql = "INSERT INTO coba_user_route VALUES (?,?,?,?,?,?,?,?)";
        try{
            ps = c.prepareStatement(sql);
            ps.setString(1, RouteId.getText());
            ps.setString(2, UserId.getText());
            ps.setString(3, (String) jComboBoxDep.getSelectedItem());
            ps.setString(4, RouteNumber.getText());
            ps.setString(5, Name.getText());
            ps.setString(6, Class.getText());
            ps.setString(7, Address.getText());
            ps.setString(8, (String) jComboBoxActivity.getSelectedItem());
            
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Route setted");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }//GEN-LAST:event_SetRouteMouseClicked

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        RouteId.setText("");
        RouteNumber.setText("");
    }//GEN-LAST:event_ResetMouseClicked


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetRouteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Address;
    public javax.swing.JTextField Class;
    public javax.swing.JTextField Name;
    private javax.swing.JLabel Reset;
    public javax.swing.JTextField RouteId;
    public javax.swing.JTextField RouteNumber;
    private javax.swing.JLabel SetRoute;
    public javax.swing.JTextField UserId;
    public javax.swing.JComboBox<String> jComboBoxActivity;
    private javax.swing.JComboBox<String> jComboBoxDep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jclass;
    private javax.swing.JLabel jclass1;
    private javax.swing.JLabel jclass2;
    private javax.swing.JLabel jclass3;
    // End of variables declaration//GEN-END:variables
}
