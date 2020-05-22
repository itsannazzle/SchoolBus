
package visual.bususer;

import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class addUser extends javax.swing.JFrame {

    public addUser() {
        initComponents();
        this.dispose();
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JComboBox jco = new JComboBox();
        ButtonGroup buttG = new ButtonGroup();
        buttG.add(jRadioButtonFemale);
        buttG.add(jRadioButtonMale);
        jRadioButtonFemale.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MiddleNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClassTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        EmergencyNumTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LastNameTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        UserNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Reset = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("AddUser"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(251, 236, 243));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First name ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));

        FirstNameTextField.setBorder(null);
        FirstNameTextField.setOpaque(false);
        jPanel3.add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 110, 30));

        jLabel2.setText("Middle name ");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        MiddleNameTextField.setBorder(null);
        MiddleNameTextField.setOpaque(false);
        jPanel3.add(MiddleNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 131, 110, 30));

        jLabel3.setText("Class ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, -1, -1));

        ClassTextField.setBorder(null);
        ClassTextField.setOpaque(false);
        ClassTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClassTextFieldKeyTyped(evt);
            }
        });
        jPanel3.add(ClassTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, 110, 30));

        jLabel4.setText("Address");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, -1, -1));

        AddressTextArea.setColumns(20);
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, 202, 90));

        jLabel5.setText("Emergency number ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        EmergencyNumTextField.setBorder(null);
        EmergencyNumTextField.setOpaque(false);
        EmergencyNumTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmergencyNumTextFieldKeyTyped(evt);
            }
        });
        jPanel3.add(EmergencyNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 30));

        jLabel9.setText("Last name ");
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        LastNameTextField1.setBorder(null);
        LastNameTextField1.setOpaque(false);
        jPanel3.add(LastNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 131, 110, 30));

        jLabel10.setText("Gender ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, -1, -1));

        jRadioButtonFemale.setBackground(new java.awt.Color(251, 236, 243));
        jRadioButtonFemale.setText("Female");
        jPanel3.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));

        jRadioButtonMale.setBackground(new java.awt.Color(251, 236, 243));
        jRadioButtonMale.setText("Male");
        jPanel3.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 201, -1, -1));

        jLabel12.setText("User number ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));

        UserNumberTextField.setBorder(null);
        UserNumberTextField.setOpaque(false);
        UserNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserNumberTextFieldKeyTyped(evt);
            }
        });
        jPanel3.add(UserNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 90, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 20, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\add user.png")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 90, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 161, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 161, 110, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, 110, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 281, 110, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 10));

        Reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Reset.png")); // NOI18N
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        jPanel3.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 571, -1, 30));

        Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Add.png")); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        jPanel3.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 571, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        pack();
    }// </editor-fold>                        
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
public boolean checkUserNumber (String un){
    boolean checkuser = false;
    ResultSet rs;
    PreparedStatement ps;
    Connection c = getConnection();
    String sql = "select * from bus_user where user_number =?";
    try{
        ps = c.prepareStatement(sql);
        ps.setString(1, un);
        rs = ps.executeQuery();
        if (rs.next()){
            checkuser = true;
        }
        
    } catch (Exception e){
        
    } return checkuser;
} 
   
    private void EmergencyNumTextFieldKeyTyped(java.awt.event.KeyEvent evt) {                                               
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }                                              

    private void UserNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {                                             
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }                                            

    private void ClassTextFieldKeyTyped(java.awt.event.KeyEvent evt) {                                        
        if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }                                       

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {                                 
            if(UserNumberTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert user number");
            } else if(FirstNameTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert first name");
            } else if(LastNameTextField1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert last name");
            } else if(ClassTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert class");
            } else if(AddressTextArea.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert address");
            } else if(EmergencyNumTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Insert emergency number");
            } else {
        String Gender = "Female";
        if (jRadioButtonMale.isSelected()){
            Gender = "Male";
        }
        if(checkUserNumber(UserNumberTextField.getText())){
                JOptionPane.showMessageDialog(null, "User number is taken", "Add user", 2);
            } else {
        PreparedStatement ps;
        ResultSet rs;
        Connection c = getConnection();
        String sql = "INSERT INTO bus_user VALUES (?,?,?,?,?,?,?,?)";
        try{
            ps = c.prepareStatement(sql);
            ps.setString(1, UserNumberTextField.getText());
            ps.setString(2, FirstNameTextField.getText());
            ps.setString(3, MiddleNameTextField.getText());
            ps.setString(4, LastNameTextField1.getText());
            ps.setString(5, Gender);
            ps.setString(6, ClassTextField.getText());
            ps.setString(7, AddressTextArea.getText());
            ps.setString(8, EmergencyNumTextField.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "New user added");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        }
        BusUser.AddRowToJTable(new Object[]{
            UserNumberTextField.getText(),
            FirstNameTextField.getText(),
            MiddleNameTextField.getText(),
            LastNameTextField1.getText(),
            Gender,
            ClassTextField.getText(),
            AddressTextArea.getText(),
            EmergencyNumTextField.getText(),
        });
            }
    }                                

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {                                   
        FirstNameTextField.setText("");
        MiddleNameTextField.setText("");
        LastNameTextField1.setText("");
        ClassTextField.setText("");
        AddressTextArea.setText("");
        EmergencyNumTextField.setText("");
    }                                  

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Add;
    private javax.swing.JTextArea AddressTextArea;
    private javax.swing.JTextField ClassTextField;
    private javax.swing.JTextField EmergencyNumTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField1;
    private javax.swing.JTextField MiddleNameTextField;
    private javax.swing.JLabel Reset;
    private javax.swing.JTextField UserNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRadioButtonFemale;
    public javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration                   
}
