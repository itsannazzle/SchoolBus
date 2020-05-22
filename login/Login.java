package visual;

import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dispose();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Login"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 10, 10));

        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\login.png")); // NOI18N
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 150, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 340, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 340, 10));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Username ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        UsernameTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        UsernameTextField.setBorder(null);
        UsernameTextField.setOpaque(false);
        UsernameTextField.setRequestFocusEnabled(false);
        jPanel1.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 340, 30));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Password ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        PasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(153, 153, 153));
        PasswordField.setBorder(null);
        PasswordField.setOpaque(false);
        PasswordField.setRequestFocusEnabled(false);
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyTyped(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 340, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\pic.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 170));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\bg.png")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(693, 549));
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 549));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
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
    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
       
        String password = String.valueOf(PasswordField.getPassword());
        PreparedStatement ps;
        ResultSet rs ;
        Connection c = getConnection();
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ? ";
        try{
        ps = c.prepareStatement(sql);
        ps.setString(1, UsernameTextField.getText());
        ps.setString(2, password);
        
        rs = ps.executeQuery();
        
        if (rs.next()){
            JOptionPane.showMessageDialog(null, "Login success");
            Dashboard homepage = new Dashboard();
            homepage.setVisible(true);
            homepage.pack();
            homepage.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.dispose();
            homepage.setExtendedState(MAXIMIZED_BOTH);
            Dashboard.AdminNameLabel.setText("Admin : "+UsernameTextField.getText()+"");
            
        this.setLocationRelativeTo(null);
            
        } else {
            JOptionPane.showMessageDialog(null, "Username and password didn't match", "Login failed", 2);
            
       }
        
        } catch (Exception e){
            System.out.println(e);
        } 
    }                                        

    private void PasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {                                       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)        
        LoginButton.doLayout();
    }                                      

 
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel LoginButton;
    private javax.swing.JPasswordField PasswordField;
    public javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration                   
}
