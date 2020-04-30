
package visual.bususer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EditUser extends javax.swing.JFrame {

    
    
    public EditUser() {
        initComponents();
        this.dispose();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JComboBox jco = new JComboBox();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonFemale);
        bg.add(jRadioButtonMale);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        editFN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editMD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editClass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        editEN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        editLN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        UN = new javax.swing.JTextField();
        jComboBoxActivity = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Save = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(251, 236, 243));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, -1));

        jLabel1.setText("First name ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        editFN.setBorder(null);
        editFN.setOpaque(false);
        jPanel3.add(editFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));

        jLabel2.setText("Middle name ");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        editMD.setBorder(null);
        editMD.setOpaque(false);
        jPanel3.add(editMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, 30));

        jLabel3.setText("Class ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        editClass.setBorder(null);
        editClass.setOpaque(false);
        editClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editClassKeyTyped(evt);
            }
        });
        jPanel3.add(editClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 30));

        jLabel4.setText("Address ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        editAddress.setColumns(20);
        editAddress.setRows(5);
        jScrollPane1.setViewportView(editAddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 202, -1));

        jLabel5.setText("Emergency number ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        editEN.setBorder(null);
        editEN.setOpaque(false);
        editEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editENKeyTyped(evt);
            }
        });
        jPanel3.add(editEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 30));

        jLabel9.setText("Last name");
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        editLN.setBorder(null);
        editLN.setOpaque(false);
        editLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLNActionPerformed(evt);
            }
        });
        jPanel3.add(editLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 110, 30));

        jLabel10.setText("Gender");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel11.setText("Activity ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel12.setText("User number ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        UN.setEditable(false);
        UN.setBorder(null);
        UN.setFocusable(false);
        UN.setOpaque(false);
        UN.setRequestFocusEnabled(false);
        UN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UNKeyTyped(evt);
            }
        });
        jPanel3.add(UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        jComboBoxActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- No Activity --", "Swimming", "Football", "Beavers", "Rainbows", "Cooking ", "Junk modeling", "Taekwondo", "Gymnastic", "Bricks for kids", "Engineering" }));
        jComboBoxActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActivityActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 202, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("*User number can't be changed");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jRadioButtonFemale.setBackground(new java.awt.Color(251, 236, 243));
        jRadioButtonFemale.setText("Female");
        jPanel3.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jRadioButtonMale.setBackground(new java.awt.Color(251, 236, 243));
        jRadioButtonMale.setText("Male");
        jPanel3.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\edit ser.png")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 110, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 10));

        Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Button\\Save.png")); // NOI18N
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        jPanel3.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiddleNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddleNameTextFieldActionPerformed

    private void jComboBoxActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActivityActionPerformed

    private void UNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UNKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_UNKeyTyped

    private void editLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editLNActionPerformed

    private void editENKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editENKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_editENKeyTyped

    private void editClassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editClassKeyTyped
        if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_editClassKeyTyped

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
       String Gender = "Female";
        if(jRadioButtonMale.isSelected()){
            Gender = "Male";
        }

        UN.setEditable(false);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coba", "root", "");
            String sql = "UPDATE bus_user SET First_Name=?,Middle_Name=?,Last_Name=?,Gender=?,Class=?,Address =?,Activity =?,EmergencyNum =? WHERE user_number=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, editFN.getText());
            ps.setString(2, editMD.getText());
            ps.setString(3, editLN.getText());
            ps.setString(4, Gender);
            ps.setString(5, editClass.getText());
            ps.setString(6, editAddress.getText());
            ps.setString(7, (String) jComboBoxActivity.getSelectedItem());
            ps.setString(8, editEN.getText());
            ps.setString(9, UN.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Edit success");
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }//GEN-LAST:event_SaveMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Save;
    public javax.swing.JTextField UN;
    public javax.swing.JTextArea editAddress;
    public javax.swing.JTextField editClass;
    public javax.swing.JTextField editEN;
    public javax.swing.JTextField editFN;
    public javax.swing.JTextField editLN;
    public javax.swing.JTextField editMD;
    public javax.swing.JComboBox<String> jComboBoxActivity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    // End of variables declaration//GEN-END:variables
}
