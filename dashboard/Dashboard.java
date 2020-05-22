package visual;

import java.sql.*;
import visual.route.BusRoute;
import visual.driver.BusDriver;
import visual.chaperone.BusChaperone;
import visual.bususer.BusUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import visual.LostAndFound.LostNFound;


public class Dashboard extends javax.swing.JFrame {

  
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
        this.setExtendedState(MAXIMIZED_BOTH);
        ShowDate();
        ShowTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LostNFound = new javax.swing.JLabel();
        BusChaperone = new javax.swing.JLabel();
        BusDriver = new javax.swing.JLabel();
        BusRoute = new javax.swing.JLabel();
        BusUser = new javax.swing.JLabel();
        AdminNameLabel = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("HomePage"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 20, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 10, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\Dashboard\\Dashboard (2).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1390, 100));

        LostNFound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LostNFound.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\nav\\Group 167.png")); // NOI18N
        LostNFound.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LostNFound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LostNFoundMouseClicked(evt);
            }
        });
        jPanel1.add(LostNFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 160, 150));

        BusChaperone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusChaperone.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\nav\\Group 166.png")); // NOI18N
        BusChaperone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusChaperone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusChaperoneMouseClicked(evt);
            }
        });
        jPanel1.add(BusChaperone, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 160, 150));

        BusDriver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusDriver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\nav\\Group 165.png")); // NOI18N
        BusDriver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusDriverMouseClicked(evt);
            }
        });
        jPanel1.add(BusDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 160, 150));

        BusRoute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusRoute.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\nav\\Group 164.png")); // NOI18N
        BusRoute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusRouteMouseClicked(evt);
            }
        });
        jPanel1.add(BusRoute, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 160, 150));

        BusUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anna Karenina\\Documents\\NetBeansProjects\\Visual\\Images\\nav\\Group 163.png")); // NOI18N
        BusUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusUserMouseClicked(evt);
            }
        });
        jPanel1.add(BusUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 160, 150));

        AdminNameLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        AdminNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminNameLabel.setText("Admin : Cotton");
        jPanel1.add(AdminNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        TIME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIME.setText("Time");
        jPanel1.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, -1));

        DATE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DATE.setText("Date");
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 156, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 860));

        pack();
    }// </editor-fold>                        
    void ShowDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        DATE.setText(s.format(d));
    }
    void ShowTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                TIME.setText(s.format(d));
            }
        }).start();
    }
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.dispose();
    }                                    

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        setState(JFrame.ICONIFIED);
    }                                     

    private void BusUserMouseClicked(java.awt.event.MouseEvent evt) {                                     
        BusUser bususer = new BusUser();
        bususer.setVisible(true);
        this.dispose();
    }                                    

    private void BusRouteMouseClicked(java.awt.event.MouseEvent evt) {                                      
        BusRoute BC = new BusRoute();
        BC.setVisible(true);
        this.dispose();
    }                                     

    private void BusDriverMouseClicked(java.awt.event.MouseEvent evt) {                                       
        BusDriver BD = new BusDriver();
        BD.setVisible(true);
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
    private void BusChaperoneMouseClicked(java.awt.event.MouseEvent evt) {                                          
        BusChaperone BC = new BusChaperone();
        BC.setVisible(true);
        this.dispose();
    }                                         

    private void LostNFoundMouseClicked(java.awt.event.MouseEvent evt) {                                        
       LostNFound lnf = new LostNFound();
       lnf.setVisible(true);
       this.dispose();
    }                                       
    
    
    
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JLabel AdminNameLabel;
    private javax.swing.JLabel BusChaperone;
    private javax.swing.JLabel BusDriver;
    private javax.swing.JLabel BusRoute;
    private javax.swing.JLabel BusUser;
    private javax.swing.JLabel DATE;
    private javax.swing.JLabel LostNFound;
    private javax.swing.JLabel TIME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
