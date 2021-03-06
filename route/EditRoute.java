package visual.route;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna Karenina
 */
public class EditRoute extends javax.swing.JFrame {

    public EditRoute() {
        initComponents();
        this.dispose();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jclass1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDep = new javax.swing.JComboBox<>();
        jclass = new javax.swing.JLabel();
        RouteNumber = new javax.swing.JTextField();
        jComboBoxActivity = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Save = new javax.swing.JLabel();
        jclass2 = new javax.swing.JLabel();
        cls = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jclass3 = new javax.swing.JLabel();
        jclass4 = new javax.swing.JLabel();
        RID = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 236, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jclass1.setText("User name ");
        jPanel1.add(jclass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        name.setBorder(null);
        name.setFocusable(false);
        name.setOpaque(false);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 205, 30));

        jLabel9.setText("Route departure");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jComboBoxDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM1", "PM2", "PM3", "PM4" }));
        jPanel1.add(jComboBoxDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 25));

        jclass.setText("Route number");
        jPanel1.add(jclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        RouteNumber.setBorder(null);
        RouteNumber.setOpaque(false);
        RouteNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RouteNumberKeyTyped(evt);
            }
        });
        jPanel1.add(RouteNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 70, 30));

        jComboBoxActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html> </html>", "Swimming", "Football", "Beavers", "Rainbows", "Cooking ", "Junk modeling", "Taekwondo", "Gymnastic", "Bricks for kids", "Engineering" }));
        jComboBoxActivity.setBorder(null);
        jPanel1.add(jComboBoxActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, -1));

        jLabel11.setText("Activity ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 15, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\edit route.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 205, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 70, 10));

        Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Save.png")); // NOI18N
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, 30));

        jclass2.setText("Address");
        jPanel1.add(jclass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        cls.setBorder(null);
        cls.setFocusable(false);
        cls.setOpaque(false);
        jPanel1.add(cls, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, -1));

        jclass3.setText("Class ");
        jPanel1.add(jclass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jclass4.setText("Route id");
        jPanel1.add(jclass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        RID.setEditable(false);
        RID.setBorder(null);
        RID.setOpaque(false);
        RID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RIDKeyTyped(evt);
            }
        });
        jPanel1.add(RID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        pack();
    }// </editor-fold>                        

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void RouteNumberKeyTyped(java.awt.event.KeyEvent evt) {                                     
        if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
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
    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {                                  
        
        JComboBox jco = new JComboBox();
        PreparedStatement ps;
        ResultSet rs;
        Connection c = getConnection();
        String sql = "UPDATE coba_user_route SET Route_departure=?, Route_number=?, Name=?, Class=?, Address=?, Activity=? WHERE User_route_id=?";
        try{
            ps = c.prepareStatement(sql);
            
            ps.setString(1, (String) jComboBoxDep.getSelectedItem());
            ps.setString(2, RouteNumber.getText());
            ps.setString(3, name.getText());
            ps.setString(4, cls.getText());
            ps.setString(5, jTextArea1.getText());
            ps.setString(6, (String) jComboBoxActivity.getSelectedItem());
            ps.setString(7, RID.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data updated");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        this.dispose();
    }                                 

    private void RIDKeyTyped(java.awt.event.KeyEvent evt) {                             
        // TODO add your handling code here:
    }                            

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRoute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JTextField RID;
    public javax.swing.JTextField RouteNumber;
    private javax.swing.JLabel Save;
    public javax.swing.JTextField cls;
    public javax.swing.JComboBox<String> jComboBoxActivity;
    public javax.swing.JComboBox<String> jComboBoxDep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jclass;
    private javax.swing.JLabel jclass1;
    private javax.swing.JLabel jclass2;
    private javax.swing.JLabel jclass3;
    private javax.swing.JLabel jclass4;
    public javax.swing.JTextField name;
    // End of variables declaration                   
}
